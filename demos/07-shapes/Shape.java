
public class Shape {

    static double square(double s) {
        return s * s;
    }

    static void showResult(String operation, double result) {
        System.out.printf("Area of %s is: %s", operation, result);
        System.out.println("");
    }

    public static void main(String[] args) {

        double number1 = 3.5;
        double number2 = 5;
        double number3 = 3.6;

        showResult("Square", square(number1));
        showResult("Square", square(number2));
        showResult("Square", square(number3));
    }
}
