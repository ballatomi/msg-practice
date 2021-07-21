package com.msg.practice;

import java.util.Locale;

/**
 * List all available system locales.
 */
public class SystemLocales {

    public static void main(String[] args) {
        Locale[] list = Locale.getAvailableLocales();
        for (Locale l : list) {
            System.out.println(l.getDisplayName() + ": " + l.getLanguage() + " -- " + l.getCountry());
        }
    }
}
