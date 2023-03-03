package org.example.one.two.io;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanDemo3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("ib.txt"))) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    scanner.useLocale(Locale.GERMAN);
                    double number = scanner.nextDouble();
                    System.out.println(number);
                } else {
                    scanner.next();
                }
            }

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
