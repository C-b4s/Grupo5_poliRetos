package src.Poliretos.automatas.automatas3;

public class Aut3 {
   // automata a+|b+|c+

    final int e = -10;

    int[][] mt = {
            // a b c
            { 1, 2, 3 },
            { 1, e, e },
            { e, 2, e },
            { e, e, 3 }
    };

    public int obtenerColumna(char c) {
        switch (c) {
            case 'a':
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
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

        return estadoActual == 1 || estadoActual == 2 || estadoActual == 3;
    }  
}
