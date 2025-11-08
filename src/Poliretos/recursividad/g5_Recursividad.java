package src.Poliretos.recursividad;

public class g5_Recursividad {
    
    /**
     * S1: Método recursivo con bucle FOR para calcular el factorial.
     */
    public int g5_factorialFor(int n) {
        if (n <= 1) return 1;
        int result = 1;
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
        int i = n;
        while (i > 1) {
            result *= i;
            i--;
        }
        return result;
    }

    /**
     * S3: Método recursivo con bucle DO-WHILE para calcular el factorial.
     */
    public int g5_factorialDoWhile(int n) {
        if (n <= 1) return 1;
        int result = 1;
        int i = n;
        do {
            result *= i;
            i--;
        } while (i > 1);
        return result;
    }

    
    /**
     * Suma recursiva usando FOR.
     */
    public int g5_sumarFor(int a, int b) {
        if (b == 0) return a;
        for (int i = 0; i < b; i++) {
            a++;
        }
        return a;
    }

    /**
     * Suma recursiva usando WHILE.
     */
    public int g5_sumarWhile(int a, int b) {
        if (b == 0) return a;
        int i = 0;
        while (i < b) {
            a++;
            i++;
        }
        return a;
    }

    /**
     * Suma recursiva usando DO-WHILE.
     */
    public int g5_sumarDoWhile(int a, int b) {
        if (b == 0) return a;
        int i = 0;
        do {
            a++;
            i++;
        } while (i < b);
        return a;
    }
    
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
    /**
     * Contar hasta n usando bucle FOR.
     */
    public void contarFor(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    /**
     * Contar hasta n usando bucle WHILE.
     */
    public void contarWhile(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * Contar hasta n usando bucle DO-WHILE.
     */
    public void contarDoWhile(int n) {
        int i = 1;
        if (n >= 1) {
            do {
                System.out.println(i);
                i++;
            } while (i <= n);
        }
    }
    
    /**
     * Contar desde n hasta 0 usando bucle FOR.
     */
    public void contarDesdeFor(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    /**
     * Contar desde n hasta 0 usando bucle WHILE.
     */
    public void contarDesdeWhile(int n) {
        int i = n;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }

    /**
     * Contar desde n hasta 0 usando bucle DO-WHILE.
     */
    public void contarDesdeDoWhile(int n) {
        int i = n;
        if (n >= 0) {
            do {
                System.out.println(i);
                i--;
            } while (i >= 0);
        }
    }
}
