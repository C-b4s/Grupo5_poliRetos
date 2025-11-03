package src.array;

import java.util.Arrays;

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

    public char [] [] crearMatrizInicialesFor (int tamIngresado, char caracterUsuario){
        char [] [] matIniciales = new char [tamIngresado][(tamIngresado * 2) + 3];

        for (int i = 0; i < tamIngresado; i++){
            Arrays.fill(matIniciales[i], ' ');
        }

        int mitad = (int) Math.ceil(tamIngresado / 2.0);

        for (int i = 0; i < tamIngresado; i++){
                if (i == 0|| i == mitad - 1 || i == tamIngresado - 1){
                    for (int j = 0; j < tamIngresado; j++){
                        matIniciales [i][j] = caracterUsuario;
                    }
                }else if (i < mitad - 1){

                    matIniciales[i][0] = caracterUsuario;
                
                }else{
                    matIniciales [i][tamIngresado - 1] = caracterUsuario;
                        
                }
        }           
                  
        
        int offset = tamIngresado + 2;

        for (int i = 0; i < tamIngresado; i++){
            
             if (i == 0 || i == tamIngresado - 1){
                    for (int j = 0; j < tamIngresado; j++){
                        matIniciales [i][offset + j] = caracterUsuario;
                    }
            }else{
                matIniciales[i][offset + (tamIngresado - i - 1)] = caracterUsuario;
            }
        }

        return matIniciales;
    }

    public char[][] crearMatrizInicialesWhile(int tamanioMatriz, char caracterImpresion) {
        char[][] matrizIniciales = new char[tamanioMatriz][(tamanioMatriz * 2) + 3];

        int i = 0;
        while (i < tamanioMatriz) {
            Arrays.fill(matrizIniciales[i], ' ');
            i++;
        }

        int mitad = (int) Math.ceil(tamanioMatriz / 2.0);

        i = 0;
        while (i < tamanioMatriz) {
            if (i == 0 || i == mitad - 1 || i == tamanioMatriz - 1) {
                int j = 0;
                while (j < tamanioMatriz) {
                    matrizIniciales[i][j] = caracterImpresion;
                    j++;
                }
            } else if (i < mitad - 1) {
                matrizIniciales[i][0] = caracterImpresion;
            } else {
                matrizIniciales[i][tamanioMatriz - 1] = caracterImpresion;
            }
            i++;
        }

        int offset = tamanioMatriz + 2;

        i = 0;
        while (i < tamanioMatriz) {
            if (i == 0 || i == tamanioMatriz - 1) {
                int j = 0;
                while (j < tamanioMatriz) {
                    matrizIniciales[i][offset + j] = caracterImpresion;
                    j++;
                }
            } else {
                matrizIniciales[i][offset + (tamanioMatriz - i - 1)] = caracterImpresion;
            }
            i++;
        }

        return matrizIniciales;
    }

    public char [] [] crearMatrizInicialesDoWhile (int tamIngresado, char caracterUsuario){
        char [] [] matIniciales = new char [tamIngresado][(tamIngresado * 2) + 3];

        int i = 0;
        do{
            Arrays.fill(matIniciales[i], ' ');
            i++;
        }while (i < tamIngresado);

        int mitad = (int) Math.ceil(tamIngresado / 2.0);

        i = 0;
        do{
            if (i == 0|| i == mitad - 1 || i == tamIngresado - 1){
                int j = 0;
                do{
                    matIniciales [i][j] = caracterUsuario;
                    j++;
                }while (j < tamIngresado);
            }else if (i < mitad - 1){
                matIniciales[i][0] = caracterUsuario;
        
            }else{
                matIniciales [i][tamIngresado - 1] = caracterUsuario;
                    
            }
            i++;
        }while (i < tamIngresado);           
                      
       
        int offset = tamIngresado + 2;

        i = 0;
        do{
             if (i == 0 || i == tamIngresado - 1){
                    int j = 0;
                    do{
                        matIniciales [i][offset + j] = caracterUsuario;
                        j++;
                    }while (j < tamIngresado);
            }else{
                matIniciales[i][offset + (tamIngresado - i - 1)] = caracterUsuario;
            }
            i++;
        }while (i < tamIngresado);

        return matIniciales;
    }

    public void graficarNombre2XFor(String name) {
        if (name == null) name = "";
        
        int[] cps = name.codePoints().toArray();
        String[] letras = new String[cps.length];
        for (int i = 0; i < cps.length; i++) {
            letras[i] = new String(Character.toChars(cps[i]));
        }

        int n = letras.length;
        int height = Math.max(6, n);          
        int ancho = Math.max(20, Math.max(10, n * 3)); 

        plotNameOn2xFor(name, letras, ancho, height);
    }

    private void plotNameOn2xFor(String rawName, String[] letras, int ancho, int height) {
        int n = letras.length;

        int yLabelWidth = Integer.toString(height).length(); 
        int yAxisCol = yLabelWidth + 1; 

        int availableCols = ancho - (yAxisCol + 1); 
        if (availableCols < 1) availableCols = 1;

        double yRealMax = (n == 0) ? 0.0 : 2.0 * n;

        double scaleY = (yRealMax > 0) ? (height / yRealMax) : 1.0;

        int filas = height + 1; 
        int cols = yAxisCol + 1 + availableCols;
        String[][] plano = new String[filas][cols];

        
        for (int r = 0; r < filas; r++) {
            Arrays.fill(plano[r], " ");
        }

        for (int r = 0; r < filas; r++) {
            plano[r][yAxisCol] = "|";
        }
        
        int horizonRow = filas - 1;
        for (int c = yAxisCol; c < cols; c++) {
            plano[horizonRow][c] = "_"; 
        }
        plano[horizonRow][yAxisCol] = "+"; 

        for (int i = 0; i < n; i++) {
            double x = i + 1; 
            double yReal = 2.0 * x;
            
            double yScaled = yReal * scaleY;
            int yInt = (int) Math.round(yScaled); 
            
            int rowIndex = filas - 1 - yInt; 

            
            int colIndex;
            if (n == 1) {
                colIndex = yAxisCol + 1 + (availableCols / 2);
            } else {
                // Espaciado proporcional
                double posFraction = (double) i / (double) (Math.max(1, n - 1));
                colIndex = yAxisCol + 1 + (int) Math.round(posFraction * (availableCols - 1));
            }

            
            if (colIndex <= yAxisCol) colIndex = yAxisCol + 1;
            if (colIndex >= cols) colIndex = cols - 1;

            
            plano[rowIndex][colIndex] = letras[i];
        }

        
        for (int r = 0; r < filas; r++) {
            int yValue = filas - 1 - r; 
            String label = String.format("%" + yLabelWidth + "d ", yValue);
            StringBuilder line = new StringBuilder();
            line.append(label);
            
            for (int c = 0; c < cols; c++) {
                line.append(plano[r][c]);
            }
            System.out.println(line.toString());
        }

        StringBuilder xLabelsPrefix = new StringBuilder();
        for (int i = 0; i < yLabelWidth + 1; i++) xLabelsPrefix.append(" ");
        StringBuilder xLine = new StringBuilder(xLabelsPrefix.toString());
        for (int c = 0; c < cols - (yLabelWidth + 1); c++) xLine.append(" ");
        System.out.println(xLine.toString());
        System.out.println(); 
    }

    public void graficarNombre2XWhile(String name) {
        if (name == null) name = "";
        
        int[] cps = name.codePoints().toArray();
        String[] letras = new String[cps.length];
        int i = 0;
        while (i < cps.length) {
            letras[i] = new String(Character.toChars(cps[i]));
            i++;
        }

        int n = letras.length;
        int height = Math.max(6, n);          
        int ancho = Math.max(20, Math.max(10, n * 3)); 

        plotNameOn2xWhile(name, letras, ancho, height);
    }

    private void plotNameOn2xWhile(String name, String[] letras, int ancho, int height) {
        int n = letras.length;

        int yLabelWidth = Integer.toString(height).length(); 
        int yAxisCol = yLabelWidth + 1; 

        int availableCols = ancho - (yAxisCol + 1); 
        if (availableCols < 1) availableCols = 1;

        double yRealMax = (n == 0) ? 0.0 : 2.0 * n;

        double scaleY = (yRealMax > 0) ? (height / yRealMax) : 1.0;

        int filas = height + 1; 
        int cols = yAxisCol + 1 + availableCols;
        String[][] plano = new String[filas][cols];

        
        int r = 0;
        while (r < filas) {
            Arrays.fill(plano[r], " ");
            r++;
        }

        r = 0;
        while (r < filas) {
            plano[r][yAxisCol] = "|";
            r++;
        }
        
        int horizonRow = filas - 1;
        int c = yAxisCol;
        while (c < cols) {
            plano[horizonRow][c] = "_"; 
            c++;
        }
        plano[horizonRow][yAxisCol] = "+"; 

        int i = 0;
        while (i < n) {
            double x = i + 1; 
            double yReal = 2.0 * x;
            
            double yScaled = yReal * scaleY;
            int yInt = (int) Math.round(yScaled); 
            
            int rowIndex = filas - 1 - yInt; 

            
            int colIndex;
            if (n == 1) {
                colIndex = yAxisCol + 1 + (availableCols / 2);
            } else {
                // Espaciado proporcional
                double posFraction = (double) i / (double) (Math.max(1, n - 1));
                colIndex = yAxisCol + 1 + (int) Math.round(posFraction * (availableCols - 1));
            }

            
            if (colIndex <= yAxisCol) colIndex = yAxisCol + 1;
            if (colIndex >= cols) colIndex = cols - 1;

            
            plano[rowIndex][colIndex] = letras[i];
            i++;
        }
    }

    public void graficarNombre2XDoWhile(String name) {
        if (name == null) name = "";
        
        int[] cps = name.codePoints().toArray();
        String[] letras = new String[cps.length];
        int i = 0;
        do{
            if (i >= cps.length) break;
            letras[i] = new String(Character.toChars(cps[i]));
            i++;
        }while (true);

        int n = letras.length;
        int height = Math.max(6, n);          
        int ancho = Math.max(20, Math.max(10, n * 3)); 

        plotNameOn2xDoWhile(name, letras, ancho, height);
    }

    public void plotNameOn2xDoWhile(String name, String[] letras, int ancho, int height) {
        int n = letras.length;

        int yLabelWidth = Integer.toString(height).length(); 
        int yAxisCol = yLabelWidth + 1; 

        int availableCols = ancho - (yAxisCol + 1); 
        if (availableCols < 1) availableCols = 1;

        double yRealMax = (n == 0) ? 0.0 : 2.0 * n;

        double scaleY = (yRealMax > 0) ? (height / yRealMax) : 1.0;

        int filas = height + 1; 
        int cols = yAxisCol + 1 + availableCols;
        String[][] plano = new String[filas][cols];

        
        int r = 0;
        do{
            if (r >= filas) break;
            Arrays.fill(plano[r], " ");
            r++;
        }while (true);

        r = 0;
        do{
            if (r >= filas) break;
            plano[r][yAxisCol] = "|";
            r++;
        }while (true);
        
        int horizonRow = filas - 1;
        int c = yAxisCol;
        do{
            if (c >= cols) break;
            plano[horizonRow][c] = "_"; 
            c++;
        }while (true);
        plano[horizonRow][yAxisCol] = "+"; 

        int i = 0;
        do{
            if (i >= n) break;
            double x = i + 1; 
            double yReal = 2.0 * x;
            
            double yScaled = yReal * scaleY;
            int yInt = (int) Math.round(yScaled); 
            
            int rowIndex = filas - 1 - yInt; 

            
            int colIndex;
            if (n == 1) {
                colIndex = yAxisCol + 1 + (availableCols / 2);
            } else {
                // Espaciado proporcional
                double posFraction = (double) i / (double) (Math.max(1, n - 1));
                colIndex = yAxisCol + 1 + (int) Math.round(posFraction * (availableCols - 1));
            }

            
            if (colIndex <= yAxisCol) colIndex = yAxisCol + 1;
            if (colIndex >= cols) colIndex = cols - 1;
            plano[rowIndex][colIndex] = letras[i];
            i++;
        }while (true);
    }

}
