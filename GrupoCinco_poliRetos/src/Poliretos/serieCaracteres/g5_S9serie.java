package src.Poliretos.serieCaracteres;

public class g5_S9serie {
    
/**
 * Genera la serie S9: a bb ccc dddd ... usando bucle FOR
 */
public String g5_generarS9_for(int n) {
    String resultado = "";
    char letra = 'a';
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j < i; j++) {
            resultado += letra;
        }
        resultado += " ";
        letra++;
    }
    return resultado;
}

/**
 * Genera la serie S9: a bb ccc dddd ... usando bucle WHILE
 */
public String g5_generarS9_while(int n) {
    String resultado = "";
    char letra = 'a';
    int i = 1;
    while (i <= n) {
        int j = 0;
        while (j < i) {
            resultado += letra;
            j++;
        }
        resultado += " ";
        letra++;
        i++;
    }
    return resultado;
}

/**
 * Genera la serie S9: a bb ccc dddd ... usando bucle DO-WHILE
 */
public String g5_generarS9_doWhile(int n) {
    String resultado = "";
    char letra = 'a';
    int i = 1;
    if (n > 0) {
        do {
            int j = 0;
            do {
                resultado += letra;
                j++;
            } while (j < i);
            resultado += " ";
            letra++;
            i++;
        } while (i <= n);
    }
    return resultado;
}
}
