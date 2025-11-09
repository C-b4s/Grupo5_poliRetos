package src.Poliretos.automatas.compiladorDecimal;

public class compi1 {
    // compilador para numeros decimales
    double numero;

    public void validarNumero(double numero) {
        double parteEntera = Math.floor(numero);
        double parteDecimal = numero - parteEntera;

        if (Math.abs(parteDecimal) != 0.0) {
            System.out.println(
                    "El numero " + numero + " es un numero decimal.\n" + "La parte decimal es: " + parteDecimal);
        } else {
            System.out.println("El numero " + numero + " no es un numero decimal.");

        }
    }
}
