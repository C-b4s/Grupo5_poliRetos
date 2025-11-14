package src.Poliretos.serieCaracteres;

public class G5_S2serie {

    /**
     * Genera la serie S2: + ++ +++ ... según Fibonacci usando bucle FOR
     */
    public String g5_generarS2_for(int n) {
        String resultado = "";
        int a = 1, b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < a; j++) {
                resultado += "+";
            }
            resultado += " ";
            int temp = a + b;
            a = b;
            b = temp;
        }
        return resultado;
    }

    /**
     * Genera la serie S2: + ++ +++ ... según Fibonacci usando bucle WHILE
     */
    public String g5_generarS2_while(int n) {
        String resultado = "";
        int i = 1;
        int a = 1, b = 1;
        while (i <= n) {
            int j = 0;
            while (j < a) {
                resultado += "+";
                j++;
            }
            resultado += " ";
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        return resultado;
    }

    /**
     * Genera la serie S2: + ++ +++ ... según Fibonacci usando bucle DO-WHILE
     */
    public String g5_generarS2_doWhile(int n) {
        String resultado = "";
        int i = 1;
        int a = 1, b = 1;
        if (n >= 1) {
            do {
                int j = 0;
                do {
                    resultado += "+";
                    j++;
                } while (j < a);
                resultado += " ";
                int temp = a + b;
                a = b;
                b = temp;
                i++;
            } while (i <= n);
        }
        return resultado;
    }
}