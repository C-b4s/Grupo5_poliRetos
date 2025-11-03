package src.cadenaCaracteres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class CadenaService {
    public int contarVocalesFor(String textoIngresado) {
        int contVocales = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contVocales;
        }
        for (int i = 0; i < textoIngresado.length(); i++) {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) != -1) {
                contVocales++;
            }
        }
        return contVocales;
    }

    public int contarVocalesWhile(String textoIngresado) {
        int contVocales = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contVocales;
        }
        while (i < textoIngresado.length()) {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) != -1) {
                contVocales++;
            }
            i++;
        }
        return contVocales;
    }

    public int contarVocalesDoWhile(String textoIngresado) {
        int contVocales = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contVocales;
        }
        do {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) != -1) {
                contVocales++;
            }
            i++;
        } while (i < textoIngresado.length());
        return contVocales;
    }

    public int contarConstantesFor(String textoIngresado){
        int contConstantes = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contConstantes;
        }
        for (char i : textoIngresado.toCharArray()) {
            if (Character.isLetter(i) && cadenaVocales.indexOf(i) == -1) {
                contConstantes++;
            }
        }
        return contConstantes;
    }

    public int contarConstantesWhile(String textoIngresado){
        int contConstantes = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contConstantes;
        }
        while (i < textoIngresado.length()) {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) == -1) {
                contConstantes++;
            }
            i++;
        }
        return contConstantes;
    }

    public int contarConstantesDoWhile(String textoIngresado){
        int contConstantes = 0;
        String cadenaVocales = "áéíóúaeiou";
        cadenaVocales.toLowerCase();
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return contConstantes;
        }
        do {
            if (Character.isLetter(textoIngresado.charAt(i)) && cadenaVocales.indexOf(textoIngresado.charAt(i)) == -1) {
                contConstantes++;
            }
            i++;
        } while (i < textoIngresado.length());
        return contConstantes;
    }

    public String eliminarVocalFor(String textoIngresado, char vocalAEliminar){
        String textoSinVocal = "";
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinVocal;
        }
        for (char i : textoIngresado.toCharArray()) {
            if (textoIngresado.charAt(i) == vocalAEliminar) {
                textoSinVocal += " ";
            }
            else {
                textoSinVocal += textoIngresado.charAt(i);
            }
        }
        return textoSinVocal;
    }

    public String eliminarVocalWhile(String textoIngresado, char vocalAEliminar){
        String textoSinVocal = "";
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinVocal;
        }
        while (i < textoIngresado.length()) {
            if (textoIngresado.charAt(i) == vocalAEliminar) {
                textoSinVocal += " ";
            }else {
                textoSinVocal += textoIngresado.charAt(i);
            }
            i++;
        }
        return textoSinVocal;
    }

    public String eliminarVocalDoWhile(String textoIngresado, char vocalAEliminar){
        String textoSinVocal = "";
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinVocal;
        }
        do {
            if (textoIngresado.charAt(i) == vocalAEliminar) {
                textoSinVocal += " ";
            }else{
                textoSinVocal += textoIngresado.charAt(i);
            }
            i++;
        } while (i < textoIngresado.length());
        return textoSinVocal;
    }

    public String eliminarConsonanteFor(String textoIngresado, char consonanteAEliminar){
        String textoSinConsonante = "";
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinConsonante;
        }
        for (char i : textoIngresado.toCharArray()) {
            if (textoIngresado.charAt(i) == consonanteAEliminar) {
                textoSinConsonante += " ";
            }
            else {
                textoSinConsonante += textoIngresado.charAt(i);
            }
        }
        return textoSinConsonante;
    }

    public String eliminarConsonanteWhile(String textoIngresado, char consonanteAEliminar){
        String textoSinConsonante = "";
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinConsonante;
        }
        while (i < textoIngresado.length()) {
            if (textoIngresado.charAt(i) == consonanteAEliminar) {
                textoSinConsonante += " ";
            }else {
                textoSinConsonante += textoIngresado.charAt(i);
            }
            i++;
        }
        return textoSinConsonante;
    }

    public String eliminarConsonanteDoWhile(String textoIngresado, char consonanteAEliminar){
        String textoSinConsonante = "";
        int i = 0;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoSinConsonante;
        }
        do {
            if (textoIngresado.charAt(i) == consonanteAEliminar) {
                textoSinConsonante += " ";
            }else{
                textoSinConsonante += textoIngresado.charAt(i);
            }
            i++;
        } while (i < textoIngresado.length());
        return textoSinConsonante;
    }

    public String invertirConVocalesMayusFor(String textoIngresado){
        String textoInvertido = "";
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoInvertido;
        }
        for (int i = textoIngresado.length() - 1; i >= 0; i--) {
            char caracterActual = textoIngresado.charAt(i);
            if ("áéíóúaeiou".indexOf(Character.toLowerCase(caracterActual)) != -1) {
                textoInvertido += Character.toUpperCase(caracterActual);
            } else {
                textoInvertido += caracterActual;
            }
        }
        return textoInvertido;
    }

    public String invertirConVocalesMayusWhile(String textoIngresado){
        String textoInvertido = "";
        int i = textoIngresado.length() - 1;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoInvertido;
        }
        while (i >= 0) {
            char caracterActual = textoIngresado.charAt(i);
            if ("áéíóúaeiou".indexOf(Character.toLowerCase(caracterActual)) != -1) {
                textoInvertido += Character.toUpperCase(caracterActual);
            } else {
                textoInvertido += caracterActual;
            }
            i--;
        }
        return textoInvertido;
    }

    public String invertirConVocalesMayusDoWhile(String textoIngresado){
        String textoInvertido = "";
        int i = textoIngresado.length() - 1;
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoInvertido;
        }
        do {
            char caracterActual = textoIngresado.charAt(i);
            if ("áéíóúaeiou".indexOf(Character.toLowerCase(caracterActual)) != -1) {
                textoInvertido += Character.toUpperCase(caracterActual);
            } else {
                textoInvertido += caracterActual;
            }
            i--;
        } while (i >= 0);
        return textoInvertido;
    }

    public String invertirConConsonantesMayusFor(String textoIngresado){
        String textoInvertido = "";
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoInvertido;
        }
        for (int i = textoIngresado.length() - 1; i >= 0; i--) {
            char caracterActual = textoIngresado.charAt(i);
            if (Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf(Character.toLowerCase(caracterActual)) == -1) {
                textoInvertido += Character.toUpperCase(caracterActual);
            } else {
                textoInvertido += caracterActual;
            }
        }
        return textoInvertido;
    }

    public String invertirConConsonantesMayusWhile(String textoIngresado){
        String textoInvertido = "";
        int i = textoIngresado.length() - 1;

        if (textoIngresado.length()== 0){
            return textoInvertido;
        }

        while (i >= 0){
            char caracterActual = textoIngresado.charAt(i);
            if (Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf(caracterActual) == -1){
                textoInvertido += Character.toUpperCase(caracterActual);
            }else{
                textoInvertido += caracterActual;
            }
            i--;
        }
        return textoInvertido;
    }

    public String invertirConConsonantesMayusDoWhile(String textoIngresado){
        String textoInvertido = "";
        int i = textoIngresado.length() - 1;

        if(textoIngresado.length()== 0){
            return textoInvertido;
        }

        do{
            char caracterActual = textoIngresado.charAt(i);
            if(Character.isLetter(caracterActual) && "áéíóúaeiou".indexOf(caracterActual) == -1){
                textoInvertido += Character.toUpperCase(caracterActual);
            }else{
                textoInvertido += Character.toUpperCase(caracterActual);
            }
            i--;
        } while (i >= 0);
        return textoInvertido;
    }
    
    public String convertirAMayusSinJFor (String textoIngresado){
        StringBuilder textoEnMayus = new StringBuilder();
        if (textoIngresado == null || textoIngresado.length() == 0) {
            return textoEnMayus.toString();
        }

        String textoAOperar = textoIngresado.toLowerCase();

        for (char caracterTexto : textoAOperar.toCharArray()){
            if (caracterTexto == 'j'){

            }else{
                textoEnMayus.append(Character.toUpperCase(caracterTexto));
            }
        }
        return textoEnMayus.toString();
    }

    public String convertirAMayusSinJWhile(String textoIngresado){
        StringBuilder textoEnMayus = new StringBuilder();
        int i = 0;

        if (textoIngresado == null || textoIngresado.length()==0){
            return textoEnMayus.toString();
        }

        while (i < textoIngresado.length()){
            char caracterTexto = textoIngresado.charAt(i);
            if (caracterTexto == 'j'){

            }else{
                textoEnMayus.append(Character.toUpperCase(caracterTexto));
            }
            i++;
        }
        return textoEnMayus.toString();
    }

    public String convertirAMayusSinJDoWhile(String textoIngresado){
        StringBuilder textoEnMayus = new StringBuilder();
        int i = 0;

        if (textoIngresado == null || textoIngresado.length()==0){
            return textoEnMayus.toString();
        }

        do{
            char caracterTexto = textoIngresado.charAt(i);
            if (caracterTexto == 'j'){

            }else{
                textoEnMayus.append(Character.toUpperCase(caracterTexto));
            }
            i++;
        }while (i < textoIngresado.length());
        return textoEnMayus.toString();
    }

    public void adivinarAnagramasFor (Scanner ingresoDatos){
        
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
            String respuestaUsuario = ingresoDatos.nextLine();
            if (respuestaUsuario.equalsIgnoreCase(solucionAnagrama)){
                System.out.println("¡Felicidades! Has adivinado el anagrama correctamente.");
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

    public void adivinarAnagramasWhile (Scanner ingresoDatos){
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
            String respuestaUsuario = ingresoDatos.nextLine();
            if (respuestaUsuario.equalsIgnoreCase(solucionAnagrama)){
                System.out.println("¡Felicidades! Has adivinado el anagrama correctamente.");
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

    public void adivinarAnagramasDoWhile (Scanner ingresoDatos){
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
            String respuestaUsuario = ingresoDatos.nextLine();
            if(respuestaUsuario.equalsIgnoreCase(solucionAnagrama)){
                System.out.println("¡Felicidades! Has adivinado el anagrama correctamente.");
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

    public String alternarMayusYMinusFor(String textoIngresado){
        StringBuilder textoAlternado = new StringBuilder();
    
        if (textoIngresado == null || textoIngresado.length() == 0){
            return textoAlternado.toString();
        }

        for (int i = 0; i < textoIngresado.length(); i++){
            if (i % 2 == 0){
                textoAlternado.append(Character.toUpperCase(textoIngresado.charAt(i)));
            }else{
                textoAlternado.append(Character.toLowerCase(textoIngresado.charAt(i)));
            }
        }

        return textoAlternado.toString();
    }

    public String alternarMayusYMinusWhile(String textoIngresado){
        StringBuilder textoAlternado = new StringBuilder();
        int i = 0;

        if (textoIngresado == null || textoIngresado.length() == 0){
            return "";
        }

        while (i < textoIngresado.length()){
            if( i % 2 == 0){
                textoAlternado.append(Character.toUpperCase(textoIngresado.charAt(i)));
            }else{
                textoAlternado.append(Character.toLowerCase(textoIngresado.charAt(i)));
            }
            i++;
        }
        return textoAlternado.toString();
    }

    public String alternarMayusYMinusDoWhile (String textoIngresado){
        StringBuilder textoAlternado = new StringBuilder();
        int i = 0;

        if (textoIngresado == null || textoIngresado.length() == 0){
            return "";
        }

        do{
            if (i % 2 == 0){
                textoAlternado.append(Character.toUpperCase(textoIngresado.charAt(i)));
            }else{
                textoAlternado.append(Character.toLowerCase(textoIngresado.charAt(i)));
            }
            i++;
        }while (i < textoIngresado.length());
        return textoAlternado.toString();
    }




}
