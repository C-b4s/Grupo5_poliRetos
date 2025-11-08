package src.Poliretos.cadenaCaracteres;

public class g5_alternarMayusYMinus {
    public String g5_alternarMayusYMinusFor(String textoIngresado){
        StringBuilder textoAlternado = new StringBuilder();
    
        if (textoIngresado == null || textoIngresado.length() == 0){
            return textoAlternado.toString();
        }

        for (int i = 0; i < textoIngresado.length(); i++){
            if (i % 2 == 0){
                textoAlternado.append(Character.toUpperCase(textoIngresado.charAt(i)));
            }else{
                textoAlternado.append(Character.toLowerCase(textoIngresado.charAt(i)));
            }
        }

        return textoAlternado.toString();
    }

    public String g5_alternarMayusYMinusWhile(String textoIngresado){
        StringBuilder textoAlternado = new StringBuilder();
        int i = 0;

        if (textoIngresado == null || textoIngresado.length() == 0){
            return "";
        }

        while (i < textoIngresado.length()){
            if( i % 2 == 0){
                textoAlternado.append(Character.toUpperCase(textoIngresado.charAt(i)));
            }else{
                textoAlternado.append(Character.toLowerCase(textoIngresado.charAt(i)));
            }
            i++;
        }
        return textoAlternado.toString();
    }

    public String g5_alternarMayusYMinusDoWhile (String textoIngresado){
        StringBuilder textoAlternado = new StringBuilder();
        int i = 0;

        if (textoIngresado == null || textoIngresado.length() == 0){
            return "";
        }

        do{
            if (i % 2 == 0){
                textoAlternado.append(Character.toUpperCase(textoIngresado.charAt(i)));
            }else{
                textoAlternado.append(Character.toLowerCase(textoIngresado.charAt(i)));
            }
            i++;
        }while (i < textoIngresado.length());
        return textoAlternado.toString();
    }

}
