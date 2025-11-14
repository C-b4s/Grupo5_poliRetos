package src.Poliretos.Figuras;

public class G5_S4Figuras {

    public void g5_figuraN4For(int filas){
        int tamano = filas;
         for (int fila = 1; fila <= tamano; fila++) {

            // Espacios en blanco antes de los asteriscos
            for (int espacio = tamano - fila; espacio > 0; espacio--) {
                System.out.print("  ");
            }

            // Asteriscos con espacio
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }

            System.out.println(); 
        }

    }

    public void g5_figuraN4While(int filas){
        int tamano = filas;
        int fila = 1;
        while (fila <= tamano) {

            // Espacios en blanco antes de los asteriscos
            int espacio = tamano - fila;
            while (espacio > 0) {
                System.out.print("  ");
                espacio--;
            }

            // Asteriscos con espacio
            int col = 1;
            while (col <= fila) {
                System.out.print("* ");
                col++;
            }

            System.out.println(); 
            fila++;
        }
    }

    public void g5_figuraN4DoWhile(int filas){
        int tamano = filas;
        int fila = 1;
        do {

            // Espacios en blanco antes de los asteriscos
            int espacio = tamano - fila;
            do {
                System.out.print("  ");
                espacio--;
            } while (espacio > 0);

            // Asteriscos con espacio
            int col = 1;
            do {
                System.out.print("* ");
                col++;
            } while (col <= fila);

            System.out.println(); 
            fila++;
        } while (fila <= tamano);
    }

}
