package lee.jaebeom.allwiki.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.preference.PreferenceManager;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by leejaebeom on 2017. 10. 18..
 */

public class SharedPreference{
    public static String keyKeyword = "keyword";
    private static SharedPreferences pref;
    private static SharedPreferences.Editor editor;

    public static void savePreference(String key, String value, Context context){
            pref = PreferenceManager.getDefaultSharedPreferences(context);
            editor = pref.edit();
            editor.putString(key, value);
            editor.apply();
    }

    public static void savePreference(String key, int value, Context context){
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static void savePreference(String key, boolean value, Context context){
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static String getStringPreferences(Context context, String key){
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString(key, "");
    }

    public static int getIntPreferences(Context context, String key){
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt(key, 0);
    }

    public static boolean getBooleanPreferences(Context context, String key){
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getBoolean(key, false);
    }
}
