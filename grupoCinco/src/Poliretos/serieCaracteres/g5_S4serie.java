package src.Poliretos.serieCaracteres;

public class g5_S4serie {
    /**
 * Genera la serie S4: + - * / + - * / ... usando bucle FOR
 */
public String g5_generarS4_for(int n) {
    String[] simbolos = {"+", "-", "*", "/"};
    String resultado = "";
    for (int i = 0; i < n; i++) {
        resultado += simbolos[i % 4] + " ";
    }
    return resultado;
}

/**
 * Genera la serie S4: + - * / + - * / ... usando bucle WHILE
 */
public String g5_generarS4_while(int n) {
    String[] simbolos = {"+", "-", "*", "/"};
    String resultado = "";
    int i = 0;
    while (i < n) {
        resultado += simbolos[i % 4] + " ";
        i++;
    }
    return resultado;
}

/**
 * Genera la serie S4: + - * / + - * / ... usando bucle DO-WHILE
 */
public String g5_generarS4_doWhile(int n) {
    String[] simbolos = {"+", "-", "*", "/"};
    String resultado = "";
    int i = 0;
    if (n > 0) {
        do {
            resultado += simbolos[i % 4] + " ";
            i++;
        } while (i < n);
    }
    return resultado;
}
}
