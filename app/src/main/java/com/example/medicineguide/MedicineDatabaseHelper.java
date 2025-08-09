package com.example.medicineguide;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MedicineDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "medicine.db";
    private static final int DATABASE_VERSION = 8;

    public static final String TABLE_NAME = "medicines";

    public static final String COLUMN_ILLNESS = "illness";
    public static final String COLUMN_NAME_ADULT = "name_adult";
    public static final String COLUMN_NAME_CHILD = "name_child";
    public static final String COLUMN_NAME_INFANT = "name_infant";

    public static final String COLUMN_USAGE_ADULT = "usage_adult";
    public static final String COLUMN_USAGE_CHILD = "usage_child";
    public static final String COLUMN_USAGE_INFANT = "usage_infant";

    public static final String COLUMN_SIDE_EFFECTS = "side_effects";

    public static final String COLUMN_NAME_ADULT_TE = "name_adult_te";
    public static final String COLUMN_NAME_CHILD_TE = "name_child_te";
    public static final String COLUMN_NAME_INFANT_TE = "name_infant_te";

    public static final String COLUMN_USAGE_ADULT_TE = "usage_adult_te";
    public static final String COLUMN_USAGE_CHILD_TE = "usage_child_te";
    public static final String COLUMN_USAGE_INFANT_TE = "usage_infant_te";

    public static final String COLUMN_SIDE_EFFECTS_TE = "side_effects_te";

    public static final String COLUMN_NAME_ADULT_TA = "name_adult_ta";
    public static final String COLUMN_NAME_CHILD_TA = "name_child_ta";
    public static final String COLUMN_NAME_INFANT_TA = "name_infant_ta";

    public static final String COLUMN_USAGE_ADULT_TA = "usage_adult_ta";
    public static final String COLUMN_USAGE_CHILD_TA = "usage_child_ta";
    public static final String COLUMN_USAGE_INFANT_TA = "usage_infant_ta";

    public static final String COLUMN_SIDE_EFFECTS_TA = "side_effects_ta";

    public MedicineDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ILLNESS + " TEXT PRIMARY KEY, " +
                COLUMN_NAME_ADULT + " TEXT, " +
                COLUMN_NAME_CHILD + " TEXT, " +
                COLUMN_NAME_INFANT + " TEXT, " +
                COLUMN_USAGE_ADULT + " TEXT, " +
                COLUMN_USAGE_CHILD + " TEXT, " +
                COLUMN_USAGE_INFANT + " TEXT, " +
                COLUMN_SIDE_EFFECTS + " TEXT, " +
                COLUMN_NAME_ADULT_TE + " TEXT, " +
                COLUMN_NAME_CHILD_TE + " TEXT, " +
                COLUMN_NAME_INFANT_TE + " TEXT, " +
                COLUMN_USAGE_ADULT_TE + " TEXT, " +
                COLUMN_USAGE_CHILD_TE + " TEXT, " +
                COLUMN_USAGE_INFANT_TE + " TEXT, " +
                COLUMN_SIDE_EFFECTS_TE + " TEXT, " +
                COLUMN_NAME_ADULT_TA + " TEXT, " +
                COLUMN_NAME_CHILD_TA + " TEXT, " +
                COLUMN_NAME_INFANT_TA + " TEXT, " +
                COLUMN_USAGE_ADULT_TA + " TEXT, " +
                COLUMN_USAGE_CHILD_TA + " TEXT, " +
                COLUMN_USAGE_INFANT_TA + " TEXT, " +
                COLUMN_SIDE_EFFECTS_TA + " TEXT);";

        db.execSQL(CREATE_TABLE);

        insertAllMedicines(db);
    }

    private void insertAllMedicines(SQLiteDatabase db) {
        insertFeverData(db);
        insertColdData(db);
        insertHeadacheData(db);
        insertVomitingData(db);
        insertDiarrheaData(db);
        insertBodyPainData(db);
        insertSoreThroatData(db);
        insertAllergyData(db);
        insertStomachPainData(db);
        insertEyeIrritationData(db);
        insertCoughData(db);
        insertAcidityData(db);
        insertConstipationData(db);
        insertEarPainData(db);
        insertToothacheData(db);
        insertIndigestionData(db);
        insertMotionSicknessData(db);
        insertNoseBlockData(db);
        insertItchingRashesData(db);
        insertWormsData(db);
        insertMinorBurnData(db);
        insertChickenpoxData(db);
        insertDehydrationData(db);
        insertEyeRednessData(db);
        insertNasalCongestionData(db);
        insertHeatRashData(db);
        insertJointPainData(db);
        insertMeaslesData(db);
        insertMouthInfectionData(db);
        insertEarDischargeData(db);
        insertMinorCutsData(db);
        insertChestCongestionData(db);
        insertSkinAllergyData(db);
        insertHiccupsData(db);
        insertFungalInfectionData(db);
        insertHFMDData(db);
        insertBurnsData(db);
        insertTeethingPainData(db);
        insertCrackedLipsData(db);
        insertThroatIrritationData(db);
        insertSunburnData(db);
        insertNauseaData(db);
        insertGasTroubleData(db);
        insertSneezingData(db);
        insertBackPainData(db);
        insertDryCoughData(db);
        insertHairLiceData(db);
        insertTeethingFeverData(db);
        insertScalpInfectionData(db);
        insertHandPainData(db);
        insertUrineInfectionData(db);
        insertChestPainData(db);
        insertBloatingData(db);
        insertThroatDrynessData(db);
        insertMildFeverAcheData(db);
        insertEarWaxData(db);
        insertColdSoresData(db);
        insertMouthUlcersData(db);
        insertHighFeverData(db);
        insertLowBPData(db);
        insertHighBPData(db);
        insertUrinaryBurningData(db);
        insertMenstrualPainData(db);
        insertBreathlessnessData(db);
        insertDengueData(db);
        insertTyphoidData(db);
        insertChestTightnessData(db);
        insertSkinDrynessData(db);
        insertInsomniaData(db);
        insertPimplesData(db);
        insertEyePainData(db);
        insertEarBlockData(db);
        insertFrequentUrinationData(db);
        insertAnemiaData(db);
        insertGasAcidityData(db);
        insertMigraineData(db);
        insertWeightLossData(db);
        insertDustAllergyData(db);
        insertPollenAllergyData(db);
        insertFoodAllergyData(db);
        insertInsectBiteAllergyData(db);
        insertColdAllergyData(db);
        insertSunAllergyData(db);
        insertPerfumeAllergyData(db);
        insertPetAllergyData(db);
        insertCosmeticAllergyData(db);
        insertEyeAllergyData(db);
        insertInjuryData(db);
        insertLegSprainData(db);
        insertMuscleCrampsData(db);
        insertMinorFractureData(db);
        insertFootInjuryData(db);
        insertCrackedHeelsData(db);
        insertShoulderPainData(db);
        insertKneePainData(db);
        insertAnkleSprainData(db);
        insertNeckPainData(db);
        insertMuscleStrainData(db);
        insertWoundHealingData(db);
        insertColdFeetData(db);
        insertEyeTwitchingData(db);
        insertHandNumbnessData(db);
        insertHeelPainData(db);
        insertSweatyPalmsData(db);
        insertScalpDrynessData(db);
        insertLipSwellingData(db);
        insertJawPainData(db);
        insertFingerSwellingData(db);
        insertTiredLegsData(db);
        insertFoodPoisoningData(db);
        insertAppendicitisData(db);
        insertAsthmaData(db);
        insertSinusInfectionData(db);
        insertGumBleedingData(db);
        insertBadBreathData(db);
        insertToothSensitivityData(db);
        insertGumSwellingData(db);
        insertAcneData(db);
        insertEczemaData(db);
        insertConjunctivitisData(db);
        insertEyeStrainData(db);
        insertRashData(db);
        insertDryEyesData(db);
        insertItchySkinData(db);
        insertHivesData(db);
        insertBedsoresData(db);
        insertSkinTagsData(db);
        insertJaundiceData(db);
        insertUTIData(db);
        insertMenstrualCrampsData(db);
        insertWhiteDischargeData(db);
        insertIrregularPeriodsData(db);
        insertVaginalItchingData(db);
        insertBreastPainData(db);
        insertPCOSData(db);
        insertYeastInfectionData(db);
        insertMenopauseData(db);
        insertPregnancyNauseaData(db);
        insertIronDeficiencyAnemiaData(db);
        insertMalariaData(db);
        insertChikungunyaData(db);
        insertViralFeverData(db);



































    }

    // ... existing insert methods for illnesses 1-5 ...

    private void insertBodyPainData(SQLiteDatabase db) {
        insertMedicine(db, "body pain", "Flexon", "Flexon Junior Tablet", "Crocin Drops",
                "1 tablet after food, 3 times daily", "1 tablet after food, 2 times daily", "0.5ml after food, 2 times daily", "Stomach upset, dizziness",
                "ఫ్లెక్సాన్", "ఫ్లెక్సాన్ జూనియర్ టాబ్లెట్", "క్రోసిన్ డ్రాప్స్",
                "భోజనం తరువాత 1 టాబ్లెట్, రోజుకు 3 సార్లు", "భోజనం తరువాత 1 టాబ్లెట్, రోజుకు 2 సార్లు", "భోజనం తరువాత 0.5ml, రోజుకు 2 సార్లు", "కడుపు సమస్యలు, తల తిరుగుడు",
                "பிளெக்சான்", "பிளெக்சான் ஜூனியர் மாத்திரை", "கிரோசின் சொட்டுகள்",
                "உணவுக்குப் பிறகு ஒரு மாத்திரை, நாளில் 3 முறை", "உணவுக்குப் பிறகு ஒரு மாத்திரை, நாளில் 2 முறை", "உணவுக்குப் பிறகு 0.5மில்லி, நாளில் 2 முறை", "வயிற்று பிரச்சனை, மயக்கம்");
    }

    private void insertSoreThroatData(SQLiteDatabase db) {
        insertMedicine(db, "sore throat", "Strepsils", "Alex Syrup", "Crocin Drops",
                "1 lozenge every 4 hours", "5ml after food, 2 times daily", "0.5ml after food, 2 times daily", "Mouth irritation, nausea",
                "స్ట్రెప్సిల్స్", "ఆలెక్స్ సిరప్", "క్రోసిన్ డ్రాప్స్",
                "ప్రతి 4 గంటలకు 1 ముంచెము", "భోజనం తరువాత 5ml, రోజుకు 2 సార్లు", "భోజనం తరువాత 0.5ml, రోజుకు 2 సార్లు", "నోరు ఎర్రబడటం, వాంతులు",
                "ஸ்ட்ரெப்சில்ஸ்", "அலெக்ஸ் சிரப்", "கிரோசின் சொட்டுகள்",
                "ஒவ்வொரு 4 மணி நேரத்திற்கும் ஒரு மென்முறுக்கு", "உணவுக்குப் பிறகு 5மில்லி, நாளில் 2 முறை", "உணவுக்குப் பிறகு 0.5மில்லி, நாளில் 2 முறை", "வாய் எரிச்சல், வாந்தி");
    }

    private void insertAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "allergy", "Cetzine", "Cetrizine Syrup", "Cetrizine Drops",
                "1 tablet at night", "5ml at night", "0.5ml at night", "Drowsiness, dry mouth",
                "సెట్జిన్", "సెట్రిజిన్ సిరప్", "సెట్రిజిన్ డ్రాప్స్",
                "రాత్రి 1 టాబ్లెట్", "రాత్రి 5ml", "రాత్రి 0.5ml", "నిద్ర, నోరు ఎండిపోవడం",
                "செட்ஸின்", "செட்ரிசின் சிரப்", "செட்ரிசின் சொட்டுகள்",
                "இரவு ஒரு மாத்திரை", "இரவு 5மில்லி", "இரவு 0.5மில்லி", "தூக்கமாக்கம், வாய் உலர்தல்");
    }

    private void insertStomachPainData(SQLiteDatabase db) {
        insertMedicine(db, "stomach pain", "Cyclopam", "Cyclopam Syrup", "Neopeptine Drops",
                "1 tablet after food, 2 times daily", "5ml after food, 2 times daily", "0.5ml after food, 2 times daily", "Dry mouth, dizziness",
                "సైక్లోపామ్", "సైక్లోపామ్ సిరప్", "నియోపెప్టిన్ డ్రాప్స్",
                "ఆహారం తరువాత 1 టాబ్లెట్, రోజుకు 2 సార్లు", "ఆహారం తరువాత 5ml, రోజుకు 2 సార్లు", "ఆహారం తరువాత 0.5ml, రోజుకు 2 సార్లు", "నోరు ఎండిపోవడం, తల తిరుగుడు",
                "சைக்கோபாம்", "சைக்கோபாம் சிரப்", "நியோபெப்டின் சொட்டுகள்",
                "உணவுக்குப் பிறகு ஒரு மாத்திரை, நாளில் 2 முறை", "உணவுக்குப் பிறகு 5மில்லி, நாளில் 2 முறை", "உணவுக்குப் பிறகு 0.5மில்லி, நாளில் 2 முறை", "வாய் உலர்தல், மயக்கம்");
    }

    private void insertEyeIrritationData(SQLiteDatabase db) {
        insertMedicine(db, "eye irritation", "Refresh Tears", "Tearfree Eye Drops", "Tearfree Eye Drops",
                "2 drops in affected eye, 3 times daily", "1 drop in affected eye, 2 times daily", "1 drop in affected eye, 1 time daily", "Eye redness, itching",
                "రిఫ్రెష్ టియర్స్", "టియర్‌ఫ్రీ ఐ డ్రాప్స్", "టియర్‌ఫ్రీ ఐ డ్రాప్స్",
                "ప్రతిరోజూ 3 సార్లు 2 చుక్కలు ప్రభావిత కంటిలో వేయాలి", "ప్రతిరోజూ 2 సార్లు 1 చుక్క", "ప్రతిరోజూ ఒకసారి 1 చుక్క", "కళ్ల ఎర్రదనం, గజ్జి",
                "ரிஃப்ரெஷ் டியர்ஸ்", "டியர்ஃப்ரீ கண் சொட்டுகள்", "டியர்ஃப்ரீ கண் சொட்டுகள்",
                "தினமும் 3 முறை பாதிக்கப்பட்ட கண்களில் 2 சொட்டுகள்", "தினமும் 2 முறை ஒரு சொட்டு", "தினமும் ஒரு முறை ஒரு சொட்டு", "கண் சிவத்தல், அரிப்பு");
    }
    private void insertFeverData(SQLiteDatabase db) {
        insertMedicine(db, "fever", "Dolo 650", "Calpol 250 Syrup", "Crocin Drops",
                "1 tablet every 6 hrs", "5ml every 6 hrs", "0.5–1ml every 6 hrs", "Nausea, liver issues",
                "డోలో 650", "క్యాల్పాల్ 250 సిరప్", "క్రోసిన్ డ్రాప్స్",
                "ప్రతి 6 గంటలకు 1 టాబ్లెట్", "ప్రతి 6 గంటలకు 5ml", "ప్రతి 6 గంటలకు 0.5–1ml", "వాంతులు, కాలేయ సమస్యలు",
                "டோலோ 650", "கால்பால் 250 சிரப்", "கிரோசின் சொட்டுகள்",
                "6 மணி நேரத்திற்கு ஒரு மாத்திரை", "6 மணி நேரத்திற்கு 5மில்லி", "6 மணி நேரத்திற்கு 0.5–1மில்லி", "வாந்தி, கல்லீரல் சிக்கல்");
    }

    private void insertColdData(SQLiteDatabase db) {
        insertMedicine(db, "cold", "Sinarest", "Coldact", "Nasivion Mini",
                "1 tablet twice daily", "5ml twice daily", "1 drop in each nostril twice daily", "Drowsiness, dry mouth",
                "సైనారెస్ట్", "కోల్డాక్ట్", "నాసివియన్ మినీ",
                "రోజు రెండుసార్లు 1 టాబ్లెట్", "రోజు రెండుసార్లు 5ml", "ప్రతి ముక్కులో 1 చుక్క రెండు సార్లు", "నిద్రలేమి, నోరు ఎండిపోవడం",
                "சைனரெஸ்ட்", "கோல்டாக்ட்", "நாசிவியன் மினி",
                "ஒரு மாத்திரை நாள் இரு முறை", "5மில்லி நாள் இரு முறை", "ஒவ்வொரு மூக்கிலும் ஒரு சொட்டு", "தூக்கமாக்கம், வாய் உலர்தல்");
    }

    private void insertHeadacheData(SQLiteDatabase db) {
        insertMedicine(db, "headache", "Paracetamol", "Junior Paracetamol", "Crocin Drops",
                "1 tablet after food", "5ml after food", "0.5–1ml after food", "Dizziness, nausea",
                "పారాసెటమాల్", "జూనియర్ పారాసెటమాల్", "క్రోసిన్ డ్రాప్స్",
                "భోజనం తరువాత 1 టాబ్లెట్", "భోజనం తరువాత 5ml", "భోజనం తరువాత 0.5–1ml", "తల తిరుగుడు, వాంతులు",
                "பாராசெடமால்", "ஜூனியர் பாராசெடமால்", "கிரோசின் சொட்டுகள்",
                "சாப்பாட்டுக்குப் பிறகு ஒரு மாத்திரை", "சாப்பாட்டுக்குப் பிறகு 5மில்லி", "சாப்பாட்டுக்குப் பிறகு 0.5–1மில்லி", "மயக்கம், வாந்தி");
    }

    private void insertVomitingData(SQLiteDatabase db) {
        insertMedicine(db, "vomiting", "Ondem 4mg", "Ondansetron Syrup", "Emeset Drops",
                "1 tablet after meals", "5ml after meals", "0.3–0.6ml after meals", "Constipation, headache",
                "ఒండెం 4mg", "ఒండాన్సెట్రాన్ సిరప్", "ఎమిసెట్ డ్రాప్స్",
                "ఆహారం తరువాత 1 టాబ్లెట్", "ఆహారం తరువాత 5ml", "ఆహారం తరువాత 0.3–0.6ml", "బద్దకము, తలనొప్పి",
                "ஒண்டெம் 4மி.கி", "ஒண்டான்செட்ரான் சிரப்", "எம்செட் சொட்டுகள்",
                "உணவிற்குப் பிறகு ஒரு மாத்திரை", "உணவிற்குப் பிறகு 5மில்லி", "உணவிற்குப் பிறகு 0.3–0.6மில்லி", "மலம் கடினமாகுதல், தலைவலி");
    }

    private void insertDiarrheaData(SQLiteDatabase db) {
        insertMedicine(db, "diarrhea", "Loperamide", "Racecadotril", "Zincovit Drops",
                "1 capsule after loose motion", "5ml twice daily", "1ml once daily", "Constipation, stomach cramps",
                "లోపెరమైడ్", "రేసెకాడోట్రిల్", "జింకోవిట్ డ్రాప్స్",
                "ఊదిన వెంటనే 1 క్యాప్సూల్", "రోజు రెండు సార్లు 5ml", "రోజుకు ఒకసారి 1ml", "బద్దకము, కడుపు ముడుతలు",
                "லோப்பெரமைடு", "ரேசிகாடோட்ரில்", "சிங்கோவிட் சொட்டுகள்",
                "விடுமூச்சிற்குப் பிறகு ஒரு கேப்ஸ்யூல்", "நாள் இரு முறை 5மில்லி", "ஒரு முறை ஒரு மில்லி", "மலம் கடினமாகுதல், வயிற்று வலிகள்");
    }
    private void insertCoughData(SQLiteDatabase db) {
        insertMedicine(db, "cough", "Ascoril D Plus", "Grilinctus BM", "Tixylix Drops",
                "1 tablet twice daily after food", "5ml twice daily after food", "0.5ml twice daily after food", "Drowsiness, dry mouth",
                "ఆస్కోరిల్ డి ప్లస్", "గ్రిలిన్క్టస్ బిఎమ్", "టిక్సిలిక్స్ డ్రాప్స్",
                "ఆహారం తరువాత రోజూ రెండు సార్లు 1 టాబ్లెట్", "ఆహారం తరువాత రోజూ రెండు సార్లు 5ml", "ఆహారం తరువాత రోజూ రెండు సార్లు 0.5ml", "నిద్రత, నోరు ఎండడం",
                "அஸ்கோரில் டி பிளஸ்", "கிரிலிங்க்டஸ் பிஎம்", "டிக்ஸிலிக்ஸ் சொட்டுகள்",
                "உணவிற்குப் பிறகு ஒரு மாத்திரை இரு முறை", "உணவிற்குப் பிறகு 5மில்லி இரு முறை", "உணவிற்குப் பிறகு 0.5மில்லி இரு முறை", "தூக்கம், வாய் உலர்வு");
    }

    private void insertAcidityData(SQLiteDatabase db) {
        insertMedicine(db, "acidity", "Rantac 150", "Junior Lanzol", "Junior Lanzol Drops",
                "1 tablet before breakfast", "5ml before food", "1ml before food", "Constipation, headache",
                "రాంటాక్ 150", "జూనియర్ లాంజోల్", "జూనియర్ లాంజోల్ డ్రాప్స్",
                "ప్రతీ రోజూ అల్పాహారం ముందు 1 టాబ్లెట్", "ఆహారం ముందు 5ml", "ఆహారం ముందు 1ml", "బద్దకము, తలనొప్పి",
                "ராண்டாக் 150", "ஜூனியர் லான்சோல்", "ஜூனியர் லான்சோல் சொட்டுகள்",
                "காலை உணவுக்கு முன் ஒரு மாத்திரை", "உணவுக்கு முன் 5மில்லி", "உணவுக்கு முன் 1மில்லி", "மலம் கடினம், தலைவலி");
    }

    private void insertConstipationData(SQLiteDatabase db) {
        insertMedicine(db, "constipation", "Cremaffin Plus", "Duphalac Syrup", "Colicaid Drops",
                "15ml at bedtime", "10ml at bedtime", "0.5ml twice daily", "Stomach cramps, nausea",
                "క్రెమాఫిన్ ప్లస్", "డ్యూఫాలాక్ సిరప్", "కోలికెయిడ్ డ్రాప్స్",
                "రాత్రి పడుకొనే ముందు 15ml", "రాత్రి పడుకొనే ముందు 10ml", "రోజూ రెండు సార్లు 0.5ml", "కడుపు ముడుతలు, వాంతులు",
                "கிரெமாஃபின் பிளஸ்", "டூபலக்ச் சிரப்", "கொலிகெய்ட் சொட்டுகள்",
                "உறங்கும் முன் 15மில்லி", "உறங்கும் முன் 10மில்லி", "இரண்டு முறை 0.5மில்லி", "வயிற்று வலிகள், வாந்தி");
    }

    private void insertEarPainData(SQLiteDatabase db) {
        insertMedicine(db, "ear pain", "Otek-AC Ear Drops", "Otek-AC Pediatric", "Otek-AC Infant Drops",
                "2 drops in affected ear twice daily", "2 drops twice daily", "1–2 drops twice daily", "Irritation, redness",
                "ఒటెక్-ఏసీ డ్రాప్స్", "ఒటెక్-ఏసీ పిల్లల డ్రాప్స్", "ఒటెక్-ఏసీ శిశు డ్రాప్స్",
                "పోరబడిన చెవిలో రోజుకు రెండు సార్లు 2 చుక్కలు", "రోజుకు రెండు సార్లు 2 చుక్కలు", "రోజుకు రెండు సార్లు 1-2 చుక్కలు", "చెవిలో రక్తం, ఎరుపు",
                "ஓடெக்-ஏசி காது சொட்டுகள்", "ஓடெக்-ஏசி பீடியாட்ரிக்", "ஓடெக்-ஏசி இன்ஃபண்ட்",
                "பாதிக்கப்பட்ட காது இரண்டு முறை 2 சொட்டு", "இரண்டு முறை 2 சொட்டு", "இரண்டு முறை 1–2 சொட்டு", "காதில் சிவப்பு, அரிப்பு");
    }

    private void insertToothacheData(SQLiteDatabase db) {
        insertMedicine(db, "toothache", "Ketorol DT", "Dolokind Plus", "Dentokind Drops",
                "1 tablet after food twice daily", "1 tablet after food twice daily", "2 drops thrice daily", "Stomach upset, dizziness",
                "కెటరోల్ డిటి", "డోలోకైండ్ ప్లస్", "డెంటోకైండ్ డ్రాప్స్",
                "ఆహారం తర్వాత రోజుకు రెండు సార్లు 1 టాబ్లెట్", "ఆహారం తర్వాత రోజుకు రెండు సార్లు 1 టాబ్లెట్", "రోజుకు మూడుసార్లు 2 చుక్కలు", "అజీర్ణం, తల తిరుగుడు",
                "கெடோரால் டிடி", "டோலோகைண்ட் பிளஸ்", "டெண்டோகைண்ட் சொட்டுகள்",
                "உணவுக்குப் பிறகு இரு முறை ஒரு மாத்திரை", "உணவுக்குப் பிறகு இரு முறை ஒரு மாத்திரை", "மூன்று முறை 2 சொட்டு", "வயிறு பிரச்சனை, மயக்கம்");
    }
    private void insertIndigestionData(SQLiteDatabase db) {
        insertMedicine(db, "indigestion",
                "Digene", "Digene Gel", "Neopeptine Drops",
                "2 teaspoons after meals", "1 teaspoon after meals", "0.5ml after meals", "Bloating, mild constipation",
                "డైజిన్", "డైజిన్ జెల్", "నియోపెప్టిన్ డ్రాప్స్",
                "ఆహారం తర్వాత 2 టీ స్పూన్లు", "ఆహారం తర్వాత 1 టీ స్పూన్", "ఆహారం తర్వాత 0.5ml", "ఉబ్బసం, తేలికపాటి బద్ధకము",
                "டிஜின்", "டிஜின் ஜெல்", "நியோபெப்டின் சொட்டுகள்",
                "உணவுக்குப் பிறகு 2 டீஸ்பூன்", "உணவுக்குப் பிறகு 1 டீஸ்பூன்", "உணவுக்குப் பிறகு 0.5மில்லி", "வயிறு உப்பளம், மலச்சிக்கல்");

    }

    private void insertMotionSicknessData(SQLiteDatabase db) {
        insertMedicine(db, "motion sickness",
                "Avomine", "Domstal Syrup", "Emeset Drops",
                "1 tablet 30 mins before travel", "5ml 30 mins before travel", "0.5ml 30 mins before travel", "Drowsiness, dry mouth",
                "అవొమైన్", "డామ్‌స్టాల్ సిరప్", "ఎమిసెట్ డ్రాప్స్",
                "ప్రయాణానికి 30 నిమిషాల ముందు 1 టాబ్లెట్", "ప్రయాణానికి 30 నిమిషాల ముందు 5ml", "ప్రయాణానికి 30 నిమిషాల ముందు 0.5ml", "నిద్రత, నోరు ఎండడం",
                "அவோமைன்", "டோம்‌ஸ்டால் சிரப்", "எம்செட் சொட்டுகள்",
                "பயணத்திற்கு 30 நிமிடம் முன் 1 மாத்திரை", "பயணத்திற்கு 30 நிமிடம் முன் 5மில்லி", "பயணத்திற்கு 30 நிமிடம் முன் 0.5மில்லி", "தூக்கம், வாய் உலர்வு");

    }
    private void insertNoseBlockData(SQLiteDatabase db) {
        insertMedicine(db, "nose block",
                "Otrivin Adult", "Otrivin Pediatric", "Nasivion Mini",
                "1 spray in each nostril, 2 times daily", "1 drop in each nostril, 2 times daily", "1 drop in each nostril, once daily", "Nasal dryness, burning sensation",
                "ఒట్రివిన్ అడల్ట్", "ఒట్రివిన్ పీడియాట్రిక్", "నాసివియన్ మినీ",
                "ప్రతి ముక్కులో 1 స్ప్రే, రోజుకు 2 సార్లు", "ప్రతి ముక్కులో 1 చుక్క, రోజుకు 2 సార్లు", "ప్రతి ముక్కులో 1 చుక్క, రోజు ఒకసారి", "ముక్కు ఎండిపోవడం, కాలినట్లు అనిపించడం",
                "ஓட்ரிவின் அடல்ட்", "ஓட்ரிவின் பீடியாட்ரிக்", "நாசிவியன் மினி",
                "ஒவ்வொரு மூக்கிலும் 1 ஸ்பிரே, நாள் 2 முறை", "ஒவ்வொரு மூக்கிலும் 1 சொட்டு, நாள் 2 முறை", "ஒவ்வொரு மூக்கிலும் 1 சொட்டு, நாள் 1 முறை", "மூக்கு உலர்ச்சி, எரிச்சல்");

    }

    private void insertItchingRashesData(SQLiteDatabase db) {
        insertMedicine(db, "itching",
                "Candid B Cream", "Candid Kids Cream", "Candid Baby Powder",
                "Apply thin layer twice daily", "Apply gently twice daily", "Apply powder once daily", "Redness, mild irritation",
                "కాండిడ్ బి క్రీమ్", "కాండిడ్ కిడ్స్ క్రీమ్", "కాండిడ్ బేబీ పొడి",
                "రోజుకు రెండు సార్లు పలుచగా అప్లై చేయాలి", "రోజుకు రెండు సార్లు నెమ్మదిగా అప్లై చేయాలి", "రోజుకు ఒకసారి పొడి వేయాలి", "ఎర్రదనం, తేలికపాటి జలుబు",
                "கேண்டிட் பி கிரீம்", "கேண்டிட் கிட்ஸ் கிரீம்", "கேண்டிட் பேபி பவுடர்",
                "நாள் இரு முறை மெல்ல தடவவும்", "நாள் இரு முறை மெதுவாக தடவவும்", "நாள் 1 முறை தூளாகப் பயன்படுத்தவும்", "சிவத்தல், லேசான எரிச்சல்");

    }

    private void insertWormsData(SQLiteDatabase db) {
        insertMedicine(db, "worms",
                "Zentel 400mg", "Zentel Syrup", "Zentel Drops",
                "1 tablet once at night", "10ml once at night", "0.5ml once at night", "Abdominal pain, nausea",
                "జెంటెల్ 400mg", "జెంటెల్ సిరప్", "జెంటెల్ డ్రాప్స్",
                "రాత్రి 1 టాబ్లెట్", "రాత్రి 10ml", "రాత్రి 0.5ml", "కడుపు నొప్పి, వాంతులు",
                "சென்டெல் 400மி.கி", "சென்டெல் சிரப்", "சென்டெல் சொட்டுகள்",
                "இரவு 1 மாத்திரை", "இரவு 10மில்லி", "இரவு 0.5மில்லி", "வயிற்று வலி, வாந்தி");
    }
    private void insertMinorBurnData(SQLiteDatabase db) {
        insertMedicine(db, "minor burn",
                "Silverex Cream", "Burnol", "Burnol",
                "Apply thin layer on burn area twice daily", "Apply gently twice daily", "Apply gently twice daily", "Itching, mild redness",
                "సిల్వరెక్స్ క్రీమ్", "బర్నాల్", "బర్నాల్",
                "గాయమైన ప్రదేశంలో పలుచగా రాసి రోజుకు 2 సార్లు అప్లై చేయాలి", "రోజుకు 2 సార్లు అప్లై చేయాలి", "రోజుకు 2 సార్లు అప్లై చేయాలి", "గజ్జి, స్వల్ప ఎర్రదనం",
                "சில்வெரெக்ஸ் கிரீம்", "பர்னால்", "பர்னால்",
                "புண் பகுதியில் மெதுவாக இரு முறை தடவவும்", "இரு முறை மெதுவாக தடவவும்", "இரு முறை மெதுவாக தடவவும்", "அரிப்பு, சிவப்பு");
    }
    private void insertChickenpoxData(SQLiteDatabase db) {
        insertMedicine(db, "chickenpox",
                "Calamine Lotion", "Calamine Lotion", "Calamine Lotion",
                "Apply gently 3–4 times daily", "Apply gently 3 times daily", "Apply gently 2 times daily", "Skin dryness, irritation",
                "కాలమైన్ లోషన్", "కాలమైన్ లోషన్", "కాలమైన్ లోషన్",
                "రోజుకు 3-4 సార్లు మృదువుగా అప్లై చేయాలి", "రోజుకు 3 సార్లు అప్లై చేయాలి", "రోజుకు 2 సార్లు అప్లై చేయాలి", "చర్మ ఎండదనం, అసహనం",
                "காலமைன் லோஷன்", "காலமைன் லோஷன்", "காலமைன் லோஷன்",
                "தினம் 3–4 முறை மெதுவாக தடவவும்", "தினம் 3 முறை மெதுவாக", "தினம் 2 முறை மெதுவாக", "தோல் உலர்ச்சி, எரிச்சல்");
    }

    private void insertEyeRednessData(SQLiteDatabase db) {
        insertMedicine(db, "eye redness",
                "Tears Plus", "Tearfree Kids", "Tearfree Infant",
                "1 drop in affected eye 3 times daily", "1 drop 2 times daily", "1 drop once daily", "Temporary blur, stinging",
                "టియర్స్ ప్లస్", "టియర్‌ఫ్రీ కిడ్స్", "టియర్‌ఫ్రీ శిశువు",
                "ప్రభావిత కంటిలో రోజుకు 3 సార్లు 1 చుక్క", "రోజుకు 2 సార్లు 1 చుక్క", "రోజుకు 1 సారి 1 చుక్క", "తాత్కాలిక అస్పష్టత, కాలినట్టు అనిపించటం",
                "டியர்ஸ் பிளஸ்", "டியர்ஃப்ரீ குழந்தை", "டியர்ஃப்ரீ குட்டிகள்",
                "பாதிக்கப்பட்ட கண்களில் 3 முறை 1 சொட்டு", "2 முறை 1 சொட்டு", "1 முறை 1 சொட்டு", "தற்காலிக மங்கல், எரிச்சல்");
    }
    private void insertNasalCongestionData(SQLiteDatabase db) {
        insertMedicine(db, "nasal congestion",
                "Sinarest Nasal Spray", "Nasivion Pediatric", "Nasivion Mini",
                "1 spray per nostril, 3 times daily", "1 drop per nostril, twice daily", "1 drop per nostril, once daily", "Dryness, sneezing",
                "సైనారెస్ట్ స్ప్రే", "నాసివియన్ పీడియాట్రిక్", "నాసివియన్ మినీ",
                "ప్రతి ముక్కులో 1 స్ప్రే, రోజుకు 3 సార్లు", "రోజుకు రెండు సార్లు ప్రతి ముక్కులో 1 చుక్క", "రోజుకు ఒకసారి ప్రతి ముక్కులో 1 చుక్క", "ముక్కు ఎండిపోవడం, తుమ్ములు",
                "சைனரெஸ்ட் மூக்கு ஸ்ப்ரே", "நாசிவியன் பீடியாட்ரிக்", "நாசிவியன் மினி",
                "மூன்றுமுறை ஒவ்வொரு மூக்கிலும் 1 ஸ்ப்ரே", "2 முறை ஒவ்வொரு மூக்கிலும் 1 சொட்டு", "1 முறை ஒவ்வொரு மூக்கிலும் 1 சொட்டு", "மூக்கு உலர்ச்சி, தும்மல்");

    }
    private void insertHeatRashData(SQLiteDatabase db) {
        insertMedicine(db, "heat rash",
                "Candid Dusting Powder", "Candid Kids Powder", "Candid Baby Powder",
                "Dust affected area twice daily", "Apply powder twice daily", "Apply powder once daily", "Redness, itching",
                "కాండిడ్ డస్టింగ్ పొడి", "కాండిడ్ కిడ్స్ పొడి", "కాండిడ్ బేబీ పొడి",
                "ప్రభావిత ప్రాంతంలో రోజుకు రెండు సార్లు పొడి వేయాలి", "రోజుకు రెండు సార్లు వేయాలి", "రోజుకు ఒకసారి వేయాలి", "ఎర్రదనం, గజ్జి",
                "கேண்டிட் தூள்", "கேண்டிட் குழந்தை தூள்", "கேண்டிட் பேபி பவுடர்",
                "பாதிக்கப்பட்ட பகுதியில் இரு முறை தூளாக்கவும்", "இரு முறை தூளாக்கவும்", "ஒரு முறை தூளாக்கவும்", "சிவத்தல், அரிப்பு");
    }
    private void insertJointPainData(SQLiteDatabase db) {
        insertMedicine(db, "joint pain",
                "Volini Gel", "Volini Gel", "Mustard Oil Massage",
                "Apply gently on joints twice daily", "Apply gently on joints twice daily", "Massage lightly once daily", "Skin irritation, mild warmth",
                "వోలిని జెల్", "వోలిని జెల్", "ఆవాల నూనె మసాజ్",
                "జాయింట్లపై రోజుకు రెండు సార్లు అప్లై చేయాలి", "జాయింట్లపై మృదువుగా రాయాలి", "రోజుకు ఒకసారి మృదువుగా మసాజ్ చేయాలి", "చర్మం తట్టుకోలేకపోవడం, వేడి",
                "வொலினி ஜெல்", "வொலினி ஜெல்", "கடுகு எண்ணெய் மசாஜ்",
                "முழங்கால்களில் மெதுவாக 2 முறை தடவவும்", "மெதுவாக 2 முறை", "1 முறை மெதுவாக மசாஜ் செய்யவும்", "சிறு எரிச்சல், வெப்பம்"
        );
    }
    private void insertMeaslesData(SQLiteDatabase db) {
        insertMedicine(db, "measles",
                "Paracetamol", "Calpol Syrup", "Crocin Drops",
                "1 tablet for fever, 2 times daily", "5ml for fever, twice daily", "0.5ml for fever, twice daily", "Rash, fatigue",
                "పారాసెటమాల్", "క్యాల్పాల్ సిరప్", "క్రోసిన్ డ్రాప్స్",
                "జ్వరం వచ్చినప్పుడు రోజుకు 2 సార్లు 1 టాబ్లెట్", "రోజుకు రెండు సార్లు 5ml", "రోజుకు రెండు సార్లు 0.5ml", "చర్మం మీద దద్దుర్లు, అలసట",
                "பாராசெடமால்", "கால்பால் சிரப்", "கிரோசின் சொட்டுகள்",
                "இரண்டு முறை 1 மாத்திரை", "இரண்டு முறை 5மில்லி", "இரண்டு முறை 0.5மில்லி", "தோல் ரேஷ், சோர்வு"
        );
    }
    private void insertMouthInfectionData(SQLiteDatabase db) {
        insertMedicine(db, "mouth infection",
                "Betadine Mouthwash", "Betadine Gargle", "Glycerin Borax",
                "Gargle twice daily after meals", "Gargle once daily", "Apply gently with finger twice daily", "Staining of teeth, irritation",
                "బెటాడైన్ మౌత్‌వాష్", "బెటాడైన్ గార్గిల్", "గ్లిసరిన్ బోరాక్స్",
                "ఆహారం తరువాత రోజుకు రెండు సార్లు గార్గిల్ చేయాలి", "రోజుకు ఒకసారి గార్గిల్ చేయాలి", "రోజుకు రెండు సార్లు మృదువుగా రాయాలి", "పళ్ల పసుపు రంగు, అసహనం",
                "பெட்டாடின் வாய்வெளி", "பெட்டாடின் கரகிள்", "கிளிசரின் போராக்ஸ்",
                "இரண்டு முறை கருகல் செய்யவும்", "1 முறை கருகல்", "இரண்டு முறை மெதுவாக தடவவும்", "பற்கள் மஞ்சள், எரிச்சல்"
        );
    }
    private void insertEarDischargeData(SQLiteDatabase db) {
        insertMedicine(db, "ear discharge",
                "Ciplox Ear Drops", "Otek-AC Pediatric", "Ciplox D Drops",
                "2 drops twice daily", "2 drops twice daily", "1 drop twice daily", "Irritation, stinging",
                "సిప్లాక్స్ డ్రాప్స్", "ఒటెక్-ఏసీ పిల్లల డ్రాప్స్", "సిప్లాక్స్ డి డ్రాప్స్",
                "రోజుకు రెండు సార్లు 2 చుక్కలు", "రోజుకు రెండు సార్లు 2 చుక్కలు", "రోజుకు రెండు సార్లు 1 చుక్క", "క్లేశం, కాలినట్లు అనిపించటం",
                "சிப்ளாக்ஸ் சொட்டுகள்", "ஓடெக்-ஏசி பீடியாட்ரிக்", "சிப்ளாக்ஸ் டி சொட்டுகள்",
                "இரு முறை 2 சொட்டு", "இரு முறை 2 சொட்டு", "இரு முறை 1 சொட்டு", "அரிப்பு, எரிச்சல்"
        );
    }
    private void insertMinorCutsData(SQLiteDatabase db) {
        insertMedicine(db, "minor cuts",
                "Betadine Cream", "Savlon Antiseptic", "Cipladine Ointment",
                "Apply on wound twice daily", "Apply gently twice daily", "Apply gently twice daily", "Burning, redness",
                "బెటాడైన్ క్రీమ్", "సావ్లాన్ యాంటిసెప్టిక్", "సిప్లాడిన్ ఆయింట్‌మెంట్",
                "గాయంపై రోజుకు రెండు సార్లు అప్లై చేయాలి", "రోజుకు రెండు సార్లు అప్లై చేయాలి", "రోజుకు రెండు సార్లు అప్లై చేయాలి", "కాలినట్లు, ఎర్రదనం",
                "பெட்டாடின் கிரீம்", "சாவ்லான் கிரீம்", "சிப்லாடின் ஒயின்மென்ட்",
                "புண் பகுதியில் 2 முறை தடவவும்", "2 முறை மெதுவாக தடவவும்", "2 முறை மெதுவாக தடவவும்", "எரிச்சல், சிவத்தல்"
        );
    }
    private void insertChestCongestionData(SQLiteDatabase db) {
        insertMedicine(db, "chest congestion",
                "Ambroxol Tablet", "Ambrodil Syrup", "Tixylix AF Drops",
                "1 tablet twice daily", "5ml twice daily", "0.5ml twice daily", "Cough, mild nausea",
                "అంబ్రోక్సాల్ టాబ్లెట్", "అంబ్రోడిల్ సిరప్", "టిక్సిలిక్స్ AF డ్రాప్స్",
                "రోజుకు రెండు సార్లు 1 టాబ్లెట్", "రోజుకు రెండు సార్లు 5ml", "రోజుకు రెండు సార్లు 0.5ml", "దగ్గు, తేలికపాటి వాంతులు",
                "அம்பிரோக்சோல் மாத்திரை", "அம்ப்ரோடில் சிரப்", "டிக்ஸிலிக்ஸ் ஏஎஃப் சொட்டுகள்",
                "2 முறை மாத்திரை", "2 முறை 5மில்லி", "2 முறை 0.5மில்லி", "இருமல், மயக்கம்"
        );
    }
    private void insertSkinAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "skin allergy",
                "Atarax", "Atarax Syrup", "Calamine Lotion",
                "1 tablet at night", "5ml at night", "Apply once daily", "Drowsiness, dry skin",
                "అటరాక్స్", "అటరాక్స్ సిరప్", "కాలమైన్ లోషన్",
                "రాత్రి 1 టాబ్లెట్", "రాత్రి 5ml", "రోజుకు ఒక్కసారే అప్లై చేయాలి", "నిద్ర, ఎండిపోయిన చర్మం",
                "அட்டராக்ஸ்", "அட்டராக்ஸ் சிரப்", "காலமைன் லோஷன்",
                "இரவு 1 மாத்திரை", "இரவு 5மில்லி", "நாள் 1 முறை தடவவும்", "தூக்கம், உலர்ந்த தோல்"
        );
    }
    private void insertHiccupsData(SQLiteDatabase db) {
        insertMedicine(db, "hiccups",
                "Domstal", "Domstal Syrup", "Neopeptine Drops",
                "1 tablet after meals", "5ml after meals", "0.5ml after meals", "Drowsiness, dry mouth",
                "డామ్‌స్టాల్", "డామ్‌స్టాల్ సిరప్", "నియోపెప్టిన్ డ్రాప్స్",
                "ఆహారం తర్వాత 1 టాబ్లెట్", "ఆహారం తర్వాత 5ml", "ఆహారం తర్వాత 0.5ml", "నిద్రత, నోరు ఎండడం",
                "டோம்‌ஸ்டால்", "டோம்‌ஸ்டால் சிரப்", "நியோபெப்டின் சொட்டுகள்",
                "உணவிற்குப் பிறகு 1 மாத்திரை", "உணவிற்குப் பிறகு 5மில்லி", "உணவிற்குப் பிறகு 0.5மில்லி", "தூக்கம், வாய் உலர்வு"
        );
    }
    private void insertFungalInfectionData(SQLiteDatabase db) {
        insertMedicine(db, "fungal infection",
                "Clotrimazole Cream", "Candid Kids Cream", "Candid Baby Powder",
                "Apply twice daily", "Apply gently twice daily", "Apply once daily", "Redness, mild irritation",
                "క్లోట్రిమాజోల్ క్రీమ్", "కాండిడ్ కిడ్స్ క్రీమ్", "కాండిడ్ బేబీ పొడి",
                "రోజుకు రెండు సార్లు అప్లై చేయాలి", "రోజుకు రెండు సార్లు నెమ్మదిగా అప్లై చేయాలి", "రోజుకు ఒక్కసారి అప్లై చేయాలి", "చర్మం ఎర్రబడటం, తేలికపాటి అసహనం",
                "க்ளோட்ரிமாஸோல் கிரீம்", "கேண்டிட் கிட்ஸ் கிரீம்", "கேண்டிட் பேபி பவுடர்",
                "2 முறை தடவவும்", "2 முறை மெதுவாக", "1 முறை பவுடர்", "சிவத்தல், லேசான எரிச்சல்"
        );
    }
    private void insertHFMDData(SQLiteDatabase db) {
        insertMedicine(db, "hfmd",
                "Paracetamol", "Calpol Syrup", "Crocin Drops",
                "1 tablet for fever & pain", "5ml twice daily", "0.5ml twice daily", "Rash, fever, fatigue",
                "పారాసెటమాల్", "క్యాల్పాల్ సిరప్", "క్రోసిన్ డ్రాప్స్",
                "జ్వరం, నొప్పి కోసం 1 టాబ్లెట్", "రోజుకు రెండు సార్లు 5ml", "రోజుకు రెండు సార్లు 0.5ml", "చర్మం మీద దద్దుర్లు, జ్వరం, అలసట",
                "பாராசெடமால்", "கால்பால் சிரப்", "கிரோசின் சொட்டுகள்",
                "காய்ச்சல் மற்றும் வலிக்கு 1 மாத்திரை", "2 முறை 5மில்லி", "2 முறை 0.5மில்லி", "தோல் ரேஷ், காய்ச்சல், சோர்வு"
        );
    }
    private void insertBurnsData(SQLiteDatabase db) {
        insertMedicine(db, "burns",
                "Silverex Cream", "Burnol Cream", "Cipladine Ointment",
                "Apply gently on affected area", "Apply twice daily", "Apply twice daily", "Skin irritation",
                "సిల్వెరెక్స్ క్రీమ్", "బర్నోల్ క్రీమ్", "సిప్లాడిన్ ఆయింట్‌మెంట్",
                "గాయమైన ప్రదేశంలో మృదువుగా అప్లై చేయాలి", "రోజుకు రెండు సార్లు", "రోజుకు రెండు సార్లు", "చర్మం అసహనం",
                "சில்வெரெக்ஸ் கிரீம்", "பர்னோல் கிரீம்", "சிப்லாடின் ஒயின்மென்ட்",
                "பாதிக்கப்பட்ட இடத்தில் மெதுவாக தடவவும்", "2 முறை", "2 முறை", "தோல் எரிச்சல்"
        );
    }
    private void insertTeethingPainData(SQLiteDatabase db) {
        insertMedicine(db, "teething pain",
                "Calpol", "Calpol Syrup", "Dentokind Drops",
                "1 tablet if fever", "5ml if needed", "2 drops 3 times daily", "Irritability, mild fever",
                "క్యాల్పాల్", "క్యాల్పాల్ సిరప్", "డెంటోకైండ్ డ్రాప్స్",
                "జ్వరం ఉంటే 1 టాబ్లెట్", "అవసరమైతే 5ml", "రోజుకు మూడుసార్లు 2 చుక్కలు", "చలికాలం, చిరాకు",
                "கால்பால்", "கால்பால் சிரப்", "டெண்டோகைண்ட் சொட்டுகள்",
                "காய்ச்சல் இருந்தால் 1 மாத்திரை", "தேவைப்பட்டால் 5மில்லி", "3 முறை 2 சொட்டு", "சிறு காய்ச்சல், எரிச்சல்"
        );
    }
    private void insertCrackedLipsData(SQLiteDatabase db) {
        insertMedicine(db, "cracked lips",
                "Boroline", "Himalaya Lip Balm", "Coconut Oil",
                "Apply gently on lips 2–3 times daily", "Apply 2 times daily", "Apply gently once daily", "No major side effects",
                "బోరోలిన్", "హిమాలయా లిప్ బామ్", "కొబ్బరి నూనె",
                "రోజుకు 2–3 సార్లు మృదువుగా అప్లై చేయాలి", "రోజుకు రెండు సార్లు అప్లై చేయాలి", "రోజుకు ఒక్కసారి", "పక్కదుష్ప్రభావాలు లేవు",
                "போரோலின்", "இமாலயா லிப் பாம்", "தேங்காய் எண்ணெய்",
                "2–3 முறை மெதுவாக தடவவும்", "2 முறை", "1 முறை", "பக்கவிளைவுகள் இல்லை"
        );
    }
    private void insertThroatIrritationData(SQLiteDatabase db) {
        insertMedicine(db, "throat irritation",
                "Strepsils", "Alex Syrup", "Crocin Drops",
                "1 lozenge every 4 hours", "5ml twice daily", "0.5ml twice daily", "Mouth irritation, nausea",
                "స్ట్రెప్సిల్స్", "ఆలెక్స్ సిరప్", "క్రోసిన్ డ్రాప్స్",
                "ప్రతి 4 గంటలకు 1 ముంచెము", "రోజుకు రెండు సార్లు 5ml", "రోజుకు రెండు సార్లు 0.5ml", "నోరు ఎర్రపడటం, వాంతులు",
                "ஸ்ட்ரெப்சில்ஸ்", "அலெக்ஸ் சிரப்", "கிரோசின் சொட்டுகள்",
                "4 மணி நேரத்திற்கு ஒரு மென்முறுக்கு", "2 முறை 5மில்லி", "2 முறை 0.5மில்லி", "வாய் எரிச்சல், வாந்தி"
        );
    }
    private void insertSunburnData(SQLiteDatabase db) {
        insertMedicine(db, "sunburn",
                "Aloe Vera Gel", "Himalaya Aloe Lotion", "Coconut Oil",
                "Apply twice daily", "Apply gently twice daily", "Apply gently once daily", "Redness, mild burning",
                "ఆలోవెరా జెల్", "హిమాలయా ఆలోలోషన్", "కొబ్బరి నూనె",
                "రోజుకు రెండు సార్లు అప్లై చేయాలి", "రోజుకు రెండు సార్లు నెమ్మదిగా అప్లై చేయాలి", "రోజుకు ఒక్కసారి అప్లై చేయాలి", "ఎర్రదనం, తేలికపాటి కాలినట్లు",
                "ஆலோவேரா ஜெல்", "இமாலயா ஆலோ லோஷன்", "தேங்காய் எண்ணெய்",
                "2 முறை தடவவும்", "2 முறை மெதுவாக", "1 முறை மெதுவாக", "சிவத்தல், எரிச்சல்"
        );
    }
    private void insertNauseaData(SQLiteDatabase db) {
        insertMedicine(db, "nausea",
                "Domperidone", "Domstal Syrup", "Emeset Drops",
                "1 tablet before meals", "5ml before meals", "0.5ml before meals", "Dry mouth, dizziness",
                "డోంపెరిడోన్", "డామ్‌స్టాల్ సిరప్", "ఎమిసెట్ డ్రాప్స్",
                "ఆహారం ముందు 1 టాబ్లెట్", "ఆహారం ముందు 5ml", "ఆహారం ముందు 0.5ml", "నోరు ఎండిపోవడం, తలనుపి",
                "டொம்பெரிடோன்", "டோம்‌ஸ்டால் சிரப்", "எம்செட் சொட்டுகள்",
                "உணவிற்கு முன் 1 மாத்திரை", "உணவிற்கு முன் 5மில்லி", "உணவிற்கு முன் 0.5மில்லி", "வாய் உலர்வு, மயக்கம்"
        );
    }
    private void insertGasTroubleData(SQLiteDatabase db) {
        insertMedicine(db, "gas trouble",
                "Gelusil", "Gelusil Syrup", "Colicaid Drops",
                "2 teaspoons after meals", "1 teaspoon after meals", "0.5ml after meals", "Stomach discomfort",
                "జెలుసిల్", "జెలుసిల్ సిరప్", "కోలికెయిడ్ డ్రాప్స్",
                "ఆహారం తర్వాత 2 టీ స్పూన్లు", "ఆహారం తర్వాత 1 టీ స్పూన్", "ఆహారం తర్వాత 0.5ml", "కడుపులో అసౌకర్యం",
                "ஜெலுசில்", "ஜெலுசில் சிரப்", "கொலிகேய் சொட்டுகள்",
                "உணவிற்குப் பிறகு 2 டீஸ்பூன்", "1 டீஸ்பூன்", "0.5மில்லி", "வயிறு 불편ம்"
        );
    }
    private void insertDehydrationData(SQLiteDatabase db) {
        insertMedicine(db, "dehydration",
                "ORS Powder", "ORS Solution", "ORS Drops",
                "Mix and sip frequently", "100ml after loose motion", "5ml after loose motion", "No major side effects",
                "ఒఆర్ఎస్ పొడి", "ఒఆర్ఎస్ ద్రావణం", "ఒఆర్ఎస్ డ్రాప్స్",
                "తరచూ తాగాలి", "లూజ్ మోషన్ తరువాత 100ml", "లూజ్ మోషన్ తరువాత 5ml", "పక్కదుష్ప్రభావాలు లేవు",
                "ஓஆர்எஸ் தூள்", "ஓஆர்எஸ் திரவம்", "ஓஆர்எஸ் சொட்டுகள்",
                "மிகவும் குடிக்க வேண்டும்", "தயார் செய்து 100மில்லி", "5மில்லி", "பக்கவிளைவுகள் இல்லை"
        );
    }
    private void insertSneezingData(SQLiteDatabase db) {
        insertMedicine(db, "sneezing",
                "Cetirizine", "Cetzine Syrup", "Cetzine Drops",
                "1 tablet at night", "5ml at night", "0.5ml at night", "Drowsiness",
                "సెటిరిజిన్", "సెట్జిన్ సిరప్", "సెట్జిన్ డ్రాప్స్",
                "రాత్రి 1 టాబ్లెట్", "రాత్రి 5ml", "రాత్రి 0.5ml", "నిద్రత",
                "செடிரிசின்", "செட்ஸின் சிரப்", "செட்ஸின் சொட்டுகள்",
                "இரவு 1 மாத்திரை", "இரவு 5மில்லி", "இரவு 0.5மில்லி", "தூக்கம்"
        );
    }
    private void insertBackPainData(SQLiteDatabase db) {
        insertMedicine(db, "back pain",
                "Flexon MR", "Ibugesic Plus Syrup", "Crocin Drops",
                "1 tablet after food", "5ml after food", "0.5ml after food", "Stomach upset, dizziness",
                "ఫ్లెక్సాన్ MR", "ఇబ్యూజెసిక్ ప్లస్ సిరప్", "క్రోసిన్ డ్రాప్స్",
                "ఆహారం తర్వాత 1 టాబ్లెట్", "ఆహారం తర్వాత 5ml", "ఆహారం తర్వాత 0.5ml", "కడుపు 불편ం, తలనుపి",
                "ஃபிளெக்சான் எம்.ஆர்.", "இப்யூஜெசிக் பிளஸ் சிரப்", "கிரோசின் சொட்டுகள்",
                "உணவிற்குப் பிறகு 1 மாத்திரை", "5மில்லி", "0.5மில்லி", "வயிறு எரிச்சல், மயக்கம்"
        );
    }
    private void insertDryCoughData(SQLiteDatabase db) {
        insertMedicine(db, "dry cough",
                "Benadryl Dry Cough", "Chericof Syrup", "Tixylix Drops",
                "2 tsp twice daily", "5ml twice daily", "0.5ml twice daily", "Drowsiness",
                "బెనాడ్రిల్ డ్రై కఫ్", "చెరికాఫ్ సిరప్", "టిక్సిలిక్స్ డ్రాప్స్",
                "రోజుకు రెండు సార్లు 2 టీ స్పూన్లు", "రోజుకు రెండు సార్లు 5ml", "రోజుకు రెండు సార్లు 0.5ml", "నిద్రత",
                "பெனட்ரில் டிரை காஃப்", "செரிகாஃப் சிரப்", "டிக்ஸிலிக்ஸ் சொட்டுகள்",
                "2 முறை 2 டீஸ்பூன்", "2 முறை 5மில்லி", "2 முறை 0.5மில்லி", "தூக்கம்"
        );
    }
    private void insertHairLiceData(SQLiteDatabase db) {
        insertMedicine(db, "hair lice",
                "Permite Lotion", "Mediker Shampoo", "Lice Shield",
                "Apply once weekly", "Use twice weekly", "Apply gently once", "Itching, mild rash",
                "పెర్మైట్ లోషన్", "మెడికర్ షాంపూ", "లైస్ షీల్డ్",
                "వారం లో ఒకసారి అప్లై చేయాలి", "వారం లో రెండు సార్లు వాడాలి", "ఒక్కసారి అప్లై చేయాలి", "కుట్టడం, తేలికపాటి ర్యాష్",
                "பெர்மைட் லோஷன்", "மெடிகர் ஷாம்பு", "லைஸ் ஷீல்ட்",
                "வாரத்திற்கு 1 முறை", "வாரத்திற்கு 2 முறை", "1 முறை", "நச்சு, லேசான ரேஷ்"
        );
    }
    private void insertTeethingFeverData(SQLiteDatabase db) {
        insertMedicine(db, "teething fever",
                "Paracetamol", "Calpol Syrup", "Crocin Drops",
                "1 tablet after food", "5ml after food", "0.5ml after food", "Fever, mild drowsiness",
                "పారాసెటమాల్", "క్యాల్పాల్ సిరప్", "క్రోసిన్ డ్రాప్స్",
                "ఆహారం తర్వాత 1 టాబ్లెట్", "ఆహారం తర్వాత 5ml", "ఆహారం తర్వాత 0.5ml", "జ్వరం, తేలికపాటి నిద్ర",
                "பாராசெடமால்", "கால்பால் சிரப்", "கிரோசின் சொட்டுகள்",
                "உணவிற்குப் பிறகு 1 மாத்திரை", "5மில்லி", "0.5மில்லி", "காய்ச்சல், தூக்கம்"
        );
    }
    private void insertThroatInfectionData(SQLiteDatabase db) {
        insertMedicine(db, "throat infection",
                "Azithral 500", "Azithral Syrup", "Crocin Drops",
                "1 tablet daily for 3 days", "5ml daily for 3 days", "0.5ml daily for 3 days", "Nausea, diarrhea",
                "అజిత్రాల్ 500", "అజిత్రాల్ సిరప్", "క్రోసిన్ డ్రాప్స్",
                "3 రోజులు రోజూ 1 టాబ్లెట్", "3 రోజులు రోజూ 5ml", "3 రోజులు రోజూ 0.5ml", "వాంతులు, డయేరియా",
                "அசித்ரல் 500", "அசித்ரல் சிரப்", "கிரோசின் சொட்டுகள்",
                "3 நாட்களுக்கு 1 மாத்திரை", "3 நாட்களுக்கு 5மில்லி", "3 நாட்களுக்கு 0.5மில்லி", "வாந்தி, வயிற்றோடு நசுக்கம்"
        );
    }
    private void insertMouthUlcerData(SQLiteDatabase db) {
        insertMedicine(db, "mouth ulcer",
                "Hexigel", "Rexidin M Forte Gel", "Dologel Jr",
                "Apply 2–3 times daily", "Apply gently 2 times", "Apply once daily", "Mouth irritation",
                "హెక్సిజెల్", "రెక్సిడిన్ ఎం ఫోర్టే జెల్", "డోలొజెల్ జూనియర్",
                "రోజుకు 2–3 సార్లు అప్లై చేయాలి", "రోజుకు రెండు సార్లు అప్లై చేయాలి", "రోజుకు ఒకసారి అప్లై చేయాలి", "నోరులో ఇబ్బంది",
                "ஹெக்சிஜெல்", "ரெக்சிடின் எம் ஃபோர்டே", "டோலோஜெல் ஜூனியர்",
                "2-3 முறை பயன்படுத்தவும்", "2 முறை மெதுவாக", "1 முறை", "வாய் எரிச்சல்"
        );
    }
    private void insertScalpInfectionData(SQLiteDatabase db) {
        insertMedicine(db, "scalp infection",
                "Scalp+ Shampoo", "Selsun Suspension", "Sebamed Baby Shampoo",
                "Use twice a week", "Use twice a week", "Use once a week", "Dryness, itching",
                "స్కాల్ప్+ షాంపూ", "సెల్సన్ సస్పెన్షన్", "సెబామెడ్ బేబీ షాంపూ",
                "వారం లో రెండు సార్లు ఉపయోగించాలి", "వారం లో రెండు సార్లు", "వారం లో ఒకసారి", "ఎండిపోవడం, కొరకడం",
                "ஸ்கால்ப்+ ஷாம்பு", "செல்சன் சஸ்பென்ஷன்", "செபமெட் குழந்தைகள் ஷாம்பு",
                "வாரம் 2 முறை", "வாரம் 2 முறை", "வாரம் 1 முறை", "உலர்வு, அரிப்பு"
        );
    }
    private void insertHandPainData(SQLiteDatabase db) {
        insertMedicine(db, "hand pain",
                "Moov Cream", "Ibugesic Plus", "Crocin Drops",
                "Apply gently 2 times/day", "5ml twice daily", "0.5ml twice daily", "Burning, dizziness",
                "మూవ్ క్రీమ్", "ఇబ్యూసిక్ ప్లస్", "క్రోసిన్ డ్రాప్స్",
                "రోజు రెండు సార్లు నెమ్మదిగా అప్లై చేయాలి", "రోజు రెండు సార్లు 5ml", "రోజు రెండు సార్లు 0.5ml", "కాలినట్లనిపించడం, తల తిరగడం",
                "மூவ் கிரீம்", "இபுஜெசிக் பிளஸ்", "கிரோசின் சொட்டுகள்",
                "2 முறை மெதுவாக தடவவும்", "2 முறை 5மில்லி", "2 முறை 0.5மில்லி", "எரிச்சல், மயக்கம்"
        );
    }
    private void insertUrineInfectionData(SQLiteDatabase db) {
        insertMedicine(db, "urine infection",
                "Cranberry Capsule", "Cranberry Syrup", "Cital Drops",
                "1 capsule twice daily", "5ml twice daily", "0.5ml twice daily", "Frequent urination, stomach upset",
                "క్రాన్‌బెర్రీ క్యాప్సూల్", "క్రాన్‌బెర్రీ సిరప్", "సిటాల్ డ్రాప్స్",
                "రోజుకు రెండు సార్లు ఒక క్యాప్సూల్", "రోజుకు రెండు సార్లు 5ml", "రోజుకు రెండు సార్లు 0.5ml", "తరచుగా మూత్రం, కడుపునొప్పి",
                "க்ரான்பெரி கேப்ஸ்யூல்", "க்ரான்பெரி சிரப்", "சிடால் சொட்டுகள்",
                "2 முறை 1 கேப்சூல்", "2 முறை 5மில்லி", "2 முறை 0.5மில்லி", "மிகவும் சிறுநீர், வயிற்று வலி"
        );
    }
    private void insertChestPainData(SQLiteDatabase db) {
        insertMedicine(db, "chest pain",
                "Disprin", "Junior Disprin", "Crocin Drops",
                "1 tablet with water", "Half tablet", "0.5ml", "Stomach irritation",
                "డిస్ప్రిన్", "జూనియర్ డిస్ప్రిన్", "క్రోసిన్ డ్రాప్స్",
                "నీటితో ఒక టాబ్లెట్", "సగం టాబ్లెట్", "0.5ml", "కడుపు చికాకులు",
                "டிஸ்பிரின்", "ஜூனியர் டிஸ்பிரின்", "கிரோசின் சொட்டுகள்",
                "தண்ணீருடன் 1 மாத்திரை", "அரை மாத்திரை", "0.5மில்லி", "வயிறு எரிச்சல்"
        );
    }
    private void insertBloatingData(SQLiteDatabase db) {
        insertMedicine(db, "bloating",
                "Simethicone Tablets", "Simethicone Syrup", "Neopeptine Drops",
                "1 tablet after meals", "5ml after meals", "5 drops after meals", "Gas, mild nausea",
                "సిమెతికోనే టాబ్లెట్", "సిమెతికోనే సిరప్", "నియోపెప్టిన్ డ్రాప్స్",
                "ఆహారం తర్వాత 1 టాబ్లెట్", "ఆహారం తర్వాత 5ml", "ఆహారం తర్వాత 5 చుక్కలు", "వాయువు, తేలికపాటి వాంతులు",
                "சிமெத்திகோன் மாத்திரை", "சிமெத்திகோன் சிரப்", "நியோபெப்டின் சொட்டுகள்",
                "உணவுக்குப் பிறகு 1 மாத்திரை", "உணவுக்குப் பிறகு 5மில்லி", "உணவுக்குப் பிறகு 5 சொட்டு", "வாயு, லேசான வாந்தி"
        );
    }
    private void insertThroatDrynessData(SQLiteDatabase db) {
        insertMedicine(db, "throat dryness",
                "Glycerin Lozenges", "Himani Fast Relief Syrup", "Tulasi Drops",
                "1 lozenge every 4 hrs", "5ml every 4 hrs", "3 drops every 4 hrs", "Slight numbness",
                "గ్లిసరిన్ లోజెంజెస్", "హిమానీ ఫాస్ట్ రిలీఫ్", "తులసి డ్రాప్స్",
                "ప్రతి 4 గంటలకి ఒకటి", "ప్రతి 4 గంటలకి 5ml", "ప్రతి 4 గంటలకి 3 చుక్కలు", "తక్కువ నమ్మడం",
                "கிளிசரின் லோசென்ஜ்கள்", "ஹிமானி சிரப்", "துளசி சொட்டுகள்",
                "4 மணி நேரத்திற்கு ஒரு முறை", "4 மணி நேரத்திற்கு 5மில்லி", "4 மணி நேரத்திற்கு 3 சொட்டு", "லேசான சளி"
        );
    }
    private void insertMildFeverAcheData(SQLiteDatabase db) {
        insertMedicine(db, "mild fever ache",
                "Dolo 500", "Ibugesic Syrup", "Crocin Drops",
                "1 tablet after food", "5ml after food", "0.5ml after food", "Sleepiness, acidity",
                "డోలో 500", "ఇబ్యూసిక్ సిరప్", "క్రోసిన్ డ్రాప్స్",
                "ఆహారం తర్వాత 1 టాబ్లెట్", "ఆహారం తర్వాత 5ml", "ఆహారం తర్వాత 0.5ml", "నిద్ర, ఎసిడిటీ",
                "டோலோ 500", "இபுஜெசிக் சிரப்", "கிரோசின் சொட்டுகள்",
                "உணவுக்குப் பிறகு 1 மாத்திரை", "உணவுக்குப் பிறகு 5மில்லி", "உணவுக்குப் பிறகு 0.5மில்லி", "தூக்கம், அமிலம் அதிகரிப்பு"
        );
    }
    private void insertEarWaxData(SQLiteDatabase db) {
        insertMedicine(db, "ear wax",
                "Soliwax Drops", "Otipax", "Waxolve Pediatric",
                "2 drops twice daily", "2 drops twice daily", "1 drop daily", "Irritation",
                "సోలివాక్స్ డ్రాప్స్", "ఒటిపాక్స్", "వాక్సోల్వ్",
                "రోజుకు రెండు సార్లు 2 చుక్కలు", "రోజుకు రెండు సార్లు 2 చుక్కలు", "రోజుకి ఒక చుక్క", "చికాకు",
                "சொலிவாக்ஸ் சொட்டுகள்", "ஒடிபாக்ஸ்", "வாக்ஸோல்வ்",
                "2 முறை 2 சொட்டு", "2 முறை 2 சொட்டு", "1 முறை 1 சொட்டு", "எரிச்சல்"
        );
    }
    private void insertColdSoresData(SQLiteDatabase db) {
        insertMedicine(db, "cold sores",
                "Acyclovir Cream", "Acyclovir Syrup", "Zovirax Infant",
                "Apply on lips 3x/day", "5ml 2x/day", "0.5ml 2x/day", "Mild dryness",
                "అసైక్లోవిర్ క్రీమ్", "అసైక్లోవిర్ సిరప్", "జోవిరాక్స్",
                "రోజు 3 సార్లు పెదాలపై అప్లై చేయాలి", "రోజుకు రెండు సార్లు 5ml", "రోజుకు రెండు సార్లు 0.5ml", "ఎండిపోవడం",
                "அசைக்ளோவிர் கிரீம்", "அசைக்ளோவிர் சிரப்", "சோவிராக்ஸ்",
                "நாள் 3 முறை", "நாள் 2 முறை 5மில்லி", "நாள் 2 முறை 0.5மில்லி", "உலர்வு"
        );
    }
    private void insertMouthUlcersData(SQLiteDatabase db) {
        insertMedicine(db, "mouth ulcers",
                "Dologel", "Aptivate Syrup", "Glycodin Junior",
                "Apply gel twice daily", "5ml twice daily", "0.5ml twice daily", "Mild burning",
                "డోలోజెల్", "ఆప్టివేట్ సిరప్", "గ్లైకోడిన్ జూనియర్",
                "రోజు రెండు సార్లు జెల్ అప్లై చేయాలి", "రోజు రెండు సార్లు 5ml", "రోజు రెండు సార్లు 0.5ml", "కాలినట్లు అనిపించటం",
                "டோலோஜெல்", "அப்டிவேட் சிரப்", "கிளைகோடின் ஜூனியர்",
                "நாள் 2 முறை ஜெல்", "நாள் 2 முறை 5மில்லி", "நாள் 2 முறை 0.5மில்லி", "எரிச்சல்"
        );
    }
    private void insertHighFeverData(SQLiteDatabase db) {
        insertMedicine(db, "high fever",
                "SampleAdultMedicine", "SampleChildMedicine", "SampleInfantMedicine",
                "Usage for adult", "Usage for child", "Usage for infant", "Side effects in English",
                "తెలుగులో ఔషధం", "తెలుగులో పిల్లల ఔషధం", "తెలుగులో శిశు ఔషధం",
                "తెలుగులో వాడకం", "తెలుగులో పిల్లల వాడకం", "తెలుగులో శిశు వాడకం", "తెలుగులో దుష్ప్రభావాలు",
                "தமிழில் மருந்து", "தமிழில் குழந்தை மருந்து", "தமிழில் பசு மருந்து",
                "தமிழில் பயன்பாடு", "தமிழில் குழந்தை பயன்பாடு", "தமிழில் பசு பயன்பாடு", "தமிழில் பக்கவிளைவுகள்");
    }

    private void insertLowBPData(SQLiteDatabase db) {
        insertMedicine(db, "low blood pressure",
                "SampleAdultMedicine", "SampleChildMedicine", "SampleInfantMedicine",
                "Usage for adult", "Usage for child", "Usage for infant", "Side effects in English",
                "తెలుగులో ఔషధం", "తెలుగులో పిల్లల ఔషధం", "తెలుగులో శిశు ఔషధం",
                "తెలుగులో వాడకం", "తెలుగులో పిల్లల వాడకం", "తెలుగులో శిశు వాడకం", "తెలుగులో దుష్ప్రభావాలు",
                "தமிழில் மருந்து", "தமிழில் குழந்தை மருந்து", "தமிழில் பசு மருந்து",
                "தமிழில் பயன்பாடு", "தமிழில் குழந்தை பயன்பாடு", "தமிழில் பசு பயன்பாடு", "தமிழில் பக்கவிளைவுகள்");
    }

    private void insertHighBPData(SQLiteDatabase db) {
        insertMedicine(db, "high blood pressure",
                "SampleAdultMedicine", "SampleChildMedicine", "SampleInfantMedicine",
                "Usage for adult", "Usage for child", "Usage for infant", "Side effects in English",
                "తెలుగులో ఔషధం", "తెలుగులో పిల్లల ఔషధం", "తెలుగులో శిశు ఔషధం",
                "తెలుగులో వాడకం", "తెలుగులో పిల్లల వాడకం", "తెలుగులో శిశు వాడకం", "తెలుగులో దుష్ప్రభావాలు",
                "தமிழில் மருந்து", "தமிழில் குழந்தை மருந்து", "தமிழில் பசு மருந்து",
                "தமிழில் பயன்பாடு", "தமிழில் குழந்தை பயன்பாடு", "தமிழில் பசு பயன்பாடு", "தமிழில் பக்கவிளைவுகள்");
    }

    private void insertUrinaryBurningData(SQLiteDatabase db) {
        insertMedicine(db, "urinary burning",
                "SampleAdultMedicine", "SampleChildMedicine", "SampleInfantMedicine",
                "Usage for adult", "Usage for child", "Usage for infant", "Side effects in English",
                "తెలుగులో ఔషధం", "తెలుగులో పిల్లల ఔషధం", "తెలుగులో శిశు ఔషధం",
                "తెలుగులో వాడకం", "తెలుగులో పిల్లల వాడకం", "తెలుగులో శిశు వాడకం", "తెలుగులో దుష్ప్రభావాలు",
                "தமிழில் மருந்து", "தமிழில் குழந்தை மருந்து", "தமிழில் பசு மருந்து",
                "தமிழில் பயன்பாடு", "தமிழில் குழந்தை பயன்பாடு", "தமிழில் பசு பயன்பாடு", "தமிழில் பக்கவிளைவுகள்");
    }

    private void insertMenstrualPainData(SQLiteDatabase db) {
        insertMedicine(db, "menstrual pain",
                "SampleAdultMedicine", "SampleChildMedicine", "SampleInfantMedicine",
                "Usage for adult", "Usage for child", "Usage for infant", "Side effects in English",
                "తెలుగులో ఔషధం", "తెలుగులో పిల్లల ఔషధం", "తెలుగులో శిశు ఔషధం",
                "తెలుగులో వాడకం", "తెలుగులో పిల్లల వాడకం", "తెలుగులో శిశు వాడకం", "తెలుగులో దుష్ప్రభావాలు",
                "தமிழில் மருந்து", "தமிழில் குழந்தை மருந்து", "தமிழில் பசு மருந்து",
                "தமிழில் பயன்பாடு", "தமிழில் குழந்தை பயன்பாடு", "தமிழில் பசு பயன்பாடு", "தமிழில் பக்கவிளைவுகள்");
    }

    private void insertBreathlessnessData(SQLiteDatabase db) {
        insertMedicine(db, "breathlessness",
                "SampleAdultMedicine", "SampleChildMedicine", "SampleInfantMedicine",
                "Usage for adult", "Usage for child", "Usage for infant", "Side effects in English",
                "తెలుగులో ఔషధం", "తెలుగులో పిల్లల ఔషధం", "తెలుగులో శిశు ఔషధం",
                "తెలుగులో వాడకం", "తెలుగులో పిల్లల వాడకం", "తెలుగులో శిశు వాడకం", "తెలుగులో దుష్ప్రభావాలు",
                "தமிழில் மருந்து", "தமிழில் குழந்தை மருந்து", "தமிழில் பசு மருந்து",
                "தமிழில் பயன்பாடு", "தமிழில் குழந்தை பயன்பாடு", "தமிழில் பசு பயன்பாடு", "தமிழில் பக்கவிளைவுகள்");
    }

    private void insertDengueData(SQLiteDatabase db) {
        insertMedicine(db, "dengue symptoms",
                "SampleAdultMedicine", "SampleChildMedicine", "SampleInfantMedicine",
                "Usage for adult", "Usage for child", "Usage for infant", "Side effects in English",
                "తెలుగులో ఔషధం", "తెలుగులో పిల్లల ఔషధం", "తెలుగులో శిశు ఔషధం",
                "తెలుగులో వాడకం", "తెలుగులో పిల్లల వాడకం", "తెలుగులో శిశు వాడకం", "తెలుగులో దుష్ప్రభావాలు",
                "தமிழில் மருந்து", "தமிழில் குழந்தை மருந்து", "தமிழில் பசு மருந்து",
                "தமிழில் பயன்பாடு", "தமிழில் குழந்தை பயன்பாடு", "தமிழில் பசு பயன்பாடு", "தமிழில் பக்கவிளைவுகள்");
    }

    private void insertTyphoidData(SQLiteDatabase db) {
        insertMedicine(db, "typhoid symptoms",
                "SampleAdultMedicine", "SampleChildMedicine", "SampleInfantMedicine",
                "Usage for adult", "Usage for child", "Usage for infant", "Side effects in English",
                "తెలుగులో ఔషధం", "తెలుగులో పిల్లల ఔషధం", "తెలుగులో శిశు ఔషధం",
                "తెలుగులో వాడకం", "తెలుగులో పిల్లల వాడకం", "తెలుగులో శిశు వాడకం", "తెలుగులో దుష్ప్రభావాలు",
                "தமிழில் மருந்து", "தமிழில் குழந்தை மருந்து", "தமிழில் பசு மருந்து",
                "தமிழில் பயன்பாடு", "தமிழில் குழந்தை பயன்பாடு", "தமிழில் பசு பயன்பாடு", "தமிழில் பக்கவிளைவுகள்");
    }

    private void insertChestTightnessData(SQLiteDatabase db) {
        insertMedicine(db, "chest tightness",
                "SampleAdultMedicine", "SampleChildMedicine", "SampleInfantMedicine",
                "Usage for adult", "Usage for child", "Usage for infant", "Side effects in English",
                "తెలుగులో ఔషధం", "తెలుగులో పిల్లల ఔషధం", "తెలుగులో శిశు ఔషధం",
                "తెలుగులో వాడకం", "తెలుగులో పిల్లల వాడకం", "తెలుగులో శిశు వాడకం", "తెలుగులో దుష్ప్రభావాలు",
                "தமிழில் மருந்து", "தமிழில் குழந்தை மருந்து", "தமிழில் பசு மருந்து",
                "தமிழில் பயன்பாடு", "தமிழில் குழந்தை பயன்பாடு", "தமிழில் பசு பயன்பாடு", "தமிழில் பக்கவிளைவுகள்");
    }

    private void insertSkinDrynessData(SQLiteDatabase db) {
        insertMedicine(db, "skin dryness",
                "SampleAdultMedicine", "SampleChildMedicine", "SampleInfantMedicine",
                "Usage for adult", "Usage for child", "Usage for infant", "Side effects in English",
                "తెలుగులో ఔషధం", "తెలుగులో పిల్లల ఔషధం", "తెలుగులో శిశు ఔషధం",
                "తెలుగులో వాడకం", "తెలుగులో పిల్లల వాడకం", "తెలుగులో శిశు వాడకం", "తెలుగులో దుష్ప్రభావాలు",
                "தமிழில் மருந்து", "தமிழில் குழந்தை மருந்து", "தமிழில் பசு மருந்து",
                "தமிழில் பயன்பாடு", "தமிழில் குழந்தை பயன்பாடு", "தமிழில் பசு பயன்பாடு", "தமிழில் பக்கவிளைவுகள்");
    }
    private void insertInsomniaData(SQLiteDatabase db) {
        insertMedicine(db, "insomnia",
                "Zolfresh", "Melatonin Syrup", "Melatonin Drops",
                "1 tablet at bedtime", "5ml at bedtime", "0.5ml at bedtime", "Drowsiness, dizziness",
                "జోల్ఫ్రెష్", "మెలటోనిన్ సిరప్", "మెలటోనిన్ డ్రాప్స్",
                "నిద్రకు ముందు 1 టాబ్లెట్", "నిద్రకు ముందు 5ml", "నిద్రకు ముందు 0.5ml", "నిద్రత, తల తిరుగుడు",
                "சால்ஃப்ரெஷ்", "மெலடோனின் சிரப்", "மெலடோனின் சொட்டுகள்",
                "உறங்கும் முன் ஒரு மாத்திரை", "உறங்கும் முன் 5மில்லி", "உறங்கும் முன் 0.5மில்லி", "தூக்கம், மயக்கம்");
    }
    private void insertPimplesData(SQLiteDatabase db) {
        insertMedicine(db, "pimples",
                "Clindamycin Gel", "Clindamycin Gel", "Sebamed Baby Cream",
                "Apply thin layer twice daily", "Apply gently twice daily", "Apply once daily", "Dry skin, irritation",
                "క్లిండామైసిన్ జెల్", "క్లిండామైసిన్ జెల్", "సెబామెడ్ బేబీ క్రీమ్",
                "రోజుకు రెండు సార్లు అప్లై చేయాలి", "రోజుకు రెండు సార్లు అప్లై చేయాలి", "రోజుకు ఒకసారి అప్లై చేయాలి", "చర్మం పొడిబారడం, మంట",
                "க்ளின்டமைசின் ஜெல்", "க்ளின்டமைசின் ஜெல்", "செபாமெட் பேபி கிரீம்",
                "இரு முறை மெதுவாக தடவவும்", "இரு முறை மெதுவாக தடவவும்", "ஒரு முறை தடவவும்", "ஒழுங்கு, எரிச்சல்");
    }
    private void insertEyePainData(SQLiteDatabase db) {
        insertMedicine(db, "eye pain",
                "Refresh Tears", "Tearfree Kids", "Tearfree Infant",
                "2 drops 3 times daily", "1 drop 2 times daily", "1 drop once daily", "Redness, irritation",
                "రిఫ్రెష్ టియర్స్", "టియర్‌ఫ్రీ కిడ్స్", "టియర్‌ఫ్రీ ఇన్ఫెంట్",
                "రోజుకు 3 సార్లు 2 చుక్కలు", "రోజుకు 2 సార్లు 1 చుక్క", "రోజుకు ఒకసారి 1 చుక్క", "ఎర్రదనం, జలుబు",
                "ரிஃப்ரெஷ் டியர்ஸ்", "டியர்ஃப்ரீ குழந்தைகள்", "டியர்ஃப்ரீ பச்சிளம்",
                "மூன்று முறை 2 சொட்டு", "இரு முறை 1 சொட்டு", "ஒரு முறை 1 சொட்டு", "சிவத்தல், எரிச்சல்");
    }
    private void insertEarBlockData(SQLiteDatabase db) {
        insertMedicine(db, "ear block",
                "Soliwax Drops", "Soliwax Pediatric", "Soliwax Infant",
                "2 drops twice daily", "1 drop twice daily", "1 drop once daily", "Ear itching, mild irritation",
                "సాలివాక్స్ డ్రాప్స్", "సాలివాక్స్ పిల్లల", "సాలివాక్స్ శిశువు",
                "రోజుకు రెండు సార్లు 2 చుక్కలు", "రోజుకు రెండు సార్లు 1 చుక్క", "రోజుకు ఒకసారి 1 చుక్క", "చెవి గజ్జి, అసౌకర్యం",
                "சொலிவாக்ஸ் சொட்டுகள்", "சொலிவாக்ஸ் பீடியாட்ரிக்", "சொலிவாக்ஸ் பச்சிளம்",
                "இரு முறை 2 சொட்டு", "இரு முறை 1 சொட்டு", "ஒரு முறை 1 சொட்டு", "காது அரிப்பு, லேசான எரிச்சல்");
    }
    private void insertFrequentUrinationData(SQLiteDatabase db) {
        insertMedicine(db, "frequent urination",
                "Uribid", "Uribid Syrup", "Cranberry Drops",
                "1 tablet after food twice daily", "5ml after food twice daily", "0.5ml after food twice daily", "Nausea, stomach upset",
                "యూరిబిడ్", "యూరిబిడ్ సిరప్", "క్రాన్‌బెర్రీ డ్రాప్స్",
                "ఆహారం తరువాత రోజుకు రెండు సార్లు 1 టాబ్లెట్", "ఆహారం తరువాత రోజుకు రెండు సార్లు 5ml", "ఆహారం తరువాత రోజుకు రెండు సార్లు 0.5ml", "వాంతులు, అజీర్ణం",
                "உரிபிட்", "உரிபிட் சிரப்", "கிரான்பெரி சொட்டுகள்",
                "உணவுக்குப் பிறகு இரு முறை ஒரு மாத்திரை", "உணவுக்குப் பிறகு 5மில்லி", "உணவுக்குப் பிறகு 0.5மில்லி", "வாந்தி, வயிறு பிரச்சனை");
    }
    private void insertAnemiaData(SQLiteDatabase db) {
        insertMedicine(db, "anemia",
                "Dexorange", "Feronia XT Syrup", "Zincovit Drops",
                "1 capsule daily after food", "5ml once daily", "0.5ml once daily", "Dark stools, nausea",
                "డెక్సారెంజ్", "ఫెరోనియా ఎక్స్‌టీ సిరప్", "జింకోవిట్ డ్రాప్స్",
                "ఆహారం తర్వాత రోజుకు ఒక క్యాప్సూల్", "రోజుకు ఒకసారి 5ml", "రోజుకు ఒకసారి 0.5ml", "గాఢమైన మలాలు, వాంతులు",
                "டெக்சோரேஞ்ச்", "பெரோனியா எக்ஸ்டி", "சிங்கோவிட் சொட்டுகள்",
                "உணவுக்குப் பிறகு ஒரு கேப்ஸ்யூல்", "ஒரு முறை 5மில்லி", "ஒரு முறை 0.5மில்லி", "கருந்து மலச்சிக்கல், வாந்தி");
    }
    private void insertGasAcidityData(SQLiteDatabase db) {
        insertMedicine(db, "gas",
                "Gelusil", "Gelusil Syrup", "Neopeptine Drops",
                "2 teaspoons after meals", "5ml after meals", "0.5ml after meals", "Gas, bloating",
                "జెలుసిల్", "జెలుసిల్ సిరప్", "నియోపెప్టిన్ డ్రాప్స్",
                "ఆహారం తర్వాత 2 టీ స్పూన్లు", "ఆహారం తర్వాత 5ml", "ఆహారం తర్వాత 0.5ml", "వాయువు, ఉబ్బసం",
                "ஜெலுசில்", "ஜெலுசில் சிரப்", "நியோபெப்டின் சொட்டுகள்",
                "உணவுக்குப் பிறகு 2 டீஸ்பூன்", "உணவுக்குப் பிறகு 5மில்லி", "உணவுக்குப் பிறகு 0.5மில்லி", "வாயுவு, உப்பளம்");
    }
    private void insertMigraineData(SQLiteDatabase db) {
        insertMedicine(db, "migraine",
                "Suminat", "Paracetamol Syrup", "Crocin Drops",
                "1 tablet during attack", "5ml during pain", "0.5ml during pain", "Drowsiness, nausea",
                "స్యూమినాట్", "పారాసెటమాల్ సిరప్", "క్రోసిన్ డ్రాప్స్",
                "తలనొప్పి సమయంలో 1 టాబ్లెట్", "నొప్పి సమయంలో 5ml", "నొప్పి సమయంలో 0.5ml", "నిద్రత, వాంతులు",
                "சுமினாட்", "பாராசெடமால் சிரப்", "கிரோசின் சொட்டுகள்",
                "தலைவலியின் போது 1 மாத்திரை", "வலியின் போது 5மில்லி", "வலியின் போது 0.5மில்லி", "தூக்கம், வாந்தி");
    }
    private void insertWeightLossData(SQLiteDatabase db) {
        insertMedicine(db, "weight loss",
                "Aptivate", "Aptivate Syrup", "Aptivate Drops",
                "1 tablet before food", "5ml before food", "0.5ml before food", "Appetite increase, mild drowsiness",
                "ఆప్టివేట్", "ఆప్టివేట్ సిరప్", "ఆప్టివేట్ డ్రాప్స్",
                "ఆహారం ముందు 1 టాబ్లెట్", "ఆహారం ముందు 5ml", "ఆహారం ముందు 0.5ml", "భోజన ఆరాటం, తేలికపాటి నిద్ర",
                "அப்டிவேட்", "அப்டிவேட் சிரப்", "அப்டிவேட் சொட்டுகள்",
                "உணவுக்கு முன் ஒரு மாத்திரை", "உணவுக்கு முன் 5மில்லி", "உணவுக்கு முன் 0.5மில்லி", "பசிக்கட்டுதல், தூக்கமாக்கம்");
    }
    private void insertDustAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "dust allergy",
                "Levocetirizine", "Levocet Syrup", "Levocet Drops",
                "1 tablet at night", "5ml at night", "0.5ml at night", "Drowsiness, dry mouth",
                "లెవోసెటిరిజిన్", "లెవోసెట్ సిరప్", "లెవోసెట్ డ్రాప్స్",
                "రాత్రి 1 టాబ్లెట్", "రాత్రి 5ml", "రాత్రి 0.5ml", "నిద్ర, నోరు ఎండిపోవడం",
                "லெவோசெடிரிசின்", "லெவோசெட் சிரப்", "லெவோசெட் சொட்டுகள்",
                "இரவில் ஒரு மாத்திரை", "இரவில் 5மில்லி", "இரவில் 0.5மில்லி", "தூக்கம், வாய் உலர்வு");
    }
    private void insertPollenAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "pollen allergy",
                "Montair LC", "Montair LC Kid", "Cetrizine Drops",
                "1 tablet daily", "5ml daily", "0.5ml daily", "Headache, drowsiness",
                "మాంటెయిర్ ఎల్‌సి", "మాంటెయిర్ ఎల్‌సి కిడ్", "సెట్రిజిన్ డ్రాప్స్",
                "రోజు ఒక టాబ్లెట్", "రోజు 5ml", "రోజు 0.5ml", "తలనొప్పి, నిద్రలేమి",
                "மொண்டேர் எல்.சி", "மொண்டேர் எல்.சி கிட்ஸ்", "செட்ரிசின் சொட்டுகள்",
                "ஒரு மாத்திரை நாள் ஒருமுறை", "5மில்லி நாள் ஒருமுறை", "0.5மில்லி நாள் ஒருமுறை", "தலைவலி, தூக்கம்");
    }
    private void insertFoodAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "food allergy",
                "Allegra", "Allegra Syrup", "Cetrizine Drops",
                "1 tablet in morning", "5ml in morning", "0.5ml in morning", "Nausea, dry mouth",
                "అలెగ్రా", "అలెగ్రా సిరప్", "సెట్రిజిన్ డ్రాప్స్",
                "ప్రతి ఉదయం 1 టాబ్లెట్", "ప్రతి ఉదయం 5ml", "ప్రతి ఉదయం 0.5ml", "వాంతులు, నోరు ఎండిపోవడం",
                "அலெக்ரா", "அலெக்ரா சிரப்", "செட்ரிசின் சொட்டுகள்",
                "தினமும் காலை ஒரு மாத்திரை", "தினமும் காலை 5மில்லி", "தினமும் காலை 0.5மில்லி", "வாந்தி, வாய் உலர்வு");
    }
    private void insertInsectBiteAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "insect bite allergy",
                "T-Bact Cream", "Candid Kids Cream", "Candid Baby Cream",
                "Apply thin layer twice daily", "Apply gently twice daily", "Apply gently once daily", "Itching, redness",
                "టి-బాక్ట్ క్రీమ్", "కాండిడ్ కిడ్స్ క్రీమ్", "కాండిడ్ బేబీ క్రీమ్",
                "రోజుకు 2 సార్లు పలుచగా అప్లై చేయాలి", "రోజుకు 2 సార్లు నెమ్మదిగా అప్లై చేయాలి", "రోజుకు ఒకసారి అప్లై చేయాలి", "తాపం, ఎర్రదనం",
                "டி-பாக்ட் கிரீம்", "கேண்டிட் கிட்ஸ் கிரீம்", "கேண்டிட் பேபி கிரீம்",
                "இரு முறை மெதுவாக தடவவும்", "இரு முறை மெதுவாக தடவவும்", "ஒரு முறை மெதுவாக தடவவும்", "அரிப்பு, சிவத்தல்");
    }
    private void insertColdAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "cold allergy",
                "Avil", "Avil Syrup", "Avil Drops",
                "1 tablet at night", "5ml at night", "0.5ml at night", "Drowsiness, blurred vision",
                "అవిల్", "అవిల్ సిరప్", "అవిల్ డ్రాప్స్",
                "రాత్రి 1 టాబ్లెట్", "రాత్రి 5ml", "రాత్రి 0.5ml", "నిద్ర, చూపు మందకడం",
                "அவில்", "அவில் சிரப்", "அவில் சொட்டுகள்",
                "இரவில் ஒரு மாத்திரை", "இரவில் 5மில்லி", "இரவில் 0.5மில்லி", "தூக்கம், மங்கிய பார்வை");
    }
    private void insertSunAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "sun allergy",
                "Calosoft Lotion", "Suncros Kids Lotion", "Suncros Infant Lotion",
                "Apply twice daily before sun", "Apply on exposed areas daily", "Apply gently once daily", "Mild irritation, burning",
                "కాలోసాఫ్ట్ లోషన్", "సన్‌క్రోస్ కిడ్స్ లోషన్", "సన్‌క్రోస్ ఇన్ఫెంట్ లోషన్",
                "సూర్యుడికి ముందుగా రోజుకు రెండు సార్లు అప్లై చేయాలి", "బయట కనిపించే భాగాల్లో అప్లై చేయాలి", "రోజుకు ఒక్కసారి నెమ్మదిగా అప్లై చేయాలి", "తప్పు భావనలు, కాలినట్లుంటుంది",
                "காலோசாஃப்ட் லோஷன்", "சன்கிராஸ் கிட்ஸ் லோஷன்", "சன்கிராஸ் இன்ஃபண்ட் லோஷன்",
                "வெளியே செல்லும் முன் நாள் இரு முறை", "வெளியே தெரியக்கூடிய இடங்களில் பயன்படுத்தவும்", "ஒரு முறை மெதுவாக தடவவும்", "எரிச்சல், எரிதல்");
    }
    private void insertPerfumeAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "perfume allergy",
                "Cetirizine", "Cetrizine Syrup", "Cetrizine Drops",
                "1 tablet at night", "5ml at night", "0.5ml at night", "Drowsiness, dry throat",
                "సెటిరిజిన్", "సెటిరిజిన్ సిరప్", "సెటిరిజిన్ డ్రాప్స్",
                "రాత్రి 1 టాబ్లెట్", "రాత్రి 5ml", "రాత్రి 0.5ml", "నిద్ర, గొంతు ఎండిపోవడం",
                "செட்ரிசின்", "செட்ரிசின் சிரப்", "செட்ரிசின் சொட்டுகள்",
                "இரவில் ஒரு மாத்திரை", "இரவில் 5மில்லி", "இரவில் 0.5மில்லி", "தூக்கம், தொண்டை உலர்வு");
    }
    private void insertPetAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "pet allergy",
                "Montelukast", "Montair LC Kid", "Cetrizine Drops",
                "1 tablet at bedtime", "5ml at bedtime", "0.5ml at bedtime", "Dry mouth, stomach upset",
                "మాంటెలూకాస్ట్", "మాంటెయిర్ ఎల్‌సి కిడ్", "సెట్రిజిన్ డ్రాప్స్",
                "నిద్రకి ముందు 1 టాబ్లెట్", "నిద్రకి ముందు 5ml", "నిద్రకి ముందు 0.5ml", "నోరు ఎండిపోవడం, అజీర్ణం",
                "மாண்டெலூக்காஸ்ட்", "மொண்டேர் எல்.சி கிட்ஸ்", "செட்ரிசின் சொட்டுகள்",
                "இரவு தூங்கும் முன் ஒரு மாத்திரை", "இரவு தூங்கும் முன் 5மில்லி", "இரவு தூங்கும் முன் 0.5மில்லி", "வாய் உலர்வு, குடல்பழுது");
    }
    private void insertCosmeticAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "cosmetic allergy",
                "Skinlite Cream", "Cutisoft Cream", "Candid Baby Cream",
                "Apply thin layer at night", "Apply gently on affected area", "Apply gently once daily", "Burning, redness",
                "స్కిన్లైట్ క్రీమ్", "కుటిసాఫ్ట్ క్రీమ్", "కాండిడ్ బేబీ క్రీమ్",
                "రాత్రి పలుచగా అప్లై చేయాలి", "ప్రభావిత ప్రాంతంలో అప్లై చేయాలి", "రోజుకు ఒక్కసారి అప్లై చేయాలి", "కాలినట్లుగా అనిపించటం, ఎర్రదనం",
                "ஸ்கின்லைட் கிரீம்", "குடிஸாப்ட் கிரீம்", "கேண்டிட் பேபி கிரீம்",
                "இரவில் மெதுவாக தடவவும்", "பாதிக்கப்பட்ட பகுதியில் தடவவும்", "ஒரு முறை தடவவும்", "எரிதல், சிவத்தல்");
    }
    private void insertEyeAllergyData(SQLiteDatabase db) {
        insertMedicine(db, "eye allergy",
                "Olopatadine Eye Drops", "Zaditen Pediatric", "Zaditen Infant Drops",
                "1 drop in each eye twice daily", "1 drop twice daily", "1 drop once daily", "Burning, watery eyes",
                "ఒలొపటాడిన్ డ్రాప్స్", "జడిటెన్ పీడియాట్రిక్", "జడిటెన్ ఇన్ఫెంట్ డ్రాప్స్",
                "ప్రతి కంట్లో 1 చుక్క, రోజూ 2 సార్లు", "రోజు 2 సార్లు 1 చుక్క", "రోజు 1 సారి 1 చుక్క", "గజ్జి, కన్నీళ్లు",
                "ஒலோபாடாடின் சொட்டுகள்", "சாடிடென் பீடியாட்ரிக்", "சாடிடென் இன்ஃபண்ட் சொட்டுகள்",
                "ஒவ்வொரு கண்ணிலும் ஒரு சொட்டு, நாள் 2 முறை", "நாள் 2 முறை ஒரு சொட்டு", "நாள் 1 முறை ஒரு சொட்டு", "எரிச்சல், கண்ணீர்");
    }

    private void insertInjuryData(SQLiteDatabase db) {
        insertMedicine(db, "injury",
                "Betadine Ointment", "Betadine Ointment", "Betadine Ointment",
                "Apply twice daily on wounds", "Apply gently on affected area", "Apply gently on affected area", "Skin irritation",
                "బెట్టాడిన్ ఆయింట్‌మెంట్", "బెట్టాడిన్ ఆయింట్‌మెంట్", "బెట్టాడిన్ ఆయింట్‌మెంట్",
                "రోజుకు రెండు సార్లు గాయాలపై రాయాలి", "ప్రమాదం ఉన్న ప్రదేశంలో నెమ్మదిగా రాయాలి", "ప్రమాదం ఉన్న ప్రదేశంలో నెమ్మదిగా రాయాలి", "చర్మ జలుబు",
                "பெட்டாடின் களிம்பு", "பெட்டாடின் களிம்பு", "பெட்டாடின் களிம்பு",
                "ஒரு நாள் இரு முறை காயங்கள் மீது தடவவும்", "பாதிக்கப்பட்ட பகுதியில் மெதுவாக பயன்படுத்தவும்", "பாதிக்கப்பட்ட பகுதியில் மெதுவாக பயன்படுத்தவும்", "தோல் எரிச்சல்");
    }



    private void insertLegSprainData(SQLiteDatabase db) {
        insertMedicine(db, "leg sprain",
                "Moov Spray", "Moov Cream", "Cold Compress",
                "Spray on affected area twice daily", "Apply gently twice daily", "Apply ice pack gently twice a day", "Skin burning, cold feeling",
                "మూవ్ స్ప్రే", "మూవ్ క్రీమ్", "ఐస్ ప్యాక్",
                "ప్రతిరోజూ రెండు సార్లు స్ప్రే చేయాలి", "రోజుకు రెండు సార్లు క్రీమ్ అప్లై చేయాలి", "ఐస్ ప్యాక్ రోజుకు రెండు సార్లు అప్లై చేయాలి", "చర్మం కాలినట్లుగా అనిపించటం, చల్లదనం",
                "மூவ் ஸ்ப்ரே", "மூவ் கிரீம்", "குளிர் பகுதி",
                "இரு முறை ஸ்ப்ரே செய்யவும்", "இரு முறை கிரீம் தடவவும்", "இரு முறை குளிர் பதத்தை பயன்படுத்தவும்", "தோல் எரிச்சல், குளிர் உணர்வு");
    }

    private void insertMuscleCrampsData(SQLiteDatabase db) {
        insertMedicine(db, "muscle cramps",
                "Revital H", "Junior Revital Syrup", "Vitamin Drops",
                "1 capsule daily after food", "5ml daily after food", "0.5ml daily after food", "Nausea, stomach upset",
                "రివిటాల్ హెచ్", "జూనియర్ రివిటాల్ సిరప్", "విటమిన్ డ్రాప్స్",
                "రోజు ఒక క్యాప్సూల్ ఆహారం తర్వాత", "ఆహారం తర్వాత రోజూ 5ml", "ఆహారం తర్వాత 0.5ml", "వాంతులు, అజీర్ణం",
                "ரிவைட்டல் எச்", "ஜூனியர் ரிவைட்டல் சிரப்", "விடமின் சொட்டுகள்",
                "ஒரு மாத்திரை தினசரி உணவுக்கு பிறகு", "5மில்லி தினசரி உணவுக்கு பிறகு", "0.5மில்லி தினசரி உணவுக்கு பிறகு", "வாந்தி, செரிமானக் கோளாறு");
    }

    private void insertMinorFractureData(SQLiteDatabase db) {
        insertMedicine(db, "minor fracture",
                "Calcimax Forte", "Calcium Syrup", "Pediatric Calcium Drops",
                "1 tablet daily after food", "5ml twice daily", "0.5ml twice daily", "Constipation, bloating",
                "కాల్సిమ్యాక్స్ ఫోర్ట్", "కాల్సియం సిరప్", "కాల్సియం డ్రాప్స్",
                "రోజుకు ఒకసారి ఆహారం తర్వాత 1 టాబ్లెట్", "రోజు రెండుసార్లు 5ml", "రోజు రెండుసార్లు 0.5ml", "బద్ధకము, ఉబ్బసం",
                "கால்சிமாக்ஸ் ஃபோர்ட்", "கால்சியம் சிரப்", "கால்சியம் சொட்டுகள்",
                "ஒரு மாத்திரை தினசரி உணவுக்கு பிறகு", "இரு முறை 5மில்லி", "இரு முறை 0.5மில்லி", "மலம் கடினமாகுதல், வயிறு உப்பளம்");
    }

    private void insertFootInjuryData(SQLiteDatabase db) {
        insertMedicine(db, "foot injury",
                "Betadine Cream", "Betadine Cream", "Betadine Cream",
                "Apply gently twice daily", "Apply gently twice daily", "Apply gently twice daily", "Irritation, mild burning",
                "బెట్టాడిన్ క్రీమ్", "బెట్టాడిన్ క్రీమ్", "బెట్టాడిన్ క్రీమ్",
                "రోజుకు రెండు సార్లు అప్లై చేయాలి", "రోజుకు రెండు సార్లు అప్లై చేయాలి", "రోజుకు రెండు సార్లు అప్లై చేయాలి", "జలుబు, తక్కువ కాలిన అనుభూతి",
                "பெட்டாடின் கிரீம்", "பெட்டாடின் கிரீம்", "பெட்டாடின் கிரீம்",
                "இரு முறை மெதுவாக தடவவும்", "இரு முறை மெதுவாக தடவவும்", "இரு முறை மெதுவாக தடவவும்", "எரிச்சல், லேசான எரிதல்");
    }

    private void insertCrackedHeelsData(SQLiteDatabase db) {
        insertMedicine(db, "cracked heels",
                "Crack Cream", "Crack Healing Cream", "Baby Foot Cream",
                "Apply at night before bed", "Apply at night", "Apply softly at night", "Itching, slight burning",
                "క్రాక్ క్రీమ్", "క్రాక్ హీలింగ్ క్రీమ్", "బేబీ ఫుట్ క్రీమ్",
                "పడుకునే ముందు రాత్రి అప్లై చేయాలి", "రాత్రి అప్లై చేయాలి", "రాత్రి మృదువుగా అప్లై చేయాలి", "తక్కువ కాలిన అనుభూతి",
                "கிராக் கிரீம்", "கிராக் ஹீலிங் கிரீம்", "பேபி ஃபூட் கிரீம்",
                "இரவில் படுக்கும் முன் தடவவும்", "இரவில் தடவவும்", "இரவில் மெதுவாக தடவவும்", "அரிப்பு, லேசான எரிச்சல்");
    }

    private void insertShoulderPainData(SQLiteDatabase db) {
        insertMedicine(db, "shoulder pain",
                "Relispray", "Junior Spray", "Warm Compress",
                "Spray twice daily", "Spray twice daily", "Apply warm compress twice daily", "Skin irritation",
                "రెలిస్‌ప్రే", "జూనియర్ స్ప్రే", "వార్మ్ కంప్రెస్",
                "రోజుకు రెండు సార్లు స్ప్రే చేయాలి", "రోజుకు రెండు సార్లు స్ప్రే చేయాలి", "రోజుకు రెండు సార్లు వేడి ప్యాడ్ అప్లై చేయాలి", "చర్మ ఇబ్బంది",
                "ரிலிஸ்ப்ரே", "ஜூனியர் ஸ்ப்ரே", "வெப்ப ஒட்டும் பதம்",
                "இரு முறை ஸ்ப்ரே செய்யவும்", "இரு முறை ஸ்ப்ரே செய்யவும்", "இரு முறை வெப்ப பதம் வைத்து நன்றாக செய்க", "தோல் எரிச்சல்");
    }

    private void insertKneePainData(SQLiteDatabase db) {
        insertMedicine(db, "knee pain",
                "Volini Gel", "Junior Volini Spray", "Volini Baby Rub",
                "Apply on knees twice daily", "Spray on knees twice daily", "Rub gently twice daily", "Skin irritation, redness",
                "వోలినీ జెల్", "జూనియర్ వోలినీ స్ప్రే", "వోలినీ బేబీ రబ్",
                "రోజుకు రెండు సార్లు మోకాలిపై రాయాలి", "రోజుకు రెండు సార్లు స్ప్రే చేయాలి", "రోజుకు రెండు సార్లు నెమ్మదిగా రాయాలి", "చర్మం కాలినట్లు, ఎర్రతనం",
                "வோலினி ஜெல்", "ஜூனியர் வோலினி ஸ்ப்ரே", "வோலினி பேபி ரப்",
                "இரு முறை முழங்கால் பகுதியில் தடவவும்", "இரு முறை ஸ்ப்ரே செய்யவும்", "இரு முறை மெதுவாக தடவவும்", "தோல் எரிச்சல், சிவத்தல்");
    }

    private void insertAnkleSprainData(SQLiteDatabase db) {
        insertMedicine(db, "ankle sprain",
                "Moov Spray", "Moov Cream", "Cold Compress",
                "Spray gently on ankle twice daily", "Apply gently on ankle twice daily", "Apply ice pack twice a day", "Cold burn, skin redness",
                "మూవ్ స్ప్రే", "మూవ్ క్రీమ్", "ఐస్ ప్యాక్",
                "రోజుకు రెండు సార్లు మడమపై స్ప్రే చేయాలి", "రోజుకు రెండు సార్లు మడమపై అప్లై చేయాలి", "రోజుకు రెండు సార్లు ఐస్ ప్యాక్ వాడాలి", "చల్లదనం వల్ల కాలిన అనుభూతి",
                "மூவ் ஸ்ப்ரே", "மூவ் கிரீம்", "குளிர் பதம்",
                "இரு முறை காளை மீது ஸ்ப்ரே செய்யவும்", "இரு முறை தடவவும்", "இரு முறை குளிர் பதத்தை வைத்திருக்கவும்", "குளிர் எரிச்சல், தோல் சிவத்தல்");
    }
    private void insertNeckPainData(SQLiteDatabase db) {
        insertMedicine(db, "neck pain",
                "Volini Spray", "Paracetamol Syrup", "Warm Compress",
                "Spray twice daily on neck", "5ml twice daily", "Apply warm cloth to neck twice daily", "Skin irritation, nausea",
                "వోలిని స్ప్రే", "ప్యారాసిటమాల్ సిరప్", "వెచ్చని గుడ్డ వేయడం",
                "రోజుకు రెండు సార్లు మెడపై స్ప్రే చేయాలి", "రోజుకు రెండు సార్లు 5ml ఇవ్వాలి", "రోజుకు రెండు సార్లు వెచ్చని గుడ్డ వేయాలి", "చర్మం ఎర్రగా మారటం, వికారం",
                "வோலினி ஸ்ப்ரே", "பாராசிட்டமால் சிரப்", "வெப்பக் கம்பிரஸ்",
                "தினம் இருமுறை கழுத்தில் ஸ்ப்ரே செய்யவும்", "இருமுறை 5ml கொடுக்கவும்", "வெப்பம் வைக்கவும்", "தோல் எரிச்சல், வாந்தி உணர்வு");
    }
    private void insertMuscleStrainData(SQLiteDatabase db) {
        insertMedicine(db, "muscle strain",
                "Moov Cream", "Cold Compress", "Gentle Massage",
                "Apply cream twice daily", "Apply cold pack twice daily", "Massage gently with oil", "Redness, skin irritation",
                "మూవ్ క్రీమ్", "చల్లటి కాంప్రెస్స్", "తేలికపాటి మసాజ్",
                "రోజుకు రెండు సార్లు క్రీమ్ రాయాలి", "రోజుకు రెండు సార్లు చల్లటి ప్యాక్ వేయాలి", "నెమ్మదిగా నూనెతో మసాజ్ చేయాలి", "చర్మం ఎర్రగా మారటం, గాట్లు",
                "மூவ் கிரீம்", "குளிர் பிளாஸ்", "மென்மையான மசாஜ்",
                "தினம் இருமுறை கிரீம் தடவவும்", "இருமுறை குளிர்ப் பிளாஸ் வைக்கவும்", "மெதுவாக எண்ணெய் தடவி மசாஜ் செய்யவும்", "தோல் சிவப்பாகுதல், எரிச்சல்");
    }
    private void insertWoundHealingData(SQLiteDatabase db) {
        insertMedicine(db, "wound healing",
                "Betadine Ointment", "Betadine Ointment", "Clean with saline",
                "Apply twice daily on wound", "Apply twice daily", "Clean with saline water before applying", "Burning sensation, redness",
                "బెటాడిన్ ఆయింట్మెంట్", "బెటాడిన్ ఆయింట్మెంట్", "ఉపసంహరణ నీటితో శుభ్రపరచడం",
                "రోజుకు రెండు సార్లు గాయం మీద రాయాలి", "రోజుకు రెండు సార్లు రాయాలి", "ఉపసంహరణ నీటితో శుభ్రపరచాలి", "కాలడం, చర్మం ఎర్రగా మారటం",
                "பெட்டாடின் மையம்", "பெட்டாடின் மையம்", "சாலின் நீரால் கழுவவும்",
                "தினம் இருமுறை பூசவும்", "இருமுறை பூசவும்", "பூசுவதற்கு முன் சாலின் நீரால் சுத்தம் செய்யவும்", "எரிச்சல், சிவப்பு");
    }

    private void insertColdFeetData(SQLiteDatabase db) {
        insertMedicine(db, "cold feet",
                "Warm Socks", "Warm Socks", "Warm Water Soak",
                "Wear warm socks daily", "Wear warm socks daily", "Soak feet in warm water for 10 minutes", "Skin dryness, redness",
                "వెచ్చని సాక్స్", "వెచ్చని సాక్స్", "వెచ్చటి నీటిలో ముంచడం",
                "ప్రతిరోజూ వెచ్చటి సాక్స్ వేసుకోవాలి", "ప్రతిరోజూ వెచ్చటి సాక్స్ వేసుకోవాలి", "వెచ్చటి నీటిలో పాదాలను 10 నిమిషాలు ముంచాలి", "చర్మం పొడిబారటం, ఎర్రబారటం",
                "வெப்ப சாக்ஸ்கள்", "வெப்ப சாக்ஸ்கள்", "வெந்நீரில் கால்கள் நனைத்தல்",
                "தினமும் வெப்ப சாக்ஸ்கள் அணியவும்", "தினமும் வெப்ப சாக்ஸ்கள் அணியவும்", "10 நிமிடம் வெந்நீரில் கால்களை நனைக்கவும்", "தோல் உலர்ச்சி, சிவப்பு");
    }
    private void insertEyeTwitchingData(SQLiteDatabase db) {
        insertMedicine(db, "eye twitching",
                "Rest, Eye Drops", "Eye Drops", "Cold Compress",
                "Use lubricating drops & rest", "Use drops twice daily", "Apply cold compress gently", "Eye irritation",
                "ఆరాం, కంటి బొట్లు", "కంటి బొట్లు", "చల్లటి కాంప్రెస్స్",
                "బొట్లు వేసి విశ్రాంతి తీసుకోవాలి", "రోజుకు రెండు సార్లు బొట్లు వేయాలి", "చల్లటి గుడ్డ వేసుకోవాలి", "కంటి గాట్లు",
                "ஓய்வு, கண் சொட்டு", "கண் சொட்டு", "குளிர் பிளாஸ்",
                "சொட்டு வைத்து ஓய்வு எடுக்கவும்", "இருமுறை சொட்டு", "குளிர் துணி வைக்கவும்", "கண் எரிச்சல்");
    }
    private void insertHandNumbnessData(SQLiteDatabase db) {
        insertMedicine(db, "hand numbness",
                "Vitamin B12 Tablets", "Multivitamin Syrup", "Massage",
                "1 tablet daily after food", "5ml syrup daily", "Gentle massage 2x a day", "Tingling, dizziness",
                "విటమిన్ B12 మాత్రలు", "మల్టీ విటమిన్ సిరప్", "తేలికపాటి మసాజ్",
                "రోజు ఒక మాత్ర ఆహారం తర్వాత", "రోజుకు ఒకసారి 5ml", "రోజుకు రెండు సార్లు మసాజ్ చేయాలి", "చిల్లులు, తలనొప్పి",
                "விட்டமின் B12 மாத்திரை", "மல்டி விட்டமின் சிரப்", "மென்மையான மசாஜ்",
                "ஒரு மாத்திரை உணவுக்குப் பிறகு", "5ml சிரப் தினம்", "மெதுவாக தினம் இருமுறை மசாஜ்", "மின்மினுப்பு, தலைசுற்றல்");
    }
    private void insertHeelPainData(SQLiteDatabase db) {
        insertMedicine(db, "heel pain",
                "Heel Pad, Pain Gel", "Paracetamol Syrup", "Foot Soak",
                "Apply gel and wear heel pads", "5ml twice daily", "Soak in warm water with salt", "Mild swelling, skin dryness",
                "హీల్ ప్యాడ్, నొప్పి జెల్", "ప్యారాసిటమాల్ సిరప్", "వెచ్చటి నీటిలో ముంచడం",
                "జెల్ రాసి హీల్ ప్యాడ్స్ వేసుకోవాలి", "రోజుకు రెండు సార్లు 5ml", "వెచ్చటి నీటిలో ఉప్పు కలిపి ముంచాలి", "ఉబ్బరం, పొడి చర్మం",
                "ஹீல் பேட், வலி ஜெல்", "பாராசிட்டமால் சிரப்", "வெந்நீரில் நனைத்தல்",
                "ஜெல் தடவி ஹீல் பேட் அணியவும்", "இருமுறை 5ml", "உப்புடன் வெந்நீரில் கால்கள் வைக்கவும்", "சிறு வீக்கம், தோல் உலர்ச்சி");
    }
    private void insertSweatyPalmsData(SQLiteDatabase db) {
        insertMedicine(db, "sweaty palms",
                "Talcum Powder", "Talcum Powder", "Cold Water Wash",
                "Apply powder twice a day", "Apply powder lightly", "Wash hands with cool water", "Dryness, skin irritation",
                "టాల్కం పౌడర్", "టాల్కం పౌడర్", "చల్లటి నీటితో చేతులు కడగడం",
                "రోజుకు రెండు సార్లు పౌడర్ వాడాలి", "తేలికగా పౌడర్ వాడాలి", "చల్లటి నీటితో చేతులు కడగాలి", "చర్మం పొడిబారటం",
                "டால்கம் பவுடர்", "டால்கம் பவுடர்", "குளிர்ந்த நீரால் கைக்கழுவுதல்",
                "இருமுறை பவுடர் தடவவும்", "லேசாக பவுடர் பயன்படுத்தவும்", "குளிர்ந்த நீரில் கைக்கழுவவும்", "தோல் உலர்ச்சி");
    }
    private void insertScalpDrynessData(SQLiteDatabase db) {
        insertMedicine(db, "scalp dryness",
                "Anti-Dandruff Shampoo", "Mild Baby Shampoo", "Coconut Oil",
                "Use shampoo 2–3 times/week", "Use mild shampoo", "Apply oil overnight", "Itching, flaking",
                "యాంటీ డాండ్రఫ్ షాంపూ", "బేబీ షాంపూ", "కొబ్బరి నూనె",
                "వారం లో 2-3 సార్లు షాంపూ వాడాలి", "తక్కువ శక్తి ఉన్న షాంపూ వాడాలి", "రాత్రంతా నూనె రాయాలి", "తల పగలు, పొడి చర్మం",
                "அரிப்பு ஷாம்பு", "பேபி ஷாம்பு", "தேங்காய் எண்ணெய்",
                "வாரம் 2-3 முறை ஷாம்பு", "மிதமான ஷாம்பு பயன்படுத்தவும்", "நள்ளிரவில் எண்ணெய் பூசவும்", "அரிப்பு, பசை");
    }
    private void insertLipSwellingData(SQLiteDatabase db) {
        insertMedicine(db, "lip swelling",
                "Cetrizine Tablet", "Antihistamine Syrup", "Cold Compress",
                "1 tablet at night", "5ml at night", "Apply cold compress 2x/day", "Drowsiness, dry mouth",
                "సెట్రిజైన్ టాబ్లెట్", "యాంటీహిస్టమైన్ సిరప్", "చల్లటి కాంప్రెస్స్",
                "రాత్రి ఒక మాత్ర వాడాలి", "రాత్రి 5ml ఇవ్వాలి", "రోజుకు రెండు సార్లు చల్లటి ప్యాక్ వేయాలి", "అలసట, నోరు ఎండటం",
                "செடிரிசின் மாத்திரை", "ஹிஸ்டமின் சிரப்", "குளிர் பிளாஸ்",
                "இரவு ஒரு மாத்திரை", "இரவு 5ml", "இருமுறை குளிர் துணி வைக்கவும்", "மயக்கம், வாய் உலர்ச்சி");
    }
    private void insertJawPainData(SQLiteDatabase db) {
        insertMedicine(db, "jaw pain",
                "Ibuprofen Tablet", "Paracetamol Syrup", "Warm Compress",
                "1 tablet twice after food", "5ml twice daily", "Apply warm cloth over jaw", "Stomach upset, sleepiness",
                "ఇబుప్రొఫెన్ టాబ్లెట్", "ప్యారాసిటమాల్ సిరప్", "వెచ్చటి గుడ్డ వేయడం",
                "రోజుకు రెండు సార్లు ఆహారం తర్వాత టాబ్లెట్", "రోజుకు రెండు సార్లు 5ml", "తేలికగా గుడ్డ వేయాలి", "అజీర్ణం, నిద్ర",
                "இபுபுரோஃபென் மாத்திரை", "பாராசிட்டமால் சிரப்", "வெப்ப கம்பிரஸ்",
                "இருமுறை உணவுக்குப் பிறகு மாத்திரை", "5ml இருமுறை", "வெப்பம் வைக்கவும்", "மயக்கம், குடல் பிரச்சனை");
    }
    private void insertFingerSwellingData(SQLiteDatabase db) {
        insertMedicine(db, "finger swelling",
                "Pain Relief Gel", "Cold Compress", "Elevation",
                "Apply gel twice daily", "Apply cold pack gently", "Keep finger elevated", "Redness, local irritation",
                "నొప్పి నివారణ జెల్", "చల్లటి ప్యాక్", "ఆంగుళాన్ని పైకి ఉంచడం",
                "రోజుకు రెండు సార్లు జెల్ రాయాలి", "తేలికగా చల్లటి ప్యాక్ వేయాలి", "వెళుతురులో ఉంచాలి", "చర్మం ఎర్రగా మారటం",
                "வலி ஜெல்", "குளிர் பிளாஸ்", "விரலை உயர்த்தி வைக்கவும்",
                "இருமுறை ஜெல் தடவவும்", "மெதுவாக குளிர் பிளாஸ்", "விரலை உயர்த்தி வைக்கவும்", "சிவப்பு, எரிச்சல்");
    }
    private void insertTiredLegsData(SQLiteDatabase db) {
        insertMedicine(db, "tired legs",
                "Electrolyte Powder", "ORS Syrup", "Leg Elevation",
                "1 sachet with water after walk", "5ml after play", "Keep legs raised 10 minutes", "Mild cramp, nausea",
                "ఎలెక్ట్రోలైట్ పౌడర్", "ORS సిరప్", "కాలిని పైకి ఉంచడం",
                "నడక తర్వాత 1 సాషే నీటిలో కలిపి త్రాగాలి", "ఆట తర్వాత 5ml ఇవ్వాలి", "10 నిమిషాలు పైకి ఉంచాలి", "పొట్టి నొప్పి, వికారం",
                "மின்னணு தூள்", "ORS சிரப்", "கால்களை உயர்த்தி வைக்கவும்",
                "நடந்த பிறகு ஒரு பை", "விளையாட்டுக்குப் பிறகு 5ml", "10 நிமிடம் உயர்த்தி வைக்கவும்", "வலி, வாந்தி உணர்வு");
    }
    private void insertFoodPoisoningData(SQLiteDatabase db) {
        insertMedicine(db, "food poisoning",
                "ORS, Norflox-TZ", "ORS, Norflox-TZ (Pediatric)", "-",
                "Take ORS to prevent dehydration. Take Norflox-TZ twice daily after food for 3 days.",
                "Give ORS frequently. Give Norflox-TZ (Pediatric) as per doctor advice.", "-",
                "Nausea, headache, mild stomach pain",
                "ఓఆర్‌ఎస్, నార్ఫ్లాక్స్-టిజడ్", "ఓఆర్‌ఎస్, నార్ఫ్లాక్స్-టిజడ్ (పెడియాట్రిక్)", "-",
                "డీహైడ్రేషన్ నివారించేందుకు ఓఆర్‌ఎస్ తీసుకోండి. నార్ఫ్లాక్స్-టిజడ్ రోజు రెండు సార్లు ఆహారం తర్వాత 3 రోజుల పాటు తీసుకోండి.",
                "ఓఆర్‌ఎస్ తరచూ ఇవ్వండి. నార్ఫ్లాక్స్-టిజడ్ (పెడియాట్రిక్) వైద్యుల సూచన మేరకు ఇవ్వాలి.", "-",
                "వాంతులు, తలనొప్పి, కడుపు నొప్పి",
                "ஓஆர்எஸ், நார்ஃப்ளாக்ஸ்-டிஎஸ்", "ஓஆர்எஸ், நார்ஃப்ளாக்ஸ்-டிஎஸ் (குழந்தைகள்)", "-",
                "நீரிழப்பு தவிர்க்க ஓஆர்எஸ் குடிக்கவும். நார்ஃப்ளாக்ஸ்-டிஎஸ் உணவுக்குப் பிறகு தினமும் இருமுறை 3 நாட்கள் எடுத்துக்கொள்ளவும்.",
                "ஓஆர்எஸ் அடிக்கடி கொடுக்கவும். நார்ஃப்ளாக்ஸ்-டிஎஸ் (குழந்தைகள்) மருத்துவர் ஆலோசனையுடன் கொடுக்கவும்.", "-",
                "வாந்தி, தலைவலி, வயிற்று வலி"
        );
    }

    private void insertAppendicitisData(SQLiteDatabase db) {
        insertMedicine(db, "appendicitis",
                "Hospitalization, IV antibiotics", "Hospitalization, IV antibiotics", "-",
                "Requires immediate medical attention. IV antibiotics and surgery if needed.",
                "Hospital admission required. IV antibiotics and surgery based on severity.", "-",
                "Nausea, infection risk",
                "ఆసుపత్రి చేరిక, ఐవీ యాంటీబయోటిక్స్", "ఆసుపత్రి చేరిక, ఐవీ యాంటీబయోటిక్స్", "-",
                "తక్షణ వైద్య సహాయం అవసరం. అవసరమైతే శస్త్రచికిత్సతో పాటు ఐవీ యాంటీబయోటిక్స్.",
                "ఆసుపత్రిలో చేరాలి. తీవ్రత ఆధారంగా శస్త్రచికిత్స అవసరం.", "-",
                "వాంతులు, ఇన్ఫెక్షన్ ప్రమాదం",
                "மருத்துவமனையில் சேர்த்தல், IV ஆன்டிபயாடிக்ஸ்", "மருத்துவமனையில் சேர்த்தல், IV ஆன்டிபயாடிக்ஸ்", "-",
                "விரைவில் மருத்துவ சிகிச்சை தேவை. தேவையானால் அறுவை சிகிச்சை மற்றும் IV ஆன்டிபயாடிக்ஸ்.",
                "மருத்துவமனையில் சேர்த்தல் தேவை. தீவிரத்தை பொறுத்து அறுவை சிகிச்சை.", "-",
                "வாந்தி, தொற்று அபாயம்"
        );
    }

    private void insertAsthmaData(SQLiteDatabase db) {
        insertMedicine(db, "asthma",
                "Levolin Inhaler, Budecort", "Levolin Inhaler Junior", "-",
                "Use Levolin Inhaler during wheezing. Use Budecort for regular control.",
                "Use Levolin Inhaler Junior during wheezing episodes.", "-",
                "Tremor, dry mouth, throat irritation",
                "లెవోలిన్ ఇన్హేలర్, బుడెకార్ట్", "లెవోలిన్ ఇన్హేలర్ జూనియర్", "-",
                "శ్వాస తీసుకోవడంలో ఇబ్బందికి లెవోలిన్ ఇన్హేలర్ ఉపయోగించండి. నియమిత నియంత్రణకు బుడెకార్ట్ ఉపయోగించండి.",
                "శ్వాస సమస్యల సమయంలో లెవోలిన్ ఇన్హేలర్ జూనియర్ ఉపయోగించాలి.", "-",
                "వణుకు, నోటి పొడిబారటం, గొంతు ఇబ్బంది",
                "லெவோலின் இன்ஹேலர், புதெகார்ட்", "லெவோலின் இன்ஹேலர் ஜூனியர்", "-",
                "சுழற்சி சிரமத்தின் போது லெவோலின் இன்ஹேலர் பயன்படுத்தவும். தினசரி கட்டுப்பாட்டிற்கு புதெகார்ட் பயன்படுத்தவும்.",
                "சிறார்களுக்கு சுழற்சி சிரமத்தின் போது லெவோலின் ஜூனியர் பயன்படுத்தவும்.", "-",
                "கைகம்பல், வாய் வறட்சி, தொண்டை வலி"
        );
    }

    private void insertSinusInfectionData(SQLiteDatabase db) {
        insertMedicine(db, "sinus infection",
                "Sinarest, Steam Inhalation", "Sinarest Pediatric, Steam", "-",
                "Take Sinarest twice a day after food. Do steam inhalation 2-3 times daily.",
                "Give Sinarest Pediatric as per dosage. Steam inhalation helps relieve congestion.", "-",
                "Drowsiness, dry mouth",
                "సైనరెస్ట్, ఆవి పీల్చడం", "సైనరెస్ట్ పెడియాట్రిక్, ఆవి", "-",
                "సైనరెస్ట్ రోజుకు రెండు సార్లు ఆహారం తర్వాత తీసుకోండి. రోజుకు 2-3 సార్లు ఆవి పీల్చండి.",
                "సైనరెస్ట్ పెడియాట్రిక్ డోసేజ్ ప్రకారం ఇవ్వాలి. ఆవి congestion తగ్గిస్తుంది.", "-",
                "నిద్రమత్తు, నోటి పొడి",
                "சைனரெஸ்ட், வாயு உள்வாங்கல்", "சைனரெஸ்ட் பீடியாட்ரிக், வாயு", "-",
                "சைனரெஸ்ட் உணவுக்குப் பிறகு தினம் இருமுறை எடுத்துக்கொள்ளவும். தினமும் 2-3 முறை வாயு உள்வாங்கவும்.",
                "சைனரெஸ்ட் பீடியாட்ரிக் அளவுக்கேற்ப கொடுக்கவும். வாயு உள்வாங்கல் நெரிசலை குறைக்கும்.", "-",
                "மயக்கம், வாய் வறட்சி"
        );
    }

    private void insertGumBleedingData(SQLiteDatabase db) {
        insertMedicine(db, "gum bleeding",
                "Hexidine Mouthwash", "Hexidine Mouthwash", "Hexidine Mouthwash",
                "Rinse mouth twice daily", "Rinse mouth once daily", "Use a soft wet cloth to clean gums",
                "Mild burning, altered taste",
                "హెక్సిడైన్ మౌత్‌వాష్", "హెక్సిడైన్ మౌత్‌వాష్", "హెక్సిడైన్ మౌత్‌వాష్",
                "రోజు రెండు సార్లు కళ్ళును పుక్కిలించాలి", "రోజు ఒకసారి పుక్కిలించాలి", "ఆడ్లను తడి గుడ్డతో శుభ్రం చేయాలి",
                "కొంత కాలం కాలినట్టు, రుచి మారుతుంది",
                "ஹெக்ஸிடின் மவுத்த்வாஷ்", "ஹெக்ஸிடின் மவுத்த்வாஷ்", "ஹெக்ஸிடின் மவுத்த்வாஷ்",
                "ஒரு நாளில் இரண்டு முறை குளுக்கழிக்கவும்", "ஒரு முறை மட்டும் குளுக்கழிக்கவும்", "ஊதா துணியால் நன்றாக தேய்க்கவும்",
                "சிறு எரிச்சல், சுவை மாற்றம்"
        );
    }
    private void insertBadBreathData(SQLiteDatabase db) {
        insertMedicine(db, "bad breath",
                "Listerine", "Listerine", "Listerine",
                "Rinse mouth twice daily", "Rinse once daily", "Wipe mouth gently",
                "Burning, dry mouth",
                "లిస్టర్‌నీన్", "లిస్టర్‌నీన్", "లిస్టర్‌నీన్",
                "రోజూ రెండు సార్లు పుక్కిలించాలి", "రోజు ఒకసారి పుక్కిలించాలి", "తడి గుడ్డతో నోరును శుభ్రపరచాలి",
                "కాలిన అనుభూతి, నోరు ఎండు పోవడం",
                "லிஸ்டெரின்", "லிஸ்டெரின்", "லிஸ்டெரின்",
                "ஒரு நாளில் இருமுறை வாயை சுத்தம் செய்யவும்", "ஒரு முறை மட்டும் குளுக்கவும்", "ஊதா துணியால் சுத்தம் செய்யவும்",
                "வாயில் எரிச்சல், உலர்ச்சி"
        );
    }
    private void insertToothSensitivityData(SQLiteDatabase db) {
        insertMedicine(db, "tooth sensitivity",
                "Sensodyne Toothpaste", "Sensodyne Toothpaste", "Soft brush only",
                "Brush twice daily", "Brush once daily", "Clean gently with cloth",
                "Mild irritation",
                "సెన్సోడైన్ పేస్ట్", "సెన్సోడైన్ పేస్ట్", "సాఫ్ట్ బ్రష్ ఉపయోగించాలి",
                "రోజూ రెండు సార్లు బ్రష్ చేయాలి", "రోజు ఒకసారి బ్రష్ చేయాలి", "తడి గుడ్డతో శుభ్రం చేయాలి",
                "అల్ప అసౌకర్యం",
                "சென்சடைன் பேஸ்ட்", "சென்சடைன் பேஸ்ட்", "மென்மையான பரஷ்",
                "ஒரு நாளில் இருமுறை பற்கள் துலக்கவும்", "ஒரு முறை மட்டும்", "ஊதா துணியால் தேய்க்கவும்",
                "சிறு எரிச்சல்"
        );
    }
    private void insertGumSwellingData(SQLiteDatabase db) {
        insertMedicine(db, "gum swelling",
                "Metrogyl DG Gel", "Metrogyl DG Gel", "Metrogyl DG Gel",
                "Apply to gums twice daily", "Apply once daily", "Apply very little",
                "Burning sensation, bitter taste",
                "మెట్రోజిల్ డిజి జెల్", "మెట్రోజిల్ డిజి జెల్", "మెట్రోజిల్ డిజి జెల్",
                "రోజు రెండు సార్లు అల్లర్లకు అప్లై చేయాలి", "రోజు ఒకసారి అప్లై చేయాలి", "చిన్న మోతాదులో అప్లై చేయాలి",
                "కాలిన అనుభూతి, చేదు రుచి",
                "மெட்ரோஜில் ஜி ஜெல்", "மெட்ரோஜில் ஜி ஜெல்", "மெட்ரோஜில் ஜி ஜெல்",
                "ஒரு நாளில் இரண்டு முறை இடவும்", "ஒரு முறை மட்டும் இடவும்", "சிறு அளவு மட்டுமே இடவும்",
                "எரிச்சல், கசப்பு"
        );
    }
    private void insertAcneData(SQLiteDatabase db) {
        insertMedicine(db, "acne",
                "Clindamycin Gel", "Clindamycin Gel", "Not Recommended",
                "Apply thin layer twice daily", "Apply thin layer once daily", "Avoid use in infants", "Skin dryness, redness",
                "క్లిండామైసిన్ జెల్", "క్లిండామైసిన్ జెల్", "లభ్యమైంది కాదు",
                "రోజుకు రెండు సార్లు పలుచని పొరగా అప్లై చేయండి", "రోజుకు ఒకసారి అప్లై చేయండి", "శిశువులకు ఉపయోగించవద్దు", "చర్మం పొడిబారడం, ఎరుపు",
                "கிளின்டாமைசின் ஜெல்", "கிளின்டாமைசின் ஜெல்", "கிடைக்கவில்லை",
                "இரண்டு முறை மெல்ல தடவவும்", "ஒரு முறை மெல்ல தடவவும்", "பிள்ளைகளுக்கு தவிர்க்கவும்", "தோல் உலர்ச்சி, சிவப்பு");
    }

    private void insertEczemaData(SQLiteDatabase db) {
        insertMedicine(db, "eczema",
                "Hydrocortisone Cream", "Hydrocortisone Cream", "Moisturizer",
                "Apply thinly twice daily", "Apply once daily", "Apply gentle moisturizer", "Itching, burning",
                "హైడ్రోకార్టిసోన్ క్రీమ్", "హైడ్రోకార్టిసోన్ క్రీమ్", "నెమ్మదిగా మాయిశ్చరైజర్ అప్లై చేయండి",
                "రోజుకు రెండు సార్లు అప్లై చేయండి", "రోజుకు ఒకసారి అప్లై చేయండి", "రోజుకు రెండుసార్లు అప్లై చేయండి", "ఖజ్జీ, కాలుతుంది",
                "ஹைட்ரோகார்டிசோன் கிரீம்", "ஹைட்ரோகார்டிசோன் கிரீம்", "மென்மையான முறையில் நிறைவேற்றவும்",
                "இரண்டு முறை தடவவும்", "ஒரு முறை தடவவும்", "ஒரு நாளில் இரண்டு முறை தடவவும்", "நெருடல், எரிச்சல்");
    }

    private void insertConjunctivitisData(SQLiteDatabase db) {
        insertMedicine(db, "conjunctivitis",
                "Moxifloxacin Eye Drops", "Chloramphenicol Eye Drops", "Sterile Saline",
                "1 drop every 6 hrs", "1 drop every 8 hrs", "Clean eyes gently", "Eye irritation, burning",
                "మోక్సీఫ్లోక్సాసిన్ ఐ డ్రాప్స్", "క్లోరంపెనికాల్ ఐ డ్రాప్స్", "క్లీన్ వాటర్‌తో కళ్ళు శుభ్రం చేయండి",
                "ప్రతి 6 గంటలకు 1 బొట్టు", "ప్రతి 8 గంటలకు 1 బొట్టు", "నెమ్మదిగా శుభ్రం చేయండి", "కళ్ళు కాలుతాయి, ఇర్రిటేషన్",
                "மோக்ஸிஃப்ளோக்ஸாசின் கண் சொட்டு", "கிளோரம்பெனிகால் கண் சொட்டு", "தூய நீர் அல்லது உப்பு நீர்",
                "6 மணி நேரத்திற்கு ஒரு சொட்டு", "8 மணி நேரத்திற்கு ஒரு சொட்டு", "மெல்ல சுத்தம் செய்யவும்", "கண் எரிச்சல், எரிச்சல்");
    }

    private void insertEyeStrainData(SQLiteDatabase db) {
        insertMedicine(db, "eye strain",
                "Refresh Tears", "Tear Drops (Pediatric)", "Not Needed",
                "1-2 drops as needed", "1 drop as needed", "Not needed for infants", "Mild burning or blurring",
                "రిఫ్రెష్ టియర్స్", "టీర్ డ్రాప్స్ (పిల్లల కోసం)", "అవసరం లేదు",
                "అవసరమైతే 1-2 బొట్లు", "అవసరమైతే 1 బొట్టు", "శిశువులకు అవసరం లేదు", "చిన్నకాలపు కాలడం లేదా బ్లర్",
                "ரிப்ரெஷ் டியர்ஸ்", "குழந்தைகள் கண்ணீர் சொட்டு", "தேவையில்லை",
                "தேவைப்பட்டால் 1-2 சொட்டு", "தேவைப்பட்டால் 1 சொட்டு", "குழந்தைகளுக்கு தேவையில்லை", "சிறிய எரிச்சல் அல்லது மங்கல்");
    }

    private void insertRashData(SQLiteDatabase db) {
        insertMedicine(db, "skin rash",
                "Calamine Lotion", "Calamine Lotion", "Coconut Oil",
                "Apply gently twice daily", "Apply once daily", "Apply small amount", "Itching, skin dryness",
                "కాలమైన్ లోషన్", "కాలమైన్ లోషన్", "కొబ్బరినూనె",
                "రోజుకు రెండు సార్లు అప్లై చేయండి", "రోజుకు ఒకసారి అప్లై చేయండి", "కొద్దిగా అప్లై చేయండి", "ఖజ్జీ, చర్మం పొడిబారడం",
                "காலமைன் லோஷன்", "காலமைன் லோஷன்", "தேங்காயெண்ணெய்",
                "இரண்டு முறை மென்மையாக தடவவும்", "ஒரு முறை தடவவும்", "சிறிதளவு தடவவும்", "நெருடல், தோல் உலர்ச்சி");
    }


    private void insertDryEyesData(SQLiteDatabase db) {
        insertMedicine(db, "dry eyes",
                "Refresh Tears", "Refresh Tears", "Consult doctor",
                "Use 1–2 drops in each eye when needed", "Use 1 drop when needed", "Consult pediatrician", "Eye irritation, temporary blurred vision",
                "రీఫ్రెష్ టియర్స్", "రీఫ్రెష్ టియర్స్", "డాక్టర్‌ను సంప్రదించండి",
                "అవసరమైనప్పుడు ప్రతి కన్నులో 1–2 చుక్కలు వేసుకోండి", "అవసరమైనప్పుడు 1 చుక్క వేసుకోండి", "డాక్టర్‌ను సంప్రదించండి", "కంటి జలదోషం, తాత్కాలికంగా చూపు మందగింపు",
                "ரீஃப்ரெஷ் டியர்ஸ்", "ரீஃப்ரெஷ் டியர்ஸ்", "மருத்துவரை அணுகவும்",
                "தேவையானபோது ஒவ்வொரு கண்களிலும் 1–2 சொட்டு", "தேவையானபோது 1 சொட்டு", "மருத்துவரை அணுகவும்", "கண் எரிச்சல், தற்காலிகமாக மங்கிய பார்வை");
    }

    private void insertItchySkinData(SQLiteDatabase db) {
        insertMedicine(db, "itchy skin",
                "Cetrizine", "Cetrizine Syrup", "Calamine Lotion",
                "Take 1 tablet at night", "5 ml once daily", "Apply on affected area 2–3 times a day", "Drowsiness, dry mouth",
                "సెట్రిజైన్", "సెట్రిజైన్ సిరప్", "క్యాలమైన్ లోషన్",
                "రాత్రి ఒక టాబ్లెట్ తీసుకోండి", "రోజుకు ఒకసారి 5 మిల్లీలీటర్లు", "రోజుకు 2–3 సార్లు ప్రభావిత భాగంలో రాయండి", "నిద్రమత్తు, నోరు ఎండిపోవడం",
                "செட்ரிசின்", "செட்ரிசின் சிரப்", "கேலமைன் லோஷன்",
                "இரவு 1 மாத்திரை எடுத்துக்கொள்ளவும்", "ஒன்று நாள் 5 மிலி", "பாதிக்கப்பட்ட பகுதியில் தினமும் 2–3 முறை தடவவும்", "தூக்கத்தேவை, வாய் உலர்வு");
    }


    private void insertHivesData(SQLiteDatabase db) {
        insertMedicine(db, "hives",
                "Cetirizine", "Cetirizine", "Consult Doctor",
                "Take 1 tablet at night", "Half tablet at night", "Consult pediatrician",
                "Drowsiness, dry mouth",
                "సిటిరిజిన్", "సిటిరిజిన్", "డాక్టర్‌ను సంప్రదించండి",
                "రాత్రి ఒక మాత్ర తీసుకోండి", "రాత్రి అర మాత్ర", "పిల్లల వైద్యుడిని సంప్రదించండి",
                "అలసట, నోరు ఎండిపోవడం",
                "செட்டிரிசின்", "செட்டிரிசின்", "மருத்துவரை அணுகவும்",
                "இரவில் ஒரு மாத்திரை", "இரவில் அரை மாத்திரை", "குழந்தை மருத்துவரை அணுகவும்",
                "தூக்கமின்மை, வாய்காறுதல்");
    }

    private void insertBedsoresData(SQLiteDatabase db) {
        insertMedicine(db, "bedsores",
                "Silver Sulfadiazine Cream", "Antibiotic Cream", "Seek hospital care",
                "Apply gently to wounds twice daily", "Apply thin layer daily", "Hospital-based care",
                "Burning, skin irritation",
                "సిల్వర్ సల్ఫడయాజిన్ క్రీమ్", "జీవాణు నిరోధక క్రీమ్", "ఆసుపత్రి సంరక్షణ అవసరం",
                "రోజు రెండుసార్లు వేయండి", "చిన్న మోతాదులో వేయండి", "ఆసుపత్రిలో చికిత్స",
                "చర్మం మండడం, జలుబు",
                "சில்வர் சல்படையாசின் கிரீம்", "ஆண்டிபயாட்டிக் கிரீம்", "மருத்துவமனையில் பராமரிப்பு",
                "இரண்டு முறை தடவவும்", "குறைந்த அளவில்", "மருத்துவமனை தேவையானது",
                "சருமம் எரிதல், உலர்வு");
    }

    private void insertSkinTagsData(SQLiteDatabase db) {
        insertMedicine(db, "skin tags",
                "Tag Removal Cream", "Tag Removal Ointment", "Doctor removal advised",
                "Apply once daily", "Apply small amount daily", "Not suitable for infants",
                "Irritation, redness",
                "టాగ్ రిమూవల్ క్రీమ్", "టాగ్ రిమూవల్ మలయం", "డాక్టర్ సలహా అవసరం",
                "రోజుకు ఒక్కసారి వేయండి", "చిన్న మోతాదులో వేయండి", "శిశువులకు కాదు",
                "చర్మం ఎర్రబడటం, ఇబ్బంది",
                "டாக் அகற்று கிரீம்", "டாக் அகற்று மயிர்", "மருத்துவரை அணுகவும்",
                "ஒரு முறை பூசவும்", "குறைந்த அளவில்", "குழந்தைக்கு அல்ல",
                "சரும எரிதல், சிவப்பு");
    }
    private void insertJaundiceData(SQLiteDatabase db) {
        insertMedicine(db, "jaundice",
                "Liv 52", "Liv 52 syrup", "Not recommended",
                "1 tablet twice daily after food", "10ml twice daily after food", "Not for infants",
                "Mild stomach upset", "Rare stomach upset", "Not suitable for infants",
                "లివ్ 52", "లివ్ 52 సిరప్", "పిల్లలకు ఇవ్వవద్దు",
                "ఆహారం తర్వాత రోజుకు రెండు సార్లు", "రోజుకు రెండు సార్లు 10 మి.లీ", "పిల్లలకు కాదు",
                "అన్నవాయువు, తలనొప్పి", "పిల్లల్లో అరుదైన రియాక్షన్", "పిల్లలకు అనుకూలం కాదు",
                "லிவ் 52", "லிவ் 52 சிரப்", "குழந்தைகளுக்குத் தவிர்க்கவும்"
        );
    }
    private void insertUTIData(SQLiteDatabase db) {
        insertMedicine(db, "urinary tract infection",
                "Cranberry Tablets", "Cranberry Syrup", "Not recommended",
                "Take one tablet twice a day after meals", "5 ml syrup twice daily after meals", "Not for infants",
                "Stomach upset, mild diarrhea", "Mild nausea", "Not suitable for infants",
                "క్రాన్‌బెర్రీ మాత్రలు", "క్రాన్‌బెర్రీ సిరప్", "పిల్లలకు ఇవ్వవద్దు",
                "ప్రతి భోజనానంతరం ఒక మాత్ర రెండు సార్లు", "రోజుకు రెండు సార్లు 5 మిల్లీలీటర్లు", "ఇన్ఫెంట్స్‌కు ఇవ్వవద్దు",
                "கிரான்பெரி மாத்திரைகள்", "கிரான்பெரி சிரப்", "குழந்தைகளுக்கு இல்லை",
                "ஒவ்வொரு உணவிற்குப்பின் ஒரு மாத்திரை தினமும் இரண்டு முறை", "ஒரு நாளுக்கு இரு முறை 5 மிலிலீட்டர்", "குழந்தைகளுக்கு இல்லை"
        );
    }
    private void insertMenstrualCrampsData(SQLiteDatabase db) {
        insertMedicine(db, "menstrual cramps",
                "Meftal Spas", "Paracetamol Syrup", "Not recommended",
                "Take one tablet during pain, max 2 per day", "5 ml syrup when in pain, max twice a day", "Not for infants",
                "Dizziness, nausea", "Mild sleepiness", "Not suitable for infants",
                "మెఫ్టాల్ స్పాస్", "ప్యారాసిటమాల్ సిరప్", "ఇన్ఫెంట్స్‌కి ఇవ్వవద్దు",
                "నొప్పి సమయంలో ఒక మాత్ర, రోజుకు గరిష్టంగా రెండు", "నొప్పి ఉన్నప్పుడు రోజుకు రెండు సార్లు 5 మిల్లీ", "ఇన్ఫెంట్స్‌కి అనుకూలం కాదు",
                "மெஃப்டால் ஸ்பாஸ்", "பராசிட்டமால் சிரப்", "குழந்தைகளுக்கு இல்லை",
                "வலி ஏற்பட்டால் ஒரு மாத்திரை, அதிகபட்சம் 2 நாள்", "வலி இருந்தால் நாள் இரு முறை 5 மிலிலிட்டர்", "குழந்தைகளுக்கு தவிர்க்கவும்"
        );
    }

    private void insertWhiteDischargeData(SQLiteDatabase db) {
        insertMedicine(db, "white vaginal discharge",
                "Clingen Vaginal Tablet", "", "Not for infants",
                "Insert 1 tablet into vagina at bedtime for 7 days", "", "Not applicable",
                "Mild vaginal irritation, itching",
                "క్లింజెన్ వెజైనల్ టాబ్లెట్", "", "శిశువులకు కాదు",
                "ప్రతి రాత్రి వెజైనాలో ఒక టాబ్లెట్ ఉంచాలి (7 రోజులు)", "", "వర్తించదు",
                "అల్ప అసౌకర్యం, అలర్జీ",
                "க்ளிஞ்சன் வைஜினல் மாத்திரை", "", "குழந்தைகளுக்கு இல்லை",
                "ஒவ்வொரு இரவும் ஒரு மாத்திரை வைஜினாவில் வைக்கவும் (7 நாட்கள்)", "", "பொருந்தாது",
                "சிறு எரிச்சல், அலர்ஜி"
        );
    }
    private void insertIrregularPeriodsData(SQLiteDatabase db) {
        insertMedicine(db, "irregular periods",
                "Deviry", "", "Not for children",
                "One tablet twice daily for 5 days or as prescribed", "", "Not applicable",
                "Nausea, headache, breast tenderness",
                "డెవిరీ", "", "పిల్లలకు కాదు",
                "రోజుకు రెండు సార్లు ఒక మాత్ర (5 రోజులు లేదా డాక్టర్ సలహా మేరకు)", "", "వర్తించదు",
                "వాంతులు, తలనొప్పి, স্তన సున్నితత",
                "டெவிரி", "", "குழந்தைகளுக்கு இல்லை",
                "ஒரு மாத்திரை தினம் இருமுறை (5 நாட்கள் அல்லது மருத்துவர் ஆலோசனைப்படி)", "", "பொருந்தாது",
                "வாந்தி, தலைவலி, மார்பக வலிப்பு"
        );
    }
    private void insertVaginalItchingData(SQLiteDatabase db) {
        insertMedicine(db, "vaginal itching",
                "Candid V Gel", "", "Not for infants",
                "Apply externally twice a day for 5–7 days", "", "Not applicable",
                "Burning sensation, irritation",
                "కాండిడ్ వి జెల్", "", "శిశువులకు కాదు",
                "బయటి భాగానికి రోజుకు రెండు సార్లు ఉపయోగించాలి (5–7 రోజులు)", "", "వర్తించదు",
                "కలత, తగిన చోట రక్తం",
                "காண்டிட் வி ஜெல்", "", "குழந்தைகளுக்கு இல்லை",
                "வெளிப்புறமாக தினம் இருமுறை பூசவும் (5–7 நாட்கள்)", "", "பொருந்தாது",
                "எரிச்சல், எரிச்சல் உணர்வு"
        );
    }
    private void insertBreastPainData(SQLiteDatabase db) {
        insertMedicine(db, "breast pain",
                "Evion 400", "", "Not for children",
                "One capsule daily after food for 15 days", "", "Not applicable",
                "Loose stools, nausea",
                "ఈవియన్ 400", "", "పిల్లలకు కాదు",
                "ఆహారం తర్వాత రోజుకు ఒక కాప్సూల్ (15 రోజులు)", "", "వర్తించదు",
                "వాంతులు, జీర్ణ సమస్యలు",
                "எவியான் 400", "", "குழந்தைகளுக்கு இல்லை",
                "உணவுக்குப் பிறகு தினம் ஒரு கேப்சூல் (15 நாட்கள்)", "", "பொருந்தாது",
                "வாந்தி, வயிற்றுப் பிரச்சனை"
        );
    }
    private void insertPCOSData(SQLiteDatabase db) {
        insertMedicine(db,
                "PCOS",
                "Metformin", "", "",
                "500mg once daily", "", "",
                "Nausea, diarrhea",
                "மெட்ஃபார்மின்", "", "",
                "தினமும் ஒருமுறை 500மி.கி", "", "",
                "வாந்தி, வயிற்றுப்போக்கு",
                "மெடஃபார்மின்", "", "",
                "500mg روزانہ ایک بار", "", "",
                "متلی، دست");
    }
    private void insertYeastInfectionData(SQLiteDatabase db) {
        insertMedicine(db,
                "Vaginal Yeast Infection",
                "Fluconazole", "Clotrimazole Cream", "",
                "150mg single dose", "Apply externally twice daily", "",
                "Stomach pain, rash",
                "ఫ్లూకోనాజోల్", "క్లోట్రిమాజోల్ క్రీమ్", "",
                "ఒక్కసారి 150 మి.గ్రా", "రోజుకు రెండుసార్లు వెలుపల ఉపయోగించాలి", "",
                "వయర్ల నొప్పి, అలర్జీ",
                "ஃப்ளூகோனாசோல்", "குளோட்ரிமாசோல் கிரீம்", "",
                "150மி.கி ஒரே முறை", "வெளிப்புறம் தினமும் இருமுறை", "",
                "வயிற்று வலி, தோல் வெளியீடு");
    }
    private void insertMenopauseData(SQLiteDatabase db) {
        insertMedicine(db,
                "Menopause Symptoms",
                "Hormonal Therapy (HRT)", "", "",
                "As prescribed by doctor", "", "",
                "Nausea, breast tenderness",
                "హార్మోన్ థెరపీ", "", "",
                "డాక్టర్ సూచించిన విధంగా", "", "",
                "వాంతులు, పాలను పట్టే భాగం నొప్పి",
                "ஹார்மோன் சிகிச்சை", "", "",
                "மருத்துவர் பரிந்துரைப்படி", "", "",
                "வாந்தி, மார்பக வலி");
    }
    private void insertPregnancyNauseaData(SQLiteDatabase db) {
        insertMedicine(db, "pregnancy-related nausea",
                "Doxinate", "", "",
                "Take one tablet in the morning before food or as prescribed by your doctor.", "", "",
                "Drowsiness, dry mouth, constipation",
                "డాక్సినేట్", "", "",
                "ఆహారం ముందు ఒక మాత్ర తీసుకోండి లేదా వైద్యుడు సూచించిన విధంగా తీసుకోండి.", "", "",
                "నిద్రమత్తు, నోరు ఎండిపోవడం, మలబద్ధకం",
                "டாக்ஸினேட்", "", "",
                "உணவிற்கு முன் ஒரு மாத்திரை எடுத்துக் கொள்ளவும் அல்லது மருத்துவர் கூறியபடி.", "", "",
                "நித்திரை தன்மை, வாய் உலர்வு, மலச்சிக்கல்"
        );
    }
    private void insertIronDeficiencyAnemiaData(SQLiteDatabase db) {
        insertMedicine(db, "iron deficiency anemia",
                "Ferrochel", "", "",
                "Take one tablet daily after food or as prescribed by your doctor.", "", "",
                "Stomach upset, dark stools, constipation",
                "ఫెరోచెల్", "", "",
                "ఆహారం తర్వాత రోజు ఒక్క మాత్ర తీసుకోండి లేదా వైద్యుడు సూచించిన విధంగా.", "", "",
                "కడుపు సమస్యలు, మలమూత్రం రంగు మారడం, మలబద్ధకం",
                "ஃபெரோசெல்", "", "",
                "உணவுக்குப் பிறகு தினமும் ஒரு மாத்திரை எடுத்துக் கொள்ளவும் அல்லது மருத்துவர் கூறியபடி.", "", "",
                "வயிற்று குழப்பம், கரும்பட்ட எழுமலை, மலச்சிக்கல்"
        );
    }
    private void insertViralFeverData(SQLiteDatabase db) {
        insertMedicine(db, "viral fever",
                "Paracetamol 500mg", "Paracetamol Syrup", "",
                "One tablet every 6 hours", "5ml every 6 hours", "",
                "Nausea, stomach upset",
                "పారాసెటమాల్ 500 మి.గ్రా", "పారాసెటమాల్ సిరప్", "",
                "ప్రతి 6 గంటలకు ఒక టాబ్లెట్", "ప్రతి 6 గంటలకు 5 మి.లీ", "",
                "వికారం, అజీర్ణం",
                "பாராசிட்டமால் 500 மி.கிரா", "பாராசிட்டமால் சிரப்", "",
                "6 மணி நேரத்திற்கு ஒரு மாத்திரை", "6 மணி நேரத்திற்கு 5 மி.லி", "",
                "வாந்தி, வயிற்று கவலை"
        );
    }
    private void insertChikungunyaData(SQLiteDatabase db) {
        insertMedicine(db, "chikungunya",
                "Paracetamol 650mg", "Paracetamol Syrup", "",
                "One tablet every 6–8 hours", "5ml every 6–8 hours", "",
                "Body pain, fatigue",
                "పారాసెటమాల్ 650 మి.గ్రా", "పారాసెటమాల్ సిరప్", "",
                "ప్రతి 6–8 గంటలకు ఒక టాబ్లెట్", "ప్రతి 6–8 గంటలకు 5 మి.లీ", "",
                "శరీర నొప్పి, అలసట",
                "பாராசிட்டமால் 650 மி.கிரா", "பாராசிட்டமால் சிரப்", "",
                "6-8 மணி நேரத்திற்கு ஒரு மாத்திரை", "6-8 மணி நேரத்திற்கு 5 மி.லி", "",
                "உடல் வலி, சோர்வு"
        );
    }
    private void insertMalariaData(SQLiteDatabase db) {
        insertMedicine(db, "malaria",
                "Artemether 80mg", "Artemether Syrup", "",
                "One tablet twice daily for 3 days", "5ml twice daily for 3 days", "",
                "Nausea, vomiting, dizziness",
                "ఆర్టిమెథెర్ 80 మి.గ్రా", "ఆర్టిమెథెర్ సిరప్", "",
                "రోజు రెండు సార్లు మూడు రోజుల పాటు ఒక టాబ్లెట్", "మూడు రోజుల పాటు రోజు రెండు సార్లు 5 మి.లీ", "",
                "వికారం, వాంతులు, తలనొప్పి",
                "ஆர்டிமெதர் 80 மி.கிரா", "ஆர்டிமெதர் சிரப்", "",
                "மூன்று நாட்களுக்கு தினமும் இரு முறை", "மூன்று நாட்களுக்கு தினமும் இரு முறை 5 மி.லி", "",
                "வாந்தி, மயக்கம்"
        );
    }




































    private void insertMedicine(SQLiteDatabase db, String illness,
                                String name_adult, String name_child, String name_infant,
                                String usage_adult, String usage_child, String usage_infant,
                                String side_effects,
                                String name_adult_te, String name_child_te, String name_infant_te,
                                String usage_adult_te, String usage_child_te, String usage_infant_te,
                                String side_effects_te,
                                String name_adult_ta, String name_child_ta, String name_infant_ta,
                                String usage_adult_ta, String usage_child_ta, String usage_infant_ta,
                                String side_effects_ta) {

        String query = "INSERT INTO " + TABLE_NAME + " VALUES ('" + illness + "','" +
                name_adult + "','" + name_child + "','" + name_infant + "','" +
                usage_adult + "','" + usage_child + "','" + usage_infant + "','" + side_effects + "','" +
                name_adult_te + "','" + name_child_te + "','" + name_infant_te + "','" +
                usage_adult_te + "','" + usage_child_te + "','" + usage_infant_te + "','" + side_effects_te + "','" +
                name_adult_ta + "','" + name_child_ta + "','" + name_infant_ta + "','" +
                usage_adult_ta + "','" + usage_child_ta + "','" + usage_infant_ta + "','" + side_effects_ta + "');";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public Cursor getMedicineByIllness(String illness) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE LOWER(" + COLUMN_ILLNESS + ") = ?";
        return db.rawQuery(query, new String[]{illness.toLowerCase()});
    }
}
