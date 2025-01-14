package Woche2;

import Prog1Tools.IOTools;

public class KleinerGrößer {
    public static void main(String[] args) {
        int zahl1 = IOTools.readInt("Gib eine Zahl zur Überprüfung ein: ");
        int zahl2 = IOTools.readInt("Gib eine zweite Zahl zum Vergleich ein: ");

        if (zahl1 > zahl2) {
            System.out.println(zahl1 + " ist größer als " + zahl2);
        } else if (zahl1 < zahl2) {
            System.out.println(zahl1 + " ist kleiner als " + zahl2);
        } else System.out.println(zahl1 + " ist gleich groß wie " + zahl2);
    }
}
