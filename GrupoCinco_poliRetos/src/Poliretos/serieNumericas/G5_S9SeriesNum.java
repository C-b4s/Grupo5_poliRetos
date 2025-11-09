package src.Poliretos.serieNumericas;

public class G5_S9SeriesNum extends DatosSeriesNumericas {
    /*
     * 
     */
    public void g5_S9_Potencias2_FOR() {
        int n = getScanner("S9: Potencias de 2", "FOR");
        long term = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term *= 2;
        }
        System.out.println("\n----------------------------------");
    }

    /*
     * 
     */
    public void g5_S9_Potencias2_WHILE() {
        int n = getScanner("S9: Potencias de 2", "WHILE");
        long term = 2;
        int i = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term *= 2;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    /*
     * 
     */
    public void g5_S9_Potencias2_DOWHILE() {
        int n = getScanner("S9: Potencias de 2", "DO-WHILE");
        if (n < 1) return;
        long term = 2;
        int i = 1;
        do {
            System.out.print(term + " ");
            term *= 2;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

}
