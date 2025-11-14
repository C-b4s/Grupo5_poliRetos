package src.Poliretos.cadenaCaracteres;

public class G5_invertirConConsonantesEnMayus {
public String g5_invertirConConsonantesMayusFor(String textoIngresado){
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return "";
        }
        
        textoIngresado = textoIngresado.toLowerCase();
        StringBuilder textoInvertido = new StringBuilder();
        
        for (int i = textoIngresado.length() - 1; i >= 0; i--) {
            char caracterActual = textoIngresado.charAt(i);
            if (Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf(caracterActual) == -1) {
                textoInvertido.append(Character.toUpperCase(caracterActual));
            } else {
                textoInvertido.append(caracterActual);
            }
        }
        return textoInvertido.toString();
    }

    public String g5_invertirConConsonantesMayusWhile(String textoIngresado){
        int i = textoIngresado.length() - 1;

        if (textoIngresado.length()== 0){
            return "";
        }

        textoIngresado = textoIngresado.toLowerCase();
        StringBuilder textoInvertido = new StringBuilder();

        while (i >= 0){
            char caracterActual = textoIngresado.charAt(i);
            if (Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf(caracterActual) == -1){
                textoInvertido.append(Character.toUpperCase(caracterActual));
            }else{
                textoInvertido.append(caracterActual);
            }
            i--;
        }
        return textoInvertido.toString();
    }

    public String g5_invertirConConsonantesMayusDoWhile(String textoIngresado){
        int i = textoIngresado.length() - 1;

        if(textoIngresado.length()== 0){
            return "";
        }

        textoIngresado = textoIngresado.toLowerCase();
        StringBuilder textoInvertido = new StringBuilder();

        do{
            char caracterActual = textoIngresado.charAt(i);
            if(Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf(caracterActual) == -1){
                textoInvertido.append(Character.toUpperCase(caracterActual));
            }else{
                textoInvertido.append(caracterActual);
            }
            i--;
        } while (i >= 0);
        return textoInvertido.toString();
    }
}
