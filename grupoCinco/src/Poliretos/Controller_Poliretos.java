package src.Poliretos;
import java.util.Scanner;
import src.Poliretos.array.ArrayService;
import src.Poliretos.automatas.automatas;
import src.Poliretos.cadenaCaracteres.CadenaService;
import src.Poliretos.recursividad.g5_ContadorRegresivo;
import src.Poliretos.recursividad.gr5_Factorial;
import src.Poliretos.recursividad.gr5_Multiplicacion;
import src.Poliretos.recursividad.gr5_Sumar;
import src.Poliretos.recursividad.gr5_Potencia;
import src.Poliretos.recursividad.gr5_ContadorProgresivo;
import src.Poliretos.serieCaracteres.g5_S1serie;
import src.Poliretos.serieCaracteres.g5_S2serie;
import src.Poliretos.serieCaracteres.g5_S3serie;
import src.Poliretos.serieCaracteres.g5_S4serie;
import src.Poliretos.serieCaracteres.g5_S5serie;
import src.Poliretos.serieCaracteres.g5_S6serie;
import src.Poliretos.serieCaracteres.g5_S7serie;
import src.Poliretos.serieCaracteres.g5_S8serie;
import src.Poliretos.serieCaracteres.g5_S9serie;

public class Controller_Poliretos {
    public void Inicializar() throws InterruptedException{
        Scanner ingresoDatos = new Scanner(System.in);
        g5_ContadorRegresivo reg = new g5_ContadorRegresivo();
        gr5_Factorial fact = new gr5_Factorial();
        gr5_Multiplicacion mul= new gr5_Multiplicacion();
        gr5_Sumar sum =new gr5_Sumar();
        gr5_Potencia pot =new gr5_Potencia();
        gr5_ContadorProgresivo prog =new gr5_ContadorProgresivo();
        g5_S1serie s1 =new g5_S1serie();
        g5_S2serie s2 =new g5_S2serie();
        g5_S3serie s3 =new g5_S3serie();
        g5_S4serie s4=new g5_S4serie();
        g5_S5serie s5 =new g5_S5serie();
        g5_S6serie s6 =new g5_S6serie();
        g5_S7serie s7= new g5_S7serie();
        g5_S8serie s8=new g5_S8serie();
        g5_S9serie s9=new g5_S9serie();

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
        
        System.out.print("Ingrese el valor de n: ");
        int n= ingresoDatos.nextInt();
        System.out.print("Ingrese el valor de a: ");
        int a= ingresoDatos.nextInt();
        System.out.print("Ingrese el valor de b: ");
        int b= ingresoDatos.nextInt();

        System.out.println("\n*Factorial de " + n + " con el bucle for: " + fact.g5_factorialFor(n));
        System.out.println("Factorial de " + n + " con el bucle while: " + fact.g5_factorialWhile(n));
        System.out.println("Factorial de " + n + " con el bucle do_while: " + fact.g5_factorialDoWhile(n));

        System.out.println("Suma recursiva de " + a + " + " + b + " con el bucle for: " + sum.g5_sumarFor(a, b));
        System.out.println("Suma recursiva de " + a + " + " + b + " con el bucle while: " + sum.g5_sumarWhile(a, b));
        System.out.println("Suma recursiva de " + a + " + " + b + " con el bucle do_while: " + sum.g5_sumarDoWhile(a, b));

        System.out.println("Multiplicación recursiva de " + a + " * " + b + " con el bucle for: " + mul.g5_multiplicarFor(a, b));
        System.out.println("Multiplicación recursiva de " + a + " * " + b + " con el bucle while: " + mul.g5_multiplicarWhile(a, b));
        System.out.println("Multiplicación recursiva de " + a + " * " + b + " con el bucle do_while: " + mul.g5_multiplicarDoWhile(a, b));

        System.out.println("Potencia recursiva de " + a + "^" + b + " con el bucle for: " + pot.potenciaFor(a, b));
        System.out.println("Potencia recursiva de " + a + "^" + b + " con el bucle while: " + pot.potenciaWhile(a, b));
        System.out.println("Potencia recursiva de " + a + "^" + b + " con el bucle do_while: " + pot.potenciaDoWhile(a, b));

        System.out.println("Conteo progresivo hasta " + n + " con el bucle for:");
        prog.contarFor(n);
        System.out.println("Conteo progresivo hasta " + n + " con el bucle while:");
        prog.contarWhile(n);
        System.out.println("Conteo progresivo hasta " + n + " con el bucle do_while:");
        prog.contarDoWhile(n);

        System.out.println("Conteo regresivo desde " + n + " hasta 0 con el bucle for:");
        reg.contarDesdeFor(n);
        System.out.println("Conteo regresivo desde " + n + " hasta 0 con el bucle while:");
        reg.contarDesdeWhile(n);
        System.out.println("Conteo regresivo desde " + n + " hasta 0 con el bucle do_while:");
         reg.contarDesdeDoWhile(n);
        //...


        System.out.print("Ingrese la cantidad de elementos n: ");
        int n2 = ingresoDatos.nextInt();

       System.out.println("===== Impresión de series =====");
        System.out.println("Serie S1 con el bucle For :" + s1.g5_generarS1_for(n2));
        System.out.println("Serie S1 con el bucle While:" + s1.g5_generarS1_while(n2));
        System.out.println("Serie S1 con el bucle Do_While:" + s1.g5_generarS1_doWhile(n2));

        System.out.println("Serie S2 con el bucle For :" + s2.g5_generarS2_for(n2));
        System.out.println("Serie S2 con el bucle While:" + s2.g5_generarS2_while(n2));
        System.out.println("Serie S2 con el bucle Do_While:" + s2.g5_generarS2_doWhile(n2));

        System.out.println("Serie S2 con el bucle For :" + s3.g5_generarS3_for(n2));
        System.out.println("Serie S2 con el bucle While:" + s3.g5_generarS3_while(n2));
        System.out.println("Serie S2 con el bucle Do_While:" + s3.g5_generarS3_doWhile(n2));

        System.out.println("Serie S4 con el bucle For :" + s4.g5_generarS4_for(n2));
        System.out.println("Serie S4 con el bucle While:" + s4.g5_generarS4_while(n2));
        System.out.println("Serie S4 con el bucle Do_While:" + s4.g5_generarS4_doWhile(n2));

        System.out.println("Serie S5 con el bucle For :" + s5.g5_generarS5_for(n2));
        System.out.println("Serie S5 con el bucle While:" + s5.g5_generarS5_while(n2));
        System.out.println("Serie S5 con el bucle Do_While:" + s5.g5_generarS5_doWhile(n2));

        System.out.println("Serie S6 con el bucle For :" + s6.g5_generarS6_for(n2));
        System.out.println("Serie S6 con el bucle While:" + s6.g5_generarS6_while(n2));
        System.out.println("Serie S6 con el bucle Do_While:" + s6.g5_generarS6_doWhile(n2));

        System.out.println("Serie S7 con el bucle For :" + s7.g5_generarS7_for(n2));
        System.out.println("Serie S7 con el bucle While:" + s7.g5_generarS7_while(n2));
        System.out.println("Serie S7 con el bucle Do_While:" + s7.g5_generarS7_doWhile(n2));

        System.out.println("Serie S8 con el bucle For :" + s8.g5_generarS8_for(n2));
        System.out.println("Serie S8 con el bucle While:" + s8.g5_generarS8_while(n2));
        System.out.println("Serie S8 con el bucle Do_While:" + s8.g5_generarS8_doWhile(n2));

        System.out.println("Serie S9 con el bucle For :" + s9.g5_generarS9_for(n2));
        System.out.println("Serie S9 con el bucle While:" + s9.g5_generarS9_while(n2));
        System.out.println("Serie S9 con el bucle Do_While:" + s9.g5_generarS9_doWhile(n2));

        // ...


    }
}
