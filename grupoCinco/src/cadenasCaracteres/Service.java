package src.cadenasCaracteres;

public class Service {
    public int contarVocalesFor(String textoIngresado) {
        int contVocales = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        if (textoIngresado.length() == 0) {
            return contVocales;
        }
        for (int i = 0; i < textoIngresado.length(); i++) {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) != -1) {
                contVocales++;
            }
        }
        return contVocales;
    }

    public int contarVocalesWhile(String textoIngresado) {
        int contVocales = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        int i = 0;
        if (textoIngresado.length() == 0) {
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

    public int contarVocalesDoWhile(String textoIngresado) {
        int contVocales = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        int i = 0;
        if (textoIngresado.length() == 0) {
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

    public int contarConstantesFor(String textoIngresado){
        int contConstantes = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        if (textoIngresado.length() == 0) {
            return contConstantes;
        }
        for (int i : textoIngresado.toCharArray()) {
            if (Character.isLetter(i) && cadenaVocales.indexOf(i) == -1) {
                contConstantes++;
            }
        }
        return contConstantes;
    }

    public int contarConstantesWhile(String textoIngresado){
        int contConstantes = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        int i = 0;
        if (textoIngresado.length() == 0) {
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

    public int contarConstantesDoWhile(String textoIngresado){
        int contConstantes = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        int i = 0;
        if (textoIngresado.length() == 0) {
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

    public String eliminarVocalFor(String textoIngresado, char vocalAEliminar){
        String resultado = "";
        if (textoIngresado.length() == 0) {
            return resultado;
        }
        for (int i : textoIngresado.toCharArray()) {
            if (textoIngresado.charAt(i) == vocalAEliminar) {
                resultado += " ";
            }
            else {
                resultado += textoIngresado.charAt(i);
            }
        }
        return resultado;
    }

    public String eliminarVocalWhile(String textoIngresado, char vocalAEliminar){
        String resultado = "";
        int i = 0;
        if (textoIngresado.length() == 0) {
            return resultado;
        }
        while (i < textoIngresado.length()) {
            if (textoIngresado.charAt(i) == vocalAEliminar) {
                resultado += " ";
            }else {
                resultado += textoIngresado.charAt(i);
            }
            i++;
        }
        return resultado;
    }

    public String eliminarVocalDoWhile(String textoIngresado, char vocalAEliminar){
        String resultado = "";
        int i = 0;
        if (textoIngresado.length() == 0) {
            return resultado;
        }
        do {
            if (textoIngresado.charAt(i) == vocalAEliminar) {
                resultado += " ";
            }else{
                resultado += textoIngresado.charAt(i);
            }
            i++;
        } while (i < textoIngresado.length());
        return resultado;
    }

    public String eliminarConsonanteFor(String textoIngresado, char consonanteAEliminar){
        String resultado = "";
        if (textoIngresado.length() == 0) {
            return resultado;
        }
        for (int i : textoIngresado.toCharArray()) {
            if (textoIngresado.charAt(i) == consonanteAEliminar) {
                resultado += " ";
            }
            else {
                resultado += textoIngresado.charAt(i);
            }
        }
        return resultado;
    }

    public String eliminarConsonanteWhile(String textoIngresado, char consonanteAEliminar){
        String resultado = "";
        int i = 0;
        if (textoIngresado.length() == 0) {
            return resultado;
        }
        while (i < textoIngresado.length()) {
            if (textoIngresado.charAt(i) == consonanteAEliminar) {
                resultado += " ";
            }else {
                resultado += textoIngresado.charAt(i);
            }
            i++;
        }
        return resultado;
    }

    public String eliminarConsonanteDoWhile(String textoIngresado, char consonanteAEliminar){
        String resultado = "";
        int i = 0;
        if (textoIngresado.length() == 0) {
            return resultado;
        }
        do {
            if (textoIngresado.charAt(i) == consonanteAEliminar) {
                resultado += " ";
            }else{
                resultado += textoIngresado.charAt(i);
            }
            i++;
        } while (i < textoIngresado.length());
        return resultado;
    }

    
}
