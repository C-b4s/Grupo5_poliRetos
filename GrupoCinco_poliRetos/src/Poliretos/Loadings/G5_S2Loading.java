package src.Poliretos.Loadings;

public class G5_S2Loading extends DatosLoading{
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
    public void g5_L02_BarraFija_For(){
        int pasos = getScanner("L02: Barra Fija (#)");
        for(int i=0; i<=pasos; i++){
            int numBarras = (int) Math.round((double) i / pasos * getLONGITUD_BARRA());
            String barra = "[" + "#".repeat(numBarras) + " ".repeat(getLONGITUD_BARRA() - numBarras) + "]";
            System.out.print("\r" + barra + " " + i + "%");
            esperar(20);
        }
        System.out.println("\nCarga L02 Completa.");
    }
    /*
     * 
     */
    public void g5_L02_BarraFija_WHILE() {
        int pasos = getScanner("L02: Barra Fija (#)");
        int i = 0;
        
        while (i <= pasos) {
            int numBarras = (int) Math.round((double) i / pasos * getLONGITUD_BARRA());
            String barra = "[" + "#".repeat(numBarras) + " ".repeat(getLONGITUD_BARRA() - numBarras) + "]";
            System.out.print("\r" + barra + " " + i + "%");
            esperar(20);
            i++;
        }
        System.out.println("\nCarga L02 Completa.");
    }
    /*
     * 
     */
    public void g5_L02_BarraFija_DoWHILE(){
        int pasos = getScanner("L02: Barra Fija (#)");
        int i = 0;
        do {
            int numBarras = (int) Math.round((double) i / pasos * getLONGITUD_BARRA());
            String barra = "[" + "#".repeat(numBarras) + " ".repeat(getLONGITUD_BARRA() - numBarras) + "]";
            System.out.print("\r" + barra + " " + i + "%");
            esperar(20);
            i++;
        } while (i<=pasos);
        System.out.println("\nCarga L02 Completa.");
    }
    
}
