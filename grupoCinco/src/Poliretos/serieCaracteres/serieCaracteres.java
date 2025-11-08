package src.Poliretos.serieCaracteres;

public class serieCaracteres {

    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
    /**
     * Genera la serie S1: + - + - + - ...
     * @param n
     * @return
     
     */
    public String g5_generarS1(int n) {
        String resultado = "";
        for (int i = 0; i < n; i++) {
            resultado += (i % 2 == 0) ? "+" : "-";
            resultado += " ";
        }
        return resultado;
    }
    /**
     * Genera la serie S2: + ++ +++ ...
     
     */
    public String g5_generarS2(int n) {
        String resultado = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                resultado += "+";
            }
            resultado += " ";
        }
        return resultado;
    }
    /**
     * Genera la serie S3: ++ ++++ ++++++ ...
     
     * @param n
     * @return
     */
    public String g5_generarS3(int n) {
        String resultado = "";
        int cantidad = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cantidad; j++) {
                resultado += "+";
            }
            resultado += " ";
            cantidad += 2;
        }
        return resultado;
    }
    /**
     * Genera la serie S4: + - * / + - * / ...
     * @param n
     * @return
     */
    public String g5_generarS4(int n) {
        String[] simbolos = {"+", "-", "*", "/"};
        String resultado = "";
        for (int i = 0; i < n; i++) {
            resultado += simbolos[i % 4] + " ";
        }
        return resultado;
    }
    /**
     * Genera la serie S5: \ | / - \ | / - ...
     * @param n
     * @return
     */
    public String g5_generarS5(int n) {
        String[] simbolos = {"\\", "|", "/", "-"};
        String resultado = "";
        for (int i = 0; i < n; i++) {
            resultado += simbolos[i % 4] + " ";
        }
        return resultado;
    }

    /**
     * Genera la serie S6: a b c d e ...
     * @param n
     * @return
     */
    public String g5_generarS6(int n) {
        String resultado = "";
        for (int i = 0; i < n; i++) {
            resultado += (char)('a' + i) + " ";
        }
        return resultado;
    }

    /**
     * Genera la serie S7: a c e g i ...
     * @param n
     * @return
     */
    public String g5_generarS7(int n) {
        String resultado = "";
        char letra = 'a';
        for (int i = 0; i < n; i++) {
            resultado += letra + " ";
            letra += 2;
        }
        return resultado;
    }
    /**
     * Genera la serie S8: a bb ccc dddd ...
     * @param n
     * @return
     */
    public String g5_generarS8(int n) {
        String resultado = "";
        char letra = 'a';
        int cantidad = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cantidad; j++) {
                resultado += letra;
            }
            resultado += " ";
            letra++;
            cantidad *= 2;
        }
        return resultado;
    }
    /**
     * Genera la serie S9: a bb ccc dddd ...
     * @param n
     * @return
     */
    public String g5_generarS9(int n) {
        String resultado = "";
        char letra = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                resultado += letra;
            }
            resultado += " ";
            letra++;
        }
        return resultado;
    }

}
