package com.example.englishfor1stgrade;
import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesHelper {
    private static final String PREF_NAME = "MyPreferences";
    private static final String KEY_ANSWER_1 = "answer1";
    private static final String KEY_ANSWER_2 = "answer2";

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public SharedPreferencesHelper(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveAnswer1(String answer) {
        editor.putString(KEY_ANSWER_1, answer);
        editor.apply();
    }

    public String getAnswer1() {
        return sharedPreferences.getString(KEY_ANSWER_1, "");
    }

    public void saveAnswer2(String answer) {
        editor.putString(KEY_ANSWER_2, answer);
        editor.apply();
    }

    public String getAnswer2() {
        return sharedPreferences.getString(KEY_ANSWER_2, "");
    }
}
