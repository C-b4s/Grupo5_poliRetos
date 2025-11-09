package Poliretos.Figuras;

public class g5_S8Figuras {

     public void g5_figuraN8For(int tamano) {
        for (int fila = tamano - 1; fila >= 0; fila--) {
            for (int espacio = 0; espacio < fila; espacio++) {
                System.out.print("  ");
            }
            System.out.println("_|");
        }
    }

    public void g5_figuraN8While(int tamano) {
        int fila = tamano - 1;
        while (fila >= 0) {
            int espacio = 0;
            while (espacio < fila) {
                System.out.print("  ");
                espacio++;
            }
            System.out.println("_|");
            fila--;
        }
    }       

    public void g5_figuraN8DoWhile(int tamano) {
        int fila = tamano - 1;
        do {
            int espacio = 0;
            do {
                System.out.print("  ");
                espacio++;
            } while (espacio < fila);
            System.out.println("_|");
            fila--;
        } while (fila >= 0);
    }

}
