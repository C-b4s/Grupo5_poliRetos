package src.Poliretos.array;

public class G5_graficarNombre2x {
    public void g5_graficarNombre2xFor(String nombre) {

        int n = nombre.length();

        // Pendiente de la función f(x) = 2x
        int m = 2;

        // Dimensiones de la matriz (lienzo)
        int altura = m * (n - 1) + 3; // margen superior
        int anchura = n + 3;          // margen derecho

        // Crear matriz vacía
        char[][] plano = new char[altura][anchura];

        // Inicializar con espacios
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                plano[i][j] = ' ';
            }
        }

        // Dibujar ejes
        for (int i = 0; i < anchura; i++) plano[0][i] = '_';      // eje X
        for (int i = 0; i < altura; i++) plano[i][0] = '|';       // eje Y
        plano[0][0] = '+';                                        // origen

        // Graficar letras del nombre en f(x) = 2x
        for (int x = 0; x < n; x++) {
            int y = m * x; // f(x) = 2x

            if (y < altura && x < anchura) {
                char letra = nombre.charAt(x);
                plano[y][x] = letra;
            }
        }

        for (int i = altura - 1; i >= 0; i--) {
            System.out.printf("%2d %s\n", i, new String(plano[i]));
        }


    }

    public void g5_graficarNombre2xWhile(String nombre) {
        int n = nombre.length();
        int m = 2;

        int altura = m * (n - 1) + 3;
        int anchura = n + 3;

        char[][] plano = new char[altura][anchura];

        int i = 0;
        while (i < altura) {
            int j = 0;
            while (j < anchura) {
                plano[i][j] = ' ';
                j++;
            }
            i++;
        }

        i = 0;
        while (i < anchura) {
            plano[0][i] = '_';
            i++;
        }

        i = 0;
        while (i < altura) {
            plano[i][0] = '|';
            i++;
        }
        plano[0][0] = '+';

        int x = 0;
        while (x < n) {
            int y = m * x;

            if (y < altura && x < anchura) {
                char letra = nombre.charAt(x);
                plano[y][x] = letra;
            }
            x++;
        }

        i = altura - 1;
        while (i >= 0) {
            System.out.printf("%2d %s\n", i, new String(plano[i]));
            i--;
        }
    }

    public void g5_graficarNombre2xDoWhile(String nombre) {
        int n = nombre.length();
        int m = 2;

        int altura = m * (n - 1) + 3;
        int anchura = n + 3;

        char[][] plano = new char[altura][anchura];

        int i = 0;
        do {
            int j = 0;
            do {
                plano[i][j] = ' ';
                j++;
            } while (j < anchura);
            i++;
        } while (i < altura);

        i = 0;
        do {
            plano[0][i] = '_';
            i++;
        } while (i < anchura);

        i = 0;
        do {
            plano[i][0] = '|';
            i++;
        } while (i < altura);
        plano[0][0] = '+';

        int x = 0;
        do {
            int y = m * x;

            if (y < altura && x < anchura) {
                char letra = nombre.charAt(x);
                plano[y][x] = letra;
            }
            x++;
        } while (x < n);

        i = altura - 1;
        do {
            System.out.printf("%2d %s\n", i, new String(plano[i]));
            i--;
        } while (i >= 0);
    }
}
