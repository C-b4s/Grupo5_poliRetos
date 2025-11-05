package src;

import java.util.Scanner;
import src.array.ArrayService;
import src.cadenaCaracteres.CadenaService;
import src.recursividad.OperacionesDatos;
import src.recursividad.recursion;
import src.serieCaracteres.serieCaracteres;
import src.automatas.automatas;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner ingresoDatos = new Scanner(System.in);

        System.out.println("Bienvenido al proyecto realizado por el grupo cinco");
        System.out.println("Los integrantes del grupo son:\n");
        System.out.println("1. Sebastián Zúñiga");
        System.out.println("2. Victoria Torres");
        System.out.println("3. Robinson Tandazo");
        System.out.println("4. Matias Quinchiguano");
        System.out.println("5. Michael Sornoza");
        System.out.println("6. Micaela Sagñay");
       

        ArrayService servicioArray = new ArrayService();
<<<<<<< HEAD
        
        servicioArray.colocarLetrasNombreAleatorioFor("Sebastián Josué Zúñiga Mendoza", 500);
=======

        automatas automatas = new automatas();

>>>>>>> 6e7a6c9c89bd8b022b47047e8af347df4eb48218
        servicioArray.imprimirXConNombre("Sebastián Zúñiga");
        servicioArray.graficarNombre2xWhile("Sebastián");

        System.out.println("Mi nombre es Sebastián Zúñiga");
        System.out.print("Tamaño de la matriz: ");
        int tamanioMatriz = ingresoDatos.nextInt();
        ingresoDatos.nextLine(); // Limpiar el buffer

        System.out.print("Caracter para imprimir las iniciales de mi nombre: ");
        char caracterImpresion = ingresoDatos.nextLine().charAt(0);

        char[][] matrizIniciales = servicioArray.crearMatrizInicialesFor(tamanioMatriz, caracterImpresion);
        System.out.println(" ");

        for (char[] fila : matrizIniciales) {
            System.out.println(new String(fila));
        }

        System.out.println(" ");

        System.out.println("Bienvenido. Por favor, ingrese su nombre:");
        String nombreUsuario = ingresoDatos.nextLine();
        String[] palabrasNombre = nombreUsuario.split(" ");

        System.out.println(
                "Por favor, ingrese los porcentajes asociados a cada palabra de su nombre, separados por espacios:");

        String[] porcentajesStr = ingresoDatos.nextLine().split(" ");
        double[] porcentajes = new double[porcentajesStr.length];

        for (int i = 0; i < porcentajesStr.length; i++) {
            porcentajes[i] = Double.parseDouble(porcentajesStr[i]);
        }

        servicioArray.mostrarPorcentajesDoWhile(palabrasNombre, porcentajes);

        System.out.println("Bienvenido al proyecto realizado por el grupo cinco. Ingrese un texto:");
        String textoIngresado = ingresoDatos.nextLine();
        CadenaService servicio = new CadenaService();
        int cantidadVocales = servicio.contarVocalesFor(textoIngresado);
        System.out.println("La cantidad de vocales en el texto ingresado es: " + cantidadVocales);
        
        System.out.println("El texto en mayúingresoDatosulas sin la letra 'J' es: " + servicio.convertirAMayusSinJDoWhile(textoIngresado));

        System.out.println(
                "El texto en mayúsculas sin la letra 'J' es: " + servicio.convertirAMayusSinJDoWhile(textoIngresado));

        System.out.println("Ingrese una vocal a eliminar del texto:");
        char vocalAEliminar = ingresoDatos.nextLine().charAt(0);
        String textoModificado = servicio.eliminarVocalDoWhile(textoIngresado, vocalAEliminar);
        System.out.println("El texto modificado es: " + textoModificado);

        servicio.adivinarAnagramasWhile(ingresoDatos);

        System.out.println("Por favor, ingrese un texto para alternar entre mayúingresoDatosulas y minúingresoDatosulas: ");
        String textoParaAlternar = ingresoDatos.nextLine();
        String textoAlternado = servicio.alternarMayusYMinusFor(textoParaAlternar);
        System.out.println("El texto con alternancia de mayúingresoDatosulas y minúingresoDatosulas es: " + textoAlternado);

        System.out.println("======== Autómatas y Validaciones ========");
        automatas.automata1(ingresoDatos);
        automatas.automata2(ingresoDatos);
        automatas.automata3(ingresoDatos);
        automatas.automata4(ingresoDatos);
        automatas.validarVariable(ingresoDatos);
        automatas.validarPalabraReservada(ingresoDatos);
        automatas.validarContrasena(ingresoDatos);

        ingresoDatos.close();


        //...
        recursion rec=new recursion();
        OperacionesDatos op = new OperacionesDatos();

        System.out.print("Ingrese el valor de n: ");
        op.setN(ingresoDatos.nextInt());

        System.out.print("Ingrese el valor de a: ");
        op.setA(ingresoDatos.nextInt());

        System.out.print("Ingrese el valor de b: ");
        op.setB(ingresoDatos.nextInt());

        System.out.println("\nFactorial de " + op.getN() + ": " + rec.g5_factorial(op.getN()));
        System.out.println("Suma recursiva de " + op.getA() + " + " + op.getB() + ": " + rec.g5_sumar(op.getA(), op.getB()));
        System.out.println("Multiplicación recursiva de " + op.getA() + " x " + op.getB() + ": " + rec.g5_multiplicar(op.getA(), op.getB()));
        System.out.println("Potencia recursiva de " + op.getA() + "^" + op.getB() + ": " + rec.potencia(op.getA(), op.getB()));

        System.out.println("\nConteo progresivo hasta " + op.getN() + ":");
        rec.contarHasta(op.getN());

        System.out.println("\nConteo regresivo desde " + op.getN() + " hasta 0:");
        rec.contarDesde(op.getN());

        //...
        serieCaracteres caracteres=new serieCaracteres();
        System.out.print("Ingrese la cantidad de elementos n: ");
        int n = ingresoDatos.nextInt();

        System.out.println("\n S1: " + caracteres.g5_generarS1(n));
        System.out.println(" S2: " + caracteres.g5_generarS2(n));
        System.out.println(" S3: " + caracteres.g5_generarS3(n));
        System.out.println(" S4: " + caracteres.g5_generarS4(n));
        System.out.println(" S5: " + caracteres.g5_generarS5(n));
        System.out.println(" S6: " + caracteres.g5_generarS6(n));
        System.out.println(" S7: " + caracteres.g5_generarS7(n));
        System.out.println(" S8: " + caracteres.g5_generarS8(n));
        System.out.println(" S9: " + caracteres.g5_generarS9(n));
        
        // ...
    }
}

        