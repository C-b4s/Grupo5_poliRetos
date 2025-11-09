package src.Poliretos.Figuras;

public class G5_S13Figuras {
    /*
     * 
     */
    public void g5_Figuras13For(int filas){
    int j=1;
     for(int n=1;n<=filas;n++){
         System.out.println(j);
        j*=10;
        j+=(n+1);
    }
    }
    /*
     * 
     */
    public void g5_Figuras13While(int filas){
        int j=1;
        int n=1;
        while(n<=filas){
            System.out.println(j);
            j*=10;
            j+=(n+1);
            n++;
        }
    }
    /*
     * 
     */
    public void g5_Figuras13DoWhile(int filas){
        int j=1;
        int n=1;
        do{
            System.out.println(j);
            j*=10;
            j+=(n+1);
            n++;
        }while(n<=filas);
    }
}
