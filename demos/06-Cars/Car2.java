public class Car2 {
    private static int numCars = 0;

    private int id;
    private String model;
    private String color;
    private int seats;
    private int numDoor;
    private boolean isAuto;
    private char type;

    // Constructor
    Car2(String model, String color, int seats, int numDoor, boolean isAuto, char type) {
        numCars = numCars + 1;
        this.id = numCars;
        this.model = model;
        this.color = color;
        this.seats = seats;
        this.numDoor = numDoor;
        this.isAuto = isAuto;
        this.type = type;
    }

    void showInfo() {
        String message = """
                Id: %s
                Model is: %s
                Color is: %s
                Number of seats: %d
                Number of door: %d
                Is Auto?: %b
                Type: %c
                        """.formatted(id,model, color, seats, numDoor, isAuto, type);
        System.out.println(message);
    }
}
