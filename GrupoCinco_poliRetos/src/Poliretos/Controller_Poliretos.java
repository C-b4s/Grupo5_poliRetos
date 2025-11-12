package src.Poliretos;

import java.text.Normalizer;
import java.util.InputMismatchException;
import java.util.Scanner;

import src.Poliretos.Figuras.G5_S10Figuras;
import src.Poliretos.Figuras.G5_S11Figuras;
import src.Poliretos.Figuras.G5_S12Figuras;
import src.Poliretos.Figuras.G5_S13Figuras;
import src.Poliretos.Figuras.G5_S14Figuras;
import src.Poliretos.Figuras.G5_S15Figuras;
import src.Poliretos.Figuras.G5_S16Figuras;
import src.Poliretos.Figuras.G5_S17Figuras;
import src.Poliretos.Figuras.G5_S18Figuras;
import src.Poliretos.Figuras.G5_S19Figuras;
import src.Poliretos.Figuras.G5_S1Figuras;
import src.Poliretos.Figuras.G5_S2Figuras;
import src.Poliretos.Figuras.G5_S3Figuras;
import src.Poliretos.Figuras.G5_S4Figuras;
import src.Poliretos.Figuras.G5_S5Figuras;
import src.Poliretos.Figuras.G5_S6Figuras;
import src.Poliretos.Figuras.G5_S7Figuras;
import src.Poliretos.Figuras.G5_S8Figuras;
import src.Poliretos.Figuras.G5_S9Figuras;
import src.Poliretos.array.G5_colocarLetrasNombreAleatorio;
import src.Poliretos.array.G5_crearMatrizIniciales;
import src.Poliretos.array.G5_graficarNombre2x;
import src.Poliretos.array.G5_imprimirXConNombre;
import src.Poliretos.array.G5_mostrarNombresConPorcentajes;
import src.Poliretos.cadenaCaracteres.G5_adivinarAnagramas;
import src.Poliretos.cadenaCaracteres.G5_alternarMayusYMinus;
import src.Poliretos.cadenaCaracteres.G5_contarConsonantes;
import src.Poliretos.cadenaCaracteres.G5_contarVocales;
import src.Poliretos.cadenaCaracteres.G5_convertirAMayusSinJ;
import src.Poliretos.cadenaCaracteres.G5_eliminarConsonante;
import src.Poliretos.cadenaCaracteres.G5_eliminarVocal;
import src.Poliretos.cadenaCaracteres.G5_invertirConConsonantesEnMayus;
import src.Poliretos.cadenaCaracteres.G5_invertirConVocalesEnMayus;
import src.Poliretos.automatas.automatas1.Aut1;
import src.Poliretos.automatas.automatas2.Aut2;
import src.Poliretos.automatas.automatas3.Aut3;
import src.Poliretos.automatas.automatas4.Aut4;
import src.Poliretos.automatas.compiladorDecimal.Compi1;
import src.Poliretos.automatas.compiladorLenguaje.Compi2;
import src.Poliretos.automatas.compiladorVariable.Compi3;
import src.Poliretos.automatas.validadorClave.Compi4;
import src.Poliretos.recursividad.G5_Factorial;
import src.Poliretos.recursividad.G5_Sumar;
import src.Poliretos.recursividad.G5_Multiplicacion;
import src.Poliretos.recursividad.G5_ContadorRegresivo;
import src.Poliretos.recursividad.G5_ContadorProgresivo;
import src.Poliretos.recursividad.G5_Potencia;
import src.Poliretos.serieCaracteres.G5_S10serie;
import src.Poliretos.serieCaracteres.G5_S1serie;
import src.Poliretos.serieCaracteres.G5_S2serie;
import src.Poliretos.serieCaracteres.G5_S3serie;
import src.Poliretos.serieCaracteres.G5_S4serie;
import src.Poliretos.serieCaracteres.G5_S5serie;
import src.Poliretos.serieCaracteres.G5_S6serie;
import src.Poliretos.serieCaracteres.G5_S7serie;
import src.Poliretos.serieCaracteres.G5_S8serie;
import src.Poliretos.serieCaracteres.G5_S9serie;
import src.Poliretos.Loadings.G5_S1Loading;
import src.Poliretos.Loadings.G5_S2Loading;
import src.Poliretos.Loadings.G5_S3Loading;
import src.Poliretos.Loadings.G5_S4Loading;
import src.Poliretos.Loadings.G5_S5Loading;
import src.Poliretos.Loadings.G5_S6Loading;
import src.Poliretos.Loadings.G5_S7Loading;
import src.Poliretos.Loadings.G5_S8Loading;
import src.Poliretos.Loadings.G5_S9Loading;
import src.Poliretos.Loadings.G5_S10Loading;
import src.Poliretos.Loadings.G5_S11Loading;
import src.Poliretos.Loadings.G5_S12Loading;

public class Controller_Poliretos {
    public final String ROJO = "\u001B[31m";
    public final String RESET = "\u001B[0m";
    public final String VERDE = "\u001B[32m";
    Scanner ingresoDatos = new Scanner(System.in);


    Integer operaciones;

