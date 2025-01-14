package Woche3;

public class HelloWorld {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 5000) {
            i++;
            if (schaltjahr(i)!=schaltjahr2(i)){
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean schaltjahr(int jahr) {
        if (jahr % 4 == 0 && jahr % 100 != 0) {
            return true;
        } else return jahr % 400 == 0 && jahr % 100 == 0 && jahr % 4 == 0;
    }

    private static boolean schaltjahr2(int jahr) {
        return jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0);
        //Wenn Jahreszahl nicht durch 4 teilbar, dann auch nicht durch 400 & 100
    }
}
