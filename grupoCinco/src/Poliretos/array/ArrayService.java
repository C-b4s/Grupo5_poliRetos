package src.Poliretos.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {
    /**
     * Este método muestra los porcentajes asociados a cada palabra del nombre
     * utilizando un bucle for.
     * @param palabrasNombre: String[]
     * @param porcentajes: double[]
     */

    public void mostrarPorcentajesFor (String [] palabrasNombre, double porcentajes []){        
        for (int i = 0; i < palabrasNombre.length; i++){
            String barraPalabra = generarBarraFor(porcentajes[i]);
            int numLetras = (int) Math.ceil((porcentajes[i]/100) * palabrasNombre[i].length());
            String letrasPalabra = palabrasNombre[i].substring(0,numLetras);
            System.out.printf("%-20s %.0f%% %-20s\n", barraPalabra, porcentajes[i], letrasPalabra);
        }
    }


    /**
     * Este método genera una barra de progreso basada en el porcentaje dado.
     * @param porcentaje : double
     * @return String barra de progreso
     */
    
    private String generarBarraFor (double porcentaje){
        int espaciosTotales = 15;
        int espaciosLlenos = (int) (porcentaje / 100 * espaciosTotales);
        StringBuilder barra = new StringBuilder("[");

        if (espaciosLlenos == espaciosTotales) {
            for (int j = 0; j < espaciosTotales; j++){
                if (j < (espaciosLlenos - 1)) barra.append("=");
                else if(j < espaciosLlenos) barra.append(">");
            }
        }else if (espaciosLlenos == 0){
            for (int j = 0; j < espaciosTotales; j++){
                barra.append(" ");
            }
        }else{
            for (int j = 0; j < espaciosTotales; j++){
                if (j < espaciosLlenos) barra.append("=");
                else if(j == espaciosLlenos) barra.append(">");
                else barra.append(" ");
            }
        }

        return barra.append("] ").toString();
    }

    public void mostrarPorcentajesWhile(String [] palabrasNombre, double [] porcentajes){
        int i = 0;
        while (i < palabrasNombre.length){
            String barraPalabra = generarBarraWhile(porcentajes[i]);
            int numLetras = (int) Math.ceil((porcentajes[i]/100) * palabrasNombre[i].length());
            String letrasPalabra = palabrasNombre[i].substring(0, numLetras);
            System.out.printf("%-20s %.0f%% %-20s\n", barraPalabra, porcentajes[i], letrasPalabra);
            i++;
        }
    }

    private String generarBarraWhile(double porcentaje) {
        int espaciosTotales = 15;
        int espaciosLlenos = (int) (porcentaje / 100 * espaciosTotales);
        StringBuilder barra = new StringBuilder("[");

        int j = 0;
        if(espaciosLlenos == espaciosTotales){
            while (j < espaciosTotales){
                if (j < (espaciosLlenos - 1)) barra.append("=");
                else if(j < espaciosLlenos) barra.append(">");
                j++;
            }
        }else if (espaciosLlenos == 0){
            while (j < espaciosTotales){
                barra.append(" ");
                j++;
            }
        }else{
            while (j < espaciosTotales){
                if (j < espaciosLlenos) barra.append("=");
                else if(j == espaciosLlenos) barra.append(">");
                else barra.append(" ");
                j++;
            }
        }
        return barra.append("] ").toString();
    }

    public void mostrarPorcentajesDoWhile (String [] palabrasNombre, double [] porcentajes){
        int i = 0;
        do{
            String barraPalabra = generarBarraDoWhile(porcentajes[i]);
            int numLetras = (int) Math.ceil(porcentajes[i]/100 * palabrasNombre[i].length());
            String letrasPalabra = palabrasNombre[i].substring(0, numLetras);
            System.out.printf("%-20s %.0f%% %-20s\n", barraPalabra, porcentajes[i], letrasPalabra);
            i++;
        }while (i < palabrasNombre.length);
    }

    private String generarBarraDoWhile(double porcentaje) {
        int espaciosTotales = 15;
        int espaciosLlenos = (int) (porcentaje / 100 * espaciosTotales);
        StringBuilder barra = new StringBuilder("[");
        int j = 0;
        if (espaciosLlenos == espaciosTotales){
            do{
                if(j < espaciosLlenos - 1) barra.append("=");
                else if (j < espaciosLlenos) barra.append(">");
                j++;
            }while (j < espaciosTotales);
        }else if (espaciosLlenos == 0){
            do{
                barra.append(" ");
                j++;
            }while (j < espaciosTotales);
        }else{
            do{
                if (j < espaciosLlenos) barra.append("=");
                else if (j == espaciosLlenos) barra.append(">");
                else barra.append(" ");
                j++;
            }while (j < espaciosTotales);
        }
        return barra.append("] ").toString();
    }

    public char [] [] crearMatrizInicialesFor (int tamIngresado, char caracterUsuario){
        char [] [] matIniciales = new char [tamIngresado][(tamIngresado * 2) + 3];

        for (int i = 0; i < tamIngresado; i++){
            Arrays.fill(matIniciales[i], ' ');
        }

        int mitad = (int) Math.ceil(tamIngresado / 2.0);

        for (int i = 0; i < tamIngresado; i++){
                if (i == 0|| i == mitad - 1 || i == tamIngresado - 1){
                    for (int j = 0; j < tamIngresado; j++){
                        matIniciales [i][j] = caracterUsuario;
                    }
                }else if (i < mitad - 1){

                    matIniciales[i][0] = caracterUsuario;
                
                }else{
                    matIniciales [i][tamIngresado - 1] = caracterUsuario;
                        
                }
        }           
                  
        
        int offset = tamIngresado + 2;

        for (int i = 0; i < tamIngresado; i++){
            
             if (i == 0 || i == tamIngresado - 1){
                    for (int j = 0; j < tamIngresado; j++){
                        matIniciales [i][offset + j] = caracterUsuario;
                    }
            }else{
                matIniciales[i][offset + (tamIngresado - i - 1)] = caracterUsuario;
            }
        }

        return matIniciales;
    }

    public char[][] crearMatrizInicialesWhile(int tamanioMatriz, char caracterImpresion) {
        char[][] matrizIniciales = new char[tamanioMatriz][(tamanioMatriz * 2) + 3];

        int i = 0;
        while (i < tamanioMatriz) {
            Arrays.fill(matrizIniciales[i], ' ');
            i++;
        }

        int mitad = (int) Math.ceil(tamanioMatriz / 2.0);

        i = 0;
        while (i < tamanioMatriz) {
            if (i == 0 || i == mitad - 1 || i == tamanioMatriz - 1) {
                int j = 0;
                while (j < tamanioMatriz) {
                    matrizIniciales[i][j] = caracterImpresion;
                    j++;
                }
            } else if (i < mitad - 1) {
                matrizIniciales[i][0] = caracterImpresion;
            } else {
                matrizIniciales[i][tamanioMatriz - 1] = caracterImpresion;
            }
            i++;
        }

        int offset = tamanioMatriz + 2;

        i = 0;
        while (i < tamanioMatriz) {
            if (i == 0 || i == tamanioMatriz - 1) {
                int j = 0;
                while (j < tamanioMatriz) {
                    matrizIniciales[i][offset + j] = caracterImpresion;
                    j++;
                }
            } else {
                matrizIniciales[i][offset + (tamanioMatriz - i - 1)] = caracterImpresion;
            }
            i++;
        }

        return matrizIniciales;
    }

    public char [] [] crearMatrizInicialesDoWhile (int tamIngresado, char caracterUsuario){
        char [] [] matIniciales = new char [tamIngresado][(tamIngresado * 2) + 3];

        int i = 0;
        do{
            Arrays.fill(matIniciales[i], ' ');
            i++;
        }while (i < tamIngresado);

        int mitad = (int) Math.ceil(tamIngresado / 2.0);

        i = 0;
        do{
            if (i == 0|| i == mitad - 1 || i == tamIngresado - 1){
                int j = 0;
                do{
                    matIniciales [i][j] = caracterUsuario;
                    j++;
                }while (j < tamIngresado);
            }else if (i < mitad - 1){
                matIniciales[i][0] = caracterUsuario;
        
            }else{
                matIniciales [i][tamIngresado - 1] = caracterUsuario;
                    
            }
            i++;
        }while (i < tamIngresado);           
                      
       
        int offset = tamIngresado + 2;

        i = 0;
        do{
             if (i == 0 || i == tamIngresado - 1){
                    int j = 0;
                    do{
                        matIniciales [i][offset + j] = caracterUsuario;
                        j++;
                    }while (j < tamIngresado);
            }else{
                matIniciales[i][offset + (tamIngresado - i - 1)] = caracterUsuario;
            }
            i++;
        }while (i < tamIngresado);

        return matIniciales;
    }

    public void graficarNombre2xFor(String nombre) {

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

    public void graficarNombre2xWhile(String nombre) {
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

    public void graficarNombre2xDoWhile(String nombre) {
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
    
    public void imprimirXConNombre(String nombreCompleto) {
        // Eliminar espacios para usar solo los caracteres
        String nombreSinEspacios = nombreCompleto.replace(" ", "");
        String nombre = nombreSinEspacios.substring(0,9);
        String apellido = nombreSinEspacios.substring(9, 15);
        int nombreTamanio = nombre.length(); // Tamaño de la matriz cuadrada
        char[][] matriz = new char[nombreTamanio][nombreTamanio];

        // Inicializar la matriz con espacios
        for (int i = 0; i < nombreTamanio; i++) {
            for (int j = 0; j < nombreTamanio; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Rellenar las diagonales con las letras del nombre
        for (int i = 0; i < nombre.length(); i++) {
            char letraNombre = nombre.charAt(i);
            matriz[i][i] = letraNombre;               
        }

        for (int i = 0; i < apellido.length(); i++) {
            char letraApellido = apellido.charAt(i);
            matriz[i][nombreTamanio - 1 - i] = letraApellido;       
        }

        // Imprimir la matriz
        for (int i = 0; i < nombreTamanio; i++) {
            for (int j = 0; j < nombreTamanio; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirXConNombreWhile(String nombreCompleto) {
        String nombreSinEspacios = nombreCompleto.replace(" ", "");
        String nombre = nombreSinEspacios.substring(0, 9);
        String apellido = nombreSinEspacios.substring(9, 15);
        int nombreTamanio = nombre.length();
        char[][] matriz = new char[nombreTamanio][nombreTamanio];

        int i = 0;
        while (i < nombreTamanio) {
            int j = 0;
            while (j < nombreTamanio) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }

        i = 0;
        while (i < nombre.length()) {
            char letraNombre = nombre.charAt(i);
            matriz[i][i] = letraNombre;
            i++;
        }

        i = 0;
        while (i < apellido.length()) {
            char letraApellido = apellido.charAt(i);
            matriz[i][nombreTamanio - 1 - i] = letraApellido;
            i++;
        }

        i = 0;
        while (i < nombreTamanio) {
            int j = 0;
            while (j < nombreTamanio) {
                System.out.print(matriz[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public void imprimirXConNombreDoWhile(String nombreCompleto) {
        String nombreSinEspacios = nombreCompleto.replace(" ", "");
        String nombre = nombreSinEspacios.substring(0, 9);
        String apellido = nombreSinEspacios.substring(9, 15);
        int nombreTamanio = nombre.length();
        char[][] matriz = new char[nombreTamanio][nombreTamanio];

        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < nombreTamanio);
            i++;
        } while (i < nombreTamanio);

        i = 0;
        do {
            char letraNombre = nombre.charAt(i);
            matriz[i][i] = letraNombre;
            i++;
        } while (i < nombre.length());

        i = 0;
        do {
            char letraApellido = apellido.charAt(i);
            matriz[i][nombreTamanio - 1 - i] = letraApellido;
            i++;
        } while (i < apellido.length());

        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(matriz[i][j] + " ");
                j++;
            } while (j < nombreTamanio);
            System.out.println();
            i++;
        } while (i < nombreTamanio);
    }

    public void colocarLetrasNombreAleatorioFor (String nombreCompleto, int delayMs) throws InterruptedException {
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
        limpiarPantalla();
        imprimirMatrizConEjes(matriz);

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
            limpiarPantalla();
            imprimirMatrizConEjes(matriz);

            System.out.printf("\nInsertando '%c' en (%d, %d)\n", letra, fila, col);
            Thread.sleep(delayMs);
        }

        System.out.println("\nInserción completada.");
    }

    public void colocarLetrasNombreAleatorioWhile (String nombreCompleto, int delayMs) throws InterruptedException {
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

        limpiarPantalla();
        imprimirMatrizConEjes(matriz);

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

            limpiarPantalla();
            imprimirMatrizConEjes(matriz);

            System.out.printf("\nInsertando '%c' en (%d, %d)\n", letra, fila, col);
            Thread.sleep(delayMs);
            k++;
        }

        System.out.println("\nInserción completada.");
    }

    public void colocarLetrasNOmbreAleatorioDoWhile (String nombreCompleto, int delayMs) throws InterruptedException {
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

        limpiarPantalla();
        imprimirMatrizConEjes(matriz);

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

            limpiarPantalla();
            imprimirMatrizConEjes(matriz);

            System.out.printf("\nInsertando '%c' en (%d, %d)\n", letra, fila, col);
            Thread.sleep(delayMs);
            k++;
        } while (k < texto.length());

        System.out.println("\nInserción completada.");
    }

    /** Imprime la matriz con ejes verticales y horizontales. */
    private static void imprimirMatrizConEjes(char[][] matriz) {
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
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


    