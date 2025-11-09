package src.Poliretos.Loadings;

public class G5_S4Loading extends DatosLoading{
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
    public void g5_L04_Waiting_For(){
        int maxIteraciones = 40;
        String[] animacion = {"oOo", "ooO", "oOo", "Ooo"};
        if (maxIteraciones < 1) return;
        for(int i=0;i<=maxIteraciones;i++){
            String frame = animacion[i % animacion.length];
            System.out.print("\rWaiting " + frame + " " + (i * 100 / maxIteraciones) + "%");
            esperar(100);
        }
        System.out.println("\nCarga L04 Completa.");
    }
    /*
     * 
     */
    public void g5_L04_Waiting_WHILE(){
        int maxIteraciones = 40;
        String[] animacion = {"oOo", "ooO", "oOo", "Ooo"};
        int i = 0;
        
        if (maxIteraciones < 1) return;
        while (i<=maxIteraciones) {
            String frame = animacion[i % animacion.length];
            System.out.print("\rWaiting " + frame + " " + (i * 100 / maxIteraciones) + "%");
            esperar(100);            
            i++;
        }        
        System.out.println("\nCarga L04 Completa.");
    }

    /*
     * 
     */
    public void g5_L04_Waiting_DOWHILE() {
        int maxIteraciones = 40;
        String[] animacion = {"oOo", "ooO", "oOo", "Ooo"};
        int i = 0;
        
        if (maxIteraciones < 1) return;
        
        do {
            String frame = animacion[i % animacion.length];
            System.out.print("\rWaiting " + frame + " " + (i * 100 / maxIteraciones) + "%");
            esperar(100);
            i++;
        } while (i <= maxIteraciones);
        
        System.out.println("\nCarga L04 Completa.");
    }


}
