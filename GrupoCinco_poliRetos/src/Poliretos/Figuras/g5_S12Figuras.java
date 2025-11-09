package src.Poliretos.Figuras;

public class G5_S12Figuras{
    /*
     * 
     */
    public void g5_crearFigura12For(int serieNumerica){
        for (int j=1; j<=9; j++) {
            System.out.println(serieNumerica);
            serieNumerica = serieNumerica / 10;
        }
    }
    /*
     * 
     */
    public void g5_crearFigura12While(int serieNumerica){
        int j=1;
        while (j<=9) {
            System.out.println(serieNumerica);
            serieNumerica = serieNumerica / 10;
            j++;
        }
        }
    /*
     * 
     */
    public void g5_crearFigura12DoWhile(int serieNumerica){
        int j=1;
        do {
            System.out.println(serieNumerica);
            serieNumerica = serieNumerica / 10;
            j++;
        } while (j<=9);
    }
}
