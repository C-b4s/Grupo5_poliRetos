package src.Poliretos.Loadings;

import java.util.Scanner;

public class G5_S9Loading extends DatosLoading{
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
    public void g5_L09_NombreLetra_FOR() {
        System.out.println("\n--- [LOADING] L09: Nombre Letra a Letra ---");
        System.out.print("Ingrese su Nombre y Apellido: ");
        scanner.nextLine();
        String nombre = scanner.nextLine().trim();
        
        int n = nombre.length();
        
        for (int i = 0; i < n; i++) {
            int porcentaje = (i + 1) * 100 / n;
            
            System.out.print("\r" + nombre.charAt(i) + " " + porcentaje + "%");
            esperar(200);
        }
        System.out.println("\nCarga L09 Completa.");
    }
    /*
     * 
     */
    public void g5_L09_NombreLetra_WHILE() {
        System.out.println("\n--- [LOADING] L09: Nombre Letra a Letra ---");
        System.out.print("Ingrese su Nombre y Apellido: ");
        scanner.nextLine();
        String nombre = scanner.nextLine().trim();
        
        int n = nombre.length();
        int i=0;        
        while(i<n) {
            int porcentaje = (i + 1) * 100 / n;
            
            System.out.print("\r" + nombre.charAt(i) + " " + porcentaje + "%");
            esperar(200);
            i++;
        }
        System.out.println("\nCarga L09 Completa.");
    }
     /*
      * 
      */
    public void g5_L09_NombreLetra_DOWHILE() {
        System.out.println("\n--- [LOADING] L09: Nombre Letra a Letra ---");
        System.out.print("Ingrese su Nombre y Apellido: ");
        scanner.nextLine();
        String nombre = scanner.nextLine().trim();
        
        int n = nombre.length();
        int i=0;        
        do {
            int porcentaje = (i + 1) * 100 / n;
            
            System.out.print("\r" + nombre.charAt(i) + " " + porcentaje + "%");
            esperar(200);
            i++;
        }while(i<n);
        System.out.println("\nCarga L09 Completa.");
    }  

}
