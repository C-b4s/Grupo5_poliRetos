package src.Poliretos.serieCaracteres;

public class G5_S8serie {

    /**
     * Genera la serie S8: aa bbbb cccccc dddddddd ... usando bucle FOR
     */
    public String g5_generarS8_for(int n) {
        String resultado = "";
        char letra = 'a';
        int cantidad = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cantidad; j++) {
                resultado += letra;
            }
            resultado += " ";
            letra++;
            cantidad += 2; 
        }
        return resultado.trim();
    }

    /**
     * Genera la serie S8: aa bbbb cccccc dddddddd ... usando bucle WHILE
     */
    public String g5_generarS8_while(int n) {
        String resultado = "";
        char letra = 'a';
        int cantidad = 2;
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < cantidad) {
                resultado += letra;
                j++;
            }
            resultado += " ";
            letra++;
            cantidad += 2;
            i++;
        }
        return resultado.trim();
    }

    /**
     * Genera la serie S8: aa bbbb cccccc dddddddd ... usando bucle DO-WHILE
     */
    public String g5_generarS8_doWhile(int n) {
        String resultado = "";
        char letra = 'a';
        int cantidad = 2;
        int i = 0;
        if (n > 0) {
            do {
                int j = 0;
                do {
                    resultado += letra;
                    j++;
                } while (j < cantidad);
                resultado += " ";
                letra++;
                cantidad += 2;
                i++;
            } while (i < n);
        }
        return resultado.trim();
    }
}
