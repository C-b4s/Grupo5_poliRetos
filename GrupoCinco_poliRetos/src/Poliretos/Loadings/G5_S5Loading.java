package src.Poliretos.Loadings;

public class G5_S5Loading extends DatosLoading{
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
    public void g5_L05_PuntaDinamica_FOR() {
        int pasos = getScanner("L05: Punta Dinámica (>)");
        
        for (int i = 0; i <= pasos; i++) {
            int numLlenas = (int) Math.round((double) i / pasos * getLONGITUD_BARRA());
            char punta = (i % 2 == 0) ? '>' : '=';
            
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
        System.out.println("\nCarga L05 Completa.");
    }
    /*
     * 
     */
    public void g5_L05_PuntaDinamica_WHILE(){
        int pasos = getScanner("L05: Punta Dinámica (>)");
        int i=0;
        while (i<=pasos) {
            int numLlenas = (int) Math.round((double) i / pasos * getLONGITUD_BARRA());
            char punta = (i % 2 == 0) ? '>' : '=';
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
        }
        System.out.println("\nCarga L05 Completa.");
    }
    /*
     * 
     */
        public void g5_L05_PuntaDinamica_DOWHILE(){
        int pasos = getScanner("L05: Punta Dinámica (>)");
        int i=0;
        do {
            int numLlenas = (int) Math.round((double) i / pasos * getLONGITUD_BARRA());
            char punta = (i % 2 == 0) ? '>' : '=';
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
        } while (i<=pasos);
        }

}
