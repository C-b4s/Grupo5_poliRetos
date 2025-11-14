package src.Poliretos.serieNumericas;

public class G5_S6SeriesNum extends DatosSeriesNumericas{
    /*
     * 
     */
     public void g5_S6_Cuadrados_FOR() {
        int n = getScanner("S6: Cuadrados", "FOR");
        for (int i = 1; i <= n; i++) {
            System.out.print((long)i * i + " ");
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S6_Cuadrados_WHILE() {
        int n = getScanner("S6: Cuadrados", "WHILE");
        int i = 1;
        while (i <= n) {
            System.out.print((long)i * i + " ");
            i++;
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S6_Cuadrados_DOWHILE() {
        int n = getScanner("S6: Cuadrados", "DO-WHILE");
        if (n < 1) return;
        int i = 1;
        do {
            System.out.print((long)i * i + " ");
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

}
