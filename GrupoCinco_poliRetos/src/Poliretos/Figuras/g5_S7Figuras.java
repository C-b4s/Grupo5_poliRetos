package src.Poliretos.Figuras;

public class G5_S7Figuras {

    public void g5_figuraN7For(int tamaño) {
        if (tamaño <= 0) return;
        System.out.println("_");

        for (int fila = 1; fila < tamaño; fila++) {
            for (int espacio = 0; espacio < fila; espacio++) {
                System.out.print("  "); 
            }
            System.out.println("|_");
        }
    }
    
    public void g5_figuraN7While(int tamaño) {
        if (tamaño <= 0) return;
        System.out.println("_");

        int fila = 1;
        while (fila < tamaño) {
            int espacio = 0;
            while (espacio < fila) {
                System.out.print("  "); 
                espacio++;
            }
            System.out.println("|_");
            fila++;
        }
    }
        
    public void g5_figuraN7DoWhile(int tamaño) {
        if (tamaño <= 0) return;
        System.out.println("_");

        int fila = 1;
        do {
            int espacio = 0;
            do {
                System.out.print("  "); 
                espacio++;
            } while (espacio < fila);
            System.out.println("|_");
            fila++;
        } while (fila < tamaño);
    }

}
