package src.Poliretos.cadenaCaracteres;

public class G5_eliminarVocal {
    public String g5_eliminarVocalFor(String textoIngresado, char vocalAEliminar){
        
        if (textoIngresado == null || textoIngresado.isEmpty()) {
            return "";
        }
textoIngresado = textoIngresado.toLowerCase();

        StringBuilder textoSinVocal = new StringBuilder();
        for (char caracter : textoIngresado.toCharArray()) {
            textoSinVocal.append(caracter == vocalAEliminar? ' ' : caracter);
        }
        return textoSinVocal.toString();
    }

    public String g5_eliminarVocalWhile(String textoIngresado, char vocalAEliminar){

        if (textoIngresado == null || textoIngresado.isEmpty()) {
            return "";
        }

textoIngresado = textoIngresado.toLowerCase();

        StringBuilder textoSinVocal = new StringBuilder();

        int i = 0;
        while (i < textoIngresado.length()) {
            textoSinVocal.append(textoIngresado.charAt(i) == vocalAEliminar? ' ' : textoIngresado.charAt(i));
            i++;
        }
        return textoSinVocal.toString();
    }

    public String g5_eliminarVocalDoWhile(String textoIngresado, char vocalAEliminar){
        if (textoIngresado == null || textoIngresado.isEmpty()) {
            return "";
        }

textoIngresado = textoIngresado.toLowerCase();

        StringBuilder textoSinVocal = new StringBuilder();

        int i = 0;
        do{
            textoSinVocal.append(textoIngresado.charAt(i) == vocalAEliminar? ' ' : textoIngresado.charAt(i));
            i++;
        }while (i < textoIngresado.length());
        
        return textoSinVocal.toString();
    }
}
