package src.Poliretos.cadenaCaracteres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class G5_adivinarAnagramas {
    public static final String AMARILLO = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
public void g5_adivinarAnagramasFor (Scanner sc){
        
        Map<String, String> anagramas = new HashMap<>();
        anagramas.put("calor", "colar");
        anagramas.put("Sergio", "riesgo");
        anagramas.put("mejorar", "remojar");
        anagramas.put("abusar", "basura");
        anagramas.put("animales", "milanesa");

        ArrayList <String> anagramasKeys = new ArrayList<>(anagramas.keySet());
        Random palabraAleatoria = new Random();

        String parDeAnagrama = anagramasKeys.get(palabraAleatoria.nextInt(anagramasKeys.size()));
        String solucionAnagrama = anagramas.get(parDeAnagrama);

        int intentos = 0;
        System.out.println("\n================ JUEGO DE ANAGRAMAS ================");
        System.out.println("Adivina la palabra anagrama de: " + parDeAnagrama);

        for (int i = 0; i < 3; i++){
            System.out.println("\n--- INTENTO NO. " + (i+1) + " ---");
            String respuestaUsuario = sc.nextLine();
            if (respuestaUsuario.equalsIgnoreCase(solucionAnagrama)){
                System.out.println(AMARILLO + "¡Felicidades! Has adivinado el anagrama correctamente." + RESET);
                break;
            }else{
                intentos++;

                if(intentos < 3){
                    System.out.println("Respuesta incorrecta. Intenta de nuevo.");
                }else{
                    System.out.println("Lo siento, has agotado tus intentos. La respuesta correcta era: " + solucionAnagrama);

                }
            }
        }
        
    }

    public void g5_adivinarAnagramasWhile (Scanner sc){
        // Implementación similar a la del método for, pero usando while
        Map <String, String> anagramas = new HashMap <>();
        anagramas.put("calor", "colar");
        anagramas.put("Sergio", "riesgo");
        anagramas.put("mejorar", "remojar");
        anagramas.put("abusar", "basura");
        anagramas.put("animales", "milanesa");

        ArrayList <String> anagramasKeys = new ArrayList <> (anagramas.keySet());
        Random palabraAleatoria = new Random();

        String parDeAnagrama = anagramasKeys.get(palabraAleatoria.nextInt(anagramasKeys.size()));
        String solucionAnagrama = anagramas.get(parDeAnagrama);

        int i = 0, intentos = 0;

        System.out.println("\n================ JUEGO DE ANAGRAMAS ================");
        System.out.println("Adivina la palabra anagrama de: " + parDeAnagrama);

        while (i < 3){
            System.out.println("\n--- INTENTO NO. " + (i+1) + " ---");
            String respuestaUsuario = sc.nextLine();
            if (respuestaUsuario.equalsIgnoreCase(solucionAnagrama)){
                System.out.println(AMARILLO + "¡Felicidades! Has adivinado el anagrama correctamente." + RESET);
                break;
            }else{
                intentos++;
                i++;

                if(intentos < 3){
                    System.out.println("Respuesta incorrecta. Intenta de nuevo.");
                }else{
                    System.out.println("Lo siento, has agotado tus intentos. La respuesta correcta era: " + solucionAnagrama);

                }
            }
        }
    }

    public void g5_adivinarAnagramasDoWhile (Scanner sc){
        // Implementación similar a la del método for, pero usando do while
        
        Map <String, String> anagramas = new HashMap <>();
        anagramas.put("calor", "colar");
        anagramas.put("Sergio", "riesgo");
        anagramas.put("mejorar", "remojar");
        anagramas.put("abusar", "basura");
        anagramas.put("animales", "milanesa");

        ArrayList <String> anagramasKeys = new ArrayList <> (anagramas.keySet());
        Random palabraAleatoria = new Random();
        String parDeAnagrama = anagramasKeys.get(palabraAleatoria.nextInt(anagramas.size()));
        String solucionAnagrama = anagramas.get(parDeAnagrama);

        int i = 0, intentos = 0;

        System.out.println("\n================ JUEGO DE ANAGRAMAS ================");
        System.out.println("Adivina la palabra anagrama de: " + parDeAnagrama);

        do{
            System.out.println("\n--- INTENTO NO. " + (i + 1) + " ---");
            String respuestaUsuario = sc.nextLine();
            if(respuestaUsuario.equalsIgnoreCase(solucionAnagrama)){
                System.out.println(AMARILLO + "¡Felicidades! Has adivinado el anagrama correctamente." + RESET);
                break;
            }else{
                intentos++;
                i++;
                if (intentos <3){
                    System.out.println("Respuesta incorrecta. Intenta de nuevo.");
                }else{
                    System.out.println("Lo siento, has agotado tus intentos. La respuesta correcta era: " + solucionAnagrama);

                }
                
            }
        }while (intentos < 3);

    }
}
