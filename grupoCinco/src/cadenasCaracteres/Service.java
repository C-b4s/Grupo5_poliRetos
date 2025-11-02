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
        String textoSinVocal = "";
        if (textoIngresado.length() == 0) {
            return textoSinVocal;
        }
        for (int i : textoIngresado.toCharArray()) {
            if (textoIngresado.charAt(i) == vocalAEliminar) {
                textoSinVocal += " ";
            }
            else {
                textoSinVocal += textoIngresado.charAt(i);
            }
        }
        return textoSinVocal;
    }

    public String eliminarVocalWhile(String textoIngresado, char vocalAEliminar){
        String textoSinVocal = "";
        int i = 0;
        if (textoIngresado.length() == 0) {
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

    public String eliminarVocalDoWhile(String textoIngresado, char vocalAEliminar){
        String textoSinVocal = "";
        int i = 0;
        if (textoIngresado.length() == 0) {
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

    public String eliminarConsonanteFor(String textoIngresado, char consonanteAEliminar){
        String textoSinConsonante = "";
        if (textoIngresado.length() == 0) {
            return textoSinConsonante;
        }
        for (int i : textoIngresado.toCharArray()) {
            if (textoIngresado.charAt(i) == consonanteAEliminar) {
                textoSinConsonante += " ";
            }
            else {
                textoSinConsonante += textoIngresado.charAt(i);
            }
        }
        return textoSinConsonante;
    }

    public String eliminarConsonanteWhile(String textoIngresado, char consonanteAEliminar){
        String textoSinConsonante = "";
        int i = 0;
        if (textoIngresado.length() == 0) {
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

    public String eliminarConsonanteDoWhile(String textoIngresado, char consonanteAEliminar){
        String textoSinConsonante = "";
        int i = 0;
        if (textoIngresado.length() == 0) {
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

    public String invertirConVocalesMayusFor(String textoIngresado){
        String textoInvertido = "";
        if (textoIngresado.length() == 0) {
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

    public String invertirConVocalesMayusWhile(String textoIngresado){
        String textoInvertido = "";
        int i = textoIngresado.length() - 1;
        if (textoIngresado.length() == 0) {
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

    public String invertirConVocalesMayusDoWhile(String textoIngresado){
        String textoInvertido = "";
        int i = textoIngresado.length() - 1;
        if (textoIngresado.length() == 0) {
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

    public String invertirConConsonantesMayusFor(String textoIngresado){
        String textoInvertido = "";
        if (textoIngresado.length() == 0) {
            return textoInvertido;
        }
        for (int i = textoIngresado.length() - 1; i >= 0; i--) {
            char caracterActual = textoIngresado.charAt(i);
            if (Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf(Character.toLowerCase(caracterActual)) == -1) {
                textoInvertido += Character.toUpperCase(caracterActual);
            } else {
                textoInvertido += caracterActual;
            }
        }
        return textoInvertido;
    }

    public String invertirConConsonantesMayusWhile(String textoIngresado){
        String textoInvertido = " ";
        int i = textoIngresado.length() - 1;

        if (textoIngresado.length()== 0){
            return textoInvertido;
        }

        while (i >= 0){
            char caracterActual = textoIngresado.charAt(i);
            if (Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf(caracterActual) == -1){
                textoInvertido += Character.toUpperCase(caracterActual);
            }else{
                textoInvertido += caracterActual;
            }
        }
        return textoInvertido;
    }

    public String invertirConConsonantesMayusDoWhile(String textoIngresado){
        String textoInvertido = " ";
        int i = textoIngresado.length() - 1;

        if(textoIngresado.length()== 0){
            return textoInvertido;
        }

        do{
            char caracterActual = textoIngresado.charAt(i);
            if(Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf(caracterActual) == -1){
                textoInvertido += Character.toUpperCase(caracterActual);
            }else{
                textoInvertido += Character.toUpperCase(caracterActual);
            }
        } while (i >= 0);
        return textoInvertido;
    }    



}
