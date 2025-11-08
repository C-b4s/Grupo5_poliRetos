package src.Poliretos.Controler;
import java.util.Scanner;
import src.Poliretos.array.ArrayService;
import src.Poliretos.automatas.automatas;
import src.Poliretos.cadenaCaracteres.CadenaService;
import src.Poliretos.recursividad.OperacionesDatos;
import src.Poliretos.serieCaracteres.SeriesCaracteres;
import src.Poliretos.recursividad.g5_Recursividad;

public class Controller {
    public void Inicializar() throws InterruptedException{
        Scanner ingresoDatos = new Scanner(System.in);
    
        System.out.println("¡Bienvenido al proyecto realizado por el grupo cinco!");
        System.out.println("Integrantes del grupo:");
        System.out.println("1. Sebastián Zúñiga");
        System.out.println("2. Victoria Torres");
        System.out.println("3. Andrés Sánchez");
        System.out.println("4. Matías Quinchiguango");
        System.out.println("5. Michael Sotomayor");
        System.out.println("6. Micaela Sajal");
        
        ArrayService servicioArray = new ArrayService();
        servicioArray.colocarLetrasNombreAleatorioFor("Sebastián Josué Zúñiga Mendoza", 500);
        automatas automatas = new automatas();
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

        System.out.println("El texto en mayúsculas sin la letra 'J' es: " + servicio.convertirAMayusSinJDoWhile(textoIngresado));

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


        g5_Recursividad rec=new g5_Recursividad();
        OperacionesDatos op = new OperacionesDatos();

        System.out.print("Ingrese el valor de n: ");
        op.setN(ingresoDatos.nextInt());
        System.out.print("Ingrese el valor de a: ");
        op.setA(ingresoDatos.nextInt());

        System.out.print("Ingrese el valor de b: ");
        op.setB(ingresoDatos.nextInt());

        System.out.println("\n*Factorial de " + op.getN() + " con el buble for: " + rec.g5_factorialFor(op.getN()));
        System.out.println("Factorial de " + op.getN() + " con el buble for: " + rec.g5_factorialWhile(op.getN()));
        System.out.println("Factorial de " + op.getN() + " con el buble do_while: " + rec.g5_factorialDoWhile(op.getN()));

        System.out.println("Suma recursiva de " + op.getA() + " + " + op.getB() + " con el bucle For: " + rec.g5_sumarFor(op.getA(), op.getB()));
        System.out.println("Suma recursiva de " + op.getA() + " + " + op.getB() + " con el bucle While: " + rec.g5_sumarWhile(op.getA(), op.getB()));
        System.out.println("Suma recursiva de " + op.getA() + " + " + op.getB() + " con el bucle Do_While: " + rec.g5_sumarDoWhile(op.getA(), op.getB()));
        
        System.out.println("Multiplicacion recursiva de " + op.getA() + " + " + op.getB() + " con el bucle For: " + rec.g5_multiplicarFor(op.getA(), op.getB()));
        System.out.println("Multiplicacion recursiva de " + op.getA() + " + " + op.getB() + " con el bucle While: " + rec.g5_multiplicarWhile(op.getA(), op.getB()));
        System.out.println("Multiplicacion recursiva de " + op.getA() + " + " + op.getB() + " con el bucle Do_While: " + rec.g5_multiplicarDoWhile(op.getA(), op.getB()));
        

        System.out.println("Potencia recursiva de " + op.getA() + "^" + op.getB() + " con el bucle For: " + rec.potenciaFor(op.getA(), op.getB()));
        System.out.println("Potencia recursiva de " + op.getA() + "^" + op.getB() + " con el bucle While: " + rec.potenciaWhile(op.getA(), op.getB()));
        System.out.println("Potencia recursiva de " + op.getA() + "^" + op.getB() + " con el bucle Do_While: " + rec.potenciaDoWhile(op.getA(), op.getB()));
        
        System.out.println("Conteo progresivo hasta " + op.getN() + " con el bucle for: ");
         rec.contarFor(op.getN());
        System.out.println("Conteo progresivo hasta " + op.getN() +" con el bucle while:");
         rec.contarWhile(op.getN());
        System.out.println("Conteo progresivo hasta " + op.getN() +" con el bucle do_while:");
         rec.contarDoWhile(op.getN());

        System.out.println("Conteo regresivo desde " + op.getN() + " hasta 0 con el bucle for: ");
         rec.contarDesdeFor(op.getN());
         System.out.println("Conteo regresivo desde " + op.getN() + " hasta 0 con el bucle while: ");
         rec.contarDesdeWhile(op.getN());
         System.out.println("Conteo regresivo desde " + op.getN() + " hasta 0 con el bucle do_while: ");
         rec.contarDesdeDoWhile(op.getN());

        //...

        SeriesCaracteres caracteres=new SeriesCaracteres();

        System.out.print("Ingrese la cantidad de elementos n: ");
        int n = ingresoDatos.nextInt();

       
        
        
        // ...


    }
}
