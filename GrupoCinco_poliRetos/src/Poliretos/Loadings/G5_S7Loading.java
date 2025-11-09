package src.Poliretos.Loadings;

public class G5_S7Loading extends DatosLoading{
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
    public void g5_L07_BarraPuntaRotacional_For() {
    int pasos = getScanner("L07: Barra Punta Rotacional");
        char[] signos = {'\\', '|', '/', '-'};        
        if (pasos < 1) return;

        for(int i=0;i<=pasos;i++){ 
            int numLlenas = (int) Math.round((double) i / pasos * getLONGITUD_BARRA());
            char punta = signos[i % 4];
            
            String llenas = "=".repeat(numLlenas > 0 ? numLlenas - 1 : 0);
            String barra;

            if (i == pasos) {
                barra = "[" + "=".repeat(getLONGITUD_BARRA()) + "]";
            } else {
                barra = "[" + llenas + punta + " ".repeat(getLONGITUD_BARRA() - numLlenas) + "]";
            }
            
            System.out.print("\r" + barra + " " + i + "%");
            esperar(50);
        }
        System.out.println("\nCarga L07 Completa.");
    }

    /*
     * 
     */
   public void g5_L07_BarraPuntaRotacional_WHILE() {
        int pasos = getScanner("L07: Barra Punta Rotacional");
        char[] signos = {'\\', '|', '/', '-'};
        int i = 0;
        
        if (pasos < 1) return;

        while(i<=pasos){ 
            int numLlenas = (int) Math.round((double) i / pasos * getLONGITUD_BARRA());
            char punta = signos[i % 4];
            
            String llenas = "=".repeat(numLlenas > 0 ? numLlenas - 1 : 0);
            String barra;

            if (i == pasos) {
                barra = "[" + "=".repeat(getLONGITUD_BARRA()) + "]";
            } else {
                barra = "[" + llenas + punta + " ".repeat(getLONGITUD_BARRA() - numLlenas) + "]";
            }
            
            System.out.print("\r" + barra + " " + i + "%");
            esperar(50);
            i++;
        };
        
        System.out.println("\nCarga L07 Completa.");
    }

    /*
     * 
     */
    public void g5_L07_BarraPuntaRotacional_DOWHILE() {
        int pasos = getScanner("L07: Barra Punta Rotacional");
        char[] signos = {'\\', '|', '/', '-'};
        int i = 0;
        
        if (pasos < 1) return;

        do {
            int numLlenas = (int) Math.round((double) i / pasos * getLONGITUD_BARRA());
            char punta = signos[i % 4];
            
            String llenas = "=".repeat(numLlenas > 0 ? numLlenas - 1 : 0);
            String barra;

            if (i == pasos) {
                barra = "[" + "=".repeat(getLONGITUD_BARRA()) + "]";
            } else {
                barra = "[" + llenas + punta + " ".repeat(getLONGITUD_BARRA() - numLlenas) + "]";
            }
            
            System.out.print("\r" + barra + " " + i + "%");
            esperar(50);
            i++;
        } while (i <= pasos);
        
        System.out.println("\nCarga L07 Completa.");
    }

}
