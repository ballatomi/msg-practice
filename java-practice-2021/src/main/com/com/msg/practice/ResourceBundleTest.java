package com.msg.practice;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Test for resource bundles.
 *
 * @author ballat
 */

public class ResourceBundleTest {
    public static void main(String[] args) {
        Locale currentLocale;
        ResourceBundle messages;
        try {
            currentLocale = new Locale("fr", "FR");
//            currentLocale = new Locale(args[0], args[1]);
        } catch (Exception e) {
            currentLocale = Locale.getDefault();
        }

        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        System.out.println(messages.getString("greetings"));
        System.out.println(messages.getString("inquiry"));
        System.out.println(messages.getString("farewell"));
    }

}
