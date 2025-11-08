    package src.Poliretos.serieCaracteres;
    public class g5_S1serie{

       /**
 * Genera la serie S1: + - + - + - ... usando bucle FOR
 */
public String g5_generarS1_for(int n) {
    String resultado = "";
    for (int i = 0; i < n; i++) {
        resultado += (i % 2 == 0) ? "+" : "-";
        resultado += " ";
    }
    return resultado;
}

/**
 * Genera la serie S1: + - + - + - ... usando bucle WHILE
 */
public String g5_generarS1_while(int n) {
    String resultado = "";
    int i = 0;
    while (i < n) {
        resultado += (i % 2 == 0) ? "+" : "-";
        resultado += " ";
        i++;
    }
    return resultado;
}

/**
 * Genera la serie S1: + - + - + - ... usando bucle DO-WHILE
 */
public String g5_generarS1_doWhile(int n) {
    String resultado = "";
    int i = 0;
    if (n > 0) {
        do {
            resultado += (i % 2 == 0) ? "+" : "-";
            resultado += " ";
            i++;
        } while (i < n);
    }
    return resultado;
}

    }
    