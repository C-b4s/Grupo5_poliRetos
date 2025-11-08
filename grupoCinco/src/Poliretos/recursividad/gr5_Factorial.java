package src.Poliretos.recursividad;

public class gr5_Factorial {

    
    /**
     * Método recursivo con bucle FOR para calcular el factorial.
     */
    public int g5_factorialFor(int n) {
        if (n <= 1) return 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }
     /**
     * S2: Método recursivo con bucle WHILE para calcular el factorial.
     */
    public int g5_factorialWhile(int n) {
        if (n <= 1) return 1;
        int result = 1;
=======
    /**
     * Método recursivo con bucle WHILE para calcular el factorial.
     */
    public int g5_factorialWhile(int n) {
        if (n <= 1) return 1;
>>>>>>> 124adf4 (Reorganizacion de metodos da los ejercicios de recursividad y correccion de llamado)
        int i = n;
        while (i > 1) {
            result *= i;
            i--;
        }
        return result;
    }

    /**
    /** S3: Método recursivo con bucle DO-WHILE para calcular el factorial.
     */
    public int g5_factorialDoWhile(int n) {
        if (n <= 1) return 1;
        int result = 1;
=======
     * Método recursivo con bucle DO-WHILE para calcular el factorial.
     */
    public int g5_factorialDoWhile(int n) {
        if (n <= 1) return 1;
>>>>>>> 124adf4 (Reorganizacion de metodos da los ejercicios de recursividad y correccion de llamado)
        int i = n;
        do {
            result *= i;
            i--;
        } while (i > 1);
        return result;
    }
}