package src.Poliretos.Figuras;

public class G5_S12Figuras{
    /*
     * 
     */
    public void g5_crearFigura12For(int serieNumerica){
        int clone;
        clone=serieNumerica;
        int filas=0;
        while(clone>0){
            clone/=10;
            filas++;
        }
        for (int j=1; j<=filas; j++) {
            System.out.println(serieNumerica);
            serieNumerica = serieNumerica / 10;
        }
    }
    /*
     * 
     */
    public void g5_crearFigura12While(int serieNumerica){
        int clone;
        clone=serieNumerica;
        int filas=0;
        while(clone>0){
            clone/=10;
            filas++;
        }
        int j=1;
        while (j<=filas) {
            System.out.println(serieNumerica);
            serieNumerica = serieNumerica / 10;
            j++;
        }
        }
    /*
     * 
     */
    public void g5_crearFigura12DoWhile(int serieNumerica){
        int clone;
        clone=serieNumerica;
        int filas=0;
        while(clone>0){
            clone/=10;
            filas++;
        }
        int j=1;
        do {
            System.out.println(serieNumerica);
            serieNumerica = serieNumerica / 10;
            j++;
        } while (j<=filas);
    }
}
