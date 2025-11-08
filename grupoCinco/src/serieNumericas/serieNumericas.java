package src.serieNumericas;

import java.util.Scanner;

public class serieNumericas { 

    private Scanner scanner = new Scanner(System.in);
    
    private int g5_solicitarTerminos(String serie, String ciclo) {
        System.out.println("\n--- [G5] " + serie + " - Ciclo: " + ciclo + " ---");
        System.out.print("Ingrese el número de términos: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada no válida. Por favor, ingrese un número entero: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
    
    public void g5_S1_Fibonacci_FOR() {
        int n = g5_solicitarTerminos("S1: Fibonacci", "FOR");
        long a = 0;
        long b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S1_Fibonacci_WHILE() {
        int n = g5_solicitarTerminos("S1: Fibonacci", "WHILE");
        long a = 0;
        long b = 1;
        int i = 1;
        while (i <= n) {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S1_Fibonacci_DOWHILE() {
        int n = g5_solicitarTerminos("S1: Fibonacci", "DO-WHILE");
        if (n < 1) return;
        long a = 0;
        long b = 1;
        int i = 1;
        do {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }
    
    public void g5_S2_Alternante_FOR() {
        int n = g5_solicitarTerminos("S2: Alternante", "FOR");
        for (int i = 1; i <= n; i++) {
            System.out.print((i % 2 != 0 ? (i * 2 - 1) : 0) + " ");
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S2_Alternante_WHILE() {
        int n = g5_solicitarTerminos("S2: Alternante", "WHILE");
        int i = 1;
        while (i <= n) {
            System.out.print((i % 2 != 0 ? (i * 2 - 1) : 0) + " ");
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S2_Alternante_DOWHILE() {
        int n = g5_solicitarTerminos("S2: Alternante", "DO-WHILE");
        if (n < 1) return;
        int i = 1;
        do {
            System.out.print((i % 2 != 0 ? (i * 2 - 1) : 0) + " ");
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

    public void g5_S3_Fracciones_FOR() {
        int n = g5_solicitarTerminos("S3: Fracciones Impares", "FOR");
        long numA = 0; long numB = 1; int den = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(numA + "/" + den + " ");
            long siguienteFib = numA + numB;
            numA = numB;
            numB = siguienteFib;
            den += 2;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S3_Fracciones_WHILE() {
        int n = g5_solicitarTerminos("S3: Fracciones Impares", "WHILE");
        long numA = 0; long numB = 1; int den = 1;
        int i = 1;
        while (i <= n) {
            System.out.print(numA + "/" + den + " ");
            long siguienteFib = numA + numB;
            numA = numB;
            numB = siguienteFib;
            den += 2;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S3_Fracciones_DOWHILE() {
        int n = g5_solicitarTerminos("S3: Fracciones Impares", "DO-WHILE");
        if (n < 1) return;
        long numA = 0; long numB = 1; int den = 1;
        int i = 1;
        do {
            System.out.print(numA + "/" + den + " ");
            long siguienteFib = numA + numB;
            numA = numB;
            numB = siguienteFib;
            den += 2;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }
    
    public void g5_S4_FraccionesPares_FOR() {
        int n = g5_solicitarTerminos("S4: Fracciones Pares", "FOR");
        long numA = 0; long numB = 1; int den = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(numA + "/" + den + " ");
            long siguienteFib = numA + numB;
            numA = numB;
            numB = siguienteFib;
            den += 2;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S4_FraccionesPares_WHILE() {
        int n = g5_solicitarTerminos("S4: Fracciones Pares", "WHILE");
        long numA = 0; long numB = 1; int den = 2;
        int i = 1;
        while (i <= n) {
            System.out.print(numA + "/" + den + " ");
            long siguienteFib = numA + numB;
            numA = numB;
            numB = siguienteFib;
            den += 2;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S4_FraccionesPares_DOWHILE() {
        int n = g5_solicitarTerminos("S4: Fracciones Pares", "DO-WHILE");
        if (n < 1) return;
        long numA = 0; long numB = 1; int den = 2;
        int i = 1;
        do {
            System.out.print(numA + "/" + den + " ");
            long siguienteFib = numA + numB;
            numA = numB;
            numB = siguienteFib;
            den += 2;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

    private boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void g5_S5_Primos_FOR() {
        int n = g5_solicitarTerminos("S5: Primos", "FOR");
        int count = 0;
        for (int num = 2; count < n; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S5_Primos_WHILE() {
        int n = g5_solicitarTerminos("S5: Primos", "WHILE");
        int count = 0;
        int num = 2;
        while (count < n) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S5_Primos_DOWHILE() {
        int n = g5_solicitarTerminos("S5: Primos", "DO-WHILE");
        if (n < 1) return;
        int count = 0;
        int num = 2;
        do {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        } while (count < n);
        System.out.println("\n----------------------------------");
    }

    public void g5_S6_Cuadrados_FOR() {
        int n = g5_solicitarTerminos("S6: Cuadrados", "FOR");
        for (int i = 1; i <= n; i++) {
            System.out.print((long)i * i + " ");
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S6_Cuadrados_WHILE() {
        int n = g5_solicitarTerminos("S6: Cuadrados", "WHILE");
        int i = 1;
        while (i <= n) {
            System.out.print((long)i * i + " ");
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S6_Cuadrados_DOWHILE() {
        int n = g5_solicitarTerminos("S6: Cuadrados", "DO-WHILE");
        if (n < 1) return;
        int i = 1;
        do {
            System.out.print((long)i * i + " ");
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

    public void g5_S7_Aritmetica3_FOR() {
        int n = g5_solicitarTerminos("S7: Aritmética +3", "FOR");
        int term = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += 3;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S7_Aritmetica3_WHILE() {
        int n = g5_solicitarTerminos("S7: Aritmética +3", "WHILE");
        int term = 1;
        int i = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term += 3;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S7_Aritmetica3_DOWHILE() {
        int n = g5_solicitarTerminos("S7: Aritmética +3", "DO-WHILE");
        if (n < 1) return;
        int term = 1;
        int i = 1;
        do {
            System.out.print(term + " ");
            term += 3;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

    public void g5_S8_Aritmetica5_FOR() {
        int n = g5_solicitarTerminos("S8: Aritmética +5", "FOR");
        int term = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += 5;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S8_Aritmetica5_WHILE() {
        int n = g5_solicitarTerminos("S8: Aritmética +5", "WHILE");
        int term = 3;
        int i = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term += 5;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S8_Aritmetica5_DOWHILE() {
        int n = g5_solicitarTerminos("S8: Aritmética +5", "DO-WHILE");
        if (n < 1) return;
        int term = 3;
        int i = 1;
        do {
            System.out.print(term + " ");
            term += 5;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

    public void g5_S9_Potencias2_FOR() {
        int n = g5_solicitarTerminos("S9: Potencias de 2", "FOR");
        long term = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term *= 2;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S9_Potencias2_WHILE() {
        int n = g5_solicitarTerminos("S9: Potencias de 2", "WHILE");
        long term = 2;
        int i = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term *= 2;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S9_Potencias2_DOWHILE() {
        int n = g5_solicitarTerminos("S9: Potencias de 2", "DO-WHILE");
        if (n < 1) return;
        long term = 2;
        int i = 1;
        do {
            System.out.print(term + " ");
            term *= 2;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

    public void g5_S10_Potencias3_FOR() {
        int n = g5_solicitarTerminos("S10: Potencias de 3", "FOR");
        long term = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term *= 3;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S10_Potencias3_WHILE() {
        int n = g5_solicitarTerminos("S10: Potencias de 3", "WHILE");
        long term = 3;
        int i = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term *= 3;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S10_Potencias3_DOWHILE() {
        int n = g5_solicitarTerminos("S10: Potencias de 3", "DO-WHILE");
        if (n < 1) return;
        long term = 3;
        int i = 1;
        do {
            System.out.print(term + " ");
            term *= 3;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

    public void g5_S11_Aritmetica4_FOR() {
        int n = g5_solicitarTerminos("S11: Aritmética +4", "FOR");
        int term = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += 4;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S11_Aritmetica4_WHILE() {
        int n = g5_solicitarTerminos("S11: Aritmética +4", "WHILE");
        int term = 2;
        int i = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term += 4;
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S11_Aritmetica4_DOWHILE() {
        int n = g5_solicitarTerminos("S11: Aritmética +4", "DO-WHILE");
        if (n < 1) return;
        int term = 2;
        int i = 1;
        do {
            System.out.print(term + " ");
            term += 4;
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

    public void g5_S12_n_n1_FOR() {
        int n = g5_solicitarTerminos("S12: n*(n+1)", "FOR");
        for (int i = 1; i <= n; i++) {
            long term = (long)i * (i + 1);
            System.out.print(term + " ");
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S12_n_n1_WHILE() {
        int n = g5_solicitarTerminos("S12: n*(n+1)", "WHILE");
        int i = 1;
        while (i <= n) {
            long term = (long)i * (i + 1);
            System.out.print(term + " ");
            i++;
        }
        System.out.println("\n----------------------------------");
    }

    public void g5_S12_n_n1_DOWHILE() {
        int n = g5_solicitarTerminos("S12: n*(n+1)", "DO-WHILE");
        if (n < 1) return;
        int i = 1;
        do {
            long term = (long)i * (i + 1);
            System.out.print(term + " ");
            i++;
        } while (i <= n);
        System.out.println("\n----------------------------------");
    }

    public void closeScanner() {
        scanner.close();
    }
}