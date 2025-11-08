package src.Poliretos.array;

public class g5_imprimirXConNombre {
    public void g5_imprimirXConNombreFor(String nombreCompleto) {

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

    public void g5_imprimirXConNombreWhile(String nombreCompleto) {
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

    public void g5_imprimirXConNombreDoWhile(String nombreCompleto) {
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
}
