package src.Poliretos.Loadings;

import java.util.Random;
import java.util.Scanner;

public abstract class DatosLoading {
    private Scanner scanner = new Scanner(System.in);
    private final int LONGITUD_BARRA = 20;
    private final Random random = new Random();

    

    public int getScanner(String simulacion) {
        System.out.println("\n--- [LOADING] " + simulacion + " ---");
        System.out.print("Simulación de carga. Ingrese el número de pasos (ej: 100 para 0% a 100%): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada no válida. Por favor, ingrese un número entero: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public int getLONGITUD_BARRA() {
        return LONGITUD_BARRA;
    }

    public Random getRandom() {
        return random;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
