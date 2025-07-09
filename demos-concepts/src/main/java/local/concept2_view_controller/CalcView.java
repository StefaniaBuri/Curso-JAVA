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

    @SuppressWarnings("resource")
    private int getInteger(String message) {
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
                9. Otras operaciones
                0. Salir
                """.formatted(number1, number2);
        System.out.println(menu);
    }

    private void showMenu2() {
        String menu = """
                Elige el número de la opción que quieras
                ----------------------------------------
                1. Dime un número entero (%s)
                2. Dime otro número entero (%s)
                3. Calcula el factorial del primero
                4. Calcula el factorial del segundo
                5. Calcula el primero elevado al segundo
                6. Calcula el segundo elevado al primero
                7. ...
                8. Calcula todos los anteriores(Pendiente)
                9. Volver al menu anterior
                0. Salir
                """.formatted(number1, number2);
        System.out.println(menu);
    }

    private void calculate(int option) throws BusinessException {
        //System.out.println("Calculando la opción " + option);

        switch (option) {
            case 3:
                showResult("Suma: ", ctr.add());
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
            /* case 9:
                showResult("Factorial: ", ctr.calculateFactorial());
                break; */
            default:
                System.out.printf("La opción %s no es válida\n", option);
                break;
        }

        /*
         * if(option == 8) {
         * showAllResults();
         * }
         */
    }

private void calculate2(int option) throws BusinessException {
        //System.out.println("Calculando la opción " + option);

        switch (option) {
            case 3:
            //TODO comprobar posibles problemas del casting
                showResult("Factorial number 1: ", ctr.calculateFactorial((byte) 1), number1);
                break;
            case 4:
                showResult("Factorial number 2: ", ctr.calculateFactorial((byte) 2), number2);
                break;
            case 5:
                showResult("%s elevado a %s ".formatted(number1, number2), ctr.calculatePow());
                break;
            case 6:
                 showResult("%s elevado a %s ".formatted(number2, number1), ctr.calculatePow(number2, number1));
                break;
            case 7:
                //showResult("División decimales", ctr.decimalDivide());
                break;
            case 8:
                //showAllResults();
                break;
            default:
                System.out.printf("La opción %s no es válida\n", option);
                break;
        }
    }


    private void showResult(String operation, int result) {
        //System.out.printf("Operaciones con %s y %s \n", number1, number2);
        System.out.printf("El resultado de %s es %s \n", operation, result);
        System.out.println("");
    }

    private void showResult(String operation, double result) {
        System.out.printf("El resultado de %s es %.2f \n", operation, result);
        System.out.println("");
    }

    private void showResult(String operation, long result, int number) {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        System.out.printf("El %s de %s es %s \n", operation, number, nf.format(result));
        System.out.println("");
    }

    private void showAllResults() throws BusinessException {
        System.out.printf("Operaciones con %s y %s", number1, number2);
        showResult("Suma ", ctr.add());
        showResult("Resta ", ctr.subtraction());
        showResult("Multiplicación", ctr.multiply());
        showResult("División", ctr.division());
        showResult("Resto", ctr.restDivision());
        showResult("Factorial", ctr.calculateFactorial());
    }

    void show() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true; // si el centinela es booleano se necesita un if para cambiar su condición

        while (wantContinue) {
            showMenu();
            try {
                int answer = scanner.nextInt();

                if (answer == 0) {
                    System.out.println("Gracias por todo");
                    System.exit(0);
                } else if (answer == 1) {
                    number1 = getInteger("Dime el primer número");
                    ctr.setNum1(number1);
                } else if (answer == 2) {
                    number2 = getInteger("Dime el segundo número");
                    ctr.setNum2(number2);
                } else if (answer == 9) {
                    show(true);
                }else {
                    calculate(answer);
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato no válido como opción");
                scanner = new Scanner(System.in);
            } catch (BusinessException e) {
                System.out.println(e.getMessage());
            }
        }
        //scanner.close();
    }

    void show(boolean alt) {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;
        while (wantContinue) {
            showMenu2();
            try {
            int answer = scanner.nextInt();
                if (answer == 0) {
                    System.out.println("Gracias por todo");
                    System.exit(answer);
                } else if (answer == 1) {
                    number1 = getInteger("Dime el primer número");
                    ctr.setNum1(number1);
                } else if (answer == 2) {
                    number2 = getInteger("Dime el segundo número");
                    ctr.setNum2(number2);
                } else if (answer == 9) {
                    wantContinue = false;
                    show();
                } else {
                    calculate2(answer);
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato no válido como opción");
                scanner = new Scanner(System.in);
            } catch (BusinessException e) {
                System.out.println(e.getMessage());
            }
        }
        //show();
        //scanner.close();
        //System.out.println("Gracias por todo"); 
    }

}
