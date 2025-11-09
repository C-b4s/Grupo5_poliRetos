package src.Poliretos.cadenaCaracteres;

public class G5_eliminarConsonante {
public String g5_eliminarConsonanteFor(String textoIngresado, char consonante){
        if (textoIngresado == null || textoIngresado.isEmpty()) {
            return "";
        }

        StringBuilder sinConsonante = new StringBuilder();
        for (char caracter : textoIngresado.toCharArray()) {
            sinConsonante.append(caracter == consonante? ' ' : caracter);
        }
        return sinConsonante.toString();
        
    }

    public String g5_eliminarConsonanteWhile(String textoIngresado, char consonante){
        if (textoIngresado == null || textoIngresado.isEmpty()) {
            return "";
        }

        StringBuilder sinConsonante = new StringBuilder();
        int i = 0;

        while (i < textoIngresado.length()){
            sinConsonante.append(textoIngresado.charAt(i) == consonante? ' ': textoIngresado.charAt(i));
            i++;
        }
        return sinConsonante.toString();
    }

    public String g5_eliminarConsonanteDoWhile(String textoIngresado, char consonante){
        if (textoIngresado == null || textoIngresado.isEmpty()) {
            return "";
        }

        StringBuilder sinConsonante = new StringBuilder();
        int i = 0;

        do {
            sinConsonante.append(textoIngresado.charAt(i) == consonante? ' ' : textoIngresado.charAt(i));
            i++;
        } while (i < textoIngresado.length());
            
        
        return sinConsonante.toString();
    }
}
