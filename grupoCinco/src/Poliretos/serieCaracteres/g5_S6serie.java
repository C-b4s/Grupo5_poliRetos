package src.Poliretos.serieCaracteres;

public class g5_S6serie {
    /**
 * Genera la serie S6: a b c d e ... usando bucle FOR
 */
public String g5_generarS6_for(int n) {
    String resultado = "";
    for (int i = 0; i < n; i++) {
        resultado += (char)('a' + i) + " ";
    }
    return resultado;
}

/**
 * Genera la serie S6: a b c d e ... usando bucle WHILE
 */
public String g5_generarS6_while(int n) {
    String resultado = "";
    int i = 0;
    while (i < n) {
        resultado += (char)('a' + i) + " ";
        i++;
    }
    return resultado;
}

/**
 * Genera la serie S6: a b c d e ... usando bucle DO-WHILE
 */
public String g5_generarS6_doWhile(int n) {
    String resultado = "";
    int i = 0;
    if (n > 0) {
        do {
            resultado += (char)('a' + i) + " ";
            i++;
        } while (i < n);
    }
    return resultado;
}
}
