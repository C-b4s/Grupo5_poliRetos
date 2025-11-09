package src.Poliretos.array;

public class G5_mostrarNombresConPorcentajes {
    /**
     * Este método muestra los porcentajes asociados a cada palabra del nombre
     * utilizando un bucle for.
     * @param palabrasNombre: String[]
     * @param porcentajes: double[]
     */

    public void g5_mostrarNombresConPorcentajesFor (String [] palabrasNombre, double porcentajes []){        
        for (int i = 0; i < palabrasNombre.length; i++){
            String barraPalabra = g5_generarBarraFor(porcentajes[i]);
            int numLetras = (int) Math.ceil((porcentajes[i]/100) * palabrasNombre[i].length());
            String letrasPalabra = palabrasNombre[i].substring(0,numLetras);
            System.out.printf("%-20s %.0f%% %-20s\n", barraPalabra, porcentajes[i], letrasPalabra);
        }
    }


    /**
     * Este método genera una barra de progreso basada en el porcentaje dado.
     * @param porcentaje : double
     * @return String barra de progreso
     */
    
    private String g5_generarBarraFor (double porcentaje){
        int espaciosTotales = 15;
        int espaciosLlenos = (int) (porcentaje / 100 * espaciosTotales);
        StringBuilder barra = new StringBuilder("[");

        if (espaciosLlenos == espaciosTotales) {
            for (int j = 0; j < espaciosTotales; j++){
                if (j < (espaciosLlenos - 1)) barra.append("=");
                else if(j < espaciosLlenos) barra.append(">");
            }
        }else if (espaciosLlenos == 0){
            for (int j = 0; j < espaciosTotales; j++){
                barra.append(" ");
            }
        }else{
            for (int j = 0; j < espaciosTotales; j++){
                if (j < espaciosLlenos) barra.append("=");
                else if(j == espaciosLlenos) barra.append(">");
                else barra.append(" ");
            }
        }

        return barra.append("] ").toString();
    }

    public void g5_mostrarNombresConPorcentajesWhile(String [] palabrasNombre, double [] porcentajes){
        int i = 0;
        while (i < palabrasNombre.length){
            String barraPalabra = g5_generarBarraWhile(porcentajes[i]);
            int numLetras = (int) Math.ceil((porcentajes[i]/100) * palabrasNombre[i].length());
            String letrasPalabra = palabrasNombre[i].substring(0, numLetras);
            System.out.printf("%-20s %.0f%% %-20s\n", barraPalabra, porcentajes[i], letrasPalabra);
            i++;
        }
    }

    private String g5_generarBarraWhile(double porcentaje) {
        int espaciosTotales = 15;
        int espaciosLlenos = (int) (porcentaje / 100 * espaciosTotales);
        StringBuilder barra = new StringBuilder("[");

        int j = 0;
        if(espaciosLlenos == espaciosTotales){
            while (j < espaciosTotales){
                if (j < (espaciosLlenos - 1)) barra.append("=");
                else if(j < espaciosLlenos) barra.append(">");
                j++;
            }
        }else if (espaciosLlenos == 0){
            while (j < espaciosTotales){
                barra.append(" ");
                j++;
            }
        }else{
            while (j < espaciosTotales){
                if (j < espaciosLlenos) barra.append("=");
                else if(j == espaciosLlenos) barra.append(">");
                else barra.append(" ");
                j++;
            }
        }
        return barra.append("] ").toString();
    }

    public void g5_mostrarNombresConPorcentajesDoWhile (String [] palabrasNombre, double [] porcentajes){
        int i = 0;
        do{
            String barraPalabra = g5_generarBarraDoWhile(porcentajes[i]);
            int numLetras = (int) Math.ceil(porcentajes[i]/100 * palabrasNombre[i].length());
            String letrasPalabra = palabrasNombre[i].substring(0, numLetras);
            System.out.printf("%-20s %.0f%% %-20s\n", barraPalabra, porcentajes[i], letrasPalabra);
            i++;
        }while (i < palabrasNombre.length);
    }

    private String g5_generarBarraDoWhile(double porcentaje) {
        int espaciosTotales = 15;
        int espaciosLlenos = (int) (porcentaje / 100 * espaciosTotales);
        StringBuilder barra = new StringBuilder("[");
        int j = 0;
        if (espaciosLlenos == espaciosTotales){
            do{
                if(j < espaciosLlenos - 1) barra.append("=");
                else if (j < espaciosLlenos) barra.append(">");
                j++;
            }while (j < espaciosTotales);
        }else if (espaciosLlenos == 0){
            do{
                barra.append(" ");
                j++;
            }while (j < espaciosTotales);
        }else{
            do{
                if (j < espaciosLlenos) barra.append("=");
                else if (j == espaciosLlenos) barra.append(">");
                else barra.append(" ");
                j++;
            }while (j < espaciosTotales);
        }
        return barra.append("] ").toString();
    }

}
