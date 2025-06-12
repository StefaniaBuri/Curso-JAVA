public class Operators2 {
    /* Aritméticos de asignación
     * +=
     * -=
     * *=
     * /=
     * %=
     * 
     * Incremento y Decremento
     *  ++
     *  --
     * 
     * Lógicos
     *  &&
     *  ||
     *  ^
     */

    static boolean checkAge(int age) {
        System.out.println("Chequeando edad " + age);
        boolean result = age < 25 ? true : false;
        return result;
    }

    public static void main(String[] args) {
        // int number = 22;
        //number = number + 3;
        // number += 3;
        // number++;
        // System.out.println(number++); //post-incremento
        // System.out.println(number);
        // System.out.println(++number); //pre-incremento


        String job = "Developer";
        int age = 28;

        if(job == "Developer" && checkAge(age)) {
            System.out.println("Bienvenido al Hackaton juvenil");
        } else {
            System.out.println("No puedes participar en la Hackaton juvenil");
        }
    }
}
