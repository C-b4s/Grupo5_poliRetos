package src.Poliretos.cadenaCaracteres;

public class G5_contarConsonantes {
public int g5_contarConstantesFor(String textoIngresado){
        int contConstantes = 0;
        String cadenaVocales = "áéíóúaeiou";
        textoIngresado = textoIngresado.toLowerCase();
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contConstantes;
        }
        for (char i : textoIngresado.toCharArray()) {
            if (Character.isLetter(i) && cadenaVocales.indexOf(i) == -1) {
                contConstantes++;
            }
        }
        return contConstantes;
    }

    public int g5_contarConstantesWhile(String textoIngresado){
        int contConstantes = 0;
        String cadenaVocales = "áéíóúaeiou";
        textoIngresado = textoIngresado.toLowerCase();
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contConstantes;
        }
        while (i < textoIngresado.length()) {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) == -1) {
                contConstantes++;
            }
            i++;
        }
        return contConstantes;
    }

    public int g5_contarConstantesDoWhile(String textoIngresado){
        int contConstantes = 0;
        String cadenaVocales = "áéíóúaeiou";
       textoIngresado = textoIngresado.toLowerCase();
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contConstantes;
        }
        do {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) == -1) {
                contConstantes++;
            }
            i++;
        } while (i < textoIngresado.length());
        return contConstantes;
    }
}
