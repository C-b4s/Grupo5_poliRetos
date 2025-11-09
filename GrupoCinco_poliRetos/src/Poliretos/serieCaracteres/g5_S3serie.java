package src.Poliretos.serieCaracteres;

public class G5_S3serie {
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

}
