package src.Poliretos;
import java.util.InputMismatchException;
import java.util.Scanner;

import src.Poliretos.Figuras.G5_S11Figuras;
import src.Poliretos.Figuras.G5_S12Figuras;
import src.Poliretos.Figuras.G5_S13Figuras;
import src.Poliretos.Figuras.G5_S14Figuras;
import src.Poliretos.Figuras.G5_S15Figuras;
import src.Poliretos.Figuras.G5_S16Figuras;
import src.Poliretos.Figuras.G5_S17Figuras;
import src.Poliretos.Figuras.G5_S18Figuras;
import src.Poliretos.Figuras.G5_S19Figuras;
import src.Poliretos.cadenaCaracteres.G5_contarVocales;


public class Controller_Poliretos {
    public final String ROJO = "\u001B[31m";
    public final String RESET = "\u001B[0m";
    public final String VERDE = "\u001B[32m";
    
    Integer operaciones;
        public void iniciar(){ 
            Scanner ingresoDatos = null;
            try {
                ingresoDatos = new Scanner(System.in);
            int opcionGeneral = 0, continuar = 0, operacionARealizar = 0, seguirOperaciones = 0, opcBucles = 0;
            
            String [] opcMenuPrincipal = {"1. Ver integrantes del grupo", "2. Ingresar al menú de operaciones", "3. Salir"};
            String [] secciones = {"1. Series numericas", "2. Series de caracteres", "3. Figuras", "4. Cadenas de caracteres", "5. Arrays", "6. Loading", "7. Recursion", "8. Grafos y automatas"};
            String [] integrantes = {"1. Matias Quinchiguango", "2. Micaela Sajal", "3. Michael Sotomayor", "4. Robbinson Tandazo", "5. Victoria Torres", "6. Sebastián Zúñiga"};
            String [] opcMenuPoliretos={"1.-Seleccionar Metodo a usar","2.-Salir al menú de operaciones"};
            String [] opcMetodos={"1.-FOR","2.-WHILE","3.-DO WHILE"};
            String [] cantidadFig={"1","2","3",".",".",".","18","19"};

            boolean entradaValida, operacionValida, confirmacionValida , poliretosValida;

            imprimirTitulo();
                 

        do{   
            imprimirMenu(opcMenuPrincipal, "menu general");
           entradaValida = false;
            do{
                
            try {
                System.out.print("Opción ingresada: ");
                opcionGeneral = ingresoDatos.nextInt();
                ingresoDatos.nextLine();

                if (opcionGeneral >= 1 && opcionGeneral <= 3){
                    entradaValida = true;
                }else{
                    imprimirErrorOpcionIncorrecta();
                }
                
            } catch (InputMismatchException e) {
                imprimirErrorDatosInvalidos();
                ingresoDatos.nextLine();
            }
            }while (!entradaValida);    
            

              
            
            switch (opcionGeneral) {
                case 1:
                    imprimirMenu(integrantes, "integrantes");
                    break;
                case 2:
                    do {
                        operacionValida = false;
                        imprimirMenu(secciones, "operaciones");
                        try {
                            operacionSelPolireto = ingresoDatos.nextInt();
                            ingresoDatos.nextLine();
                            if (operacionSelPolireto >= 1 && operacionSelPolireto <= 8) operacionValida = true;
                            else imprimirErrorOpcionIncorrecta();

                        } catch (InputMismatchException e) {
                            imprimirErrorDatosInvalidos();
                            ingresoDatos.nextLine();
                        }
                        switch(operacionARealizar) {
                            case 1:
                                // Series numericas
                                break;
                            case 2:
                                // Series de caracteres
                                break;
                            case 3:
                                // Figuras
                                do {
                                    imprimirMenu(opcMenuPoliretos, "FIGURAS");
                                    poliretosValida = false;
                                    System.out.print("Opción ingresada: ");
                                    try {
                                        operacionSelPolireto = ingresoDatos.nextInt();
                                        ingresoDatos.nextLine();
                                        if (operacionSelPolireto >= 1 && operacionSelPolireto <= 2) poliretosValida = true;
                                        else imprimirErrorOpcionIncorrecta();
                                    } catch (InputMismatchException e) {
                                        imprimirErrorDatosInvalidos();
                                        ingresoDatos.nextLine();
                                    }
                                    switch (operacionSelPolireto) {
                                    case 1:
                                        do {
                                            imprimirMenu(opcMetodos, "METODOS");
                                            confirmacionValida = false;
                                            System.out.print("Opción ingresada: ");
                                            try {
                                                operaciones = ingresoDatos.nextInt();
                                                ingresoDatos.nextLine();
                                                if (operaciones >= 1 && operaciones <= 3) confirmacionValida = true;
                                                else imprimirErrorOpcionIncorrecta();
                                            } catch (InputMismatchException e) {
                                        imprimirErrorDatosInvalidos();
                                        ingresoDatos.nextLine();
                                    }
                                    imprimirMenu(cantidadFig, "SELECCIONE QUE FIGURA DESEA REALIZAR (1-19)");
                                    System.out.print("Opción ingresada: ");
                                    try {
                                        numero = ingresoDatos.nextInt();
                                        ingresoDatos.nextLine();
                                        if (numero >= 1 && numero <= 19) confirmacionValida = true;
                                        else imprimirErrorOpcionIncorrecta();
                                    } catch (InputMismatchException e) {
                                        imprimirErrorDatosInvalidos();
                                        ingresoDatos.nextLine();
                                    }
                                    if (confirmacionValida) {
                                        System.out.println("Digite el número de filas que desea para la figura:");
                                        int numeroFilas = 0;
                                        do {
                                            System.out.print("Número de filas: ");
                                            try {
                                                numeroFilas = ingresoDatos.nextInt();
                                                ingresoDatos.nextLine();
                                                if (numeroFilas > 0) confirmacionValida = true;
                                                else imprimirErrorOpcionIncorrecta();
                                            } catch (InputMismatchException e) {
                                                imprimirErrorDatosInvalidos();
                                                ingresoDatos.nextLine();
                                            }
                                        } while (!confirmacionValida);
                                        System.out.println("Digite la serie de números que desea para ciertas figuras :");
                                        int serieDeNumeros = 0;
                                        do {
                                            System.out.print("Serie de números: ");
                                            try {
                                                serieDeNumeros = ingresoDatos.nextInt();
                                                ingresoDatos.nextLine();
                                                if (serieDeNumeros > 0) confirmacionValida = true;
                                                else imprimirErrorOpcionIncorrecta();
                                            } catch (InputMismatchException e) {
                                                imprimirErrorDatosInvalidos();
                                                ingresoDatos.nextLine();
                                            }
                                        } while (!confirmacionValida);
                                        System.out.println("Generando figura...\n");
                                        switch (operaciones) {
                                        case 1: // FOR
                                            ejecutarFigura(numero, "for",numeroFilas,serieDeNumeros);
                                            break;
                                        case 2: // WHILE
                                            ejecutarFigura(numero, "while",numeroFilas,serieDeNumeros);
                                            break;
                                        case 3: // DO WHILE
                                            ejecutarFigura(numero, "doWhile",numeroFilas,serieDeNumeros);
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
                                String [] cadenasCaracteres = {"Cadenas 1)", "Cadenas 2)", "Cadenas 3)", "Cadenas 4)", "Cadenas 5)", "Cadenas 6)", "Cadenas 7)", "Cadenas 8)", "Cadenas 9)"};
                                String [] bucles = {"for", "do-while", "while"};
                                System.out.println("Usted ha seleccionado realizar operaciones con cadenas de caracteres.");
                                imprimirMenu(cadenasCaracteres, "CADENAS DE CARACTERES");
                                opcCadenas = ingresoDatos.nextInt();
                                ingresoDatos.nextLine();
                                
                                switch (opcCadenas){
                                    case 1:
                                        System.out.println("Usted ha seleccionado realizar la operación C01");
                                        System.out.println("Seleccione el tipo de método que desea utilizar: ");
                                        imprimirMenu(bucles, "bucles" + cadenasCaracteres[0]);

                                        opcBucles = ingresoDatos.nextInt();
                                        ingresoDatos.nextLine();

                                        G5_contarVocales cadenasUno = new G5_contarVocales();
                                        
                                        switch (opcBucles) {
                                            case 1:
                                                System.out.println("Usted ha seleccionado usar el bucle for para la operación Cadenas 1)");

                                                break;
                                        
                                            default:
                                                break;
                                        }

                                        break;
                                    case 2:

                                        break;
                                    case 3:

                                        break;
                                    case 4:

                                        break;
                                    case 5:

                                        break;
                                    case 6:

                                        break;
                                    case 7:

                                        break;
                                    case 8:

                                        break;
                                    case 9:

                                        break;
                                    default:

                                        break;

                                }

                                

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
                                break;
                            default:
                                imprimirErrorOpcionIncorrecta();
                                operacionARealizar = 0;
                                break;
                        }

                        if (operacionValida){
                            System.out.println("Si desea realizar otra operacción, digite 2. De lo contrario, digite 1.");
                            
                            do{
                                System.out.print("Opción ingresada: ");
                                confirmacionValida = false;
                                try {
                                    seguirOperaciones = ingresoDatos.nextInt();
                                    ingresoDatos.nextLine();
                                    if (seguirOperaciones == 1 || seguirOperaciones == 2) confirmacionValida = true;
                                    else imprimirErrorOpcionIncorrecta();

                                } catch (InputMismatchException e) {
                                    imprimirErrorDatosInvalidos();
                                    ingresoDatos.nextLine();
                                }
                                
                            }while (!confirmacionValida);
                            
                        }
                    }while (!operacionValida || seguirOperaciones == 2);
                    continuar = 1;
                    break;
                case 3:
                    System.out.println("Usted ha salido del programa POLIRETOS - GRUPO 5");
                    break;
                default:
                    imprimirErrorOpcionIncorrecta();
                    break;
            }
        
            if (opcionGeneral != 3 && opcionGeneral != 2){
                do {
                    entradaValida = false;
                    System.out.print("Digite 1 para regresar al menú principal: ");
                try {
                    continuar = ingresoDatos.nextInt();
                    ingresoDatos.nextLine();
                    if (continuar == 1) entradaValida = true;
                    else imprimirErrorRegresarMenu();

                } catch (InputMismatchException e) {
                    imprimirErrorDatosInvalidos();
                    ingresoDatos.nextLine();
                }
                } while (continuar != 1);
            }
           
                
        }while (!entradaValida || opcionGeneral != 3);
            } finally {
                if (ingresoDatos != null) {
                    ingresoDatos.close();
                }
            }
    }
        public void ejecutarFigura(int numero,String tipoCiclo,int filas,int serieDeNumeros){
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
                break;                   
            }
        }

        public void imprimirErrorRegresarMenu(){
            System.out.println(ROJO + "\n============= ERROR =============");
            System.out.println("Digite 1 para regresar al menu general." + RESET + "\n");
        }
        public void imprimirErrorOpcionIncorrecta(){
            System.out.println(ROJO + "\n============= ERROR =============");
            System.out.println("La opción ingresada no es correcta. Intente nuevamente." + RESET + "\n");
        }

        public void imprimirErrorDatosInvalidos() {
            System.out.println(ROJO + "\n============= ERROR =============");
            System.out.println("El valor ingresado no es válido. Intente nuevamente." + RESET + "\n");
        }

        public void imprimirTitulo( ){
            
            String titulo = "================== POLIRETOS - GRUPO 5 ==================";
            System.out.println(ROJO + " ".repeat(15) + titulo + RESET);
            System.out.println(" ".repeat(30) + "Bienvenido a Poliretos.");
            System.out.println(" ".repeat(30) +"Por favor, elija una opción: ");   
            System.out.println();

        }

        public void imprimirMenu (String [] datos, String nombreMenu){
            
            String subtitulo = "================= " + nombreMenu.toUpperCase() + " ================";
            int offset = 60 - subtitulo.length();
            System.out.println(VERDE + " ".repeat(offset) + subtitulo + RESET);

            for (String elemento : datos){
                int espaciosDentro = subtitulo.length() - 2 - elemento.length();
                if (espaciosDentro < 0) espaciosDentro = 0;

                String textoMenu = "|" + elemento + " ".repeat(espaciosDentro) + "|";



                System.out.println(" ".repeat(offset) + textoMenu);
            }
            
            System.out.println(" ".repeat(offset) + "_".repeat(subtitulo.length()) + "\n");
            System.out.print("Operación seleccionada: ");
        }

}

