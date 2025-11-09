package src.Poliretos.Figuras;

public class g5_S3Figuras {
    
    public void g5_figuraN3For(int filas){
        int tamano = filas;
      for (int fila = 1; fila <= tamano; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }

    public void g5_figuraN3While(int filas){
        int tamano = filas;
        int fila = 1;
        while (fila <= tamano) {
            int col = 1;
            while (col <= fila) {
                System.out.print("* "); 
                col++;
            }
            System.out.println(); 
            fila++;
        }
    }
    
    public void g5_figuraN3DoWhile(int filas){
        int tamano = filas;
        int fila = 1;
        do {
            int col = 1;
            do {
                System.out.print("* "); 
                col++;
            } while (col <= fila);
            System.out.println(); 
            fila++;
        } while (fila <= tamano);
    }
    
}
