package src.Loading;
import java.util.Scanner;
import java.util.Random;

public class loading { 

    private Scanner scanner = new Scanner(System.in);
    private final int LONGITUD_BARRA = 20;
    private final Random random = new Random();

    

    private int solicitarNivelInicial(String simulacion) {
        System.out.println("\n--- [LOADING] " + simulacion + " ---");
        System.out.print("Simulación de carga. Ingrese el número de pasos (ej: 100 para 0% a 100%): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada no válida. Por favor, ingrese un número entero: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    

    public void g5_L01_RotacionSimple_FOR() {
        int pasos = solicitarNivelInicial("L01: Rotación |/-\\");
        char[] signos = {'|', '/', '-', '\\'};
        
        for (int i = 0; i <= pasos; i++) {
            int signoIndex = i % 4;
            System.out.print("\rCargando " + signos[signoIndex] + " " + i + "%");
            esperar(50);
        }
        System.out.println("\nCarga L01 Completa.");
    }

    public void g5_L02_BarraFija_WHILE() {
        int pasos = solicitarNivelInicial("L02: Barra Fija (#)");
        int i = 0;
        
        while (i <= pasos) {
            int numBarras = (int) Math.round((double) i / pasos * LONGITUD_BARRA);
            String barra = "[" + "#".repeat(numBarras) + " ".repeat(LONGITUD_BARRA - numBarras) + "]";
            System.out.print("\r" + barra + " " + i + "%");
            esperar(20);
            i++;
        }
        System.out.println("\nCarga L02 Completa.");
    }

    public void g5_L03_DesplazamientoSimple_FOR() {
        int pasos = LONGITUD_BARRA;
        
        for (int i = 0; i <= pasos; i++) {
            String espacioInicial = " ".repeat(i);
            String espacioFinal = " ".repeat(LONGITUD_BARRA - i);
            String barra;
            
            if (i == LONGITUD_BARRA) {
                barra = "[" + espacioInicial + "X]"; 
            } else {
                barra = "[" + espacioInicial + "*" + espacioFinal + "]";
            }
            System.out.print("\r" + barra + " " + (i * 100 / LONGITUD_BARRA) + "%");
            esperar(80);
        }
        System.out.println("\nCarga L03 Completa.");
    }
    
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

    public void g5_L05_PuntaDinamica_FOR() {
        int pasos = solicitarNivelInicial("L05: Punta Dinámica (>)");
        
        for (int i = 0; i <= pasos; i++) {
            int numLlenas = (int) Math.round((double) i / pasos * LONGITUD_BARRA);
            char punta = (i % 2 == 0) ? '>' : '=';
            
            String llenas = "=".repeat(numLlenas > 0 ? numLlenas - 1 : 0);
            String barra;

            if (i == pasos) {
                barra = "[" + "=".repeat(LONGITUD_BARRA) + "]";
            } else {
                barra = "[" + llenas + punta + " ".repeat(LONGITUD_BARRA - numLlenas) + "]";
            }
            
            System.out.print("\r" + barra + " " + i + "%");
            esperar(50);
        }
        System.out.println("\nCarga L05 Completa.");
    }

    public void g5_L06_DesplazamientoDoble_WHILE() {
        int maxDesplazamiento = LONGITUD_BARRA - 3;
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

    public void g5_L07_BarraPuntaRotacional_DOWHILE() {
        int pasos = solicitarNivelInicial("L07: Barra Punta Rotacional");
        char[] signos = {'\\', '|', '/', '-'};
        int i = 0;
        
        if (pasos < 1) return;

        do {
            int numLlenas = (int) Math.round((double) i / pasos * LONGITUD_BARRA);
            char punta = signos[i % 4];
            
            String llenas = "=".repeat(numLlenas > 0 ? numLlenas - 1 : 0);
            String barra;

            if (i == pasos) {
                barra = "[" + "=".repeat(LONGITUD_BARRA) + "]";
            } else {
                barra = "[" + llenas + punta + " ".repeat(LONGITUD_BARRA - numLlenas) + "]";
            }
            
            System.out.print("\r" + barra + " " + i + "%");
            esperar(50);
            i++;
        } while (i <= pasos);
        
        System.out.println("\nCarga L07 Completa.");
    }

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

   
    public void g5_L10_CargaArchivo_WHILE() {
        System.out.println("\n--- [LOADING] L10: Carga de Archivo ---");
        
      
        int totalKB = random.nextInt(91) + 10;
        int i = 0;
        
        
        String COLOR_BARRA = "\u001B[42m"; // Fondo Verde
        String COLOR_RESET = "\u001B[0m"; // Resetear color
        
        System.out.println("Downloading ArchivoYar1-win_amd64.whl (" + totalKB + " KB)");
        
        while (i <= totalKB) {
            String barra = "";
            if (i > 0) {
                 
                int numLlenas = (int) Math.round((double) i / totalKB * LONGITUD_BARRA);
                barra = "[" + COLOR_BARRA + " ".repeat(numLlenas) + COLOR_RESET + " ".repeat(LONGITUD_BARRA - numLlenas) + "]";
            } else {
                barra = "[" + " ".repeat(LONGITUD_BARRA) + "]";
            }
            
            System.out.print("\r" + barra + " " + i + " / " + totalKB + " KB");
            
            
            i += random.nextInt(5) + 1; 
            if (i > totalKB) i = totalKB;
            
            esperar(50);
        }
        
        System.out.println("\nCarga L10 Completa.");
    }

    public void g5_L11_BarraSonido_WHILE() {
        System.out.println("\n--- [LOADING] L11 (V1): Barras De Sonido Vectorial (0-8) ---");
        int numBarras = 10; 
        int i = 0;
        int maxIteraciones = 30; 
        
        while (i < maxIteraciones) {
            System.out.print("\r"); 
            
            
            int[] alturas = new int[numBarras];
            for (int j = 0; j < numBarras; j++) {
                alturas[j] = random.nextInt(9);
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

   
    public void g5_L11_SeñalSimetrica_FOR() {
        System.out.println("\n--- [LOADING] L11 (V2): Señal Simétrica (Eje Central) ---");
        int niveles = 10;
        
        for (int i = 0; i < niveles; i++) {
            
            int longitud = random.nextInt(11);
            
            String guiones = "-".repeat(longitud);
            
            
            String barra = guiones + " | " + guiones;
            
            System.out.println(barra);
            esperar(100);
        }
        System.out.println("Carga L11 (V2) Completa.");
    }
    
   
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


   
    public void closeScanner() {
        scanner.close();
    }
}
