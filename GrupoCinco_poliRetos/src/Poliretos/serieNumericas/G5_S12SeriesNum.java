package src.Poliretos.serieNumericas;

public class G5_S12SeriesNum extends DatosSeriesNumericas{
    /*
     * 
     */
    public void g5_S12_n_n1_FOR() {
        int n = getScanner("S12: n*(n+1)", "FOR");
        for (int i = 1; i <= n; i++) {
            long term = (long)i * (i + 1);
            System.out.print(term + " ");
        }
        System.out.println("\n----------------------------------");
    }

    /*
     * 
     */
    public void g5_S12_n_n1_WHILE() {
        int n = getScanner("S12: n*(n+1)", "WHILE");
        int i = 1;
        while (i <= n) {
            long term = (long)i * (i + 1);
            System.out.print(term + " ");
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    /*
     * 
     */
    public void g5_S12_n_n1_DOWHILE() {
        int n = getScanner("S12: n*(n+1)", "DO-WHILE");
        if (n < 1) return;
        int i = 1;
        do {
            long term = (long)i * (i + 1);
            System.out.print(term + " ");
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

}
