package src.Poliretos.Loadings;

public class G5_S12Loading extends DatosLoading{

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
    public void g5_L12_DesplazarFigura_FOR() {
        System.out.println("\n--- [LOADING] L12: Desplazar Figura (Ida y Vuelta) ---");
        String figura = "(\u001B[31m>\u001B[0m <)"; 
        int maxDesplazamiento = 15;
        int i = 0;
        boolean ida = true;
        int maxFrames = maxDesplazamiento * 4; 
        for(int frameCount=0;frameCount<maxFrames;frameCount++){ 

            String espacio = " ".repeat(i);
            System.out.print("\r" + " ".repeat(i) + "\\ | /");
            System.out.print("\r" + espacio + figura);
            System.out.print("\r" + espacio + "ooo-(_)-ooo");
            
            esperar(70);
            if (ida) {
                i++;
                if (i >= maxDesplazamiento) {
                    ida = false;
                }
            } else {
                i--;
                if (i <= 0) {
                    ida = true;
                }
            }
        }
        System.out.println("\nCarga L12 Completa.");
    }
     /*
     * 
     */
    public void g5_L12_DesplazarFigura_WHILE() {
        System.out.println("\n--- [LOADING] L12: Desplazar Figura (Ida y Vuelta) ---");
        String figura = "(\u001B[31m>\u001B[0m <)"; 
        int maxDesplazamiento = 15;
        int i = 0;
        boolean ida = true;
        int maxFrames = maxDesplazamiento * 4; 
        int frameCount = 0;
        
        while(frameCount<maxFrames) {
            String espacio = " ".repeat(i);

            System.out.print("\r" + " ".repeat(i) + "\\ | /");
            System.out.print("\r" + espacio + figura);
            System.out.print("\r" + espacio + "ooo-(_)-ooo");
            
            esperar(70);
            if (ida) {
                i++;
                if (i >= maxDesplazamiento) {
                    ida = false;
                }
            } else {
                i--;
                if (i <= 0) {
                    ida = true;
                }
            }
            
            frameCount++;
        };
        
        System.out.println("\nCarga L12 Completa.");
    }
    /*
     * 
     */
    public void g5_L12_DesplazarFigura_DOWHILE() {
        System.out.println("\n--- [LOADING] L12: Desplazar Figura (Ida y Vuelta) ---");
        String figura = "(\u001B[31m>\u001B[0m <)"; 
        int maxDesplazamiento = 15;
        int i = 0;
        boolean ida = true;
        int maxFrames = maxDesplazamiento * 4; 
        int frameCount = 0;
        
        do {
            String espacio = " ".repeat(i);

            System.out.print("\r" + " ".repeat(i) + "\\ | /");
            System.out.print("\r" + espacio + figura);
            System.out.print("\r" + espacio + "ooo-(_)-ooo");
            
            esperar(70);
            if (ida) {
                i++;
                if (i >= maxDesplazamiento) {
                    ida = false;
                }
            } else {
                i--;
                if (i <= 0) {
                    ida = true;
                }
            }
            
            frameCount++;
        } while (frameCount < maxFrames);
        
        System.out.println("\nCarga L12 Completa.");
    }

}
