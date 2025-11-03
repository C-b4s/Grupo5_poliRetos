package src.array;

public class ArrayService {
    public void mostrarPorcentajesFor (String [] palabrasNombre, double porcentajes []){        
        for (int i = 0; i < palabrasNombre.length; i++){
            String barraPalabra = generarBarraFor(porcentajes[i]);
            int numLetras = (int) Math.ceil((porcentajes[i]/100) * palabrasNombre[i].length());
            String letrasPalabra = palabrasNombre[i].substring(0,numLetras);
            System.out.printf("%-20s %.0f%% %-20s\n", barraPalabra, porcentajes[i], letrasPalabra);
        }
    }

    private String generarBarraFor (double porcentaje){
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

    public void mostrarPorcentajesWhile(String [] palabrasNombre, double [] porcentajes){
        int i = 0;
        while (i < palabrasNombre.length){
            String barraPalabra = generarBarraWhile(porcentajes[i]);
            int numLetras = (int) Math.ceil((porcentajes[i]/100) * palabrasNombre[i].length());
            String letrasPalabra = palabrasNombre[i].substring(0, numLetras);
            System.out.printf("%-20s %.0f%% %-20s\n", barraPalabra, porcentajes[i], letrasPalabra);
            i++;
        }
    }

    private String generarBarraWhile(double porcentaje) {
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

    public void mostrarPorcentajesDoWhile (String [] palabrasNombre, double [] porcentajes){
        int i = 0;
        do{
            String barraPalabra = generarBarraDoWhile(porcentajes[i]);
            int numLetras = (int) Math.ceil(porcentajes[i]/100 * palabrasNombre[i].length());
            String letrasPalabra = palabrasNombre[i].substring(0, numLetras);
            System.out.printf("%-20s %.0f%% %-20s\n", barraPalabra, porcentajes[i], letrasPalabra);
            i++;
        }while (i < palabrasNombre.length);
    }

    private String generarBarraDoWhile(double porcentaje) {
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
