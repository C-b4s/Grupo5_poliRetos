package src.Poliretos.serieCaracteres;

public class G5_S7serie {
    
/**
 * Genera la serie S7: a c e g i ... usando bucle FOR
 */
public String g5_generarS7_for(int n) {
    String resultado = "";
    char letra = 'a';
    for (int i = 0; i < n; i++) {
        resultado += letra + " ";
        letra += 2;
    }
    return resultado;
}

/**
 * Genera la serie S7: a c e g i ... usando bucle WHILE
 */
public String g5_generarS7_while(int n) {
    String resultado = "";
    char letra = 'a';
    int i = 0;
    while (i < n) {
        resultado += letra + " ";
        letra += 2;
        i++;
    }
    return resultado;
}

/**
 * Genera la serie S7: a c e g i ... usando bucle DO-WHILE
 */
public String g5_generarS7_doWhile(int n) {
    String resultado = "";
    char letra = 'a';
    int i = 0;
    if (n > 0) {
        do {
            resultado += letra + " ";
            letra += 2;
            i++;
        } while (i < n);
    }
    return resultado;
}
}
