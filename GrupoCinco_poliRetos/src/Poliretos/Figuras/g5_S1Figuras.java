package src.Poliretos.Figuras;

public class G5_S1Figuras {

    public void g5_figuraN1For(int filas){
        int tamano = filas;
        for (int fila = 1; fila <= tamano; fila++) {
            for (int columna = 1; columna <= tamano; columna++) {
                if (fila == 1 || fila == tamano || columna == 1 || columna == tamano) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void g5_figuraN1While(int filas){
        int tamano = filas;
        int fila = 1;
        while (fila <= tamano) {
            int columna = 1;
            while (columna <= tamano) {
                if (fila == 1 || fila == tamano || columna == 1 || columna == tamano) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columna++;
            }
            System.out.println();
            fila++;
        }
    }

    public void g5_figuraN1DoWhile(int filas){
        int tamano = filas;
        int fila = 1;
        do {
            int columna = 1;
            do {
                if (fila == 1 || fila == tamano || columna == 1 || columna == tamano) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columna++;
            } while (columna <= tamano);
            System.out.println();
            fila++;
        } while (fila <= tamano);
    }

}
