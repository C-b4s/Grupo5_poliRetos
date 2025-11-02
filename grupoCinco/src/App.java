package src;
import java.util.Scanner;

import src.cadenasCaracteres.Service;

public class App {
    public static void main(String[] args) {
        Scanner ingresoDatos = new Scanner(System.in, "UTF-8");
        System.out.println("Bienvenido al proyecto realizado por el grupo cinco. Ingrese un texto:");
        String textoIngresado = ingresoDatos.nextLine();
        Service servicio = new Service();
        int cantidadVocales = servicio.contarVocalesFor(textoIngresado);
        System.out.println("La cantidad de vocales en el texto ingresado es: " + cantidadVocales);
        

        System.out.println("Ingrese una vocal a eliminar del texto:");
        char vocalAEliminar = ingresoDatos.nextLine().charAt(0);
        String textoModificado = servicio.eliminarVocalDoWhile(textoIngresado, vocalAEliminar);
        System.out.println("El texto modificado es: " + textoModificado);

        ingresoDatos.close();
    }
}
