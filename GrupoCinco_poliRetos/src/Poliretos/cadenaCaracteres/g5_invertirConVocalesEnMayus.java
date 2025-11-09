package src.Poliretos.cadenaCaracteres;

public class G5_invertirConVocalesEnMayus {
public String g5_invertirConVocalesMayusFor(String textoIngresado){
        String textoInvertido = "";
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoInvertido;
        }
        for (int i = textoIngresado.length() - 1; i >= 0; i--) {
            char caracterActual = textoIngresado.charAt(i);
            if ("áéíóúaeiou".indexOf(Character.toLowerCase(caracterActual)) != -1) {
                textoInvertido += Character.toUpperCase(caracterActual);
            } else {
                textoInvertido += caracterActual;
            }
        }
        return textoInvertido;
    }

    public String g5_invertirConVocalesMayusWhile(String textoIngresado){
        String textoInvertido = "";
        int i = textoIngresado.length() - 1;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoInvertido;
        }
        while (i >= 0) {
            char caracterActual = textoIngresado.charAt(i);
            if ("áéíóúaeiou".indexOf(Character.toLowerCase(caracterActual)) != -1) {
                textoInvertido += Character.toUpperCase(caracterActual);
            } else {
                textoInvertido += caracterActual;
            }
            i--;
        }
        return textoInvertido;
    }

    public String g5_invertirConVocalesMayusDoWhile(String textoIngresado){
        String textoInvertido = "";
        int i = textoIngresado.length() - 1;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoInvertido;
        }
        do {
            char caracterActual = textoIngresado.charAt(i);
            if ("áéíóúaeiou".indexOf(Character.toLowerCase(caracterActual)) != -1) {
                textoInvertido += Character.toUpperCase(caracterActual);
            } else {
                textoInvertido += caracterActual;
            }
            i--;
        } while (i >= 0);
        return textoInvertido;
    }
}
