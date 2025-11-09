package Poliretos.Figuras;

public class g5_S10Figuras {

    public void g5_figuraN10For(int tamano) {
        for (int fila = 1; fila <= tamano; fila++) {

            // Espacios iniciales
            for (int espacio = 1; espacio < fila; espacio++) {
                System.out.print("  ");
            }

            // Patrón según si es impar o par
            if (fila % 2 != 0) {
                System.out.println("|_+_");
            } else {
                System.out.println(" |_-_");
            }
        }

        for (int espacio = 0; espacio < tamano; espacio++) {
            System.out.print("  ");
        }
        System.out.println("  |");
    }

    public void g5_figuraN10While(int tamano) {
        int fila = 1;
        while (fila <= tamano) {

            // Espacios iniciales
            int espacio = 1;
            while (espacio < fila) {
                System.out.print("  ");
                espacio++;
            }

            // Patrón según si es impar o par
            if (fila % 2 != 0) {
                System.out.println("|_+_");
            } else {
                System.out.println(" |_-_");
            }
            fila++;
        }

        int espacio = 0;
        while (espacio < tamano) {
            System.out.print("  ");
            espacio++;
        }
        System.out.println("  |");
    }

    public void g5_figuraN10DoWhile(int tamano) {
        int fila = 1;
        do {

            // Espacios iniciales
            int espacio = 1;
            do {
                System.out.print("  ");
                espacio++;
            } while (espacio < fila);

            // Patrón según si es impar o par
            if (fila % 2 != 0) {
                System.out.println("|_+_");
            } else {
                System.out.println(" |_-_");
            }
            fila++;
        } while (fila <= tamano);

        int espacio = 0;
        do {
            System.out.print("  ");
            espacio++;
        } while (espacio < tamano);
        System.out.println("  |");
    }

}
