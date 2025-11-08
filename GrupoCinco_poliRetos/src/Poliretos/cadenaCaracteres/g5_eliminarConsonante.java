package src.Poliretos.cadenaCaracteres;

public class g5_eliminarConsonante {
public String g5_eliminarConsonanteFor(String textoIngresado, char consonanteAEliminar){
        String textoSinConsonante = "";
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinConsonante;
        }
        for (char i : textoIngresado.toCharArray()) {
            if (textoIngresado.charAt(i) == consonanteAEliminar) {
                textoSinConsonante += " ";
            }
            else {
                textoSinConsonante += textoIngresado.charAt(i);
            }
        }
        return textoSinConsonante;
    }

    public String g5_eliminarConsonanteWhile(String textoIngresado, char consonanteAEliminar){
        String textoSinConsonante = "";
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinConsonante;
        }
        while (i < textoIngresado.length()) {
            if (textoIngresado.charAt(i) == consonanteAEliminar) {
                textoSinConsonante += " ";
            }else {
                textoSinConsonante += textoIngresado.charAt(i);
            }
            i++;
        }
        return textoSinConsonante;
    }

    public String g5_eliminarConsonanteDoWhile(String textoIngresado, char consonanteAEliminar){
        String textoSinConsonante = "";
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinConsonante;
        }
        do {
            if (textoIngresado.charAt(i) == consonanteAEliminar) {
                textoSinConsonante += " ";
            }else{
                textoSinConsonante += textoIngresado.charAt(i);
            }
            i++;
        } while (i < textoIngresado.length());
        return textoSinConsonante;
    }
}
