package src.Poliretos.recursividad;

public class gr5_ContadorRegresivo {

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