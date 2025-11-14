package src.Poliretos.Figuras;

public class G5_S15Figuras {
    /*
     * 
     */
    public void g5_Figuras15For(int filas){
        for(int i=0;i<filas;i++){
            int numero=1;
            for(int columna=0;columna<=i;columna++){
                System.out.printf("%4d", numero);
                numero = numero * (i - columna) / (columna + 1);
        }
        System.out.println();
    }
    }
    /*
     * 
     */
    public void g5_Figuras15While(int filas){
        int i=0;
        while(i<filas){
            int numero=1;
            int columna=0;
            while(columna<=i){
                System.out.printf("%4d", numero);
                numero = numero * (i - columna) / (columna + 1);
                columna++;
        }
        System.out.println();
        i++;
        }
    }
    /*
     */
    public void g5_Figuras15DoWhile(int filas){
        int i=0;
        do{
            int numero=1;
            int columna=0;
            do{
                if(columna<=i){
                    System.out.printf("%4d", numero);
                    numero = numero * (i - columna) / (columna + 1);
                }
                columna++;
        }while(columna<=i);
        System.out.println();
        i++;
        }while(i<filas);
    }        
}
