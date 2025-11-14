package src.Poliretos.Figuras;

public class G5_S16Figuras {
    /*
     * 
     */
    public void g5_Figuras16For(int filas){
        if(filas % 2 == 0){
                filas++;
            }
            for(int i=1; i<=filas;i++){
                for(int c=1;c<=filas;c++){
                    if(c==i || c==(filas-i+1)){
                        if(i%2!=0 || c%2!=0){
                            System.out.print("+");
                    } else{
                        System.out.print("-");
                    }
                } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
    /*
     * 
     */
    public void g5_Figuras16While(int filas){
        if(filas % 2 == 0){
                filas++;
            }
            int i=1;
            while(i<=filas){
                int c=1;
                while(c<=filas){
                    if(c==i || c==(filas-i+1)){
                        if(i%2!=0 || c%2!=0){
                            System.out.print("+");
                    } else{
                        System.out.print("-");
                    }
                } else{
                        System.out.print(" ");
                    }
                    c++;
                }
                System.out.println();
                i++;
            }
        }
    /*
     * 
     */
    public void g5_Figuras16DoWhile(int filas){
        if(filas % 2 == 0){
                filas++;
            }
            int i=1;
            do{
                int c=1;
                do{
                    if(c==i || c==(filas-i+1)){
                        if(i%2!=0 || c%2!=0){
                            System.out.print("+");
                    } else{
                        System.out.print("-");
                    }
                } else{
                        System.out.print(" ");
                    }
                    c++;
                }while(c<=filas);
                System.out.println();
                i++;
            }while(i<=filas);
        }

}
