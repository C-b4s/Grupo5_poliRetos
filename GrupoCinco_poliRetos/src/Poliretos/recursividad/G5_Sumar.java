package src.Poliretos.recursividad;

public class G5_Sumar {

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
}