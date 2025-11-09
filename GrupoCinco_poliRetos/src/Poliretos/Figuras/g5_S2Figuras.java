package Poliretos.Figuras;

public class g5_S2Figuras {

     public void g5_figuraN2For(int filas){
        int n = filas;
        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {

                // Bordes del cuadrado
                if (fila == 0 || fila == n - 1 || col == 0 || col == n - 1) {
                    if ((fila + col) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  "); // espacio en el centro
                }

            }
            System.out.println();
        }
    }
    
    public void g5_figuraN2While(int filas){
        int n = filas;
        int fila = 0;
        while (fila < n) {
            int col = 0;
            while (col < n) {

                // Bordes del cuadrado
                if (fila == 0 || fila == n - 1 || col == 0 || col == n - 1) {
                    if ((fila + col) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  "); // espacio en el centro
                }
                col++;
            }
            System.out.println();
            fila++;
        }
    }

    public void g5_figuraN2DoWhile(int filas){
        int n = filas;
        int fila = 0;
        do {
            int col = 0;
            do {

                // Bordes del cuadrado
                if (fila == 0 || fila == n - 1 || col == 0 || col == n - 1) {
                    if ((fila + col) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  "); // espacio en el centro
                }
                col++;
            } while (col < n);
            System.out.println();
            fila++;
        } while (fila < n);
    }   

}
