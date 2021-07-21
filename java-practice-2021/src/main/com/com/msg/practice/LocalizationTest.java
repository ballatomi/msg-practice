package com.msg.practice;

import java.text.NumberFormat;
import java.util.Locale;
import static java.lang.System.*;

/**
 * Test for resource bundles.
 *
 * @author ballat
 */
public class LocalizationTest {

    public static void main(String[] args) {
        Locale[] locales = {
                new Locale("fr", "FR"),
                new Locale("de", "DE"),
                new Locale("en", "US")
        };
        for (Locale locale : locales) {
            out.println();
            displayNumber(locale);
            displayCurrency(locale);
            displayPercent(locale);
        }
    }

    public static void displayNumber(Locale currentLocale) {
        Integer quantity = 123456;
        Double amount = 345987.246;
        NumberFormat numberFormatter;
        String quantityOut;
        String amountOut;
        numberFormatter = NumberFormat.getNumberInstance(currentLocale);
        quantityOut = numberFormatter.format(quantity);
        amountOut = numberFormatter.format(amount);
        out.println(quantityOut + " " + currentLocale);
        out.println(amountOut + " " + currentLocale);
    }

    public static void displayCurrency(Locale currentLocale) {

        Double currency = 9876543.21;
        NumberFormat currencyFormatter;
        String currencyOut;
        currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
        currencyOut = currencyFormatter.format(currency);
        out.println(currencyOut + "" + currentLocale.toString());
    }

    public static void displayPercent(Locale currentLocale) {
        Double percent = 0.75;
        NumberFormat percentFormatter;
        String percentOut;
        percentFormatter = NumberFormat.getPercentInstance(currentLocale);
        percentOut = percentFormatter.format(percent);
        out.println(percentOut + "" + currentLocale.toString());
    }

}
