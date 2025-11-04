package src.recursividad;

public class recursion {
    /**
     * Metodo recursivo para calcular el factorial de un número.
     * @param n
     * @return
     */
    public int g5_factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * g5_factorial(n - 1);
        }
    }
    /**
     * Metodo recursivo para sumar dos números.
     * @param a
     * @param b
     * @return
     */
    public int g5_sumar(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return g5_sumar(a + 1, b - 1);
        }
    }
    /**
     * Metodo recursivo para multiplicar dos números.
     * @param a
     * @param b
     * @return
     */
    public int g5_multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + g5_multiplicar(a, b - 1);
        } else {
            return -g5_multiplicar(a, -b);
        }
    }

    /**
     * Metodo recursivo para calcular la potencia de un número.
     * @param a
     * @param b
     * @return
     */
    public int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * potencia(a, b - 1);
        }
    }

    /**
     * Metodo recursivo para contar hasta un número.
     * @param n el número hasta el cual contar
     
     */
    public void contarHasta(int n) {
        g5_contarDesde(1, n);
    }
    private void g5_contarDesde(int actual, int limite) {
        if (actual > limite) {
            return;
        } else {
            System.out.println(actual);
            g5_contarDesde(actual + 1, limite);
        }
    }
    /**
     * Metodo recursivo para contar desde un número hasta 0.
     * @param n el número desde el cual contar
     */
    public void contarDesde(int n) {
        if (n < 0) {
            return;
        } else {
            System.out.println( n);
            contarDesde(n - 1);
        }
    }
    
}
