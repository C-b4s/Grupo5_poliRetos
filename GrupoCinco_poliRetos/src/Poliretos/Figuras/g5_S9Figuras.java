package src.Poliretos.Figuras;

public class G5_S9Figuras {

    public void g5_figuraN9For(int tamano) {

        for (int espacio = 0; espacio < tamano - 1; espacio++) {
            System.out.print(" ");
        }
        System.out.println(" _ ");

        for (int fila = 1; fila < tamano; fila++) {

            // Espacios a la izquierda
            for (int espacio = tamano - 1; espacio > fila; espacio--) {
                System.out.print(" ");
            }

            // Lado izquierdo
            System.out.print("_|");

            // Espacios internos
            for (int espacio = 0; espacio < fila * 2 - 2; espacio++) {
                System.out.print(" ");
            }

            // Lado derecho
            System.out.println(" |_");
        }
    }
    
    public void g5_figuraN9While(int tamano) {

        int espacio = 0;
        while (espacio < tamano - 1) {
            System.out.print(" ");
            espacio++;
        }
        System.out.println(" _ ");

        int fila = 1;
        while (fila < tamano) {

            // Espacios a la izquierda
            espacio = tamano - 1;
            while (espacio > fila) {
                System.out.print(" ");
                espacio--;
            }

            // Lado izquierdo
            System.out.print("_|");

            // Espacios internos
            espacio = 0;
            while (espacio < fila * 2 - 2) {
                System.out.print(" ");
                espacio++;
            }

            // Lado derecho
            System.out.println(" |_");
            fila++;
        }
    }

    public void g5_figuraN9DoWhile(int tamano) {

        int espacio = 0;
        do {
            System.out.print(" ");
            espacio++;
        } while (espacio < tamano - 1);
        System.out.println(" _ ");

        int fila = 1;
        do {

            // Espacios a la izquierda
            espacio = tamano - 1;
            do {
                System.out.print(" ");
                espacio--;
            } while (espacio > fila);

            // Lado izquierdo
            System.out.print("_|");

            // Espacios internos
            espacio = 0;
            do {
                System.out.print(" ");
                espacio++;
            } while (espacio < fila * 2 - 2);

            // Lado derecho
            System.out.println(" |_");
            fila++;
        } while (fila < tamano);
    }

}
