package Woche2;

import Prog1Tools.IOTools;

public class Aufgabe3 {
    public static void main(String[] args) {
        int zahl1 = IOTools.readInt("Gib die erste Zahl ein: ");
        int zahl2 = IOTools.readInt("Gib die zweite Zahl ein: ");
        int zahl3 = IOTools.readInt("Gib die dritten Zahl ein: ");

        System.out.println("Summe: " + (zahl1 + zahl2 + zahl3));
        System.out.println("Mittelwerte: " + (zahl1 + zahl2 + zahl3) / 3);
        System.out.println("Produkt: " + (zahl1 * zahl2 * zahl3));
    }
}
