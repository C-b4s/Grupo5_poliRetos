package src.Poliretos.Loadings;

public class G5_S3Loading extends DatosLoading {
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
    public void g5_L03_DesplazamientoSimple_FOR() {
        int pasos = getLONGITUD_BARRA();
        
        for (int i = 0; i <= pasos; i++) {
            String espacioInicial = " ".repeat(i);
            String espacioFinal = " ".repeat(getLONGITUD_BARRA() - i);
            String barra;
            
            if (i == getLONGITUD_BARRA()) {
                barra = "[" + espacioInicial + "X]"; 
            } else {
                barra = "[" + espacioInicial + "*" + espacioFinal + "]";
            }
            System.out.print("\r" + barra + " " + (i * 100 / getLONGITUD_BARRA()) + "%");
            esperar(80);
        }
        System.out.println("\nCarga L03 Completa.");
    }
    /*
     * 
     */
    public void g5_L03_DesplazamientoSimple_WHILE(){
        int pasos =getLONGITUD_BARRA();
        int i=0;
        while (i<=pasos) {
           String espacioInicial = " ".repeat(i);
            String espacioFinal = " ".repeat(getLONGITUD_BARRA() - i);
            String barra;
            
            if (i == getLONGITUD_BARRA()) {
                barra = "[" + espacioInicial + "X]"; 
            } else {
                barra = "[" + espacioInicial + "*" + espacioFinal + "]";
            }
            System.out.print("\r" + barra + " " + (i * 100 / getLONGITUD_BARRA()) + "%");
            esperar(80);
            i++; 
        }
        System.out.println("\nCarga L03 Completa.");
    }
    /*
     * 
     */
    public void g5_L03_DesplazamientoSimple_DoWHILE(){
         int pasos =getLONGITUD_BARRA();
        int i=0;
        do {
            String espacioInicial = " ".repeat(i);
            String espacioFinal = " ".repeat(getLONGITUD_BARRA() - i);
            String barra;
            
            if (i == getLONGITUD_BARRA()) {
                barra = "[" + espacioInicial + "X]"; 
            } else {
                barra = "[" + espacioInicial + "*" + espacioFinal + "]";
            }
            System.out.print("\r" + barra + " " + (i * 100 / getLONGITUD_BARRA()) + "%");
            esperar(80);
            i++;
        } while (i<=pasos);
        System.out.println("\nCarga L03 Completa.");
    }

}
