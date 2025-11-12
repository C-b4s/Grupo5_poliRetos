package src.Poliretos.cadenaCaracteres;

public class G5_contarVocales {
    public int g5_contarVocalesFor(String textoIngresado) {
        int contVocales = 0;
        String cadenaVocales = "áéíóúaeiou";
        textoIngresado = textoIngresado.toLowerCase();
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contVocales;
        }
        for (int i = 0; i < textoIngresado.length(); i++) {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) != -1) {
                contVocales++;
            }
        }
        return contVocales;
    }

    public int g5_contarVocalesWhile(String textoIngresado) {
        int contVocales = 0;
        String cadenaVocales = "áéíóúaeiou";
        textoIngresado = textoIngresado.toLowerCase();
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contVocales;
        }
        while (i < textoIngresado.length()) {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) != -1) {
                contVocales++;
            }
            i++;
        }
        return contVocales;
    }

    public int g5_contarVocalesDoWhile(String textoIngresado) {
        int contVocales = 0;
        String cadenaVocales = "áéíóúaeiou";
        textoIngresado = textoIngresado.toLowerCase();
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contVocales;
        }
        do {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) != -1) {
                contVocales++;
            }
            i++;
        } while (i < textoIngresado.length());
        return contVocales;
    }
}
