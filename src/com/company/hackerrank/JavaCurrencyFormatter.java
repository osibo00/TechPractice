package com.company.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {

        formatPayment(12324.134d, "India");

    }

    private static String formatPayment(Double d, String country) {
        NumberFormat nf;
        String s = "";
        switch (country) {
            case "India":
                nf = NumberFormat.getCurrencyInstance();
                StringBuilder sb = new StringBuilder(nf.format(d));
                sb.replace(0, 1, "Rs.");
                s += country + ": " + sb.toString();
                break;
            case "China":
                nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
                s += country + ": " + nf.format(d);
                break;
            case "France":
                nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                s += country + ": " + nf.format(d);
                break;
            default:
                nf = NumberFormat.getCurrencyInstance();
                s += country + ": " + nf.format(d);
                break;
        }
        return s;
    }
}
