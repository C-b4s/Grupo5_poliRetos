package src.Poliretos.Loadings;

public class G5_S1Loading extends DatosLoading{
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
    public void g5_L01_RotacionSimple_FOR() {
        int pasos = getScanner("L01: Rotación |/-\\");
        char[] signos = {'|', '/', '-', '\\'};
        
        for (int i = 0; i <= pasos; i++) {
            int signoIndex = i % 4;
            System.out.print("\rCargando " + signos[signoIndex] + " " + i + "%");
            esperar(50);
        }
        System.out.println("\nCarga L01 Completa.");
    }
    /*
     * 
     */
    public void g5_L01_RotacionSimple_While(){
        int pasos = getScanner("L01:Rotaccion |/-\\");
        char[] signos = {'|', '/', '-', '\\'};
        int i=0;
        while (i<=pasos) {
            int signoIndex= i%4;
            System.out.print("\rCargando " + signos[signoIndex] + " " + i + "%");
            esperar(50);
            i++;
        }
        System.out.println("\nCarga L01 Completa.");
    }
    /*
     * 
     */
    public void g5_L01_RotacionSimple_DoWhile(){
        int pasos = getScanner("L01:Rotaccion |/-\\");
        char[] signos = {'|', '/', '-', '\\'};
        int i=0;
        do {
            int signoIndex= i%4;
            System.out.print("\rCargando " + signos[signoIndex] + " " + i + "%");
            esperar(50);
            i++;
        } while (i<=pasos);
        System.out.println("\nCarga L01 Completa.");
    }
 
}
