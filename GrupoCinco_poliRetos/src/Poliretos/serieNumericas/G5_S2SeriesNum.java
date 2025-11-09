package src.Poliretos.serieNumericas;

public class G5_S2SeriesNum extends DatosSeriesNumericas {
/*
 * 
 */
     public void g5_S2_Alternante_FOR() {
        int n = getScanner("S2: Alternante", "FOR");
        for (int i = 1; i <= n; i++) {
            System.out.print((i % 2 != 0 ? (i * 2 - 1) : 0) + " ");
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S2_Alternante_WHILE() {
        int n = getScanner("S2: Alternante", "WHILE");
        int i = 1;
        while (i <= n) {
            System.out.print((i % 2 != 0 ? (i * 2 - 1) : 0) + " ");
            i++;
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S2_Alternante_DO_WHILE() {
        int n = getScanner("S2: Alternante", "DO-WHILE");
        int i = 1;
        do {
            System.out.print((i % 2 != 0 ? (i * 2 - 1) : 0) + " ");
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

}
