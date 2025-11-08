package poliRetos.figuras;

public class figurasService1_10 {

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

    public void g5_figuraN3For(int filas){
        int tamano = filas;
      for (int fila = 1; fila <= tamano; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }

    public void g5_figuraN3While(int filas){
        int tamano = filas;
        int fila = 1;
        while (fila <= tamano) {
            int col = 1;
            while (col <= fila) {
                System.out.print("* "); 
                col++;
            }
            System.out.println(); 
            fila++;
        }
    }
    
    public void g5_figuraN3DoWhile(int filas){
        int tamano = filas;
        int fila = 1;
        do {
            int col = 1;
            do {
                System.out.print("* "); 
                col++;
            } while (col <= fila);
            System.out.println(); 
            fila++;
        } while (fila <= tamano);
    }

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

    public void g5_figuraN7For(int tamaño) {
        if (tamaño <= 0) return;
        System.out.println("_");

        for (int fila = 1; fila < tamaño; fila++) {
            for (int espacio = 0; espacio < fila; espacio++) {
                System.out.print("  "); 
            }
            System.out.println("|_");
        }
    }
    
    public void g5_figuraN7While(int tamaño) {
        if (tamaño <= 0) return;
        System.out.println("_");

        int fila = 1;
        while (fila < tamaño) {
            int espacio = 0;
            while (espacio < fila) {
                System.out.print("  "); 
                espacio++;
            }
            System.out.println("|_");
            fila++;
        }
    }
        
    public void g5_figuraN7DoWhile(int tamaño) {
        if (tamaño <= 0) return;
        System.out.println("_");

        int fila = 1;
        do {
            int espacio = 0;
            do {
                System.out.print("  "); 
                espacio++;
            } while (espacio < fila);
            System.out.println("|_");
            fila++;
        } while (fila < tamaño);
    }
    
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