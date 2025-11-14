package src.Poliretos.serieNumericas;

public class G5_S4SeriesNum extends DatosSeriesNumericas{
    /*
     * 
     */
    public void g5_S4_FraccionesPares_FOR() {
        int n = getScanner("S4: Fracciones Pares", "FOR");
        long numA = 0; long numB = 1; int den = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(numA + "/" + den + " ");
            long siguienteFib = numA + numB;
            numA = numB;
            numB = siguienteFib;
            den += 2;
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S4_FraccionesPares_WHILE() {
        int n = getScanner("S4: Fracciones Pares", "WHILE");
        long numA = 0; long numB = 1; int den = 2;
        int i = 1;
        while (i <= n) {
            System.out.print(numA + "/" + den + " ");
            long siguienteFib = numA + numB;
            numA = numB;
            numB = siguienteFib;
            den += 2;
            i++;
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S4_FraccionesPares_DOWHILE() {
        int n = getScanner("S4: Fracciones Pares", "DO-WHILE");
        if (n < 1) return;
        long numA = 0; long numB = 1; int den = 2;
        int i = 1;
        do {
            System.out.print(numA + "/" + den + " ");
            long siguienteFib = numA + numB;
            numA = numB;
            numB = siguienteFib;
            den += 2;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }


}
