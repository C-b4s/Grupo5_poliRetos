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
import src.Poliretos.cadenaCaracteres.G5_adivinarAnagramas;
import src.Poliretos.cadenaCaracteres.G5_alternarMayusYMinus;
import src.Poliretos.cadenaCaracteres.G5_contarConsonantes;
import src.Poliretos.cadenaCaracteres.G5_contarVocales;
import src.Poliretos.cadenaCaracteres.G5_convertirAMayusSinJ;
import src.Poliretos.cadenaCaracteres.G5_eliminarConsonante;
import src.Poliretos.cadenaCaracteres.G5_eliminarVocal;
import src.Poliretos.cadenaCaracteres.G5_invertirConConsonantesEnMayus;
import src.Poliretos.cadenaCaracteres.G5_invertirConVocalesEnMayus;
import src.Poliretos.cadenaCaracteres.G5_contarVocales;
import src.Poliretos.automatas.automatas1.Aut1;
import src.Poliretos.automatas.automatas2.Aut2;
import src.Poliretos.automatas.automatas3.Aut3;
import src.Poliretos.automatas.automatas4.Aut4;
import src.Poliretos.automatas.compiladorDecimal.Compi1;
import src.Poliretos.automatas.compiladorLenguaje.Compi2;
import src.Poliretos.automatas.compiladorVariable.Compi3;
import src.Poliretos.automatas.validadorClave.Compi4;

public class Controller_Poliretos {
    public final String ROJO = "\u001B[31m";
    public final String RESET = "\u001B[0m";
    public final String VERDE = "\u001B[32m";

    Integer operaciones;

