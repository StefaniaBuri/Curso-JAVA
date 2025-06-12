import java.util.Scanner;

public class WeekTranslator {

    static String getDayByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce day of week");
        String day = scanner.nextLine();
        System.out.println("");
        scanner.close();
        return day;
    }

    public static void weekTranslator() {

        String day = getDayByScanner();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Write a right day"};
        int index = 7;

        switch (day.toLowerCase()) { 
        case "lunes":
            index = 0;
            break;
        case "martes":
            index = 1;
            break;
        case "miercoles":
        case "miércoles":
            index = 2;
            break;
        case "jueves":
            index = 3;
            break;
        case "viernes ":
            index = 4;
            break;
        case "sabado":
        case "sábado":
            index = 5;
            break;
        case "domingo":
            index = 6;
            break;
        default:
           index = 7;
           break;
        }
         System.out.println(days[index]);

    }

    public static void main(String[] args) {
        weekTranslator();
    }
}
