package src.Poliretos.serieNumericas;

public class G5_S3SeriesNum extends DatosSeriesNumericas{
    /*
     * 
     */
    public void g5_S3_Fracciones_FOR() {
        int n = getScanner("S3: Fracciones Impares", "FOR");
        long numA = 0; long numB = 1; int den = 1;
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
    public void g5_S3_Fracciones_WHILE() {
        int n = getScanner("S3: Fracciones Impares", "WHILE");
        long numA = 0; long numB = 1; int den = 1;
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
    public void g5_S3_Fracciones_DOWHILE() {
        int n = getScanner("S3: Fracciones Impares", "DO-WHILE");
        if (n < 1) return;
        long numA = 0; long numB = 1; int den = 1;
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
