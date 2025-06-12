import java.util.Scanner;

public class School {

    static int getAgeByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la edad del alumno");
        int age = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return age;
    }

    public static void schoolSchedule() {

        int age = getAgeByScanner();

        String[] messages = {
                "Kinder (de 6 años inclusive): Lunes y Miércoles de 16 a 17",
                "1stYear (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30",
                "2ndYear (de 9 a IO años inclusive): Martes y Jueves de 17:30 a 19",
                "3rdYear (de ll a 13 años inclusive): Lunes y Miércoles de 17 a 18:30",
                "No tengo clases para niños de su edad"
        };

        int index = 4;

        if (age <= 6) {
            index = 0;
            // System.out.printf("Tu tienes %s años, las clases son: %s", age, messages[0]);
        } else if (age <= 8) {
            index = 1;

            // System.out.printf("Tu tienes %s años, las clases son: %s", age, messages[1]);
        } else if (age <= 10) {
            index = 2;
            // System.out.printf("Tu tienes %s años, las clases son: %s", age, messages[2]);
        } else if (age <= 13) {
            index = 3;
            // System.out.printf("Tu tienes %s años, las clases son: %s", age, messages[3]);
        }
        // else {
        // index = 4;
        // System.out.println(messages[4]);
        // }

        System.out.println(messages[index]);
    }

    //OPTION 2
    public static void schoolSchedule1() {
        int age = getAgeByScanner();
        String[] messages = {
                "Kinder (de 6 años inclusive): Lunes y Miércoles de 16 a 17",
                "1stYear (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30",
                "2ndYear (de 9 a IO años inclusive): Martes y Jueves de 17:30 a 19",
                "3rdYear (de ll a 13 años inclusive): Lunes y Miércoles de 17 a 18:30",
                "No tengo clases para niños de su edad"
        };

        int index = (age <= 6) ? 0 :
                    (age <= 8) ? 1 : 
                    (age <= 10) ? 2 :
                    (age <= 13) ? 3 : 4;
        System.out.println(messages[index]);
    }

    public static void main(String[] args) {

        // schoolSchedule();
        schoolSchedule1();
    }
}
