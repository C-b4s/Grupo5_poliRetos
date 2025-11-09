package src.Poliretos.Loadings;

public class G5_S11Loading extends DatosLoading{
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
    public void g5_L11_BarraSonido_FOR() {
        System.out.println("\n--- [LOADING] L11 (V1): Barras De Sonido Vectorial (0-8) ---");
        int numBarras = 10; 
        int maxIteraciones = 30; 
        for(int i=0; i< maxIteraciones;i++){ 
            System.out.print("\r"); 
            
            
            int[] alturas = new int[numBarras];
            for (int j = 0; j < numBarras; j++) {
                alturas[j] = getRandom().nextInt(9);
            }
            
           
            for (int h = 8; h >= 0; h--) {
                for (int j = 0; j < numBarras; j++) {
                    if (alturas[j] >= h) {
                        System.out.print(" ** "); // Bloque de señal
                    } else {
                        System.out.print("    "); // Espacio vacío
                    }
                }
                System.out.println();
            }
            
            esperar(200); 
        }
        System.out.println("Carga L11 (V1) Completa.");
    }
    /*
     * 
     */
    public void g5_L11_BarraSonido_WHILE() {
        System.out.println("\n--- [LOADING] L11 (V1): Barras De Sonido Vectorial (0-8) ---");
        int numBarras = 10; 
        int i = 0;
        int maxIteraciones = 30; 
        
        while (i < maxIteraciones) {
            System.out.print("\r"); 
            
            
            int[] alturas = new int[numBarras];
            for (int j = 0; j < numBarras; j++) {
                alturas[j] = getRandom().nextInt(9);
            }
            
           
            for (int h = 8; h >= 0; h--) {
                for (int j = 0; j < numBarras; j++) {
                    if (alturas[j] >= h) {
                        System.out.print(" ** "); // Bloque de señal
                    } else {
                        System.out.print("    "); // Espacio vacío
                    }
                }
                System.out.println();
            }
            
            esperar(200); 
            i++;
        }
        System.out.println("Carga L11 (V1) Completa.");
    }
    /*
     * 
     */
    public void g5_L11_BarraSonido_DOWHILE() {
        System.out.println("\n--- [LOADING] L11 (V1): Barras De Sonido Vectorial (0-8) ---");
        int numBarras = 10; 
        int i = 0;
        int maxIteraciones = 30; 
        
        do {
            System.out.print("\r"); 
            
            
            int[] alturas = new int[numBarras];
            for (int j = 0; j < numBarras; j++) {
                alturas[j] = getRandom().nextInt(9);
            }
            
           
            for (int h = 8; h >= 0; h--) {
                for (int j = 0; j < numBarras; j++) {
                    if (alturas[j] >= h) {
                        System.out.print(" ** "); // Bloque de señal
                    } else {
                        System.out.print("    "); // Espacio vacío
                    }
                }
                System.out.println();
            }
            
            esperar(200); 
            i++;
        }while(i<maxIteraciones);
        System.out.println("Carga L11 (V1) Completa.");
    }
}
