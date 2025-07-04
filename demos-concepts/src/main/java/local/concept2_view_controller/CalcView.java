package local.concept2_view_controller;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import local.exceptions.BusinessException;

public class CalcView extends Calc {

    private int number1;
    private int number2;

    private CalcController ctr;

    CalcView(CalcController ctr) {
        this.ctr = ctr;
        this.ctr.setNum1(number1);
        this.ctr.setNum2(number2);
    }

    private int getInteger (String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        try {
            int num = scanner.nextInt();
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Tipo de dato no válido");
            return 0;
        } 
    }

    private void showMenu() {
        String menu = """
                Elige el número de la opción que quieras
                ----------------------------------------
                1. Dime un número (%s)
                2. Dime otro número (%s)
                3. Calcula la suma
                4. Calcula la resta
                5. Calcula la multiplicación
                6. Calcula la division y el resto
                7. Calcula la división con decimales
                8. Calcula todos los anteriores
                9. Calcula el factorial del primero.
                0. Salir
                """.formatted(number1, number2);
        System.out.println(menu);
    }

    private void calculate(int option) throws BusinessException {
       System.out.println("Calculando la opción " + option);

        switch (option) {
            case 3:
                showResult("Suma: ",ctr.add());
                break;
             case 4:
                showResult("Resta: ", ctr.subtraction()); 
                break;
             case 5:
                showResult("Multiplicación: ", ctr.multiply());
                break;
             case 6:
                showResult("División: ", ctr.division());
                showResult("Resto: ", ctr.restDivision());
                break;
             case 7:
                showResult("División decimales", ctr.decimalDivide());
                break;
             case 8:
                showAllResults();
                break;
            case 9:
                showResult("Factorial: ", ctr.calculateFactorial());
                break;
            default:
             System.out.printf("La opción %s no es válida\n", option);
                break;
             }

       /* if(option == 8) {
        showAllResults();
       } */
    }

    void showResult(String operation, int result) {
        System.out.printf("Operaciones con %s y %s \n",number1, number2);
        System.out.printf("El resultado de %s es: %s \n", operation, result);
        System.out.println("");
    }

    void showResult(String operation, double result) {
        System.out.printf("El resultado de la %s es %.2f", operation, result);
        System.out.println("");
    }

    void showResult(String operation, long result) {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        System.out.printf("El resultado del %s de %s es %s \n",operation, number1,nf.format(result));
        System.out.println("");
    }

    void showAllResults() throws BusinessException {
        showResult("Suma ", ctr.add());
        showResult("Resta ", ctr.subtraction());
        showResult("Multiplicación", ctr.multiply());
        showResult("División", ctr.division());
        showResult("Resto", ctr.restDivision());
        showResult("Factorial", ctr.restDivision());
    }
    

    void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true; // si el centinela es booleano se necesita un if para cambiar su condición

        while (wantContinue) {
             showMenu();
             try {
                int answer = scanner.nextInt();

                if(answer == 0) {
                    wantContinue = false;
                } else if(answer == 1) {
                    number1 = getInteger("Dime el primer número");
                    ctr.setNum1(number1);
                } else if(answer == 2) {
                    number2 = getInteger("Dime el segundo número");
                    ctr.setNum2(number2);
                } else {
                    calculate(answer);
                }
             } catch (InputMismatchException e) {
                System.out.println("Tipo de dato no válido como opción");
                scanner = new Scanner(System.in);
             } catch (BusinessException e) {
                System.out.println(e.getMessage()); 
            } 
        
        }
        scanner.close();
        System.out.println("Gracias por todo");
        
    }

}
