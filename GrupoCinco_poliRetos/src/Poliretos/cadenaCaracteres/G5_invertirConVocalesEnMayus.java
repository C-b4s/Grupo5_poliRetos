package src.Poliretos.cadenaCaracteres;

public class G5_invertirConVocalesEnMayus {
public String g5_invertirConVocalesMayusFor(String textoIngresado){
        
        textoIngresado = textoIngresado.toLowerCase();
        StringBuilder textoInvertido = new StringBuilder();

        for (int i = textoIngresado.length() - 1; i >= 0; i--) {
            char caracterActual = textoIngresado.charAt(i);
            if (Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf((caracterActual)) != -1) {
                textoInvertido.append(Character.toUpperCase(caracterActual));
            } else {
                textoInvertido.append(caracterActual);
            }
        }
        return textoInvertido.toString();
    }

    public String g5_invertirConVocalesMayusWhile(String textoIngresado){
        
        textoIngresado = textoIngresado.toLowerCase();
        StringBuilder textoInvertido = new StringBuilder();

        int i = textoIngresado.length() - 1;
        while (i >= 0) {
            char caracterActual = textoIngresado.charAt(i);
            if (Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf((caracterActual)) != -1) {
                textoInvertido.append(Character.toUpperCase(caracterActual));
            } else {
                textoInvertido.append(caracterActual);
            }
            i--;
        }
        return textoInvertido.toString();
    }

    public String g5_invertirConVocalesMayusDoWhile(String textoIngresado){
        
        
        if (textoIngresado == null || textoIngresado.isEmpty()) {
            return "";
        }

        textoIngresado = textoIngresado.toLowerCase();
        StringBuilder textoInvertido = new StringBuilder();
        int i = textoIngresado.length() - 1;

        do {
           char caracterActual = textoIngresado.charAt(i);
            if (Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf((caracterActual)) != -1) {
                textoInvertido.append(Character.toUpperCase(caracterActual));
            } else {
                textoInvertido.append(caracterActual);
            }
            i--;
        } while (i >= 0);
        return textoInvertido.toString();
    }
}
