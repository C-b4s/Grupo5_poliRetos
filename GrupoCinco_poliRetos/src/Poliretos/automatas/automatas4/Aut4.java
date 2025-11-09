package src.Poliretos.automatas.automatas4;

public class Aut4 {
    // automata a+|b+|c+

    final int e = -10;

    int[][] mt = {
            // 1 0
            { 1, 2 },
            { 1, e },
            { 2, 2 }
    };

    public int obtenerColumna(char c) {
        switch (c) {
            case '1':
                return 0;
            case '0':
                return 1;
            default:
                return -1;
        }
    }

    public boolean validarCadena(String cadena) {
        int estadoActual = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char simbolo = cadena.charAt(i);
            int columna = obtenerColumna(simbolo);

            if (columna == -1) {
                return false;
            }

            estadoActual = mt[estadoActual][columna];

            if (estadoActual == e) {
                return false;
            }
        }

        return estadoActual == 1 || estadoActual == 2;
    }
}
