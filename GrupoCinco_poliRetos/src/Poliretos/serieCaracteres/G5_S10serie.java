package src.Poliretos.serieCaracteres;

public class G5_S10serie {

    /**
     * Genera la serie S10: a b c dd eee fffff gggggggg ... usando bucle FOR
     */
    public String g5_generarS10_for(int n) {
        String resultado = "";
        char letra = 'a';
        int a = 1, b = 1, c = 1;
        for (int i = 1; i <= n; i++) {
            int repeticiones = (i <= 3) ? 1 : a + b;
            for (int j = 0; j < repeticiones; j++) {
                resultado += letra;
            }
            resultado += " ";
            letra++;
            if (i > 2) {
                a = b;
                b = c;
                c = repeticiones;
            }
        }
        return resultado;
    }

    /**
     * Genera la serie S10: a b c dd eee fffff gggggggg ... usando bucle WHILE
     */
    public String g5_generarS10_while(int n) {
        String resultado = "";
        char letra = 'a';
        int a = 1, b = 1, c = 1;
        int i = 1;
        while (i <= n) {
            int repeticiones = (i <= 3) ? 1 : a + b;
            int j = 0;
            while (j < repeticiones) {
                resultado += letra;
                j++;
            }
            resultado += " ";
            letra++;
            if (i > 2) {
                a = b;
                b = c;
                c = repeticiones;
            }
            i++;
        }
        return resultado;
    }

    /**
     * Genera la serie S10: a b c dd eee fffff gggggggg ... usando bucle DO-WHILE
     */
    public String g5_generarS10_doWhile(int n) {
        String resultado = "";
        char letra = 'a';
        int a = 1, b = 1, c = 1;
        int i = 1;
        if (n > 0) {
            do {
                int repeticiones = (i <= 3) ? 1 : a + b;
                int j = 0;
                do {
                    resultado += letra;
                    j++;
                } while (j < repeticiones);
                resultado += " ";
                letra++;
                if (i > 2) {
                    a = b;
                    b = c;
                    c = repeticiones;
                }
                i++;
            } while (i <= n);
        }
        return resultado;
    }
}