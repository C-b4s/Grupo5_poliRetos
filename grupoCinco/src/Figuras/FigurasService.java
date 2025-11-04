public class FigurasService {
    
    
    
    /*
     * 
     */
    public void figuraNº11For(int filas){
         for (int i = 1; i <= filas; i++) {
            System.out.print("|");
            for (int j = 1; j <= i; j++) {
                System.out.print("_");
            }
            System.out.println();
            for (int k = 3; k <=(4* i); k++) {
            System.out.print(" ");
            }
        }
    }
    /*
     * 
     */
    public void figuraNº11While(int filas){
        int i = 1;
        while (i <= filas) {
            System.out.print("|");
            int j = 1;
            while (j <= i) {
                System.out.print("_");
                j++;
            }
            System.out.println();
            int k = 3;
            while (k <= (4 * i)) {
                System.out.print(" ");
                k++;
            }
            i++;
        }
    }
    /*
     * 
     */
    public void figuraNº11DoWhile(int filas){
        int i = 1;
        do {
            System.out.print("|");
            int j = 1;
            do {
                System.out.print("_");
                j++;
            } while (j <= i);
            System.out.println();
            int k = 3;
            do {
                System.out.print(" ");
                k++;
            } while (k <= (4 * i));
            i++;
        } while (i <= filas);
        /*
         * 
         */
        public void figuraNº12For(int serieNumerica){
        for (int j=1; j<=9; j++) {
            System.out.println(serieNumerica);
            serieNumerica = serieNumerica / 10;
        }
        }




}
