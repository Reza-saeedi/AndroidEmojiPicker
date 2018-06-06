package org.messenger.emojiPicker.util;

import android.content.Context;
import android.preference.PreferenceManager;

public class TextSecurePreferences {

  private static final String TAG = TextSecurePreferences.class.getSimpleName();


  public  static final String LANGUAGE_PREF                    = "pref_language";
  private static final String ENTER_SENDS_PREF                 = "pref_enter_sends";

  public  static final String SYSTEM_EMOJI_PREF                = "pref_system_emojis";
  public  static final String INCOGNITO_KEYBORAD_PREF          = "pref_incognito_keyboard";

  public static boolean isIncognitoKeyboardEnabled(Context context) {
    return getBooleanPreference(context, INCOGNITO_KEYBORAD_PREF, false);
  }

  public static boolean isEnterSendsEnabled(Context context) {
    return getBooleanPreference(context, ENTER_SENDS_PREF, false);
  }


  public static String getLanguage(Context context) {
    return getStringPreference(context, LANGUAGE_PREF, "zz");
  }

  public static boolean isSystemEmojiPreferred(Context context) {
    return getBooleanPreference(context, SYSTEM_EMOJI_PREF, false);
  }

  public static boolean getBooleanPreference(Context context, String key, boolean defaultValue) {
    return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(key, defaultValue);
  }

  public static String getStringPreference(Context context, String key, String defaultValue) {
    return PreferenceManager.getDefaultSharedPreferences(context).getString(key, defaultValue);
  }

}
