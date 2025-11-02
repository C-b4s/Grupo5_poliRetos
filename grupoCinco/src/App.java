package src;
import java.util.Scanner;

import src.cadenasCaracteres.Service;

public class App {
    public static void main(String[] args) {
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("Bienvenido al proyecto realizado por el grupo cinco. Ingrese un texto:");
        String textoIngresado = ingresoDatos.nextLine();
        Service servicio = new Service();
        int cantidadVocales = servicio.contarVocalesFor(textoIngresado);
        System.out.println("La cantidad de vocales en el texto ingresado es: " + cantidadVocales);
        
        System.out.println("El texto en mayúsculas sin la letra 'J' es: " + servicio.convertirAMayusSinJDoWhile(textoIngresado));

        System.out.println("Ingrese una vocal a eliminar del texto:");
        char vocalAEliminar = ingresoDatos.nextLine().charAt(0);
        String textoModificado = servicio.eliminarVocalDoWhile(textoIngresado, vocalAEliminar);
        System.out.println("El texto modificado es: " + textoModificado);

        servicio.adivinarAnagramasWhile(ingresoDatos);

        System.out.println("Por favor, ingrese un texto para alternar entre mayúsculas y minúsculas: ");
        String textoParaAlternar = ingresoDatos.nextLine();
        String textoAlternado = servicio.alternarMayusYMinusFor(textoParaAlternar);
        System.out.println("El texto con alternancia de mayúsculas y minúsculas es: " + textoAlternado);

        ingresoDatos.close();
    }
}
