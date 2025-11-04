package src.automatas;

import java.util.Scanner;

public class automatas {

    public static void automata1(Scanner sc) {
        System.out.println("Ingrese una cadena para el autómata a*b+c:");
        String cadena = sc.nextLine();
        if (cadena.matches("a*b+c"))
            System.out.println("La cadena es aceptada por el autómata.");
        else
            System.out.println("La cadena no es aceptada por el autómata.");
    }

    public static void automata2(Scanner sc) {
        System.out.println("Ingrese una cadena para el autómata ab+ca:");
        String cadena = sc.nextLine();
        if (cadena.matches("ab+ca"))
            System.out.println("La cadena es aceptada por el autómata.");
        else
            System.out.println("La cadena no es aceptada por el autómata.");
    }

    public static void automata3(Scanner sc) {
        System.out.println("Ingrese una cadena para el autómata a+/b+/c+:");
        String cadena = sc.nextLine();
        if (cadena.matches("(a+|b+|c+)"))
            System.out.println("La cadena es aceptada por el autómata.");
        else
            System.out.println("La cadena no es aceptada por el autómata.");
    }

    public static void automata4(Scanner sc) {
        System.out.println("Ingrese una cadena para el autómata 1+/0+1*:");
        String cadena = sc.nextLine();
        if (cadena.matches("(1+|0+1*)"))
            System.out.println("La cadena es aceptada por el autómata.");
        else
            System.out.println("La cadena no es aceptada por el autómata.");
    }

    public static void validarVariable(Scanner sc) {
        System.out.println("Ingrese una cadena para validar si es una variable válida:");
        String var = sc.nextLine();
        if (var.matches("[a-zA-Z_][a-zA-Z0-9_]*"))
            System.out.println("La variable es válida.");
        else
            System.out.println("La variable no es válida.");
    }

    public static void validarPalabraReservada(Scanner sc) {
        System.out.println("Ingrese una palabra para validar si es reservada:");
        String palabra = sc.nextLine();
        if (palabra.matches("(if|else|ifelse|for|foreach)"))
            System.out.println("Es una palabra reservada.");
        else
            System.out.println("No es una palabra reservada.");
    }

    public static void validarContrasena(Scanner sc) {
        System.out.println("Ingrese una contraseña:");
        String contrasena = sc.nextLine();

        boolean mayus = contrasena.matches(".*[A-Z].*");
        boolean minus = contrasena.matches(".*[a-z].*");
        boolean num = contrasena.matches(".*[0-9].*");
        boolean esp = contrasena.matches(".*[^a-zA-Z0-9].*");
        boolean longitud = contrasena.length() >= 8;

        if (mayus && minus && num && esp && longitud)
            System.out.println("La contraseña es válida y segura.");
        else
            System.out.println("La contraseña no cumple los requisitos.");
    }
}
