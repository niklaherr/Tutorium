package Woche2;

public class Aufgabe5 {
    public static void main(String[] args) {
        int n = 78636;
        int temp;
        String nSepariert;

        temp = n % 10;
        n -= temp;
        nSepariert = String.valueOf(temp);

        n /= 10;
        temp = n % 10;
        n -= temp;
        nSepariert = temp + ", " + nSepariert;

        n /= 10;
        temp = n % 10;
        n -= temp;
        nSepariert = temp + ", " + nSepariert;

        n /= 10;
        temp = n % 10;
        n -= temp;
        nSepariert = temp + ", " + nSepariert;

        n /= 10;
        temp = n % 10;
        nSepariert = temp + ", " + nSepariert;

        System.out.println("Die Ziffern von n sind: " + nSepariert);
    }
}
