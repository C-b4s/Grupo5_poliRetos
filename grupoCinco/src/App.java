package src;
import java.util.Scanner;
import src.array.ArrayService;
import src.cadenaCaracteres.CadenaService;

public class App {
    public static void main(String[] args) {
        Scanner ingresoDatos = new Scanner(System.in);

        ArrayService servicioArray = new ArrayService();
        
        servicioArray.graficarNombre2XFor("Sebastián Zúñiga");
        System.out.println("Mi nombre es Sebastián Zúñiga");
        System.out.print("Tamaño de la matriz: ");
        int tamanioMatriz = ingresoDatos.nextInt();
        ingresoDatos.nextLine(); // Limpiar el buffer

        System.out.print("Caracter para imprimir las iniciales de mi nombre: ");
        char caracterImpresion = ingresoDatos.nextLine().charAt(0);

        char [] [] matrizIniciales = servicioArray.crearMatrizInicialesFor(tamanioMatriz, caracterImpresion);
        System.out.println(" ");

        for (char [] fila : matrizIniciales){
            System.out.println(new String(fila));
        }

        System.out.println(" ");
        

        System.out.println("Bienvenido. Por favor, ingrese su nombre:");
        String nombreUsuario = ingresoDatos.nextLine();
        String [] palabrasNombre = nombreUsuario.split(" ");

        System.out.println("Por favor, ingrese los porcentajes asociados a cada palabra de su nombre, separados por espacios:");

        String [] porcentajesStr = ingresoDatos.nextLine().split(" ");
        double [] porcentajes = new double [porcentajesStr.length];

        for (int i = 0; i < porcentajesStr.length; i++){
            porcentajes[i] = Double.parseDouble(porcentajesStr[i]);
        }

       

        servicioArray.mostrarPorcentajesDoWhile(palabrasNombre, porcentajes);
        

        System.out.println("Bienvenido al proyecto realizado por el grupo cinco. Ingrese un texto:");
        String textoIngresado = ingresoDatos.nextLine();
        CadenaService servicio = new CadenaService();
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
