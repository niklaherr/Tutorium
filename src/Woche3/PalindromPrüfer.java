package Woche3;

import Prog1Tools.IOTools;

public class PalindromPrüfer {
    public static void main(String[] args) {
        String wort = IOTools.readString("Bitte Wort zur Palindromsprüfung eingeben: ");

        System.out.println(isPalindrom(wort));
    }

    private static boolean isPalindrom(String word) {
        StringBuilder reversedWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }

        return word.equals(String.valueOf(reversedWord));
    }
}
