package Woche2;

import Prog1Tools.IOTools;

public class Aufgabe4 {
    public static void main(String[] args) {
        int zahl; // Variable für Eingaben
        int ergebnis = 1; // Startwert für Multiplikation (neutraler Faktor)

        // Frage nach der ersten Zahl
        zahl = IOTools.readInt("Gebe die erste Zahl ein: ");
        ergebnis *= zahl;

        // Frage nach der zweiten Zahl
        zahl = IOTools.readInt("Gebe die zweite Zahl ein: ");
        ergebnis *= zahl;

        // Frage nach der dritten Zahl
        zahl = IOTools.readInt("Gebe die dritte Zahl ein: ");
        ergebnis *= zahl;

        // Ausgabe des Ergebnisses
        System.out.println("Das Ergebnis der Multiplikation ist: " + ergebnis);
    }
}
