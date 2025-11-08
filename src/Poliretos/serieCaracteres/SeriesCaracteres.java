package src.Poliretos.serieCaracteres;

public class SeriesCaracteres {

    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
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
/**
 * Genera la serie S3: ++ ++++ ++++++ ... usando bucle FOR
 */
public String g5_generarS3_for(int n) {
    String resultado = "";
    int cantidad = 2;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < cantidad; j++) {
            resultado += "+";
        }
        resultado += " ";
        cantidad += 2;
    }
    return resultado;
}

/**
 * Genera la serie S3: ++ ++++ ++++++ ... usando bucle WHILE
 */
public String g5_generarS3_while(int n) {
    String resultado = "";
    int i = 0;
    int cantidad = 2;
    while (i < n) {
        int j = 0;
        while (j < cantidad) {
            resultado += "+";
            j++;
        }
        resultado += " ";
        cantidad += 2;
        i++;
    }
    return resultado;
}

/**
 * Genera la serie S3: ++ ++++ ++++++ ... usando bucle DO-WHILE
 */
public String g5_generarS3_doWhile(int n) {
    String resultado = "";
    int i = 0;
    int cantidad = 2;
    if (n > 0) {
        do {
            int j = 0;
            do {
                resultado += "+";
                j++;
            } while (j < cantidad);
            resultado += " ";
            cantidad += 2;
            i++;
        } while (i < n);
    }
    return resultado;
}

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
/**
 * Genera la serie S5: \ | / - \ | / - ... usando bucle FOR
 */
public String g5_generarS5_for(int n) {
    String[] simbolos = {"\\", "|", "/", "-"};
    String resultado = "";
    for (int i = 0; i < n; i++) {
        resultado += simbolos[i % 4] + " ";
    }
    return resultado;
}

/**
 * Genera la serie S5: \ | / - \ | / - ... usando bucle WHILE
 */
public String g5_generarS5_while(int n) {
    String[] simbolos = {"\\", "|", "/", "-"};
    String resultado = "";
    int i = 0;
    while (i < n) {
        resultado += simbolos[i % 4] + " ";
        i++;
    }
    return resultado;
}

/**
 * Genera la serie S5: \ | / - \ | / - ... usando bucle DO-WHILE
 */
public String g5_generarS5_doWhile(int n) {
    String[] simbolos = {"\\", "|", "/", "-"};
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
/**
 * Genera la serie S8: a bb ccc dddd ... usando bucle FOR
 */
public String g5_generarS8_for(int n) {
    String resultado = "";
    char letra = 'a';
    int cantidad = 1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < cantidad; j++) {
            resultado += letra;
        }
        resultado += " ";
        letra++;
        cantidad *= 2;
    }
    return resultado;
}

/**
 * Genera la serie S8: a bb ccc dddd ... usando bucle WHILE
 */
public String g5_generarS8_while(int n) {
    String resultado = "";
    char letra = 'a';
    int cantidad = 1;
    int i = 0;
    while (i < n) {
        int j = 0;
        while (j < cantidad) {
            resultado += letra;
            j++;
        }
        resultado += " ";
        letra++;
        cantidad *= 2;
        i++;
    }
    return resultado;
}

/**
 * Genera la serie S8: a bb ccc dddd ... usando bucle DO-WHILE
 */
public String g5_generarS8_doWhile(int n) {
    String resultado = "";
    char letra = 'a';
    int cantidad = 1;
    int i = 0;
    if (n > 0) {
        do {
            int j = 0;
            do {
                resultado += letra;
                j++;
            } while (j < cantidad);
            resultado += " ";
            letra++;
            cantidad *= 2;
            i++;
        } while (i < n);
    }
    return resultado;
}
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
