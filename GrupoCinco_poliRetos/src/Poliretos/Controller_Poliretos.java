package src.Poliretos;
import java.util.InputMismatchException;
import java.util.Scanner;

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
            String [] integrantes = {"1. Matias Quinchiguano", "2. Micaela Sajal", "3. Michael Sotomayor", "4. Robbinson Tandazo", "5. Victoria Torres", "6. Sebastián Zúñiga"};
            
            boolean entradaValida, operacionValida, confirmacionValida;

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
                            operacionARealizar = ingresoDatos.nextInt();
                            ingresoDatos.nextLine();
                            if (operacionARealizar >= 1 && operacionARealizar <= 8) operacionValida = true;
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

