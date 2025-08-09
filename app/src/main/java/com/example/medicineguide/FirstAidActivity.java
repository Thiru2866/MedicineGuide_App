package com.example.medicineguide;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FirstAidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);

        TextView firstAidText = findViewById(R.id.firstAidText);

        String tips = ""
                + "1. 🩸 **Bleeding**:\n"
                + "Apply pressure with a clean cloth. Elevate the area. Seek medical help if heavy bleeding.\n\n"

                + "2. 🔥 **Burns**:\n"
                + "Cool with running water for 10 minutes. Do not apply ice or creams. Cover loosely with gauze.\n\n"

                + "3. 🤕 **Fracture**:\n"
                + "Keep the injured area still. Use a splint or rolled newspaper to support. Avoid moving the person.\n\n"

                + "4. 🐍 **Snake Bite**:\n"
                + "Keep the person calm. Immobilize the area. Don’t cut or suck the bite. Get medical help quickly.\n\n"

                + "5. 💔 **Heart Attack**:\n"
                + "Give aspirin if not allergic. Keep the person calm. Call emergency services immediately.\n\n"

                + "6. 🧠 **Stroke**:\n"
                + "Use FAST: Face drooping, Arm weakness, Speech difficulty, Time to call emergency. Keep calm.\n\n"

                + "7. 🌡️ **Heat Stroke**:\n"
                + "Move to a cool place. Give sips of water. Cool with wet cloths. Seek medical help if severe.\n\n"

                + "8. ⚡ **Electric Shock**:\n"
                + "Turn off power. Don’t touch the person directly. Call emergency help. Begin CPR if trained.\n\n"

                + "9. 🐝 **Allergic Reaction (Anaphylaxis)**:\n"
                + "Use an epinephrine auto-injector if available. Call emergency services. Lay person flat.\n\n"

                + "10. 🚫 **Choking (Adult)**:\n"
                + "Ask if they can talk. If not, perform abdominal thrusts (Heimlich maneuver). Call emergency if needed.";

        firstAidText.setText(tips);
    }
}
