package com.example.medicineguide;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView inputIllness;
    ImageButton micButton, btnSpeak;
    Button searchButton, btnEnglish, btnTelugu, btnTamil, btnFirstAid;
    TextView medicineResult;
    RadioButton radioAdult, radioChild, radioInfant;

    MedicineDatabaseHelper dbHelper;
    TextToSpeech tts;
    String selectedLanguage = "en";

    private static final int REQUEST_CODE_SPEECH = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputIllness = findViewById(R.id.inputIllness);
        micButton = findViewById(R.id.micButton);
        btnSpeak = findViewById(R.id.btnSpeak);
        searchButton = findViewById(R.id.searchButton);
        btnFirstAid = findViewById(R.id.btnFirstAid);
        btnEnglish = findViewById(R.id.btnEnglish);
        btnTelugu = findViewById(R.id.btnTelugu);
        btnTamil = findViewById(R.id.btnTamil);
        medicineResult = findViewById(R.id.medicineResult);
        radioAdult = findViewById(R.id.radioAdult);
        radioChild = findViewById(R.id.radioChild);
        radioInfant = findViewById(R.id.radioInfant);

        dbHelper = new MedicineDatabaseHelper(this);
        setupIllnessSuggestions();

        tts = new TextToSpeech(this, status -> {
            if (status == TextToSpeech.SUCCESS) {
                tts.setLanguage(Locale.ENGLISH);
            }
        });

        btnEnglish.setOnClickListener(v -> {
            selectedLanguage = "en";
            tts.setLanguage(Locale.ENGLISH);
            Toast.makeText(this, "Language: English", Toast.LENGTH_SHORT).show();
        });

        btnTelugu.setOnClickListener(v -> {
            selectedLanguage = "te";
            tts.setLanguage(new Locale("te", "IN"));
            Toast.makeText(this, "భాష: తెలుగు", Toast.LENGTH_SHORT).show();
        });

        btnTamil.setOnClickListener(v -> {
            selectedLanguage = "ta";
            tts.setLanguage(new Locale("ta", "IN"));
            Toast.makeText(this, "மொழி: தமிழ்", Toast.LENGTH_SHORT).show();
        });

        micButton.setOnClickListener(v -> startVoiceInput());
        btnSpeak.setOnClickListener(v -> speakMedicineInfo());
        btnFirstAid.setOnClickListener(v -> startActivity(new Intent(this, FirstAidActivity.class)));

        searchButton.setOnClickListener(v -> {
            String illness = inputIllness.getText().toString().trim().toLowerCase();
            if (!illness.isEmpty()) {
                searchMedicine(illness);
            } else {
                Toast.makeText(this, "Please enter illness", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setupIllnessSuggestions() {
        ArrayList<String> illnessList = new ArrayList<>();
        Cursor cursor = dbHelper.getReadableDatabase().rawQuery("SELECT DISTINCT illness FROM medicines", null);
        if (cursor.moveToFirst()) {
            do {
                illnessList.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        cursor.close();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, illnessList);
        inputIllness.setAdapter(adapter);
        inputIllness.setThreshold(1);
    }

    private void startVoiceInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        try {
            startActivityForResult(intent, REQUEST_CODE_SPEECH);
        } catch (Exception e) {
            Toast.makeText(this, "Speech input not supported", Toast.LENGTH_SHORT).show();
        }
    }

    private void speakMedicineInfo() {
        String illness = inputIllness.getText().toString().trim();
        String result = medicineResult.getText().toString();
        if (result.isEmpty()) {
            Toast.makeText(this, "Nothing to speak", Toast.LENGTH_SHORT).show();
            return;
        }
        String speakText;
        if (selectedLanguage.equals("te")) {
            speakText = illness + " కోసం సమచారం: " + result.replace("\n", ". ");
        } else if (selectedLanguage.equals("ta")) {
            speakText = illness + "க்கு மருந்து விவரம்: " + result.replace("\n", ". ");
        } else {
            speakText = "For " + illness + ", here is the medicine information. " + result.replace("\n", ". ");
        }
        tts.speak(speakText, TextToSpeech.QUEUE_FLUSH, null, null);
    }

    private void searchMedicine(String illness) {
        Cursor cursor = dbHelper.getMedicineByIllness(illness);
        if (cursor != null && cursor.moveToFirst()) {
            String name, usage, side, resultText;
            boolean isChild = radioChild.isChecked();
            boolean isInfant = radioInfant.isChecked();
            switch (selectedLanguage) {
                case "te":
                    name = isInfant ? cursor.getString(cursor.getColumnIndexOrThrow("name_infant_te"))
                            : isChild ? cursor.getString(cursor.getColumnIndexOrThrow("name_child_te"))
                            : cursor.getString(cursor.getColumnIndexOrThrow("name_adult_te"));
                    usage = isInfant ? cursor.getString(cursor.getColumnIndexOrThrow("usage_infant_te"))
                            : isChild ? cursor.getString(cursor.getColumnIndexOrThrow("usage_child_te"))
                            : cursor.getString(cursor.getColumnIndexOrThrow("usage_adult_te"));
                    side = cursor.getString(cursor.getColumnIndexOrThrow("side_effects_te"));
                    resultText = "ఆషధం: " + name + "\nవాడకం: " + usage + "\nపొరపాట్లు: " + side;
                    break;
                case "ta":
                    name = isInfant ? cursor.getString(cursor.getColumnIndexOrThrow("name_infant_ta"))
                            : isChild ? cursor.getString(cursor.getColumnIndexOrThrow("name_child_ta"))
                            : cursor.getString(cursor.getColumnIndexOrThrow("name_adult_ta"));
                    usage = isInfant ? cursor.getString(cursor.getColumnIndexOrThrow("usage_infant_ta"))
                            : isChild ? cursor.getString(cursor.getColumnIndexOrThrow("usage_child_ta"))
                            : cursor.getString(cursor.getColumnIndexOrThrow("usage_adult_ta"));
                    side = cursor.getString(cursor.getColumnIndexOrThrow("side_effects_ta"));
                    resultText = "மருந்து: " + name + "\nபயன்பாடு: " + usage + "\nபக்கவிளைவுகள்: " + side;
                    break;
                default:
                    name = isInfant ? cursor.getString(cursor.getColumnIndexOrThrow("name_infant"))
                            : isChild ? cursor.getString(cursor.getColumnIndexOrThrow("name_child"))
                            : cursor.getString(cursor.getColumnIndexOrThrow("name_adult"));
                    usage = isInfant ? cursor.getString(cursor.getColumnIndexOrThrow("usage_infant"))
                            : isChild ? cursor.getString(cursor.getColumnIndexOrThrow("usage_child"))
                            : cursor.getString(cursor.getColumnIndexOrThrow("usage_adult"));
                    side = cursor.getString(cursor.getColumnIndexOrThrow("side_effects"));
                    resultText = "Medicine: " + name + "\nUsage: " + usage + "\nSide Effects: " + side;
                    break;
            }
            medicineResult.setText(resultText);
        } else {
            medicineResult.setText("No medicine found for: " + illness);
        }
        if (cursor != null) cursor.close();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_SPEECH && resultCode == RESULT_OK && data != null) {
            ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            if (result != null && !result.isEmpty()) {
                String spokenText = result.get(0).toLowerCase();
                inputIllness.setText(spokenText);
                searchMedicine(spokenText);
            }
        }
    }

    @Override
    public void onBackPressed() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean hasRated = prefs.getBoolean("hasRated", false);

        if (!hasRated) {
            View dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_star_rating, null);
            RatingBar ratingBar = dialogView.findViewById(R.id.ratingBar);

            new AlertDialog.Builder(this)
                    .setTitle("Enjoying the app?")
                    .setView(dialogView)
                    .setCancelable(false)
                    .setPositiveButton("Submit", (dialog, which) -> {
                        float rating = ratingBar.getRating();
                        prefs.edit().putBoolean("hasRated", true).apply();

                        if (rating >= 4) {
                            try {
                                startActivity(new Intent(Intent.ACTION_VIEW,
                                        android.net.Uri.parse("market://details?id=" + getPackageName())));
                            } catch (Exception e) {
                                startActivity(new Intent(Intent.ACTION_VIEW,
                                        android.net.Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
                            }
                        }

                        super.onBackPressed();
                    })
                    .setNegativeButton("Later", (dialog, which) -> super.onBackPressed())
                    .show();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
}
