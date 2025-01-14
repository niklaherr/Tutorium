package Woche2;

import Prog1Tools.IOTools;

public class TemperaturUmrechner {
    public static void main(String[] args) {
        double temperaturCelcius = IOTools.readDouble("Enter temperatur in celcius: ");
        double temperaturFahrenheit = temperaturCelcius * 1.8 + 32;

        System.out.println(temperaturCelcius + "," + temperaturFahrenheit);
    }
}
