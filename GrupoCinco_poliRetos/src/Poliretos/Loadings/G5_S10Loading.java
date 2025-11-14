package src.Poliretos.Loadings;

public class G5_S10Loading extends DatosLoading{
    private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    /*
     * 
     */

    public void g5_L10_CargaArchivo_FOR() {
        System.out.println("\n--- [LOADING] L10: Carga de Archivo ---");
        
        int totalKB = getRandom().nextInt(91) + 10;
        String COLOR_BARRA = "\u001B[42m"; // Fondo Verde
        String COLOR_RESET = "\u001B[0m"; // Resetear color
        
        System.out.println("Downloading ArchivoYar1-win_amd64.whl (" + totalKB + " KB)");
        
        for (int i = 0; i <= totalKB;) {
            String barra = "";
            if (i > 0) {
                int numLlenas = (int) Math.round((double) i / totalKB * getLONGITUD_BARRA());
                barra = "[" + COLOR_BARRA + " ".repeat(numLlenas) + COLOR_RESET + " ".repeat(getLONGITUD_BARRA() - numLlenas) + "]";
            } else {
                barra = "[" + " ".repeat(getLONGITUD_BARRA()) + "]";
            }
            
            System.out.print("\r" + barra + " " + i + " / " + totalKB + " KB");
            
            int increment = getRandom().nextInt(5) + 1;
            i += increment;
            if (i > totalKB) i = totalKB;
            
            esperar(50);
        }
        
        System.out.println("\nCarga L10 Completa.");
    }
    /*
     * 
     */
    public void g5_L10_CargaArchivo_WHILE() {
        System.out.println("\n--- [LOADING] L10: Carga de Archivo ---");
        
        int totalKB = getRandom().nextInt(91) + 10;
        int i = 0;
        
        String COLOR_BARRA = "\u001B[42m"; // Fondo Verde
        String COLOR_RESET = "\u001B[0m"; // Resetear color
        
        System.out.println("Downloading ArchivoYar1-win_amd64.whl (" + totalKB + " KB)");
        
        while (i <= totalKB) {
            String barra = "";
            if (i > 0) {
                 
                int numLlenas = (int) Math.round((double) i / totalKB * getLONGITUD_BARRA());
                barra = "[" + COLOR_BARRA + " ".repeat(numLlenas) + COLOR_RESET + " ".repeat(getLONGITUD_BARRA() - numLlenas) + "]";
            } else {
                barra = "[" + " ".repeat(getLONGITUD_BARRA()) + "]";
            }
            
            System.out.print("\r" + barra + " " + i + " / " + totalKB + " KB");
            
            
            i += getRandom().nextInt(5) + 1; 
            if (i > totalKB) i = totalKB;
            
            esperar(50);
        }
        System.out.println("\nCarga L10 Completa.");
    }
    /*
     * 
     */
    public void g5_L10_CargaArchivo_DOWHILE() {
        System.out.println("\n--- [LOADING] L10: Carga de Archivo ---");
        
        int totalKB = getRandom().nextInt(91) + 10;
        int i = 0;
        
        String COLOR_BARRA = "\u001B[42m"; // Fondo Verde
        String COLOR_RESET = "\u001B[0m"; // Resetear color
        
        System.out.println("Downloading ArchivoYar1-win_amd64.whl (" + totalKB + " KB)");
        
        do{
            String barra = "";
            if (i > 0) {
                 
                int numLlenas = (int) Math.round((double) i / totalKB * getLONGITUD_BARRA());
                barra = "[" + COLOR_BARRA + " ".repeat(numLlenas) + COLOR_RESET + " ".repeat(getLONGITUD_BARRA() - numLlenas) + "]";
            } else {
                barra = "[" + " ".repeat(getLONGITUD_BARRA()) + "]";
            }
            
            System.out.print("\r" + barra + " " + i + " / " + totalKB + " KB");
            
            
            i += getRandom().nextInt(5) + 1; 
            if (i > totalKB) i = totalKB;
            
            esperar(50);
        }while(i<=totalKB);
        System.out.println("\nCarga L10 Completa.");
    }

}
