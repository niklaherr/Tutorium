package Woche3;

import Prog1Tools.IOTools;

public class FizzBuzz {
    public static void main(String[] args) {
        int zahl = IOTools.readInt("Bitte Zahl zur Prüfung eingeben: ");

        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    private static String fizzBuzz(int zahl) {
        if (zahl != 0) {
            if (zahl % 15 == 0) {
                return (zahl + " FizzBuzz");
            } else if (zahl % 3 == 0) {
                return (zahl + " Fizz");
            } else if (zahl % 5 == 0) {
                return (zahl + " Buzz");
            }
        }
        return (zahl + " FizzBuzz");

    }
}
