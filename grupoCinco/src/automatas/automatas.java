package src.automatas;

import java.util.Scanner;

public class automatas {
    public static void main(String[] args) {
        Scanner au = new Scanner(System.in);

        // AUTOMATA 1
        System.out.println("Ingrese una cadena para el automata a*b+c:");
        String cadena1 = au.nextLine();
        if (cadena1.matches("(a*b+c)"))
            System.out.println("La cadena es aceptada por el automata.");
        else
            System.out.println("La cadena no es aceptada por el automata.");

        // AUTOMATA 2
        System.out.println("Ingrese una cadena para el automata ab+ca:");
        String cadena2 = au.nextLine();
        if (cadena2.matches("ab+ca"))
            System.out.println("La cadena es aceptada por el automata.");
        else
            System.out.println("La cadena no es aceptada por el automata.");

        // AUTOMATA 3
        System.out.println("Ingrese una cadena para el automata a+/b+c+:");
        String cadena3 = au.nextLine();
        if (cadena3.matches("(a+/b+c+)"))
            System.out.println("La cadena es aceptada por el automata.");
        else
            System.out.println("La cadena no es aceptada por el automata.");

    }

}
