public class Car {

    String model;
    String color;
    int seats;
    int numDoor;
    boolean isAuto;
    char type;

    // Constructor
    Car(String model, String color, int seats, int numDoor, boolean isAuto, char type) {
        this.model = model;
        this.color = color;
        this.seats = seats;
        this.numDoor = numDoor;
        this.isAuto = isAuto;
        this.type = type;
    }

    void showInfo() {
        String message = """
                Model is: %s
                Color is: %s
                Number of seats: %d
                Number of door: %d
                Is Auto?: %b
                Type: %c
                        """.formatted(model, color, seats, numDoor, isAuto, type);
        System.out.println(message);
    }
}
