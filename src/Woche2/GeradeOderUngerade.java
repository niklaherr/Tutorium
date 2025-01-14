package Woche2;

public class GeradeOderUngerade {
    public static void main(String[] args) {
        int zahl = (int) (Math.random() * 10);

        if (zahl % 2 == 0) {
            System.out.println(zahl + " is an even number");
        } else
            System.out.println(zahl + " is an odd number");
    }
}
