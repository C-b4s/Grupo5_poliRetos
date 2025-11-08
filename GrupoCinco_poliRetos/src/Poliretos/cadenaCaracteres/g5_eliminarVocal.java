package src.Poliretos.cadenaCaracteres;

public class g5_eliminarVocal {
    public String g5_eliminarVocalFor(String textoIngresado, char vocalAEliminar){
        String textoSinVocal = "";
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinVocal;
        }
        for (char i : textoIngresado.toCharArray()) {
            if (textoIngresado.charAt(i) == vocalAEliminar) {
                textoSinVocal += " ";
            }
            else {
                textoSinVocal += textoIngresado.charAt(i);
            }
        }
        return textoSinVocal;
    }

    public String g5_eliminarVocalWhile(String textoIngresado, char vocalAEliminar){
        String textoSinVocal = "";
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinVocal;
        }
        while (i < textoIngresado.length()) {
            if (textoIngresado.charAt(i) == vocalAEliminar) {
                textoSinVocal += " ";
            }else {
                textoSinVocal += textoIngresado.charAt(i);
            }
            i++;
        }
        return textoSinVocal;
    }

    public String g5_eliminarVocalDoWhile(String textoIngresado, char vocalAEliminar){
        String textoSinVocal = "";
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinVocal;
        }
        do {
            if (textoIngresado.charAt(i) == vocalAEliminar) {
                textoSinVocal += " ";
            }else{
                textoSinVocal += textoIngresado.charAt(i);
            }
            i++;
        } while (i < textoIngresado.length());
        return textoSinVocal;
    }
}
