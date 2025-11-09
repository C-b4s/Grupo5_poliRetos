package src.Poliretos.automatas.compiladorLenguaje;

public class Compi2 {
    // compilador para validar lenguaje,
    // todos las letras minusculas,
    // todos lo numeros excepto el 0 y algunos caracteres especiales

    public void validarCaracteres(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '1' && c <= '9')
                    || (c == '|' || c == 'n' || c == '_' || c == '$')) {

            } else {
                System.out.println("Declaracion inválido: ");
                return;
            }
        }
        System.out.println("La declaracion es valida");
    }
}
