
public class MainCar2 {

    public static void main(String[] args) {
        Car2 car1;

        car1 = new Car2("Kia", "white", 5, 4, false, 'F');
        
        /*
         * System.out.println("Model is: " + car1.model);
         * System.out.println("Color:" + car1.color);
         * System.out.println("Seats:" + car1.seats);
         * System.out.println("Number of door:" + car1.numDoor);
         * System.out.println("Is auto? " + car1.isAuto);
         * System.out.println("Type " + car1.type);
         */

        // Mostrando con un método que esta dentro de la clase Car
        car1.showInfo();
    }
}
