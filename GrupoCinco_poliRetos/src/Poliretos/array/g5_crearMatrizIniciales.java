package src.Poliretos.array;

import java.util.Arrays;

public class G5_crearMatrizIniciales {
    public char [] [] g5_crearMatrizInicialesFor (int tamIngresado, char caracterUsuario){
        char [] [] matIniciales = new char [tamIngresado][(tamIngresado * 2) + 3];

        for (int i = 0; i < tamIngresado; i++){
            Arrays.fill(matIniciales[i], ' ');
        }

        int mitad = (int) Math.ceil(tamIngresado / 2.0);

        for (int i = 0; i < tamIngresado; i++){
                if (i == 0|| i == mitad - 1 || i == tamIngresado - 1){
                    for (int j = 0; j < tamIngresado; j++){
                        matIniciales [i][j] = caracterUsuario;
                    }
                }else if (i < mitad - 1){

                    matIniciales[i][0] = caracterUsuario;
                
                }else{
                    matIniciales [i][tamIngresado - 1] = caracterUsuario;
                        
                }
        }           
                  
        
        int offset = tamIngresado + 2;

        for (int i = 0; i < tamIngresado; i++){
            
             if (i == 0 || i == tamIngresado - 1){
                    for (int j = 0; j < tamIngresado; j++){
                        matIniciales [i][offset + j] = caracterUsuario;
                    }
            }else{
                matIniciales[i][offset + (tamIngresado - i - 1)] = caracterUsuario;
            }
        }

        return matIniciales;
    }

    public char[][] g5_crearMatrizInicialesWhile(int tamanioMatriz, char caracterImpresion) {
        char[][] matrizIniciales = new char[tamanioMatriz][(tamanioMatriz * 2) + 3];

        int i = 0;
        while (i < tamanioMatriz) {
            Arrays.fill(matrizIniciales[i], ' ');
            i++;
        }

        int mitad = (int) Math.ceil(tamanioMatriz / 2.0);

        i = 0;
        while (i < tamanioMatriz) {
            if (i == 0 || i == mitad - 1 || i == tamanioMatriz - 1) {
                int j = 0;
                while (j < tamanioMatriz) {
                    matrizIniciales[i][j] = caracterImpresion;
                    j++;
                }
            } else if (i < mitad - 1) {
                matrizIniciales[i][0] = caracterImpresion;
            } else {
                matrizIniciales[i][tamanioMatriz - 1] = caracterImpresion;
            }
            i++;
        }

        int offset = tamanioMatriz + 2;

        i = 0;
        while (i < tamanioMatriz) {
            if (i == 0 || i == tamanioMatriz - 1) {
                int j = 0;
                while (j < tamanioMatriz) {
                    matrizIniciales[i][offset + j] = caracterImpresion;
                    j++;
                }
            } else {
                matrizIniciales[i][offset + (tamanioMatriz - i - 1)] = caracterImpresion;
            }
            i++;
        }

        return matrizIniciales;
    }

    public char [] [] g5_crearMatrizInicialesDoWhile (int tamIngresado, char caracterUsuario){
        char [] [] matIniciales = new char [tamIngresado][(tamIngresado * 2) + 3];

        int i = 0;
        do{
            Arrays.fill(matIniciales[i], ' ');
            i++;
        }while (i < tamIngresado);

        int mitad = (int) Math.ceil(tamIngresado / 2.0);

        i = 0;
        do{
            if (i == 0|| i == mitad - 1 || i == tamIngresado - 1){
                int j = 0;
                do{
                    matIniciales [i][j] = caracterUsuario;
                    j++;
                }while (j < tamIngresado);
            }else if (i < mitad - 1){
                matIniciales[i][0] = caracterUsuario;
        
            }else{
                matIniciales [i][tamIngresado - 1] = caracterUsuario;
                    
            }
            i++;
        }while (i < tamIngresado);           
                      
       
        int offset = tamIngresado + 2;

        i = 0;
        do{
             if (i == 0 || i == tamIngresado - 1){
                    int j = 0;
                    do{
                        matIniciales [i][offset + j] = caracterUsuario;
                        j++;
                    }while (j < tamIngresado);
            }else{
                matIniciales[i][offset + (tamIngresado - i - 1)] = caracterUsuario;
            }
            i++;
        }while (i < tamIngresado);

        return matIniciales;
    }

}
