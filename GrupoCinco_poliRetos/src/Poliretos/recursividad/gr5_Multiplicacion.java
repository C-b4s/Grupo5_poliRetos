package src.Poliretos.recursividad;

public class gr5_Multiplicacion {

    /**
     * Multiplicación usando bucle FOR.
     */
    public int g5_multiplicarFor(int a, int b) {
        int resultado = 0;
        int signo = (b < 0) ? -1 : 1;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        return resultado * signo;
    }

    /**
     * Multiplicación usando bucle WHILE.
     */
    public int g5_multiplicarWhile(int a, int b) {
        int resultado = 0;
        int i = 0;
        int signo = (b < 0) ? -1 : 1;
        while (i < Math.abs(b)) {
            resultado += a;
            i++;
        }
        return resultado * signo;
    }

    /**
     * Multiplicación usando bucle DO-WHILE.
     */
    public int g5_multiplicarDoWhile(int a, int b) {
        int resultado = 0;
        int i = 0;
        int signo = (b < 0) ? -1 : 1;
        if (b != 0) {
            do {
                resultado += a;
                i++;
            } while (i < Math.abs(b));
        }
        return resultado * signo;
    }
}
