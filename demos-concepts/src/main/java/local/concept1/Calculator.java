package local.concept1;

import java.util.Scanner;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;

public class Calculator {

    private int num1;
    private int num2;
    static Scanner scanner = new Scanner(System.in); 

    
    public void setNum1(String message) {
        this.num1 = getInteger(message);
    }
    
    public void setNum2(String message) {
        this.num2 = getInteger(message);
    }

    int add() {
        return num1 + num2;
    }

    int subtraction() {
        return num1 - num2;
    }

    int multiply() {
        return num1 * num2;
    }

    int division() throws BusinessException {
        /* if(num2 == 0) {
            throw new BusinessException(ErrorCodes.ERROR_ZERO, "Dividendos por 0");
        } */
       try {
           int result = num1 / num2;
           return result;
       } catch (ArithmeticException e) {
           throw new BusinessException(ErrorCodes.ERROR_ZERO, "Dividendo por 0", e);
       } finally {
           System.out.println("Fin de la division");
       }
    }

    int restDivision () {
        int result = num1 % num2;
        return result;
    }

    @SuppressWarnings("resource")
    private int getInteger (String message) {
       
        System.out.println(message);
        int num = scanner.nextInt();
        //scanner.close();
        return num;
        
    }

    void showResult(String operation, int result) {
        System.out.printf("El resultado de la %s es %s", operation, result);
        System.out.println("");
    }

    void showResult() {
        System.out.printf("Operaciones con %s y %s \n",num1, num2);
        System.out.println("");
    }

    void showAllResults() throws BusinessException {
         // Imprimo resultado llamando a una función
        showResult();
        showResult("Suma: ", add());
        showResult("Resta: ", subtraction());
        showResult("Multiplicación", multiply());
        showResult("División", division());
        showResult("Resto", restDivision());
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Bucle while para repetir con distintos pares de números
        calc.setNum1("Dime un numero entero");
        calc.setNum2("Dime otro número entero");

        //ArithmeticException
        try {
            calc.showAllResults();
            
        } catch (BusinessException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
        } finally {
            scanner.close();
        }
    }
}
