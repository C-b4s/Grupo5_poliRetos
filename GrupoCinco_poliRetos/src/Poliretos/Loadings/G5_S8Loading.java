package src.Poliretos.Loadings;

import java.util.Scanner;

public class G5_S8Loading extends DatosLoading{
    Scanner scanner = new Scanner(System.in);

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
    public void g5_L08_CargaPorNombre_FOR() {
        System.out.println("\n--- [LOADING] L08: Carga por Nombre ---");
        System.out.print("Ingrese su Nombre y Apellido (ej: Patricio Ortiz): ");
        scanner.nextLine();
        String nombre = scanner.nextLine().trim();
        int n = nombre.length();
        for(int i=0;i<n;i++){ 
            System.out.print("\r" + nombre.charAt(i) + " " + (i + 1) * 100 / n + "%");
            esperar(150);
        }
        System.out.println("\nCarga L08 Completa.");
    }
    /*
     * 
     */
    public void g5_L08_CargaPorNombre_WHILE() {
        System.out.println("\n--- [LOADING] L08: Carga por Nombre ---");
        System.out.print("Ingrese su Nombre y Apellido (ej: Patricio Ortiz): ");
        scanner.nextLine();
        String nombre = scanner.nextLine().trim();
        
        int n = nombre.length();
        int i = 0;

        while (i < n) {
            
            System.out.print("\r" + nombre.charAt(i) + " " + (i + 1) * 100 / n + "%");
            esperar(150);
            i++;
        }
        System.out.println("\nCarga L08 Completa.");
    }
    /*
     * 
     */
    public void g5_L08_CargaPorNombre_DOWHILE() {
        System.out.println("\n--- [LOADING] L08: Carga por Nombre ---");
        System.out.print("Ingrese su Nombre y Apellido (ej: Patricio Ortiz): ");
        scanner.nextLine();
        String nombre = scanner.nextLine().trim();
        
        int n = nombre.length();
        int i = 0;

        do{ 
            
            System.out.print("\r" + nombre.charAt(i) + " " + (i + 1) * 100 / n + "%");
            esperar(150);
            i++;
        }while(i<n);
        System.out.println("\nCarga L08 Completa.");
    }

}
