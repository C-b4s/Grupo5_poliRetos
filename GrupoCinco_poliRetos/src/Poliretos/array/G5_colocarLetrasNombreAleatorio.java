package src.Poliretos.array;

import java.util.Random;

public class G5_colocarLetrasNombreAleatorio {
    public void g5_colocarLetrasNombreAleatorioFor (String nombreCompleto, int delayMs) throws InterruptedException {
        // 1. Separar nombre y apellidos
        String[] partes = nombreCompleto.split(" ");
        String primerNombre = partes[0];

        // 2. Tamaño del plano según el primer nombre
        int n = primerNombre.length(); // 9
        char[][] matriz = new char[n][n];

        // 3. Inicializar matriz con espacios
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = ' ';

        // 4. Construir la cadena de letras (nombre + apellidos sin acentos ni espacios)
        StringBuilder letras = new StringBuilder();
        for (String parte : partes)
            letras.append(parte);
        String texto = letras.toString(); // "SebastianJosueZunigaMendoza"

        // 5. Generador aleatorio
        Random rand = new Random();

        // 6. Mostrar matriz inicial
        g5_limpiarPantalla();
        g5_imprimirMatrizConEjes(matriz);

        System.out.println("\nInsertando letras de: " + nombreCompleto);
        System.out.println("(Las colisiones se muestran como '*')\n");

        // 7. Insertar todas las letras, actualizando en el mismo plano
        for (int k = 0; k < texto.length(); k++) {
            char letra = texto.charAt(k);

            // Posición aleatoria
            int fila = rand.nextInt(n);
            int col = rand.nextInt(n);

            // Si hay colisión
            if (matriz[fila][col] == ' ')
                matriz[fila][col] = letra;
            else
                matriz[fila][col] = '*';

            // Limpiar e imprimir el mismo plano actualizado
            g5_limpiarPantalla();
            g5_imprimirMatrizConEjes(matriz);

            System.out.printf("\nInsertando '%c' en (%d, %d)\n", letra, fila, col);
            Thread.sleep(delayMs);
        }

        System.out.println("\nInserción completada.");
    }

    public void g5_colocarLetrasNombreAleatorioWhile (String nombreCompleto, int delayMs) throws InterruptedException {
        String[] partes = nombreCompleto.split(" ");
        String primerNombre = partes[0];

        int n = primerNombre.length();
        char[][] matriz = new char[n][n];

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }

        StringBuilder letras = new StringBuilder();
        int p = 0;
        while (p < partes.length) {
            letras.append(partes[p]);
            p++;
        }
        String texto = letras.toString();

        Random rand = new Random();

        g5_limpiarPantalla();
        g5_imprimirMatrizConEjes(matriz);

        System.out.println("\nInsertando letras de: " + nombreCompleto);
        System.out.println("(Las colisiones se muestran como '*')\n");

        int k = 0;
        while (k < texto.length()) {
            char letra = texto.charAt(k);

            int fila = rand.nextInt(n);
            int col = rand.nextInt(n);

            if (matriz[fila][col] == ' ')
                matriz[fila][col] = letra;
            else
                matriz[fila][col] = '*';

            g5_limpiarPantalla();
            g5_imprimirMatrizConEjes(matriz);

            System.out.printf("\nInsertando '%c' en (%d, %d)\n", letra, fila, col);
            Thread.sleep(delayMs);
            k++;
        }

        System.out.println("\nInserción completada.");
    }

    public void g5_colocarLetrasNombreAleatorioDoWhile (String nombreCompleto, int delayMs) throws InterruptedException {
        String[] partes = nombreCompleto.split(" ");
        String primerNombre = partes[0];

        int n = primerNombre.length();
        char[][] matriz = new char[n][n];

        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);

        StringBuilder letras = new StringBuilder();
        int p = 0;
        do {
            letras.append(partes[p]);
            p++;
        } while (p < partes.length);
        String texto = letras.toString();

        Random rand = new Random();

        g5_limpiarPantalla();
        g5_imprimirMatrizConEjes(matriz);

        System.out.println("\nInsertando letras de: " + nombreCompleto);
        System.out.println("(Las colisiones se muestran como '*')\n");

        int k = 0;
        do {
            char letra = texto.charAt(k);

            int fila = rand.nextInt(n);
            int col = rand.nextInt(n);

            if (matriz[fila][col] == ' ')
                matriz[fila][col] = letra;
            else
                matriz[fila][col] = '*';

            g5_limpiarPantalla();
            g5_imprimirMatrizConEjes(matriz);

            System.out.printf("\nInsertando '%c' en (%d, %d)\n", letra, fila, col);
            Thread.sleep(delayMs);
            k++;
        } while (k < texto.length());

        System.out.println("\nInserción completada.");
    }

    /** Imprime la matriz con ejes verticales y horizontales. */
    private static void g5_imprimirMatrizConEjes(char[][] matriz) {
        int n = matriz.length;

        // Eje vertical (de arriba hacia abajo)
        for (int i = n - 1; i >= 0; i--) {
            System.out.printf("%2d | ", i);
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Eje horizontal
        System.out.print("   +");
        for (int j = 0; j < n * 2 + 1; j++)
            System.out.print("-");
        System.out.println();

        System.out.print("     ");
        for (int j = 0; j < n; j++)
            System.out.print(j + " ");
        System.out.println();
    }

    /** Limpia la pantalla en la misma consola (efecto de animación en un solo plano). */
    private static void g5_limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
