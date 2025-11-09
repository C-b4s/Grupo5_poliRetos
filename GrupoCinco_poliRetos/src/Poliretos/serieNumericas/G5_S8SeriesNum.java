package src.Poliretos.serieNumericas;

public class G5_S8SeriesNum extends DatosSeriesNumericas{
    /*
     * 
     */
    public void g5_S8_Aritmetica5_FOR() {
        int n = getScanner("S8: Aritmética +5", "FOR");
        int term = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += 5;
        }
        System.out.println("\n----------------------------------");
    }

    /*
     * 
     */
    public void g5_S8_Aritmetica5_WHILE() {
        int n = getScanner("S8: Aritmética +5", "WHILE");
        int term = 3;
        int i = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term += 5;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    /*
     * 
     */
    public void g5_S8_Aritmetica5_DOWHILE() {
        int n = getScanner("S8: Aritmética +5", "DO-WHILE");
        if (n < 1) return;
        int term = 3;
        int i = 1;
        do {
            System.out.print(term + " ");
            term += 5;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }
}