    public void inicializar() {
        Scanner ingresoDatos = null;
        try {
            ingresoDatos = new Scanner(System.in);
            int opcionGeneral = 0, continuar = 0, operacionARealizar = 0, seguirOperaciones = 0, opcBucles = 0,
                    seleccionPolireto = 0, numero = 0;

            String[] opcMenuPrincipal = { "1. Ver integrantes del grupo", "2. Ingresar al menú de operaciones",
                    "3. Salir" };
            String[] secciones = { "1. Series numericas", "2. Series de caracteres", "3. Figuras",
                    "4. Cadenas de caracteres", "5. Arrays", "6. Loading", "7. Recursion", "8. Grafos y automatas" };
            String[] integrantes = { "1. Matias Quinchiguango", "2. Micaela Sajal", "3. Michael Sotomayor",
                    "4. Robbinson Tandazo", "5. Victoria Torres", "6. Sebastián Zúñiga" };
            String[] opcMenuPoliretos = { "1.-Seleccionar Metodo a usar", "2.-Salir al menú de operaciones" };
            String[] bucles = { "1.-FOR", "2.-WHILE", "3.-DO WHILE" };
            String[] cantidadFig = { "Seleccionar: ", "1", "2", "3", ".", ".", ".", "18", "19" };
            String[] menuAutomatasCompiladores = { "1. Autómata a*b+c", "2. Autómata ab+ca", "3. Autómata a+|b+|c+",
                    "4. Autómata (ab|bc)+ ", "5. Compilador de números decimales",
                    "6. Compilador de lenguaje específico", "7. Compilador de declaración de variables",
                    "8. Validador de claves", "9. Salir al menú de operaciones" };

            boolean entradaValida, operacionValida, confirmacionValida, poliretosValida;

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

                switch (opcionGeneral) {
                    case 1:
                        imprimirMenu(integrantes, "integrantes");
                        break;
                    case 2:
                        do {
                            operacionValida = false;
                            imprimirMenu(secciones, "operaciones");
                            System.out.print("Operación seleccionada: ");
                            try {
                                seleccionPolireto = ingresoDatos.nextInt();
                                ingresoDatos.nextLine();
                                if (seleccionPolireto >= 1 && seleccionPolireto <= 8)
                                    operacionValida = true;
                                else
                                    imprimirErrorOpcionIncorrecta();

                            } catch (InputMismatchException e) {
                                imprimirErrorDatosInvalidos();
                                ingresoDatos.nextLine();
                            }
                            switch (seleccionPolireto) {
                                case 1:
                                    // Series numericas
                                    break;
                                case 2:
                                    // Series de caracteres
                                    break;
                                case 3:
                                    // Figuras
                                    do {
                                        imprimirMenu(opcMenuPoliretos, "figuras");
                                        poliretosValida = false;
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
                                        switch (seleccionPolireto) {
                                            case 1:
                                                do {
                                                    imprimirMenu(bucles, "metodos");
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
                                                    imprimirMenu(cantidadFig, "FIGURAS (1-19)");
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
                                                    if (confirmacionValida) {
                                                        System.out.println(
                                                                "Digite el número de filas que desea para la figura:");
                                                        int numeroFilas = 0;
                                                        do {
                                                            System.out.print("Número de filas: ");
                                                            try {
                                                                numeroFilas = ingresoDatos.nextInt();
                                                                ingresoDatos.nextLine();
                                                                if (numeroFilas > 0)
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
                                case 4:
                                    int opcCadenas = 0;
                                    boolean validarOpcCadena, validarFrase, validarBucle, datoValido;
                                    String otroBucle = "", otraOperacion = "";
                                    String[] cadenasCaracteres = { "Cadenas 1)", "Cadenas 2)", "Cadenas 3)",
                                            "Cadenas 4)", "Cadenas 5)", "Cadenas 6)", "Cadenas 7)", "Cadenas 8)",
                                            "Cadenas 9)" };
                                    System.out.println(
                                            "Usted ha seleccionado realizar operaciones con cadenas de caracteres.");
                                    
                                    do{
                                                                            
                                    imprimirMenu(cadenasCaracteres, "cadenas de caracteres");
                                    
                                    do {
                                        datoValido = false;
                                        try {
                                        System.out.print("Opción ingresada: ");
                                        opcCadenas = ingresoDatos.nextInt();
                                        ingresoDatos.nextLine();

                                        if (opcCadenas >= 1 && opcCadenas <= 9) datoValido = true;
                                        else imprimirErrorOpcionIncorrecta();

                                        } catch (InputMismatchException e) {
                                            imprimirErrorDatosInvalidos();
                                        }     
                                    } while (!datoValido);
                                    
                                    validarOpcCadena = false;
                                    switch (opcCadenas) {
                                        case 1:
                                            G5_contarVocales cadenasUno = new G5_contarVocales();
                                            String fraseVocales = "";

                                            System.out
                                                    .println("Usted ha seleccionado realizar la operación Cadenas 1)");

                                            
                                            System.out.print("Ingrese una frase: ");
                                            fraseVocales = ingresoDatos.nextLine().toLowerCase();
                                                    
                                                                                 
                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[1]);
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
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    System.out.print("Respuesta: ");
                                                    do{
                                                        try {
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (otroBucle != "si" && otroBucle != "no");
                                                }
                                                

                                            }while (!validarBucle || otroBucle.equals("si"));
                                            break;
                                        case 2:
                                            G5_contarConsonantes cadenasDos = new G5_contarConsonantes();
                                            String fraseConsonantes;

                                            System.out
                                                    .println("Usted ha seleccionado realizar la operación Cadenas 2)");

                                            
                                            System.out.print("Ingrese una frase: ");
                                            fraseConsonantes = ingresoDatos.nextLine().toLowerCase();
                                                    
                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[1]);
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
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    System.out.print("Respuesta: ");

                                                    do{
                                                        try {
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (otroBucle != "si" && otroBucle != "no");
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
                                                    if (fraseEliminarVocal.matches("[aeiouáéíóú]")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);

                                            System.out.print("Ingrese una vocal para eliminarla: ");

                                            do {
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
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    System.out.print("Respuesta: ");

                                                    do{
                                                        try {
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (otroBucle != "si" && otroBucle != "no");
                                                }
                                            break;
                                            
                                        }while (!validarBucle || otroBucle.equals("si"));
                                        case 4:
                                            G5_eliminarConsonante cadenasCuatro = new G5_eliminarConsonante();
                                            String fraseEliminarConsonante;
                                            String consonante;
                                            String textoSinConsonante;

                                            System.out.println("Usted ha seleccionado realizar la operación Cadena 4)");

                                            
                                            System.out.print("Ingrese una frase: ");
                                            do {
                                                validarFrase = false;
                                                    System.out.print("Ingrese una frase: ");
                                                    fraseEliminarConsonante = ingresoDatos.nextLine().toLowerCase();
                                                    if (fraseEliminarConsonante.matches("[a-zñáéíóú]")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);

                                            System.out.print("Ingrese una consonante para eliminarla: ");
                                            do {
                                                consonante = ingresoDatos.nextLine().toLowerCase();
                                                esVocal = "áéíóúaeiou".contains(consonante);
                                                if (esVocal) {
                                                    imprimirErrorTipoDato();
                                                }
                                            } while (esVocal);
                                            char consonanteEliminada = consonante.charAt(0);
                                            validarBucle = false;

                                            do{
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

                                            switch (opcBucles) {
                                                case 1:
                                                    System.out.println("Usted ha seleccionado usar el bucle for para la operación Cadenas 4)");
                                                    textoSinConsonante = cadenasCuatro.g5_eliminarConsonanteFor(fraseEliminarConsonante, consonanteEliminada);
                                                    imprimirResultadoFrase(textoSinConsonante);
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle for para la operación Cadenas 4)");
                                                    textoSinConsonante = cadenasCuatro.g5_eliminarConsonanteFor(
                                                            fraseEliminarConsonante, consonanteEliminada);
                                                    System.out.println("La nueva frase es: " + textoSinConsonante);
                                                    break;

                                                case 2:
                                                    System.out.println(
                                                            "Usted ha seleccionado usar el bucle while para la operación Cadenas 4)");
                                                    textoSinConsonante = cadenasCuatro.g5_eliminarConsonanteWhile(
                                                            fraseEliminarConsonante, consonanteEliminada);
                                                    System.out.println("La nueva frase es: " + textoSinConsonante);
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
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    System.out.print("Respuesta: ");

                                                    do{
                                                        try {
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (otroBucle != "si" && otroBucle != "no");
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
                                                    if (textoCadCinco.matches("[aeiouáéíóú]")) validarFrase = true;
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
                                                System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                System.out.print("Respuesta: ");

                                                do{
                                                    try {
                                                         otroBucle = ingresoDatos.nextLine();
                                                        otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                        if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                    } catch (InputMismatchException e) {
                                                        imprimirErrorDatosInvalidos();
                                                    }
                                                        
                                                }while (otroBucle != "si" && otroBucle != "no");
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
                                                    if (textoCadSeis.matches("[aeiouáéíóú]")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);

                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[5]);
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
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    System.out.print("Respuesta: ");

                                                    do{
                                                        try {
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (otroBucle != "si" && otroBucle != "no");
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
                                                    if (textoCadSiete.matches("[aeiouáéíóú]")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);
                                            
                                            do{
                                                imprimirMenu(bucles, "bucles " + cadenasCaracteres[6]);
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
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    System.out.print("Respuesta: ");

                                                    do{
                                                        try {
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (otroBucle != "si" && otroBucle != "no");
                                            }

                                        }while (!validarBucle || otroBucle.equals("si"));
                                        break;

                                        case 8:
                                            G5_adivinarAnagramas cadenasOcho = new G5_adivinarAnagramas();
                                            Scanner adivinaAnagrama = new Scanner (System.in);

                                            System.out.println("Usted ha seleccionado realizar la operación Cadenas 8)");
                                            imprimirMenu(bucles, "bucles " + cadenasCaracteres[7]);
                                            
                                            do{
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
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    System.out.print("Respuesta: ");

                                                    do{
                                                        try {
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (otroBucle != "si" && otroBucle != "no");
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
                                                    if (textoCadNueve.matches("[aeiouáéíóú]")) validarFrase = true;
                                                    else imprimirErrorFrase();
                                            } while (!validarFrase);

                                            do{
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
                                                    System.out.println("Si desea probar otro bucle, escriba si. De lo contrario, escriba no");
                                                    System.out.print("Respuesta: ");
                                                    
                                                    do{
                                                        try {
                                                            otroBucle = ingresoDatos.nextLine();
                                                            otroBucle = Normalizer.normalize(otroBucle, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                                        } catch (InputMismatchException e) {
                                                            imprimirErrorDatosInvalidos();
                                                        }
                                                        
                                                    }while (otroBucle != "si" && otroBucle != "no");
                                                }
                                        }while (!validarBucle || otroBucle.equals("si"));
                                        break;
                                        default:
                                            imprimirErrorOpcionIncorrecta();
                                            break;

                                    }
                                    if (opcCadenas >= 1 && opcCadenas <= 8){
                                        validarOpcCadena = true;
                                        System.out.println("Si desea realizar otra operación con cadenas, escriba si. De lo contrario, escriba no");
                                        do{
                                        try {
                                            otraOperacion = Normalizer.normalize(otraOperacion, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
                                            if (!otroBucle.equals("si") && !otroBucle.equals("no")) imprimirErrorOpcionIncorrecta();
                                        } catch (InputMismatchException e) {
                                            imprimirErrorDatosInvalidos();
                                        }
              
                                        }while (otraOperacion != "si" && otraOperacion != "no");
                                    }
                                }while (!validarOpcCadena || otraOperacion.equals("si"));
                                break;
                                
                                case 5:
                                    // Arrays
                                    break;
                                case 6:
                                    // Loading
                                    break;
                                case 7:
                                    // Recursion
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
                                    operacionARealizar = 0;
                                    break;
                            }

                            if (operacionValida) {
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

    private void imprimirErrorFrase() {
        System.err.println(ROJO + "\n============= ERROR =============");
        System.err.println("La frase no contiene los caracteres necesarios para realizar la operación.");
    }

    private void imprimirResultadoFrase(String resultado) {
        System.out.println("\n========== RESULTADO ==========");
        System.out.println("La nueva frase es " + resultado);
    }

    private void imprimirErrorTipoDato() {
        System.err.println(ROJO + "\n============= ERROR =============");
        System.err.println("El dato ingresado no coincide con el tipo de dato solicitado");
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
            default:
                System.out.println("Número de figura no válido");
                break;
        }
    }

    public void imprimirErrorTipoCiclo() {
        System.err.println(ROJO + "\n============= ERROR =============");
        System.err.println("Tipo de ciclo no válido");
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

}
