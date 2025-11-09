package src.Poliretos.serieNumericas;

public class G5_S7SeriesNum extends DatosSeriesNumericas {
    /*
     * 
     */
    public void g5_S7_Aritmetica3_FOR() {
        int n = getScanner("S7: Aritmética +3", "FOR");
        int term = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += 3;
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S7_Aritmetica3_WHILE() {
        int n = getScanner("S7: Aritmética +3", "WHILE");
        int term = 1;
        int i = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term += 3;
            i++;
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S7_Aritmetica3_DOWHILE() {
        int n = getScanner("S7: Aritmética +3", "DO-WHILE");
        if (n < 1) return;
        int term = 1;
        int i = 1;
        do {
            System.out.print(term + " ");
            term += 3;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

}
