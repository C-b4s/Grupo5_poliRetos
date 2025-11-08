package src.Poliretos.serieCaracteres;

public class g5_S2serie {
    /**
 * Genera la serie S2: + ++ +++ ... usando bucle FOR
 */
public String g5_generarS2_for(int n) {
    String resultado = "";
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j < i; j++) {
            resultado += "+";
        }
        resultado += " ";
    }
    return resultado;
}

/**
 * Genera la serie S2: + ++ +++ ... usando bucle WHILE
 */
public String g5_generarS2_while(int n) {
    String resultado = "";
    int i = 1;
    while (i <= n) {
        int j = 0;
        while (j < i) {
            resultado += "+";
            j++;
        }
        resultado += " ";
        i++;
    }
    return resultado;
}

/**
 * Genera la serie S2: + ++ +++ ... usando bucle DO-WHILE
 */
public String g5_generarS2_doWhile(int n) {
    String resultado = "";
    int i = 1;
    if (n >= 1) {
        do {
            int j = 0;
            do {
                resultado += "+";
                j++;
            } while (j < i);
            resultado += " ";
            i++;
        } while (i <= n);
    }
    return resultado;
}

}
