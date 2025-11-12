package src.Poliretos.serieCaracteres;

public class G5_S9serie {

    /**
     * Genera la serie S9: a bbb ccccc ... usando bucle FOR
     */
    public String g5_generarS9_for(int n) {
        String resultado = "";
        char letra = 'a';
        for (int i = 1; i <= n; i++) {
            int cantidad = 2 * i - 1;
            for (int j = 0; j < cantidad; j++) {
                resultado += letra;
            }
            resultado += " ";
            letra++;
        }
        return resultado;
    }

    /**
     * Genera la serie S9: a bbb ccccc ... usando bucle WHILE
     */
    public String g5_generarS9_while(int n) {
        String resultado = "";
        char letra = 'a';
        int i = 1;
        while (i <= n) {
            int cantidad = 2 * i - 1;
            int j = 0;
            while (j < cantidad) {
                resultado += letra;
                j++;
            }
            resultado += " ";
            letra++;
            i++;
        }
        return resultado;
    }

    /**
     * Genera la serie S9: a bbb ccccc ... usando bucle DO-WHILE
     */
    public String g5_generarS9_doWhile(int n) {
        String resultado = "";
        char letra = 'a';
        int i = 1;
        if (n > 0) {
            do {
                int cantidad = 2 * i - 1;
                int j = 0;
                do {
                    resultado += letra;
                    j++;
                } while (j < cantidad);
                resultado += " ";
                letra++;
                i++;
            } while (i <= n);
        }
        return resultado;
    }
}