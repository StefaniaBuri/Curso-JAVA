package local.exceptions;

//Lista de constantes
public enum ErrorCodes {
    ERROR_EVEN("No se admiten números pares"),
    ERROR_NEGATIVE("No se admiten números negativos"),
    ERROR_BIGGER_20("No se admiten números mayores que 20"),
    ERROR_ZERO("No se puede dividir por cero");

    String message;


    ErrorCodes(String message) {
         this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }

}
