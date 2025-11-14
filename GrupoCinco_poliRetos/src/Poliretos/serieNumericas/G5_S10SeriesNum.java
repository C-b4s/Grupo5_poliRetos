package src.Poliretos.serieNumericas;

public class G5_S10SeriesNum extends DatosSeriesNumericas {
    /*
     * 
     */
    public void g5_S10_Potencias3_FOR() {
        int n = getScanner("S10: Potencias de 3", "FOR");
        long term = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term *= 3;
        }
        System.out.println("\n----------------------------------");
    }

    /*
     * 
     */
    public void g5_S10_Potencias3_WHILE() {
        int n = getScanner("S10: Potencias de 3", "WHILE");
        long term = 3;
        int i = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term *= 3;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    /*
     * 
     */
    public void g5_S10_Potencias3_DOWHILE() {
        int n = getScanner("S10: Potencias de 3", "DO-WHILE");
        if (n < 1) return;
        long term = 3;
        int i = 1;
        do {
            System.out.print(term + " ");
            term *= 3;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }
}
