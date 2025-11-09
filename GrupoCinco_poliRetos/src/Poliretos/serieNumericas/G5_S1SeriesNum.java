package src.Poliretos.serieNumericas;

public class G5_S1SeriesNum extends DatosSeriesNumericas {
    /*
     * 
     */
    public void g5_S1_Fibonacci_FOR() {
        int n = getScanner("S1: Fibonacci", "FOR");
        long a = 0;
        long b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S1_Fibonacci_WHILE() {
        int n = getScanner("S1: Fibonacci", "WHILE");
        long a = 0;
        long b = 1;
        int i = 1;
        while (i <= n) {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
            i++;
        }
        System.out.println("\n----------------------------------");
    }
    /*
     * 
     */
    public void g5_S1_Fibonacci_DO_WHILE() {
        int n = getScanner("S1: Fibonacci", "DO-WHILE");
        long a = 0;
        long b = 1;
        int i = 1;
        do {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }
}
