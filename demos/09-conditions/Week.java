public class Week {

    public static void weekDay() {
        int day = 3;

            if (day == 1) {
                System.out.println("Lunes");
            } else if(day == 2) {
                System.out.println("Martes");
            } else if(day == 3) {
                System.out.println("Miércoles");
            } else if(day == 4) {
                System.out.println("Jueves");
            } else if(day == 5) {
                System.out.println("Viernes");
            } else if(day == 6) {
                System.out.println("Sábado");
            } else {
                System.out.println("Domingo");
            } 

        } 
    
    


    public static void weekDay1() {

        int day = 3;
        String[] days = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int index = 6;

        switch (day) { 
        case 1:
            index = 0;
            break;
        case 2:
            index = 1;
            break;
        case 3:
            index = 2;
            break;
        case 4:
            index = 3;
            break;
        case 5:
            index = 4;
            break;
        case 6:
            index = 5;
            break;
            
        default:
           index = 6;
        }
         System.out.println(days[index]);

    }

    public static void main(String[] args) {
        weekDay1();
    }
}
