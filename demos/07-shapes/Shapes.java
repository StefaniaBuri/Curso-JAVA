public class Shapes {

    /* Sobrecarga de funciones (Overload)

     * public static double calculateArea(double side) {
        return side * side;

        public static double calculateArea(double base, double height) {
        return base * height;

        public static double calculateArea(double base, double height, boolean isTriangle) {
        return (base * height) / 2;
    }
     */


    static double square(double side) {
        return side * side;
    }

    static double rectangle(double base, double height) {
        return base * height;
    }

    static double circle(double radio) {
        double pi = 3.14159;
        return pi * (radio * radio);
    }

    static double triangle(double base, double height) {
        return (base * height) / 2;

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
        showResult("Rectangle", rectangle(number2, number3));
        showResult("Circle", circle(number2));
        showResult("Triangle", triangle(number1, number3));
    }
}
