package src.Poliretos.recursividad;

public class gr5_Potencia {

    /**
     * Potencia usando bucle FOR.
     */
    public int potenciaFor(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }

    /**
     * Potencia usando bucle WHILE.
     */
    public int potenciaWhile(int a, int b) {
        int resultado = 1;
        int i = 0;
        while (i < b) {
            resultado *= a;
            i++;
        }
        return resultado;
    }

    /**
     * Potencia usando bucle DO-WHILE.
     */
    public int potenciaDoWhile(int a, int b) {
        int resultado = 1;
        int i = 0;
        if (b == 0) return 1;
        do {
            resultado *= a;
            i++;
        } while (i < b);
        return resultado;
    }
}