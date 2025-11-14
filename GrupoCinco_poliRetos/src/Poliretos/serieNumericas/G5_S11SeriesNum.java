package src.Poliretos.serieNumericas;

public class G5_S11SeriesNum extends DatosSeriesNumericas{
    /*
     * 
     */
    public void g5_S11_Aritmetica4_FOR() {
        int n = getScanner("S11: Aritmética +4", "FOR");
        int term = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += 4;
        }
        System.out.println("\n----------------------------------");
    }

    /*
     * 
     */
    public void g5_S11_Aritmetica4_WHILE() {
        int n = getScanner("S11: Aritmética +4", "WHILE");
        int term = 2;
        int i = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term += 4;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    /*
     * 
     */
    public void g5_S11_Aritmetica4_DOWHILE() {
        int n = getScanner("S11: Aritmética +4", "DO-WHILE");
        if (n < 1) return;
        int term = 2;
        int i = 1;
        do {
            System.out.print(term + " ");
            term += 4;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }
}
