package local.concept1;

import java.text.NumberFormat;
import java.util.Locale;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;

public class Factorial {

    /*
     * Hacer calculadora de factorial(objeto instanciable)
     * gestionar exception
     */

    short number;


    Factorial(short number) {
        this.number = number;
    }

    Factorial() {}

    long calculateFactorial() throws BusinessException {
       return calculateFactorial(number);
    }

    long calculateFactorial(short number) throws BusinessException {
        if (number < 0) {
            throw new BusinessException(ErrorCodes.ERROR_NEGATIVE,"No se puede calcular factorial de " + number);
        }
        
        if(number > 20) {
            throw new BusinessException(ErrorCodes.ERROR_BIGGER_20,"No se puede calcular factorial de " + number);
        }
        long result = 1; 
        for (short i = number; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    void showFactorial(long number) {
       
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(nf.format(number));
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        short num = 21;
        try {
            long result = fact.calculateFactorial(num);
            fact.showFactorial(result);
        } catch (BusinessException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
        } 
        System.out.println("Fin del programa calculando el factorial de " + num);

    }
}