    public void inicializar() throws InterruptedException {
        try {
            ingresoDatos = new Scanner(System.in);
            int opcionGeneral = 0, continuar = 0, seguirOperaciones = 0, opcBucles = 0,
                    seleccionPolireto = 0, numero = 0;
            String otroBucle = " ", otraOperacion = " ";

            String[] opcMenuPrincipal = { "1. Ver integrantes del grupo", "2. Ingresar al menú de operaciones",
                    "3. Salir" };
            String[] secciones = { "1. Series numericas", "2. Series de caracteres", "3. Figuras",
                    "4. Cadenas de caracteres", "5. Arrays", "6. Loading", "7. Recursion", "8. Grafos y automatas" };
            String[] integrantes = { "1. Matias Quinchiguano", "2. Micaela Sagñay", "3. Michael Sotomayor",
                    "4. Robbinson Tandazo", "5. Victoria Torres", "6. Sebastián Zúñiga" };
            String[] opcMenuPoliretos = { "1.-Seleccionar Metodo a usar", "2.-Salir al menú de operaciones" };
            String[] bucles = { "1.-FOR", "2.-WHILE", "3.-DO WHILE" };
            String[] cantidadFig = { "Seleccionar: ", "1", "2", "3", ".", ".", ".", "18", "19" };
            String[] menuAutomatasCompiladores = { "1. Autómata a*b+c", "2. Autómata ab+ca", "3. Autómata a+|b+|c+",
                    "4. Autómata (ab|bc)+ ", "5. Compilador de números decimales",
                    "6. Compilador de lenguaje específico", "7. Compilador de declaración de variables",
                    "8. Validador de claves", "9. Salir al menú de operaciones" };

            boolean entradaValida, operacionValida, confirmacionValida, poliretosValida;
            char repetir;
            imprimirTitulo();

            do {
                imprimirMenu(opcMenuPrincipal, "menu general");
                do {
                    System.out.print("Opción ingresada: ");
                    entradaValida = false;
                    try {
                        opcionGeneral = ingresoDatos.nextInt();
                        ingresoDatos.nextLine();

                        if (opcionGeneral >= 1 && opcionGeneral <= 3) {
                            entradaValida = true;
                        } else {
                            imprimirErrorOpcionIncorrecta();
                        }

                    } catch (InputMismatchException e) {
                        imprimirErrorDatosInvalidos();
                        ingresoDatos.nextLine();
                    }
                } while (!entradaValida);

                operacionValida = false;
                switch (opcionGeneral) {
                    case 1:

                        imprimirMenu(integrantes, "integrantes");
                        operacionValida = true;
                        break;

                    case 2:
                        do {
                            imprimirMenu(secciones, "operaciones");
                            System.out.print("Operación seleccionada: ");
                            try {
                                seleccionPolireto = ingresoDatos.nextInt();
                                ingresoDatos.nextLine();

                            } catch (InputMismatchException e) {
                                imprimirErrorDatosInvalidos();
                                ingresoDatos.nextLine();
                            }
                            switch (seleccionPolireto) {
                                case 1:
                                imprimirMenu(opcMenuPoliretos,"Series Numericas");
                                    // Series numericas
                                    break;
                                case 2:
                                    // Series de caracteres
                                    
                                    G5_S1serie s1 = new G5_S1serie();
                                    G5_S2serie s2 = new G5_S2serie ();
                                    G5_S3serie s3 = new G5_S3serie ();
                                    G5_S4serie s4 = new G5_S4serie ();
                                    G5_S5serie s5 = new G5_S5serie ();
                                    G5_S6serie s6 = new G5_S6serie ();
                                    G5_S7serie s7 = new G5_S7serie ();
                                    G5_S8serie s8 = new G5_S8serie ();
                                    G5_S9serie s9 = new G5_S9serie ();
                                    G5_S10serie s10 = new G5_S10serie();

                                        do{
                                        System.out.println("\n================== IMPRESIÓN DE SERIES ==================");
                                        System.out.println("Seleccione la serie que desea generar:");
                                        System.out.println("1. Serie S1: + - + - + - ");
                                        System.out.println("2. Serie S2: + ++ +++ +++++ ");
                                        System.out.println("3. Serie S3: + ++ +++ +++++ ");
                                        System.out.println("4. Serie S4:+ - * / + - * /");
                                        System.out.println("5. Serie S5: \\ | / - | ");
                                        System.out.println("6. Serie S6: a b c d e f ");
                                        System.out.println("7. Serie S7: a + c - e +");
                                        System.out.println("8. Serie S8: aa bbbb cccccc");
                                        System.out.println("9. Serie S9:a bbb ccccc");
                                        System.out.println("10. Serie S10: a b c dd eee");
                                        
                                            try {
                                                System.out.print("Opción (1 - 10): ");
                                                int opcion = ingresoDatos.nextInt();

                                                System.out.print("Seleccione el tipo de ciclo (for / while / do-while): ");
                                                String tipoCiclo = ingresoDatos.next().toLowerCase();
                                                System.out.print("Ingrese la cantidad de elementos n: ");
                                                int n = ingresoDatos.nextInt();

                                                switch (opcion) {
                                                    case 1:
                                                        switch (tipoCiclo) {
                                                             case "for": System.out.println("Serie S1 con for: " + s1.g5_generarS1_for(n)); break;
                                                            case "while": System.out.println("Serie S1 con while: " + s1.g5_generarS1_while(n)); break;
                                                             case "do-while": System.out.println("Serie S1 con do-while: " + s1.g5_generarS1_doWhile(n)); break;
                                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET);
                                                        }
                                                        break;
                                                    case 2:
                                                        switch (tipoCiclo) {
                                                            case "for": System.out.println("Serie S2 con for: " + s2.g5_generarS2_for(n)); break;
                                                            case "while": System.out.println("Serie S2 con while: " + s2.g5_generarS2_while(n)); break;
                                                            case "do-while": System.out.println("Serie S2 con do-while: " + s2.g5_generarS2_doWhile(n)); break;
                                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET);
                                                        }
                                                        break;
                                                    case 3:
                                                        switch (tipoCiclo) {
                                                            case "for": System.out.println("Serie S3 con for: " + s3.g5_generarS3_for(n)); break;
                                                            case "while": System.out.println("Serie S3 con while: " + s3.g5_generarS3_while(n)); break;
                                                            case "do-while": System.out.println("Serie S3 con do-while: " + s3.g5_generarS3_doWhile(n)); break;
                                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET);
                                                        }
                                                        break;
                                                    case 4:
                                                        switch (tipoCiclo) {
                                                            case "for": System.out.println("Serie S4 con for: " + s4.g5_generarS4_for(n)); break;
                                                            case "while": System.out.println("Serie S4 con while: " + s4.g5_generarS4_while(n)); break;
                                                            case "do-while": System.out.println("Serie S4 con do-while: " + s4.g5_generarS4_doWhile(n)); break;
                                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET);
                                                        }
                                                        break;
                                                    case 5:
                                                        switch (tipoCiclo) {
                                                             case "for": System.out.println("Serie S5 con for: " + s5.g5_generarS5_for(n)); break;
                                                            case "while": System.out.println("Serie S5 con while: " + s5.g5_generarS5_while(n)); break;
                                                            case "do-while": System.out.println("Serie S5 con do-while: " + s5.g5_generarS5_doWhile(n)); break;
                                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET);
                                                        }
                                                        break;
                                                    case 6:
                                                        switch (tipoCiclo) {
                                                            case "for": System.out.println("Serie S6 con for: " + s6.g5_generarS6_for(n)); break;
                                                            case "while": System.out.println("Serie S6 con while: " + s6.g5_generarS6_while(n)); break;
                                                            case "do-while": System.out.println("Serie S6 con do-while: " + s6.g5_generarS6_doWhile(n)); break;
                                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET);
                                                        }
                                                        break;
                                                    case 7:
                                                    switch (tipoCiclo) {
                                                        case "for": System.out.println("Serie S7 con for: " + s7.g5_generarS7_for(n)); break;
                                                         case "while": System.out.println("Serie S7 con while: " + s7.g5_generarS7_while(n)); break;
                                                        case "do-while": System.out.println("Serie S7 con do-while: " + s7.g5_generarS7_doWhile(n)); break;
                                                        default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET);
                                                    }
                                                    break;
                                                    case 8:
                                                        switch (tipoCiclo) {
                                                            case "for": System.out.println("Serie S8 con for: " + s8.g5_generarS8_for(n)); break;
                                                            case "while": System.out.println("Serie S8 con while: " + s8.g5_generarS8_while(n)); break;
                                                            case "do-while": System.out.println("Serie S8 con do-while: " + s8.g5_generarS8_doWhile(n)); break;
                                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET);
                                                        }
                                                    break;
                                                    case 9:
                                                        switch (tipoCiclo) {
                                                            case "for": System.out.println("Serie S9 con for: " + s9.g5_generarS9_for(n)); break;
                                                            case "while": System.out.println("Serie S9 con while: " + s9.g5_generarS9_while(n)); break;
                                                            case "do-while": System.out.println("Serie S9 con do-while: " + s9.g5_generarS9_doWhile(n)); break;
                                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET);
                                                        }
                                                        break;
                                                    case 10:
                                                        switch (tipoCiclo) {
                                                            case "for": System.out.println("Serie S10 con for: " + s10.g5_generarS10_for(n)); break;
                                                            case "while": System.out.println("Serie S10 con while: " + s10.g5_generarS10_while(n)); break;
                                                            case "do-while": System.out.println("Serie S10 con do-while: " + s10.g5_generarS10_doWhile(n)); break;
                                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET);
                                                        }
                                                        break;
                                                    default:
                                                    System.err.println(ROJO + "La opción ingresada no es válida." + RESET);
                                                }

                                                } catch (Exception e) {
                                                    System.err.println(ROJO + "Error: entrada inválida. Intente nuevamente." + RESET);
                                                    ingresoDatos.nextLine();
                                                }

                                                    System.out.print("\n¿Desea generar otra serie de caracteres? (s/n): ");
                                                    repetir = ingresoDatos.next().charAt(0);
                                                
                                        } while (repetir == 's' || repetir == 'S');
                                    break;
                                case 3:
                                    // Figuras
                                    do {
                                        imprimirMenu(opcMenuPoliretos, "figuras");
                                        poliretosValida = false;
                                        do {
                                        System.out.print("Opción ingresada: ");
                                        try {
                                            seleccionPolireto = ingresoDatos.nextInt();
                                            ingresoDatos.nextLine();
                                            if (seleccionPolireto >= 1 && seleccionPolireto <= 2)
                                                poliretosValida = true;
                                            else
                                                imprimirErrorOpcionIncorrecta();
                                        } catch (InputMismatchException e) {
                                            imprimirErrorDatosInvalidos();
                                            ingresoDatos.nextLine();
                                        }
                                        } while (!poliretosValida);
                                        switch (seleccionPolireto) {
                                            case 1:
                                                do {
                                                    imprimirMenu(bucles, "metodos");
                                                    do{ 
                                                    confirmacionValida = false;
                                                    System.out.print("Opción ingresada: ");
                                                    try {
                                                        operaciones = ingresoDatos.nextInt();
                                                        ingresoDatos.nextLine();
                                                        if (operaciones >= 1 && operaciones <= 3)
                                                            confirmacionValida = true;
                                                        else
                                                            imprimirErrorOpcionIncorrecta();
                                                    } catch (InputMismatchException e) {
                                                        imprimirErrorDatosInvalidos();
                                                        ingresoDatos.nextLine();
                                                    }
                                                }while(!confirmacionValida);
                                                    imprimirMenu(cantidadFig, "FIGURAS (1-19)");
                                                    do{ 
                                                    confirmacionValida=false;
                                                    System.out.print("Opción ingresada: ");
                                                    try {
                                                        numero = ingresoDatos.nextInt();
                                                        ingresoDatos.nextLine();
                                                        if (numero >= 1 && numero <= 19)
                                                            confirmacionValida = true;
                                                        else
                                                            imprimirErrorOpcionIncorrecta();
                                                    } catch (InputMismatchException e) {
                                                        imprimirErrorDatosInvalidos();
                                                        ingresoDatos.nextLine();
                                                    }
                                                    }while(!confirmacionValida);
                                                    if (confirmacionValida) {
                                                        int numeroFilas = 0;
                                                        System.out.println(
                                                                "Digite el número de filas que desea para la figura:");
                                                        do {
                                                            confirmacionValida=false;
                                                            System.out.print("Número de filas: ");
                                                            try {
                                                                numeroFilas = ingresoDatos.nextInt();
                                                                ingresoDatos.nextLine();
                                                                if (numeroFilas > 0 && numeroFilas<=19)
                                                                    confirmacionValida = true;
                                                                else
                                                                    imprimirErrorOpcionIncorrecta();
                                                            } catch (InputMismatchException e) {
                                                                imprimirErrorDatosInvalidos();
                                                                ingresoDatos.nextLine();
                                                            }
                                                        } while (!confirmacionValida);
                                                        System.out.println(
                                                                "Digite la serie de números que desea para ciertas figuras :");
                                                        int serieDeNumeros = 0;
                                                        do {
                                                            confirmacionValida=false;
                                                            System.out.print("Serie de números: ");
                                                            try {
                                                                serieDeNumeros = ingresoDatos.nextInt();
                                                                ingresoDatos.nextLine();
                                                                if (serieDeNumeros > 0)
                                                                    confirmacionValida = true;
                                                                else
                                                                    imprimirErrorOpcionIncorrecta();
                                                            } catch (InputMismatchException e) {
                                                                imprimirErrorDatosInvalidos();
                                                                ingresoDatos.nextLine();
                                                            }
                                                        } while (!confirmacionValida);
                                                        System.out.println("Generando figura...\n");
                                                        switch (operaciones) {
                                                            case 1: // FOR
                                                                ejecutarFigura(numero, "for", numeroFilas,
                                                                        serieDeNumeros);
                                                                break;
                                                            case 2: // WHILE
                                                                ejecutarFigura(numero, "while", numeroFilas,
                                                                        serieDeNumeros);
                                                                break;
                                                            case 3: // DO WHILE
                                                                ejecutarFigura(numero, "doWhile", numeroFilas,
                                                                        serieDeNumeros);
                                                                break;
                                                        }
                                                    }
                                                    System.out.println();
                                                } while (!confirmacionValida);
                                                break;
                                            case 2:
                                                System.out.println("Regresando al menú de operaciones...");
                                                seguirOperaciones = 2;
                                                break;
                                        }
                                    } while (seguirOperaciones != 2);
                                    operacionValida = true;
                                    break;
                                case 4://cadenas
                                    int opcCadenas = 0;
                                    boolean validarOpcCadena, validarFrase, validarBucle, datoValido;
                                    String[] cadenasCaracteres = { "Cadenas 1)", "Cadenas 2)", "Cadenas 3)",
                                            "Cadenas 4)", "Cadenas 5)", "Cadenas 6)", "Cadenas 7)", "Cadenas 8)",
                                            "Cadenas 9)" };
                                    System.out.println(
                                            "Usted ha seleccionado realizar operaciones con cadenas de caracteres.");
                                    
                                    do{
                                                                            
                                    imprimirMenu(cadenasCaracteres, "cadenas de caracteres");
                                    
                                    do {
                                        leerEnteroValido("Operación selecionada: ");
                                        if (opcCadenas < 1 || opcCadenas > 9)  imprimirErrorOpcionIncorrecta();
                                    } while (opcCadenas < 1 || opcCadenas > 9);
                                    
                                        validarOpcCadena = false;
                                        switch (opcCadenas) {
                                        case 1:
                                            G5_contarVocales cadenasUno = new G5_contarVocales();
                                            String fraseVocales = "";

                                            System.out
                                                    .println("Usted ha seleccionado realizar la operación Cadenas 1)");

                                            
                                            do {
                                            System.out.print("Ingrese una frase: ");
                                            fraseVocales = ingresoDatos.nextLine().trim().toLowerCase();

                                            if (fraseVocales.isEmpty()) {
                                                imprimirErrorDatosInvalidos();
                                            }

                                            } while (fraseVocales.isEmpty());
                                                    
                                                                                 
                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[1]);
                                                leerEnteroValido("Bucle seleccionado (ingrese el número): ");
                                            
                                            int cantVocales;
                                            validarBucle = false;
                                            switch (opcBucles) {
                                                case 1:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle for para la operación Cadenas 1)");
                                                    cantVocales = cadenasUno.g5_contarVocalesFor(fraseVocales);
                                                    System.out.println(
                                                            fraseVocales + " tiene " + cantVocales + " vocales");
                                                    break;

                                                case 2:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle while para la operación Cadenas 1)");
                                                    cantVocales = cadenasUno.g5_contarVocalesWhile(fraseVocales);
                                                    System.out.println(
                                                            fraseVocales + " tiene " + cantVocales + " vocales");
                                                    break;

                                                case 3:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle do-while para la operación Cadenas 1)");
                                                    cantVocales = cadenasUno.g5_contarVocalesDoWhile(fraseVocales);
                                                    System.out.println(
                                                            fraseVocales + "tiene " + cantVocales + " vocales");
                                                    break;

                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                                }
                                                if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("\nSi desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    
                                                    otroBucle = leerRespuestaSiNo();
                                                }

                                            }while (!validarBucle || otroBucle.equals("si"));
                                            break;
                                        case 2:
                                            G5_contarConsonantes cadenasDos = new G5_contarConsonantes();
                                            String fraseConsonantes;

                                            System.out
                                                    .println("Usted ha seleccionado realizar la operación Cadenas 2)");

                                            
                                            do {
                                            System.out.print("Ingrese una frase: ");
                                            fraseConsonantes = ingresoDatos.nextLine().trim().toLowerCase();

                                            if (fraseConsonantes.isEmpty()) {
                                                imprimirErrorDatosInvalidos();
                                            }

                                            } while (fraseConsonantes.isEmpty());
                                                    
                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[1]);
                                            leerEnteroValido("Bucle seleccionado (ingrese el número): ");
                                            
                                            int cantConsonantes;
                                            validarBucle = false;

                                            switch (opcBucles) {
                                                case 1:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle for para la operación Cadenas 2)");
                                                    cantConsonantes = cadenasDos
                                                            .g5_contarConstantesFor(fraseConsonantes);
                                                    System.out.println(fraseConsonantes + " tiene " + cantConsonantes
                                                            + " consonantes");
                                                    break;

                                                case 2:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle while para la operación Cadenas 2)");
                                                    cantConsonantes = cadenasDos
                                                            .g5_contarConstantesWhile(fraseConsonantes);
                                                    System.out.println(fraseConsonantes + " tiene " + cantConsonantes
                                                            + " consonantes");
                                                    break;

                                                case 3:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle do-while para la operación Cadenas 2)");
                                                    cantConsonantes = cadenasDos
                                                            .g5_contarConstantesDoWhile(fraseConsonantes);
                                                    System.out.println(fraseConsonantes + "tiene " + cantConsonantes
                                                            + " consonantes");
                                                    break;

                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                                }
                                                if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("\nSi desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    
                                                    otroBucle = leerRespuestaSiNo();
                                                }
                                            }while (!validarBucle || otroBucle.equals("si"));
                                            break;
                                        case 3:
                                            G5_eliminarVocal cadenasTres = new G5_eliminarVocal();
                                            String fraseEliminarVocal;
                                            String vocal;
                                            String textoSinVocal;
                                            boolean esVocal;

                                            System.out
                                                    .println("Usted ha seleccionado realizar la operación Cadenas 3)");


                                            do {
                                                validarFrase = false;
                                                    System.out.print("Ingrese una frase: ");
                                                    fraseEliminarVocal = ingresoDatos.nextLine().toLowerCase();
                                                    if (fraseEliminarVocal.matches(".*[aeiouáéíóú].*")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);

                                            

                                            do {
                                                System.out.print("Ingrese una vocal para eliminarla: ");
                                                vocal = ingresoDatos.nextLine().toLowerCase();
                                                esVocal = "áéíóúaeiou".contains(vocal);
                                                if (!esVocal) {
                                                    imprimirErrorTipoDato();
                                                }
                                            } while (!esVocal);
                                            
                                            char vocalEliminada = vocal.charAt(0);
                                            validarBucle = false;
                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[2]);
                                                leerEnteroValido("Bucle seleccionado (ingrese el número): ");
                                            
                                    
                                            switch (opcBucles) {
                                                case 1:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle for para la operación Cadenas 3)");
                                                    textoSinVocal = cadenasTres.g5_eliminarVocalFor(fraseEliminarVocal,
                                                            vocalEliminada);
                                                    imprimirResultadoFrase(textoSinVocal);
                                                    break;

                                                case 2:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle while para la operación Cadenas 3)");
                                                    textoSinVocal = cadenasTres
                                                            .g5_eliminarVocalWhile(fraseEliminarVocal, vocalEliminada);
                                                    imprimirResultadoFrase(textoSinVocal);
                                                    break;

                                                case 3:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle do-while para la operación Cadenas 3)");
                                                    textoSinVocal = cadenasTres.g5_eliminarVocalDoWhile(
                                                            fraseEliminarVocal, vocalEliminada);
                                                    imprimirResultadoFrase(textoSinVocal);
                                                    break;

                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                            }
                                            if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("\nSi desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    
                                                    otroBucle = leerRespuestaSiNo();
                                                }
                                        }while (!validarBucle || otroBucle.equals("si"));
                                        break;
                                        case 4:
                                            G5_eliminarConsonante cadenasCuatro = new G5_eliminarConsonante();
                                            String textoConsonantes = "bcdfghjklmnpqrstvwxyz";
                                            String fraseEliminarConsonante;
                                            String consonante;
                                            String textoSinConsonante;
                                            boolean esConsonante;

                                            System.out.println("Usted ha seleccionado realizar la operación Cadena 4)");

                                            
                                            do {
                                                validarFrase = false;
                                                    System.out.print("Ingrese una frase: ");
                                                    fraseEliminarConsonante = ingresoDatos.nextLine().toLowerCase();
                                                    if (fraseEliminarConsonante.matches(".*[a-zñáéíóú].*")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);

                                            
                                            do {
                                                System.out.print("Ingrese una consonante para eliminarla: ");
                                                consonante = ingresoDatos.nextLine().toLowerCase();
                                                esConsonante = textoConsonantes.contains(consonante);
                                                if (!esConsonante) {
                                                    imprimirErrorTipoDato();
                                                }
                                            } while (!esConsonante);

                                            char consonanteEliminada = consonante.charAt(0);
                                            validarBucle = false;

                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[2]);
                                                do {
                                                datoValido = false;
                                                try {
                                                    System.out.print("Bucle seleccionado (ingrese el número): ");
                                                    opcBucles = ingresoDatos.nextInt();
                                                    ingresoDatos.nextLine();
                                                    datoValido = true;
                                                    
                                                } catch (InputMismatchException e) {
                                                    imprimirErrorDatosInvalidos();
                                                    ingresoDatos.nextLine();  
                                                    datoValido = false;
                                                }
                                                
                                            } while (!datoValido);

                                            switch (opcBucles) {
                                                case 1:
                                                    System.out.println("Usted ha seleccionado usar el bucle for para la operación Cadenas 4)");
                                                    textoSinConsonante = cadenasCuatro.g5_eliminarConsonanteFor(fraseEliminarConsonante, consonanteEliminada);
                                                    imprimirResultadoFrase(textoSinConsonante);
                                                   
                                                    break;

                                                case 2:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle while para la operación Cadenas 4)");
                                                    textoSinConsonante = cadenasCuatro.g5_eliminarConsonanteWhile(
                                                            fraseEliminarConsonante, consonanteEliminada);
                                                    imprimirResultadoFrase(textoSinConsonante);
                                                    break;

                                                case 3:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle do-while para la operación Cadenas 4)");
                                                    textoSinConsonante = cadenasCuatro.g5_eliminarConsonanteDoWhile(fraseEliminarConsonante, consonanteEliminada);
                                                    imprimirResultadoFrase(textoSinConsonante);
                                                    break;

                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                            }
                                            if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("\nSi desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    
                                                    do{
                                                        try {
                                                            System.out.print("Respuesta: ");
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (!otroBucle.equals("si") && !otroBucle.equals("no"));
                                            }
                                        }while (!validarBucle || otroBucle.equals("si"));
                                        break;
                                        case 5:

                                            G5_invertirConVocalesEnMayus cadenasCinco = new G5_invertirConVocalesEnMayus();
                                            String textoCadCinco;
                                            String invertidoVocalesMayus;

                                            System.out.println("Usted ha seleccionado realizar la operación Cadena 5)");


                                            do {
                                                validarFrase = false;
                                                    System.out.print("Ingrese una frase: ");
                                                    textoCadCinco = ingresoDatos.nextLine().toLowerCase();
                                                    if (textoCadCinco.matches(".*[aeiouáéíóú].*")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);


                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[4]);
                                              do {
                                                datoValido = false;
                                                try {
                                                    System.out.print("Bucle seleccionado (ingrese el número): ");
                                                    opcBucles = ingresoDatos.nextInt();
                                                    ingresoDatos.nextLine();
                                                    datoValido = true;
                                                    
                                                } catch (InputMismatchException e) {
                                                    imprimirErrorDatosInvalidos();
                                                    datoValido = false;
                                                } 
                                                } while (!datoValido);

                                            validarBucle = false;
                              
                                            switch (opcBucles) {
                                                case 1:
                                                    System.out.println("Usted ha seleccionado usar el bucle for para la operación Cadenas 5)");
                                                    invertidoVocalesMayus = cadenasCinco.g5_invertirConVocalesMayusFor(textoCadCinco);
                                                   imprimirResultadoFrase(invertidoVocalesMayus);
                                                    break;

                                                case 2:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle while para la operación Cadenas 5)");
                                                    invertidoVocalesMayus = cadenasCinco.g5_invertirConVocalesMayusWhile(textoCadCinco);
                                                   imprimirResultadoFrase(invertidoVocalesMayus);
                                                    break;

                                                case 3:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle do-while para la operación Cadenas 5)");
                                                    invertidoVocalesMayus = cadenasCinco.g5_invertirConVocalesMayusDoWhile(textoCadCinco);
                                                   imprimirResultadoFrase(invertidoVocalesMayus);
                                                    break;

                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                            }
                                            
                                            if (opcBucles >= 1 && opcBucles <= 3){
                                                validarBucle = true;
                                                System.out.println("\nSi desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                otroBucle = leerRespuestaSiNo();
                                            }

                                        }while (!validarBucle || otroBucle.equals("si"));
                                        break;
                                        case 6:
                                            G5_invertirConConsonantesEnMayus cadenasSeis = new G5_invertirConConsonantesEnMayus();
                                            String textoCadSeis, invertidoConsonantesMayus;

                                            System.out
                                                    .println("Usted ha seleccionado realizar la operación Cadenas 6)");

                                            
                                            do {
                                                validarFrase = false;
                                                    System.out.print("Ingrese una frase: ");
                                                    textoCadSeis = ingresoDatos.nextLine().toLowerCase();
                                                    if (textoCadSeis.matches(".*[aeiouáéíóú].*")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);

                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[5]);
                                                leerEnteroValido("Bucle seleccionado (ingrese el número): ");
                                            
                                            validarBucle = false;
                                            switch (opcBucles) {
                                                case 1:

                                                    System.out.println("Usted ha seleccionado usar el bucle for para la operación Cadenas 6)");
                                                    invertidoConsonantesMayus = cadenasSeis.g5_invertirConConsonantesMayusFor(textoCadSeis);
                                                    imprimirResultadoFrase(invertidoConsonantesMayus);
                                                    break;

                                                case 2:

                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle while para la operación Cadena 5)");
                                                    invertidoConsonantesMayus = cadenasSeis.g5_invertirConConsonantesMayusWhile(textoCadSeis);
                                                    imprimirResultadoFrase(invertidoConsonantesMayus);
                                                    break;

                                                case 3:

                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle do-while para la operación Cadenas 4)");
                                                    invertidoConsonantesMayus = cadenasSeis.g5_invertirConConsonantesMayusDoWhile(textoCadSeis);
                                                    imprimirResultadoFrase(invertidoConsonantesMayus);
                                                    break;

                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                            }
                                                if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("\nSi desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    
                                                    otroBucle = leerRespuestaSiNo();
                                                }

                                        }while (!validarBucle || otroBucle.equals("si"));
                                        break;
                                        case 7:
                                            G5_convertirAMayusSinJ cadenasSiete = new G5_convertirAMayusSinJ();
                                            String textoCadSiete, textoMayusSinJ;

                                            System.out
                                                    .println("Usted ha seleccionado realizar la opereación Cadenas 7)");

                                            do {
                                                validarFrase = false;
                                                    System.out.print("Ingrese una frase: ");
                                                    textoCadSiete = ingresoDatos.nextLine();
                                                    if (textoCadSiete.matches(".*[aeiouáéíóú].*")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);
                                            
                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[6]);
                                                leerEnteroValido("Bucle seleccionado (ingrese el número): ");
                                            
                                            validarBucle = false;
                                            
                                            switch (opcBucles) {
                                                case 1:

                                                    System.out.println("Usted ha seleccionado usar el bucle for para la operación Cadenas 7)");
                                                    textoMayusSinJ = cadenasSiete.g5_convertirAMayusSinJFor(textoCadSiete);
                                                    imprimirResultadoFrase(textoMayusSinJ);
                                                    break;

                                                case 2:

                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle while para la operación Cadena 5)");
                                                    textoMayusSinJ = cadenasSiete.g5_convertirAMayusSinJWhile(textoCadSiete);
                                                    imprimirResultadoFrase(textoMayusSinJ);
                                                    break;

                                                case 3:

                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle do-while para la operación Cadenas 4)");
                                                    textoMayusSinJ = cadenasSiete.g5_convertirAMayusSinJDoWhile(textoCadSiete);
                                                    imprimirResultadoFrase(textoMayusSinJ);
                                                    break;

                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                            }
                                            if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("\nSi desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    
                                                    do{
                                                        try {
                                                            System.out.print("Respuesta: ");
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (!otroBucle.equals("si") && !otroBucle.equals("no"));
                                            }

                                        }while (!validarBucle || otroBucle.equals("si"));
                                        break;

                                        case 8:
                                            G5_adivinarAnagramas cadenasOcho = new G5_adivinarAnagramas();
                                            Scanner adivinaAnagrama = new Scanner (System.in);

                                            System.out.println("Usted ha seleccionado realizar la operación Cadenas 8)");
                                           
                                            
                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[7]);
                                                leerEnteroValido("Bucle seleccionado (ingrese el número): ");
                                            
                                                validarBucle = false;

                                            switch (opcBucles) {
                                                case 1:
                                                    System.out.println("Usted ha seleccionado usar el bucle for para la operación Cadenas 8)");
                                                    cadenasOcho.g5_adivinarAnagramasFor(adivinaAnagrama);
                                                    break;

                                                case 2:

                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle while para la operación Cadena 8)");
                                                    cadenasOcho.g5_adivinarAnagramasWhile(adivinaAnagrama);
                                                    break;

                                                case 3:

                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle do-while para la operación Cadenas 8)");
                                                    cadenasOcho.g5_adivinarAnagramasDoWhile(adivinaAnagrama);
                                                    break;

                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                            }
                                            if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("\nSi desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    
                                                    do{
                                                        try {
                                                            System.out.print("Respuesta: ");
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (!otroBucle.equals("si") && !otroBucle.equals("no"));
                                            }

                                        }while(!validarBucle || otroBucle.equals("si"));
                                        break;

                                        case 9:
                                            G5_alternarMayusYMinus cadenasNueve = new G5_alternarMayusYMinus();
                                            String textoCadNueve, textoAlternado;

                                            System.out.println("Usted ha seleccionado realizar la operación Cadenas 9)");
                                            do {
                                                validarFrase = false;
                                                    System.out.print("Ingrese una frase: ");
                                                    textoCadNueve = ingresoDatos.nextLine();
                                                    if (textoCadNueve.matches(".*[aeiouáéíóú].*")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);

                                            do{
                                                leerEnteroValido("Bucle seleccionado (ingrese el número): ");
                                            
                                            validarBucle = false;
                                            switch (opcBucles) {
                                                case 1:

                                                    System.out.println("Usted ha seleccionado usar el bucle for para la operación Cadenas 9)");
                                                    textoAlternado = cadenasNueve.g5_alternarMayusYMinusFor(textoCadNueve);
                                                    imprimirResultadoFrase(textoAlternado);                                                
                                                    break;

                                                case 2:

                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle while para la operación Cadena 9)");
                                                    textoAlternado = cadenasNueve.g5_alternarMayusYMinusWhile(textoCadNueve);
                                                    imprimirResultadoFrase(textoAlternado);
                                                    break;

                                                case 3:

                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle do-while para la operación Cadenas 9)");
                                                    textoAlternado = cadenasNueve.g5_alternarMayusYMinusDoWhile(textoCadNueve);
                                                    imprimirResultadoFrase(textoAlternado);
                                                    break;

                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                            }
                                                if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("\nSi desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    otroBucle = leerRespuestaSiNo();
                                                }
                                        }while (!validarBucle || otroBucle.equals("si"));
                                        break;

                                        default:
                                            imprimirErrorOpcionIncorrecta();
                                            break;

                                    }
                                    if (opcCadenas >= 1 && opcCadenas <= 8){
                                        validarOpcCadena = true;
                                        System.out.println("\nSi desea realizar otra operación con cadenas, escriba si. De lo contrario, escriba no");
                                        otraOperacion = leerRespuestaSiNo();
                                    }
                                }while (!validarOpcCadena || otraOperacion.equals("si"));
                                break;
                                
                                case 5:
                                    String [] nombreCompleto = {"Sebastián", "Josué", "Zúñiga", "Mendoza"};
                                    String [] operacionesArrays = {"Arrays 1)", "Arrays 2)", "Arrays 3)", "Arrays 4)", "Arrays 5)"};
                                    int opcArrays = 0;;
                                    boolean validarOpcArrays;
                                    
                                    System.out.println(
                                            "Usted ha seleccionado realizar operaciones con arrays.");
                                    do{
                                        imprimirMenu(operacionesArrays, "arrays");

                                        do{
                                            datoValido = false;
                                            try {
                                               System.out.print("Operación seleccionada: ");
                                                opcArrays = ingresoDatos.nextInt();
                                                ingresoDatos.nextLine();
                                                datoValido = true; 
                                            } catch (InputMismatchException e) {
                                                imprimirErrorDatosInvalidos();
                                                ingresoDatos.nextLine();
                                                datoValido = false;
                                            }  
                                        }while (!datoValido);

                                        validarOpcArrays = false;
                                        switch (opcArrays) {
                                            case 1:
                                                G5_mostrarNombresConPorcentajes arraysUno = new G5_mostrarNombresConPorcentajes();
                                                String [] porcentajes;
                                                Double [] porcentajesNombre = new Double [nombreCompleto.length];
                                                boolean validarPorcentaje;

                                                System.out.println("Usted ha seleccionado realizar la operación" + operacionesArrays[0]);
                                                System.out.println("Mi nombre es: Sebastián Josué Zúñiga Mendoza");
                                                do {
                                                    validarPorcentaje = true;
                                                    System.out.print("Ingrese los porcentajes de carga separados por espacios: ");
                                                    porcentajes = ingresoDatos.nextLine().trim().split(" ");
                                                                                                        
                                                    if (porcentajes.length != nombreCompleto.length){
                                                        imprimirErrorDatosInvalidos();
                                                        validarPorcentaje = false;
                                                    }

                                                    for (int i = 0; i < nombreCompleto.length; i++){
                                                        try {
                                                            porcentajesNombre[i] = Double.parseDouble(porcentajes[i]);
                                                        } catch (Exception e) {
                                                            imprimirErrorDatosInvalidos();
                                                            validarPorcentaje = false;
                                                            break;
                                                        }
                                                    }       
                                                }while (!validarPorcentaje);
                                                
                                               do{
                                                imprimirMenu(bucles, "bucles " + operacionesArrays[0]);

                                                leerEnteroValido("Bucle seleccionado (ingrese el número): ");

                                                validarBucle = false;
                                                switch(opcBucles){
                                                    case 1:
                                                    System.out.println("Usted ha seleccionado emplear el bucle for para realizar la operación " + operacionesArrays[0]);
                                                    arraysUno.g5_mostrarNombresConPorcentajesFor(nombreCompleto, porcentajesNombre);
                                                    break;

                                                    case 2:
                                                    System.out.println("Usted has seleccionado emplear el bucle while para realizar la operación " + operacionesArrays[0]);
                                                    arraysUno.g5_mostrarNombresConPorcentajesWhile(nombreCompleto, porcentajesNombre);
                                                    break;

                                                    case 3:
                                                    System.out.println("Usted ha seleccionado emplear el bucle do-while para realizar la operación " + operacionesArrays[0]);
                                                    arraysUno.g5_mostrarNombresConPorcentajesDoWhile(nombreCompleto, porcentajesNombre);
                                                    break;

                                                    default:
                                                    imprimirErrorTipoCiclo();
                                                    break;

                                                }
                                                if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    otroBucle = leerRespuestaSiNo();
                                                }
                                             
                                            }while (!validarBucle || otroBucle.equals("si"));
                                            break;

                                            case 2:
                                            G5_crearMatrizIniciales arraysDos = new G5_crearMatrizIniciales();
                                            int tamIniciales = 0;
                                            char simboloUsuario;
                                            boolean validarTamanio, validarSimbolo;

                                            System.out.println("Usted ha seleccionado realizar la operación " + operacionesArrays[1]);
                                            leerEnteroValido("Ingrese el tamaño de la matriz cuadrada de iniciales: ");

                                            do{
                                                validarSimbolo = false;
                                                System.out.print("Digite el símbolo a utilizar: ");
                                                simboloUsuario = ingresoDatos.nextLine().charAt(0);

                                                if (Character.isWhitespace(simboloUsuario)) imprimirErrorDatosInvalidos();
                                                else validarSimbolo = true;
                                            }while (!validarSimbolo);

                                            char [] [] iniciales = new char [tamIniciales] [tamIniciales];
                                            
                                            validarBucle = false;
                                            do{
                                                imprimirMenu(bucles, "bucles " + operacionesArrays[1]);

                                                leerEnteroValido("Bucle seleccionado (ingrese el número): ");
                                                validarBucle = false;
                                                switch (opcBucles) {
                                                    case 1:
                                                        System.out.println("Usted ha seleccionado emplear el bucle for para la operación " + operacionesArrays[1]);
                                                        iniciales = arraysDos.g5_crearMatrizInicialesFor(tamIniciales, simboloUsuario);
                                                        imprimirMatrizChar(iniciales);
                                                        break;
                                                    case 2:
                                                        System.out.println("Usted ha seleccionado emplear el bucle while para la operación " + operacionesArrays[1]);
                                                        iniciales = arraysDos.g5_crearMatrizInicialesWhile(tamIniciales, simboloUsuario);
                                                        break;
                                                    case 3:
                                                        System.out.println("Usted ha seleccionado emplear el bucle do-while para la operación " + operacionesArrays[1]);
                                                        iniciales = arraysDos.g5_crearMatrizInicialesDoWhile(tamIniciales, simboloUsuario);
                                                        break;
                                                    default:
                                                        imprimirErrorTipoCiclo();
                                                        break;
                                                }
                                                if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    otroBucle = leerRespuestaSiNo();
                                                }
                                            }while (!validarBucle || otroBucle.equals("si"));
                                            break;

                                            case 3:
                                            G5_graficarNombre2x arraysTres = new G5_graficarNombre2x();
                                            System.out.println("Usted ha seleccionado realizar la operación Arrays 3)");
                                            System.out.println("Mi nombre es Sebastián");
                                            do{
                                                imprimirMenu(bucles, "bucles " + operacionesArrays[1]);

                                                leerEnteroValido("Bucle seleccionado (ingrese el número)");
                                                validarBucle = false;
                                                switch (opcBucles){
                                                    case 1:
                                                    System.out.println("Usted ha seleccionado emplear el bucle for para realizar la operación Arrays 3)");
                                                    arraysTres.g5_graficarNombre2xFor(nombreCompleto[0]);
                                                    break;

                                                    case 2:
                                                    System.out.println("Usted ha seleccionado emplear el bucle while para realizar la operación Arrays 3)");
                                                    arraysTres.g5_graficarNombre2xWhile(nombreCompleto[0]);
                                                    break;

                                                    case 3:
                                                    System.out.println("Usted ha seleccionado el bucle do-while paraa realizar la operación Arrays 3)");
                                                    arraysTres.g5_graficarNombre2xDoWhile(nombreCompleto[0]);
                                                    break;

                                                    default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                                }
                                                if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    otroBucle = leerRespuestaSiNo();
                                                }
                                            }while (!validarBucle || otroBucle.equals("si"));
                                            break;
                                            
                                            case 4:
                                            G5_imprimirXConNombre arraysCuatro = new G5_imprimirXConNombre();
                                            String nombreYApellido = nombreCompleto[0] + " " + nombreCompleto[2];

                                            System.out.println("Usted ha seleccionado realizar la operación " + operacionesArrays[3]);
                                            do{
                                                imprimirMenu(bucles, "bucle " + operacionesArrays[3]);
                                            do {
                                                datoValido = false;

                                                try {
                                                    System.out.print("Bucle seleccionado (ingrese el número): ");
                                                    opcBucles = ingresoDatos.nextInt();
                                                    ingresoDatos.nextLine();
                                                    datoValido = true;
                                                    
                                                } catch (InputMismatchException e) {
                                                    imprimirErrorDatosInvalidos();
                                                    datoValido = false;
                                                }
                                                
                                            } while (!datoValido);

                                            validarBucle = false;
                                            switch (opcBucles){
                                                case 1:
                                                    System.out.println("Usted ha seleccionado emplear el bucle for para realizar la operación " + operacionesArrays[3]);
                                                    arraysCuatro.g5_imprimirXConNombreFor(nombreYApellido);
                                                    break;
                                                case 2:
                                                    System.out.println("Usted ha seleccionado emplear el bucle while para realizar la operación " + operacionesArrays[3]);
                                                    arraysCuatro.g5_imprimirXConNombreWhile(nombreYApellido);
                                                    break;
                                                case 3:
                                                    System.out.println("Usted ha seleccionado emplear el bucle do-while para la operación " + operacionesArrays[3]);
                                                    arraysCuatro.g5_imprimirXConNombreDoWhile(nombreYApellido);
                                                    break;
                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                            }
                                            if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    otroBucle = leerRespuestaSiNo();
                                                }
                                            }while (!validarBucle || otroBucle.equals("si"));
                                                 
                                            case 5:
                                            String miNombreCompleto = nombreCompleto[0] + nombreCompleto[1] + nombreCompleto[2] + nombreCompleto[3];
                                            G5_colocarLetrasNombreAleatorio arraysCinco = new G5_colocarLetrasNombreAleatorio();
                                            System.out.println("Usted ha seleccionado realizar la operación " + operacionesArrays[4]);
                                            
                                           do{ 
                                            do {
                                                datoValido = false;
                                                imprimirMenu(bucles, "bucle " + operacionesArrays[4]);
                                                try {
                                                    System.out.print("Bucle seleccionado (ingrese el número): ");
                                                    opcBucles = ingresoDatos.nextInt();
                                                    ingresoDatos.nextLine();
                                                    datoValido = true;
                                                    
                                                } catch (InputMismatchException e) {
                                                    imprimirErrorDatosInvalidos();
                                                    datoValido = false;
                                                }
                                                
                                            } while (!datoValido);

                                            validarBucle = false;
                                            switch (opcBucles){
                                                case 1: 
                                                    System.out.println("Usted ha seleccionado el bucle for para realizar la operación " + operacionesArrays[4]);
                                                    arraysCinco.g5_colocarLetrasNombreAleatorioFor(miNombreCompleto, 200);
                                                    break;
                                                case 2:
                                                    System.out.println("Usted ha seleccionado el bucle while para realizar la operación " + operacionesArrays[4]);
                                                    arraysCinco.g5_colocarLetrasNombreAleatorioWhile(miNombreCompleto, 200);
                                                    break;
                                                case 3:
                                                    System.out.println("Usted ha seleccionado el bucle do-while para realizar la operación " + operacionesArrays[4]);
                                                    arraysCinco.g5_colocarLetrasNombreAleatorioDoWhile(miNombreCompleto, 200);
                                                    break;
                                                default:
                                                    imprimirErrorTipoCiclo();
                                                    break;
                                            }

                                            
                                            if (opcBucles >= 1 && opcBucles <= 3){
                                                    validarBucle = true;
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    otroBucle = leerRespuestaSiNo();
                                            }
                                        }while (!validarBucle || otroBucle.equals("si"));


                                            default:
                                                imprimirErrorOpcionIncorrecta();
                                                break;
                                        }
                                        if (opcArrays>= 1 && opcArrays<= 5){
                                        validarOpcArrays = true;
                                        System.out.println("\nSi desea realizar otra operación con arrays, escriba si. De lo contrario, escriba no");
                                        otraOperacion = leerRespuestaSiNo();
                                        }
                                }while (!validarOpcArrays || otraOperacion.equals("si"));
                                break;
                                case 6:
                                    // Loading
                                    G5_S1Loading l1 = new G5_S1Loading();
                                    G5_S2Loading l2 = new G5_S2Loading();
                                    G5_S3Loading l3 = new G5_S3Loading();
                                    G5_S4Loading l4 = new G5_S4Loading();
                                    G5_S5Loading l5 = new G5_S5Loading();
                                    G5_S6Loading l6 = new G5_S6Loading();
                                    G5_S7Loading l7 = new G5_S7Loading();
                                    G5_S8Loading l8 = new G5_S8Loading();
                                    G5_S9Loading l9 = new G5_S9Loading();
                                    G5_S10Loading l10 = new G5_S10Loading();
                                    G5_S11Loading l11 = new G5_S11Loading();
                                    G5_S12Loading l12 = new G5_S12Loading();

                                    System.out.println("Usted ha seleccionado realizar simulaciones de Loading.");
                                    
                                    do {
                                        String[] opcLoadings = { 
                                            "L1: Rotación Simple |/-\\",
                                            "L2: Barra Fija (#)",
                                            "L3: Barra Progresiva (>)",
                                            "L4: Pulsación (*)",
                                            "L5: Luces LED (+*+*)",
                                            "L6: Rebote (<>)",
                                            "L7: Ondulación (~)",
                                            "L8: Relleno Progresivo (●)",
                                            "L9: Puntos Progresivos (...)",
                                            "L10: Barras Cruzadas (||)",
                                            "L11: Contador Numérico",
                                            "L12: Secuencia Especial"
                                        };
                                        
                                        imprimirMenu(opcLoadings, "loadings disponibles");
                                        
                                        int opcLoading = 0;
                                        boolean validarOpcLoading;
                                        
                                        do {
                                            System.out.print("Seleccione el Loading (1-12): ");
                                            try {
                                                opcLoading = ingresoDatos.nextInt();
                                                ingresoDatos.nextLine();
                                                validarOpcLoading = (opcLoading >= 1 && opcLoading <= 12);
                                                if (!validarOpcLoading) imprimirErrorOpcionIncorrecta();
                                            } catch (InputMismatchException e) {
                                                imprimirErrorDatosInvalidos();
                                                ingresoDatos.nextLine();
                                                validarOpcLoading = false;
                                            }
                                        } while (!validarOpcLoading);
                                        
                                        String[] opcBuclesLoading = { "1.-FOR", "2.-WHILE", "3.-DO WHILE" };
                                        int tipoCicloLoading = 0;
                                        boolean validarTipoCiclo;
                                        
                                        do {
                                            imprimirMenu(opcBuclesLoading, "tipo de ciclo");
                                            System.out.print("Seleccione el tipo de ciclo (1-3): ");
                                            try {
                                                tipoCicloLoading = ingresoDatos.nextInt();
                                                ingresoDatos.nextLine();
                                                validarTipoCiclo = (tipoCicloLoading >= 1 && tipoCicloLoading <= 3);
                                                if (!validarTipoCiclo) imprimirErrorOpcionIncorrecta();
                                            } catch (InputMismatchException e) {
                                                imprimirErrorDatosInvalidos();
                                                ingresoDatos.nextLine();
                                                validarTipoCiclo = false;
                                            }
                                        } while (!validarTipoCiclo);
                                        
                                        // Ejecutar el Loading seleccionado
                                        ejecutarLoading(opcLoading, tipoCicloLoading, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12);
                                        
                                        System.out.print("\n¿Desea ejecutar otro Loading? (si/no): ");
                                        repetir = ingresoDatos.next().charAt(0);
                                        ingresoDatos.nextLine();
                                        
                                    } while (repetir == 's' || repetir == 'S');
                                    operacionValida = true;
                                    break;
                                case 7:
                                    // Recursion
                                    G5_Factorial fact=new G5_Factorial();
                                    G5_Sumar sum=new G5_Sumar();
                                    G5_Multiplicacion mul=new G5_Multiplicacion();
                                    G5_ContadorRegresivo reg=new G5_ContadorRegresivo();
                                    G5_ContadorProgresivo prog=new G5_ContadorProgresivo();
                                    G5_Potencia pot=new G5_Potencia();
                                    

                                        do {
                                             System.out.println(ROJO + "\n================== POLIRETOS - GRUPO 5 ==================" + RESET);
                                             System.out.println("Seleccione la operación que desea realizar:");
                                            System.out.println("1. Factorial");
                                            System.out.println("2. Suma");
                                            System.out.println("3. Multiplicación");
                                            System.out.println("4. Potencia");
                                            System.out.println("5. Conteo progresivo");
                                            System.out.println("6. Conteo regresivo");

                                        try {
                                         System.out.print("Opción (1–6): ");
                                        int opcion = ingresoDatos.nextInt();

                                        System.out.print("Seleccione el tipo de ciclo (for / while / do-while): ");
                                        String tipoCiclo = ingresoDatos.next().toLowerCase();

                                        int n = 0, a = 0, b = 0;

                                         // Solicitar valores según operación
                                        if (opcion == 1 || opcion == 5 || opcion == 6) {
                                            System.out.print("Ingrese el valor de n: ");
                                            n = ingresoDatos.nextInt();
                                        } else {
                                            System.out.print("Ingrese el valor de a: ");
                                            a = ingresoDatos.nextInt();
                                            System.out.print("Ingrese el valor de b: ");
                                            b = ingresoDatos.nextInt();
                                        }

                                        switch (opcion) {
                                        case 1: // Factorial
                                        switch (tipoCiclo) {
                                            case "for": System.out.println("Factorial con for: " + fact.g5_factorialFor(n)); break;
                                            case "while": System.out.println("Factorial con while: " + fact.g5_factorialWhile(n)); break;
                                            case "do-while": System.out.println("Factorial con do-while: " + fact.g5_factorialDoWhile(n)); break;
                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET); break;
                                        }
                                        break;

                                        case 2: // Suma
                                        switch (tipoCiclo) {
                                            case "for": System.out.println("Suma con for: " + sum.g5_sumarFor(a, b)); break;
                                            case "while": System.out.println("Suma con while: " + sum.g5_sumarWhile(a, b)); break;
                                            case "do-while": System.out.println("Suma con do-while: " + sum.g5_sumarDoWhile(a, b)); break;
                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET); break;
                                        }
                                        break;

                                        case 3: // Multiplicación
                                        switch (tipoCiclo) {
                                            case "for": System.out.println("Multiplicación con for: " + mul.g5_multiplicarFor(a, b)); break;
                                            case "while": System.out.println("Multiplicación con while: " + mul.g5_multiplicarWhile(a, b)); break;
                                            case "do-while": System.out.println("Multiplicación con do-while: " + mul.g5_multiplicarDoWhile(a, b)); break;
                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET); break;
                                        }
                                        break;

                                        case 4: // Potencia
                                        switch (tipoCiclo) {
                                            case "for": System.out.println("Potencia con for: " + pot.potenciaFor(a, b)); break;
                                            case "while": System.out.println("Potencia con while: " + pot.potenciaWhile(a, b)); break;
                                            case "do-while": System.out.println("Potencia con do-while: " + pot.potenciaDoWhile(a, b)); break;
                                            default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET); break;
                                        }
                                        break;

                                        case 5: // Conteo progresivo
                                        switch (tipoCiclo) {
                                        case "for": System.out.println("Conteo progresivo con for:"); prog.contarFor(n); break;
                                        case "while": System.out.println("Conteo progresivo con while:"); prog.contarWhile(n); break;
                                        case "do-while": System.out.println("Conteo progresivo con do-while:"); prog.contarDoWhile(n); break;
                                         default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET); break;
                                        }
                                        break;

                                        case 6: // Conteo regresivo
                                        switch (tipoCiclo) {
                                        case "for": System.out.println("Conteo regresivo con for:"); reg.contarDesdeFor(n); break;
                                        case "while": System.out.println("Conteo regresivo con while:"); reg.contarDesdeWhile(n); break;
                                        case "do-while": System.out.println("Conteo regresivo con do-while:"); reg.contarDesdeDoWhile(n); break;
                                         default: System.err.println(ROJO + "Tipo de ciclo no válido." + RESET); break;
                                        }
                                        break;

                                        default:
                                        System.err.println(ROJO + "La opción ingresada no es válida." + RESET);
                                         break;
                                        }

                                        } catch (Exception e) {
                                        System.err.println(ROJO + "Error: entrada inválida. Intente nuevamente." + RESET);
                                         ingresoDatos.nextLine(); // Limpiar buffer
                                    }

                                    System.out.print("\n¿Desea realizar otra operación? (s/n): ");
                                    repetir = ingresoDatos.next().charAt(0);

                                    } while (repetir == 's' || repetir == 'S');
                                      break;

                                case 8:
                                    // Grafos y automatas
                                    int opcAutCompi = 0;
                                    String cadenaEntrada = "";
                                    double numeroEntrada = 0.0;
                                    boolean entradaAutCompiValida;
                                    do {
                                        // 1. Mostrar el menú
                                        imprimirMenu(menuAutomatasCompiladores, "AUTÓMATAS Y COMPILADORES");

                                        entradaAutCompiValida = false;

                                        do {
                                            System.out.print("Opción ingresada: ");
                                            try {
                                                opcAutCompi = ingresoDatos.nextInt();
                                                ingresoDatos.nextLine();

                                                if (opcAutCompi >= 1 && opcAutCompi <= 9) {
                                                    entradaAutCompiValida = true;
                                                } else {
                                                    imprimirErrorOpcionIncorrecta();
                                                }
                                            } catch (InputMismatchException e) {
                                                imprimirErrorDatosInvalidos();
                                                ingresoDatos.nextLine();
                                                opcAutCompi = 0;
                                            }
                                        } while (!entradaAutCompiValida);
                                        if (opcAutCompi >= 1 && opcAutCompi <= 8) {
                                            System.out.println("\nIngrese la cadena/input a procesar:");
                                            cadenaEntrada = ingresoDatos.nextLine();

                                            System.out.print("Ingrese un número decimal/entero: ");
                                            try {
                                                numeroEntrada = ingresoDatos.nextDouble();
                                                ingresoDatos.nextLine();
                                            } catch (InputMismatchException e) {
                                                System.out.println("El valor ingresado no es un número válido.");
                                                ingresoDatos.nextLine();
                                                numeroEntrada = 0.0;
                                            }
                                        }

                                        switch (opcAutCompi) {
                                            case 1:
                                                Aut1 aut1 = new Aut1();
                                                aut1.validarCadena(cadenaEntrada);
                                                System.out.println("La cadena \"" + cadenaEntrada + "\" es "
                                                        + (aut1.validarCadena(cadenaEntrada) ? "válida" : "inválida"));
                                                break;
                                            case 2:
                                                Aut2 aut2 = new Aut2();
                                                aut2.validarCadena(cadenaEntrada);
                                                System.out.println("La cadena \"" + cadenaEntrada + "\" es "
                                                        + (aut2.validarCadena(cadenaEntrada) ? "válida" : "inválida"));
                                                break;
                                            case 3:
                                                Aut3 aut3 = new Aut3();
                                                aut3.validarCadena(cadenaEntrada);
                                                System.out.println("La cadena \"" + cadenaEntrada + "\" es "
                                                        + (aut3.validarCadena(cadenaEntrada) ? "válida" : "inválida"));
                                                break;
                                            case 4:
                                                Aut4 aut4 = new Aut4();
                                                aut4.validarCadena(cadenaEntrada);
                                                System.out.println("La cadena \"" + cadenaEntrada + "\" es "
                                                        + (aut4.validarCadena(cadenaEntrada) ? "válida" : "inválida"));
                                                break;
                                            case 5:
                                                Compi1 compi1 = new Compi1();
                                                compi1.validarNumero(numeroEntrada);
                                                break;
                                            case 6:
                                                Compi2 compi2 = new Compi2();
                                                compi2.validarCaracteres(cadenaEntrada);
                                                break;
                                            case 7:
                                                Compi3 compi3 = new Compi3();
                                                compi3.validarPalabraReservada(cadenaEntrada);
                                                break;
                                            case 8:
                                                Compi4 compi4 = new Compi4();
                                                compi4.validarCadena(cadenaEntrada);
                                                break;
                                            case 9:
                                                System.out.println("Regresando al menú de operaciones...");
                                                break;
                                        }
                                    } while (opcAutCompi != 9);
                                    break;

                                default:
                                    imprimirErrorOpcionIncorrecta();
                                    break;
                            }

                            if (opcionGeneral >= 1 && opcionGeneral <= 2) {
                                operacionValida = true;
                                System.out.println(
                                        "Si desea realizar otra operacción, digite 2. De lo contrario, digite 1.");

                                do {
                                    System.out.print("Opción ingresada: ");
                                    confirmacionValida = false;
                                    try {
                                        seguirOperaciones = ingresoDatos.nextInt();
                                        ingresoDatos.nextLine();
                                        if (seguirOperaciones == 1 || seguirOperaciones == 2)
                                            confirmacionValida = true;
                                        else
                                            imprimirErrorOpcionIncorrecta();

                                    } catch (InputMismatchException e) {
                                        imprimirErrorDatosInvalidos();
                                        ingresoDatos.nextLine();
                                    }

                                } while (!confirmacionValida);

                            }
                        } while (!operacionValida || seguirOperaciones == 2);
                        continuar = 1;
                        break;
                    case 3:
                        System.out.println("Usted ha salido del programa POLIRETOS - GRUPO 5");
                        entradaValida = true;
                        break;
                    default:
                        imprimirErrorOpcionIncorrecta();
                        break;
                }
                if (opcionGeneral != 3 && opcionGeneral != 2) {
                    do {
                        entradaValida = false;
                        System.out.print("Digite 1 para regresar al menú principal: ");
                        try {
                            continuar = ingresoDatos.nextInt();
                            ingresoDatos.nextLine();
                            if (continuar == 1)
                                entradaValida = true;
                            else
                                imprimirErrorRegresarMenu();

                        } catch (InputMismatchException e) {
                            imprimirErrorDatosInvalidos();
                            ingresoDatos.nextLine();
                        }
                    } while (continuar != 1);
                }
            } while (!entradaValida || opcionGeneral != 3);               
        } finally {
            if (ingresoDatos != null) {
                ingresoDatos.close();
            }
        }
        
      
    
    }

    private int leerEnteroValido(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int valor = ingresoDatos.nextInt();
                ingresoDatos.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                imprimirErrorDatosInvalidos();
                ingresoDatos.nextLine();
            }
        }
    }

    private String leerRespuestaSiNo() {
        String resUsuario;
        
        do {
            System.out.print("Respuesta (si/no): ");
            resUsuario = ingresoDatos.nextLine().trim().toLowerCase();
            resUsuario = Normalizer.normalize(resUsuario, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
            if (!resUsuario.equals("si") && !resUsuario.equals("no")) imprimirErrorOpcionIncorrecta();
        } while (!resUsuario.equals("si") && !resUsuario.equals("no"));

    return resUsuario;
    }

    private void imprimirMatrizChar(char[][] iniciales) {
        for (char[] fila : iniciales) {
            System.out.println(new String(fila));
        }
    }

    public void imprimirErrorFrase() {
        System.err.println(ROJO + "\n============= ERROR =============");
        System.err.println("La frase no contiene los caracteres necesarios para realizar la operación." + RESET + "\n");
    }

    public void imprimirResultadoFrase(String resultado) {
        System.out.println("\n========== RESULTADO ==========");
        System.out.println("La nueva frase es " + resultado + "\n");
    }

    public void imprimirErrorTipoDato() {
        System.err.println(ROJO + "\n============= ERROR =============");
        System.err.println("El dato ingresado no coincide con el tipo de dato solicitado" + RESET + "\n");
    }

    public void ejecutarFigura(int numero, String tipoCiclo, int filas, int serieDeNumeros) {
        G5_S1Figuras fg1 = new G5_S1Figuras();
        G5_S2Figuras fg2 = new G5_S2Figuras();
        G5_S3Figuras fg3 = new G5_S3Figuras();
        G5_S4Figuras fg4 = new G5_S4Figuras();
        G5_S5Figuras fg5 = new G5_S5Figuras();
        G5_S6Figuras fg6 = new G5_S6Figuras();
        G5_S7Figuras fg7 = new G5_S7Figuras();
        G5_S8Figuras fg8 = new G5_S8Figuras();
        G5_S9Figuras fg9 = new G5_S9Figuras();
        G5_S10Figuras fg10 = new G5_S10Figuras();
        G5_S11Figuras fg11 = new G5_S11Figuras();
        G5_S12Figuras fg12 = new G5_S12Figuras();
        G5_S13Figuras fg13 = new G5_S13Figuras();
        G5_S14Figuras fg14 = new G5_S14Figuras();
        G5_S15Figuras fg15 = new G5_S15Figuras();
        G5_S16Figuras fg16 = new G5_S16Figuras();
        G5_S17Figuras fg17 = new G5_S17Figuras();
        G5_S18Figuras fg18 = new G5_S18Figuras();
        G5_S19Figuras fg19 = new G5_S19Figuras();

        switch (numero) {
            case 1:
                switch (tipoCiclo) {
                    case "for":
                        fg1.g5_figuraN1For(filas);
                        break;
                    case "while":
                        fg1.g5_figuraN1While(filas);
                        break;
                    case "doWhile":
                        fg1.g5_figuraN1DoWhile(filas);
                        break;
                }
                break;
            case 2:
                switch (tipoCiclo) {
                    case "for":
                        fg2.g5_figuraN2For(filas);
                        break;
                    case "while":
                        fg2.g5_figuraN2While(filas);
                        break;
                    case "doWhile":
                        fg2.g5_figuraN2DoWhile(filas);
                        break;
                }
                break;
            case 3:
                switch (tipoCiclo) {
                    case "for":
                        fg3.g5_figuraN3For(filas);
                        break;
                    case "while":
                        fg3.g5_figuraN3While(filas);
                        break;
                    case "doWhile":
                        fg3.g5_figuraN3DoWhile(filas);
                        break;
                }
                break;
            case 4:
                switch (tipoCiclo) {
                    case "for":
                        fg4.g5_figuraN4For(filas);
                        break;
                    case "while":
                        fg4.g5_figuraN4While(filas);
                        break;
                    case "doWhile":
                        fg4.g5_figuraN4DoWhile(filas);
                        break;
                }
                break;
            case 5:
                switch (tipoCiclo) {
                    case "for":
                        fg5.g5_figuraN5For(filas);
                        break;
                    case "while":
                        fg5.g5_figuraN5While(filas);
                        break;
                    case "doWhile":
                        fg5.g5_figuraN5DoWhile(filas);
                        break;
                }
                break;
            case 6:
                switch (tipoCiclo) {
                    case "for":
                        fg6.g5_figuraN6For(filas);
                        break;
                    case "while":
                        fg6.g5_figuraN6While(filas);
                        break;
                    case "doWhile":
                        fg6.g5_figuraN6DoWhile(filas);
                        break;
                }
                break;
            case 7:
                switch (tipoCiclo) {
                    case "for":
                        fg7.g5_figuraN7For(filas);
                        break;
                    case "while":
                        fg7.g5_figuraN7While(filas);
                        break;
                    case "doWhile":
                        fg7.g5_figuraN7DoWhile(filas);
                        break;
                }
                break;
            case 8:
                switch (tipoCiclo) {
                    case "for":
                        fg8.g5_figuraN8For(filas);
                        break;
                    case "while":
                        fg8.g5_figuraN8While(filas);
                        break;
                    case "doWhile":
                        fg8.g5_figuraN8DoWhile(filas);
                        break;
                }
                break;
            case 9:
                switch (tipoCiclo) {
                    case "for":
                        fg9.g5_figuraN9For(filas);
                        break;
                    case "while":
                        fg9.g5_figuraN9While(filas);
                        break;
                    case "doWhile":
                        fg9.g5_figuraN9DoWhile(filas);
                        break;
                }
                break;
            case 10:
                switch (tipoCiclo) {
                    case "for":
                        fg10.g5_figuraN10For(filas);
                        break;
                    case "while":
                        fg10.g5_figuraN10While(filas);
                        break;
                    case "doWhile":
                        fg10.g5_figuraN10DoWhile(filas);
                        break;
                }
                break;
            case 11:
                switch (tipoCiclo) {
                    case "for":
                        fg11.g5_crearFigura11For(filas);
                        break;
                    case "while":
                        fg11.g5_crearFigura11While(filas);
                        break;
                    case "doWhile":
                        fg11.g5_crearFigura11DoWhile(filas);
                        break;
                }
                break;
            case 12:
                switch (tipoCiclo) {
                    case "for":
                        fg12.g5_crearFigura12For(serieDeNumeros);
                        break;
                    case "while":
                        fg12.g5_crearFigura12While(serieDeNumeros);
                        break;
                    case "doWhile":
                        fg12.g5_crearFigura12DoWhile(serieDeNumeros);
                        break;
                }
                break;
            case 13:
                switch (tipoCiclo) {
                    case "for":
                        fg13.g5_Figuras13For(filas);
                        break;
                    case "while":
                        fg13.g5_Figuras13While(filas);
                        break;
                    case "doWhile":
                        fg13.g5_Figuras13DoWhile(filas);
                        break;
                }
                break;
            case 14:
                switch (tipoCiclo) {
                    case "for":
                        fg14.g5_S14FigurasFor(filas);
                        break;
                    case "while":
                        fg14.g5_S14FigurasWhile(filas);
                        break;
                    case "doWhile":
                        fg14.g5_S14FigurasDoWhile(filas);
                        break;
                }
                break;
            case 15:
                switch (tipoCiclo) {
                    case "for":
                        fg15.g5_Figuras15For(filas);
                        break;
                    case "while":
                        fg15.g5_Figuras15While(filas);
                        break;
                    case "doWhile":
                        fg15.g5_Figuras15DoWhile(filas);
                        break;
                }
                break;
            case 16:
                switch (tipoCiclo) {
                    case "for":
                        fg16.g5_Figuras16For(filas);
                        break;
                    case "while":
                        fg16.g5_Figuras16While(filas);
                        break;
                    case "doWhile":
                        fg16.g5_Figuras16DoWhile(filas);
                        break;
                }
                break;
            case 17:
                switch (tipoCiclo) {
                    case "for":
                        fg17.g5_Figuras17For(filas);
                        break;
                    case "while":
                        fg17.g5_Figuras17While(filas);
                        break;
                    case "doWhile":
                        fg17.g5_Figuras17DoWhile(filas);
                        break;
                }
                break;
            case 18:
                switch (tipoCiclo) {
                    case "for":
                        fg18.g5_Figuras18For(filas);
                        break;
                    case "while":
                        fg18.g5_Figuras18While(filas);
                        break;
                    case "doWhile":
                        fg18.g5_Figuras18DoWhile(filas);
                        break;
                }
                break;
            case 19:
                switch (tipoCiclo) {
                    case "for":
                        fg19.g5_Figuras19For(filas);
                        break;
                    case "while":
                        fg19.g5_Figuras19While(filas);
                        break;
                    case "doWhile":
                        fg19.g5_Figuras19DoWhile(filas);
                        break;
                }
        }
    }

    public void imprimirErrorTipoCiclo() {
        System.err.println(ROJO + "\n============= ERROR =============");
        System.err.println("Tipo de ciclo no válido" + RESET + "\n");
    }

    public void imprimirErrorRegresarMenu() {
        System.err.println(ROJO + "\n============= ERROR =============");
        System.err.println("Digite 1 para regresar al menu general." + RESET + "\n");
    }

    public void imprimirErrorOpcionIncorrecta() {
        System.err.println(ROJO + "\n============= ERROR =============");
        System.err.println("La opción ingresada no es correcta. Intente nuevamente." + RESET + "\n");
    }

    public void imprimirErrorDatosInvalidos() {
        System.err.println(ROJO + "\n============= ERROR =============");
        System.err.println("El valor ingresado no es válido. Intente nuevamente." + RESET + "\n");
    }

    public void imprimirTitulo() {

        String titulo = "================== POLIRETOS - GRUPO 5 ==================";
        System.out.println(ROJO + " ".repeat(15) + titulo + RESET);
        System.out.println(" ".repeat(30) + "Bienvenido a Poliretos.");
        System.out.println(" ".repeat(30) + "Por favor, elija una opción: ");
        System.out.println();

    }

    public void imprimirMenu(String[] datos, String nombreMenu) {

        String subtitulo = "================= " + nombreMenu.toUpperCase() + " ================";
        int offset = 60 - subtitulo.length();
        System.out.println(VERDE + " ".repeat(offset) + subtitulo + RESET);

        for (String elemento : datos) {
            int espaciosDentro = subtitulo.length() - 2 - elemento.length();
            if (espaciosDentro < 0)
                espaciosDentro = 0;

            String textoMenu = "|" + elemento + " ".repeat(espaciosDentro) + "|";

            System.out.println(" ".repeat(offset) + textoMenu);
        }

        System.out.println(" ".repeat(offset) + "_".repeat(subtitulo.length()) + "\n");
    }

    public void ejecutarLoading(int numeroLoading, int tipoCiclo, G5_S1Loading l1, G5_S2Loading l2, 
                                 G5_S3Loading l3, G5_S4Loading l4, G5_S5Loading l5, G5_S6Loading l6,
                                 G5_S7Loading l7, G5_S8Loading l8, G5_S9Loading l9, G5_S10Loading l10,
                                 G5_S11Loading l11, G5_S12Loading l12) {
        
        switch (numeroLoading) {
            case 1:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l1.g5_L01_RotacionSimple_FOR();
                        break;
                    case 2: // WHILE
                        l1.g5_L01_RotacionSimple_While();
                        break;
                    case 3: // DO WHILE
                        l1.g5_L01_RotacionSimple_DoWhile();
                        break;
                }
                break;
            case 2:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l2.g5_L02_BarraFija_For();
                        break;
                    case 2: // WHILE
                        l2.g5_L02_BarraFija_WHILE();
                        break;
                    case 3: // DO WHILE
                        l2.g5_L02_BarraFija_DoWHILE();
                        break;
                }
                break;
            case 3:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l3.g5_L03_DesplazamientoSimple_FOR();
                        break;
                    case 2: // WHILE
                        l3.g5_L03_DesplazamientoSimple_WHILE();
                        break;
                    case 3: // DO WHILE
                        l3.g5_L03_DesplazamientoSimple_DoWHILE();
                        break;
                }
                break;
            case 4:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l4.g5_L04_Waiting_For();
                        break;
                    case 2: // WHILE
                        l4.g5_L04_Waiting_WHILE();
                        break;
                    case 3: // DO WHILE
                        l4.g5_L04_Waiting_DOWHILE();
                        break;
                }
                break;
            case 5:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l5.g5_L05_PuntaDinamica_FOR();
                        break;
                    case 2: // WHILE
                        l5.g5_L05_PuntaDinamica_WHILE();
                        break;
                    case 3: // DO WHILE
                        l5.g5_L05_PuntaDinamica_DOWHILE();
                        break;
                }
                break;
            case 6:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l6.g5_L06_DesplazamientoDoble_FOR();
                        break;
                    case 2: // WHILE
                        l6.g5_L06_DesplazamientoDoble_WHILE();
                        break;
                    case 3: // DO WHILE
                        l6.g5_L06_DesplazamientoDoble_DOWHILE();
                        break;
                }
                break;
            case 7:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l7.g5_L07_BarraPuntaRotacional_For();
                        break;
                    case 2: // WHILE
                        l7.g5_L07_BarraPuntaRotacional_WHILE();
                        break;
                    case 3: // DO WHILE
                        l7.g5_L07_BarraPuntaRotacional_DOWHILE();
                        break;
                }
                break;
            case 8:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l8.g5_L08_CargaPorNombre_FOR();
                        break;
                    case 2: // WHILE
                        l8.g5_L08_CargaPorNombre_WHILE();
                        break;
                    case 3: // DO WHILE
                        l8.g5_L08_CargaPorNombre_DOWHILE();
                        break;
                }
                break;
            case 9:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l9.g5_L09_NombreLetra_FOR();
                        break;
                    case 2: // WHILE
                        l9.g5_L09_NombreLetra_WHILE();
                        break;
                    case 3: // DO WHILE
                        l9.g5_L09_NombreLetra_DOWHILE();
                        break;
                }
                break;
            case 10:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l10.g5_L10_CargaArchivo_FOR();
                        break;
                    case 2: // WHILE
                        l10.g5_L10_CargaArchivo_WHILE();
                        break;
                    case 3: // DO WHILE
                        l10.g5_L10_CargaArchivo_DOWHILE();
                        break;
                }
                break;
            case 11:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l11.g5_L11_BarraSonido_FOR();
                        break;
                    case 2: // WHILE
                        l11.g5_L11_BarraSonido_WHILE();
                        break;
                    case 3: // DO WHILE
                        l11.g5_L11_BarraSonido_DOWHILE();
                        break;
                }
                break;
            case 12:
                switch (tipoCiclo) {
                    case 1: // FOR
                        l12.g5_L12_DesplazarFigura_FOR();
                        break;
                    case 2: // WHILE
                        l12.g5_L12_DesplazarFigura_WHILE();
                        break;
                    case 3: // DO WHILE
                        l12.g5_L12_DesplazarFigura_DOWHILE();
                        break;
                }
                break;
            default:
                imprimirErrorOpcionIncorrecta();
                break;
        }
    }

}
