package src.Poliretos.Figuras;

public class G5_S19Figuras {
    /*
     * 
     */
    public void g5_Figuras19For(int filas){
        int [] prev = {2};
        for (int r = 1; r <= filas; r++) {
            for (int d = 0; d < prev.length; d++) {
                if (d == 0) {
                    System.out.print("*");
                } else if (d == prev.length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(prev[d]);
                }
            }
            System.out.println();
            int[] next = new int[prev.length + 1];
            next[0] = 1;
            for (int k = 1; k <= prev.length - 1; k++) {
                next[k] = prev[k - 1] + prev[k];
            }
            next[next.length - 1] = 2;
            prev = next;
        }
    }
    /*
     * 
     */
    public void g5_Figuras19While(int filas){
        int [] prev = {2};
        int r = 1;
        while (r <= filas) {
            int d = 0;
            while (d < prev.length) {
                if (d == 0) {
                    System.out.print("*");
                } else if (d == prev.length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(prev[d]);
                }
                d++;
            }
            System.out.println();
            int[] next = new int[prev.length + 1];
            next[0] = 1;
            int k = 1;
            while (k <= prev.length - 1) {
                next[k] = prev[k - 1] + prev[k];
                k++;
            }
            next[next.length - 1] = 2;
            prev = next;
            r++;
        }
    }
    /*
     * 
     */
    public void g5_Figuras19DoWhile(int filas){
        int [] prev = {2};
        int r = 1;
        do {
            int d = 0;
            do {
                if (d == 0) {
                    System.out.print("*");
                } else if (d == prev.length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(prev[d]);
                }
                d++;
            } while (d < prev.length);
            System.out.println();
            int[] next = new int[prev.length + 1];
            next[0] = 1;
            int k = 1;
            do {
                next[k] = prev[k - 1] + prev[k];
                k++;
            } while (k <= prev.length - 1);
            next[next.length - 1] = 2;
            prev = next;
            r++;
        } while (r <= filas);
    }
}
