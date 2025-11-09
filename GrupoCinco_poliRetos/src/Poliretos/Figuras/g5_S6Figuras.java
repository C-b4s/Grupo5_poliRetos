package src.Poliretos.Figuras;

public class g5_S6Figuras {

     public void g5_figuraN6For(int filas){
        int tamano = filas;

        for (int fila = 1; fila <= tamano; fila++) {
            // Espacios en blanco a la izquierda
            for (int espacio = tamano - fila; espacio > 0; espacio--) {
                System.out.print(" ");
            }

            // Asteriscos de la figura
            for (int col = 1; col <= (2 * fila - 1); col++) {
                System.out.print("*");
            }

            System.out.println(); 
        }

    }

    public void g5_figuraN6While(int filas){
        int tamano = filas;
        int fila = 1;
        while (fila <= tamano) {
            // Espacios en blanco a la izquierda
            int espacio = tamano - fila;
            while (espacio > 0) {
                System.out.print(" ");
                espacio--;
            }

            // Asteriscos de la figura
            int col = 1;
            while (col <= (2 * fila - 1)) {
                System.out.print("*");
                col++;
            }

            System.out.println(); 
            fila++;
        }
    }

    public void g5_figuraN6DoWhile(int filas){
        int tamano = filas;
        int fila = 1;
        do {
            // Espacios en blanco a la izquierda
            int espacio = tamano - fila;
            do {
                System.out.print(" ");
                espacio--;
            } while (espacio > 0);

            // Asteriscos de la figura
            int col = 1;
            do {
                System.out.print("*");
                col++;
            } while (col <= (2 * fila - 1));

            System.out.println(); 
            fila++;
        } while (fila <= tamano);
    }

}
