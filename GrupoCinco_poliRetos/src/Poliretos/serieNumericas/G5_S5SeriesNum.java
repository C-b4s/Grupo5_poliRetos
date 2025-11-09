package src.Poliretos.serieNumericas;

public class G5_S5SeriesNum extends DatosSeriesNumericas {
   
     private boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    /*
     * 
     */
    public void g5_S5_Primos_FOR() {
        int n = getScanner("S5: Primos", "FOR");
        int count = 0;
        for (int num = 2; count < n; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S5_Primos_WHILE() {
        int n = getScanner("S5: Primos", "WHILE");
        int count = 0;
        int num = 2;
        while (count < n) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S5_Primos_DOWHILE() {
        int n = getScanner("S5: Primos", "DO-WHILE");
        if (n < 1) return;
        int count = 0;
        int num = 2;
        do {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        } while (count < n);
        System.out.println("\n----------------------------------");
    }


}
