package src.Poliretos.Loadings;

public class G5_S6Loading extends DatosLoading{
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
    public void g5_L06_DesplazamientoDoble_FOR() {
        int maxDesplazamiento = getLONGITUD_BARRA() - 3;
        for(int i=0;i<=maxDesplazamiento;i++){
          String inicio = " ".repeat(i);
            String fin = " ".repeat(maxDesplazamiento - i);
            
            String barra = "[" + inicio + "<=>" + fin + "]";
            
            System.out.print("\r" + barra + " " + (i * 100 / maxDesplazamiento) + "%");
            esperar(100);  
        }
        System.out.println("\nCarga L06 Completa.");
    }

    /*
     * 
     */
    public void g5_L06_DesplazamientoDoble_WHILE() {
        int maxDesplazamiento = getLONGITUD_BARRA() - 3;
        int i = 0;

        while (i <= maxDesplazamiento) {
            String inicio = " ".repeat(i);
            String fin = " ".repeat(maxDesplazamiento - i);
            
            String barra = "[" + inicio + "<=>" + fin + "]";
            
            System.out.print("\r" + barra + " " + (i * 100 / maxDesplazamiento) + "%");
            esperar(100);
            i++;
        }
        System.out.println("\nCarga L06 Completa.");
    }
    /*
     * 
     */
    public void g5_L06_DesplazamientoDoble_DOWHILE() {
        int maxDesplazamiento = getLONGITUD_BARRA() - 3;
        int i = 0;
        do{ 
            String inicio = " ".repeat(i);
            String fin = " ".repeat(maxDesplazamiento - i);
            
            String barra = "[" + inicio + "<=>" + fin + "]";
            
            System.out.print("\r" + barra + " " + (i * 100 / maxDesplazamiento) + "%");
            esperar(100);
            i++;
        }while(i<=maxDesplazamiento);
        System.out.println("\nCarga L06 Completa.");
    }

}
