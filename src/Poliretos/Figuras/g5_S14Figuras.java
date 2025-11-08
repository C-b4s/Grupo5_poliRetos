package src.Poliretos.Figuras;

public class g5_S14Figuras {
    /*
     * 
     */
    public void g5_S14FigurasFor(int filas){
        for (int i = 0; i < filas; i++) {
            int numero = 1;
            for (int espacio = 0; espacio < filas - i; espacio++) {
                System.out.print("  ");
            }
            for (int columna = 0; columna <= i; columna++) {
                System.out.printf("%4d", numero);
                numero = numero * ( i - columna) / (columna + 1);
            }
            System.out.println();
        }
    }
    /*
     * 
     */
    public void g5_S14FigurasWhile(int filas){
        int i = 0;
        while (i < filas) {
            int numero = 1;
            int espacio = 0;
            while (espacio < filas - i) {
                System.out.print("  ");
                espacio++;
            }
            int columna = 0;
            while (columna <= i) {
                System.out.printf("%4d", numero);
                numero = numero * ( i - columna) / (columna + 1);
                columna++;
            }
            System.out.println();
            i++;
        }
    }
    /*
     * 
     */
    public void g5_S14FigurasDoWhile(int filas){
        int i = 0;
        do {
            int numero = 1;
            int espacio = 0;
            do {
                if (espacio < filas - i) {
                    System.out.print("  ");
                }
                espacio++;
            } while (espacio < filas - i);
            int columna = 0;
            do {
                if (columna <= i) {
                    System.out.printf("%4d", numero);
                    numero = numero * ( i - columna) / (columna + 1);
                }
                columna++;
            } while (columna <= i);
            System.out.println();
            i++;
        } while (i < filas);
    }

}
