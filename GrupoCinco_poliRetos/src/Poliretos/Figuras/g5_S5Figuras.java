package src.Poliretos.Figuras;

public class g5_S5Figuras {

    public void g5_figuraN5For(int filas){
        int tamano = filas;

        for (int fila = tamano; fila >= 1; fila--) {
            // Espacios al inicio para centrar la pirámide
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
    
    public void g5_figuraN5While(int filas){
        int tamano = filas;
        int fila = tamano;
        while (fila >= 1) {
            // Espacios al inicio para centrar la pirámide
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
            fila--;
        }
    }

    public void g5_figuraN5DoWhile(int filas){
        int tamano = filas;
        int fila = tamano;
        do {
            // Espacios al inicio para centrar la pirámide
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
            fila--;
        } while (fila >= 1);
    }

}
