package src.Poliretos.recursividad;

public class gr5_ContadorProgresivo {

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

}