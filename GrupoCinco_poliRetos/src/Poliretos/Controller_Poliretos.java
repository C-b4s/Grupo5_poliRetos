package src.Poliretos;
import java.util.InputMismatchException;
import java.util.Scanner;

import Poliretos.Figuras.figurasService1_10;

public class Controller_Poliretos {
    public final String ROJO = "\u001B[31m";
    public final String RESET = "\u001B[0m";
    public final String VERDE = "\u001B[32m";
    
    Integer operaciones;
        public void iniciar(){ 
            Scanner ingresoDatos = null;
            try {
                ingresoDatos = new Scanner(System.in);
            int opcionGeneral = 0, continuar = 0, operacionARealizar = 0, seguirOperaciones = 0;
            
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
                        System.out.print("Operación seleccionada: ");
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
                                

                                break;
                            case 4:
                                System.out.println("Usted ha seleccionado realizar operaciones con cadenas de caracteres.");
                                String [] cadenasCaracteres = {"Cadenas 1)", "Cadenas 2)", "Cadenas 3)", "Cadenas 4)", "Cadenas 5)", "Cadenas 6)", "Cadenas 7)", "Cadenas 8)", "Cadenas 9)"};

                                imprimirMenu(cadenasCaracteres, "CADENAS DE CARACTERES");

                                break;
                            case 5:
                                figurasService1_10 tamFigura= new figurasService1_10();
                                figurasService1_10 tamFigura2 = new  figurasService1_10();
                                figurasService1_10 tamFigura3 = new  figurasService1_10();
                                figurasService1_10 tamFigura4 = new  figurasService1_10();
                                figurasService1_10 tamFigura5 = new  figurasService1_10();
                                figurasService1_10 tamFigura6 = new  figurasService1_10();
                                figurasService1_10 tamFigura7 = new  figurasService1_10();
                                figurasService1_10 tamFigura8 = new  figurasService1_10();
                                figurasService1_10 tamFigura9 = new  figurasService1_10();    
                                figurasService1_10 tamFigura10 = new  figurasService1_10();
                                System.out.println("Bienvenido al apartado de FIGURAS");
                                System.out.println();
                                System.out.println("Figura número 1\n ");
                                System.out.println();
                                System.out.println("Ingrese el tamaño de la figura:");
                                int tamañoFigura1 = ingresoDatos.nextInt();
                                System.out.println();
                                System.out.println("La figura generada con el bucle for es:\n ");
                                tamFigura.g5_figuraN1For(tamañoFigura1); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle while es:\n ");
                                tamFigura.g5_figuraN1While(tamañoFigura1); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle do-while es:\n ");
                                tamFigura.g5_figuraN1DoWhile(tamañoFigura1);
                                ingresoDatos.nextLine();
                                System.out.println();
                                System.out.println("Figura número 2\n ");
                                System.out.println("Ingrese el tamaño de la figura:");
                                int tamañoFigura2 = ingresoDatos.nextInt();
                                System.out.println();
                                System.out.println("La figura generada con el bucle for es:\n ");
                                tamFigura2.g5_figuraN2For(tamañoFigura2); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle while es:\n ");
                                tamFigura2.g5_figuraN2While(tamañoFigura2); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle do-while es:\n ");
                                tamFigura2.g5_figuraN2DoWhile(tamañoFigura2);
                                ingresoDatos.nextLine();
                                System.out.println();
                                System.out.println("Figura número 3\n ");
                                System.out.println("Ingrese el tamaño de la figura:");
                                int tamañoFigura3 = ingresoDatos.nextInt();
                                System.out.println();
                                System.out.println("La figura generada con el bucle for es:\n ");
                                tamFigura3.g5_figuraN3For(tamañoFigura3); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle while es:\n ");
                                tamFigura3.g5_figuraN3While(tamañoFigura3); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle do-while es:\n ");
                                tamFigura3.g5_figuraN3DoWhile(tamañoFigura3);
                                ingresoDatos.nextLine();
                                System.out.println();
                                System.out.println("Figura número 4\n ");
                                System.out.println("Ingrese el tamaño de la figura:");
                                int tamañoFigura4 = ingresoDatos.nextInt();
                                System.out.println();
                                System.out.println("La figura generada con el bucle for es:\n ");
                                tamFigura4.g5_figuraN4For(tamañoFigura4); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle while es:\n ");
                                tamFigura4.g5_figuraN4While(tamañoFigura4); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle do-while es:\n ");
                                tamFigura4.g5_figuraN4DoWhile(tamañoFigura4);
                                ingresoDatos.nextLine();
                                System.out.println();
                                System.out.println("Figura número 5\n ");
                                System.out.println("Ingrese el tamaño de la figura:");
                                int tamañoFigura5 = ingresoDatos.nextInt();
                                System.out.println();
                                System.out.println("La figura generada con el bucle for es:\n ");
                                tamFigura5.g5_figuraN5For(tamañoFigura5); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle while es:\n ");
                                tamFigura5.g5_figuraN5While(tamañoFigura5); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle do-while es:\n ");
                                tamFigura5.g5_figuraN5DoWhile(tamañoFigura5);
                                ingresoDatos.nextLine();
                                System.out.println();
                                System.out.println("Figura número 6\n ");
                                System.out.println("Ingrese el tamaño de la figura:");
                                int tamañoFigura6 = ingresoDatos.nextInt();
                                System.out.println();
                                System.out.println("La figura generada con el bucle for es:\n ");
                                tamFigura6.g5_figuraN6For(tamañoFigura6); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle while es:\n ");
                                tamFigura6.g5_figuraN6While(tamañoFigura6); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle do-while es:\n ");
                                tamFigura6.g5_figuraN6DoWhile(tamañoFigura6);
                                ingresoDatos.nextLine();
                                System.out.println();
                                System.out.println("Figura número 7\n ");
                                System.out.println("Ingrese el tamaño de la figura:");
                                int tamañoFigura7 = ingresoDatos.nextInt();
                                System.out.println();
                                System.out.println("La figura generada con el bucle for es:\n ");
                                tamFigura7.g5_figuraN7For(tamañoFigura7); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle while es:\n ");
                                tamFigura7.g5_figuraN7While(tamañoFigura7); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle do-while es:\n ");
                                tamFigura7.g5_figuraN7DoWhile(tamañoFigura7);
                                ingresoDatos.nextLine();
                                System.out.println();
                                System.out.println("Figura número 8\n ");
                                System.out.println("Ingrese el tamaño de la figura:");
                                int tamañoFigura8 = ingresoDatos.nextInt();
                                System.out.println();
                                System.out.println("La figura generada con el bucle for es:\n ");
                                tamFigura8.g5_figuraN8For(tamañoFigura8); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle while es:\n ");
                                tamFigura8.g5_figuraN8While(tamañoFigura8); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle do-while es:\n ");
                                tamFigura8.g5_figuraN8DoWhile(tamañoFigura8);
                                ingresoDatos.nextLine();
                                System.out.println();
                                System.out.println("Figura número 9\n ");
                                System.out.println("Ingrese el tamaño de la figura:");
                                int tamañoFigura9 = ingresoDatos.nextInt();
                                System.out.println();
                                System.out.println("La figura generada con el bucle for es:\n ");
                                tamFigura9.g5_figuraN9For(tamañoFigura9); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle while es:\n ");
                                tamFigura9.g5_figuraN9While(tamañoFigura9); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle do-while es:\n ");
                                tamFigura9.g5_figuraN9DoWhile(tamañoFigura9);
                                ingresoDatos.nextLine();
                                System.out.println();
                                System.out.println("Figura número 10\n ");
                                System.out.println("Ingrese el tamaño de la figura:");
                                int tamañoFigura10 = ingresoDatos.nextInt();
                                System.out.println();
                                System.out.println("La figura generada con el bucle for es:\n ");
                                tamFigura10.g5_figuraN10For(tamañoFigura10); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle while es:\n ");
                                tamFigura10.g5_figuraN10While(tamañoFigura10); 
                                System.out.println();
                                System.out.println("La figura generada con el bucle do-while es:\n ");
                                tamFigura10.g5_figuraN10DoWhile(tamañoFigura10);
                                ingresoDatos.nextLine();
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
            
            String subtitulo = "============== " + nombreMenu.toUpperCase() + " =============";
            int offset = 60 - subtitulo.length();
            System.out.println(VERDE + " ".repeat(offset) + subtitulo + RESET);

            for (String elemento : datos){
                int espaciosDentro = subtitulo.length() - 2 - elemento.length();
                if (espaciosDentro < 0) espaciosDentro = 0;

                String textoMenu = "|" + elemento + " ".repeat(espaciosDentro) + "|";



                System.out.println(" ".repeat(offset) + textoMenu);
            }
            
            System.out.println(" ".repeat(offset) + "_".repeat(subtitulo.length()) + "\n");
        }

}

