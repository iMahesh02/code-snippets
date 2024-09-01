package inheritance;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class customLocaleCurrency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        Locale customLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(customLocale);

        DecimalFormatSymbols symbols = ((DecimalFormat) currencyFormatter).getDecimalFormatSymbols();

        symbols.setCurrencySymbol("Rs.");

        ((DecimalFormat) currencyFormatter).setDecimalFormatSymbols(symbols);

        String us = NumberFormat.getInstance(Locale.US).getCurrencyInstance().format(payment);
        String india = currencyFormatter.format(payment);
        String china = NumberFormat.getInstance().getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getInstance().getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
