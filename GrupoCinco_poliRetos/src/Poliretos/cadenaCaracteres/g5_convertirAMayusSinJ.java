package src.Poliretos.cadenaCaracteres;

public class g5_convertirAMayusSinJ {
    public String g5_convertirAMayusSinJFor (String textoIngresado){
        StringBuilder textoEnMayus = new StringBuilder();
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoEnMayus.toString();
        }

        String textoAOperar = textoIngresado.toLowerCase();

        for (char caracterTexto : textoAOperar.toCharArray()){
            if (caracterTexto == 'j'){

            }else{
                textoEnMayus.append(Character.toUpperCase(caracterTexto));
            }
        }
        return textoEnMayus.toString();
    }

    public String g5_convertirAMayusSinJWhile(String textoIngresado){
        StringBuilder textoEnMayus = new StringBuilder();
        int i = 0;

        if (textoIngresado == null || textoIngresado.length()==0){
            return textoEnMayus.toString();
        }

        while (i < textoIngresado.length()){
            char caracterTexto = textoIngresado.charAt(i);
            if (caracterTexto == 'j'){

            }else{
                textoEnMayus.append(Character.toUpperCase(caracterTexto));
            }
            i++;
        }
        return textoEnMayus.toString();
    }

    public String g5_convertirAMayusSinJDoWhile(String textoIngresado){
        StringBuilder textoEnMayus = new StringBuilder();
        int i = 0;

        if (textoIngresado == null || textoIngresado.length()==0){
            return textoEnMayus.toString();
        }

        do{
            char caracterTexto = textoIngresado.charAt(i);
            if (caracterTexto == 'j'){

            }else{
                textoEnMayus.append(Character.toUpperCase(caracterTexto));
            }
            i++;
        }while (i < textoIngresado.length());
        return textoEnMayus.toString();
    }
}
