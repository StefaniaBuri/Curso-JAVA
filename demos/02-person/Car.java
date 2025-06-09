public class Car {
    public static void main(String[] args) {
        String name = "Kia Carens";
        short year = 2016;
        boolean isFamiliar = true;
        byte seats = 5;
        double weight = 1_400;
        int price = 20_000;

        System.out.println("""
                Modelo de coche: %s
                Año de fabricación: %s
                ¿Es un coche familiar?: %s
                Número de asientos: %s
                Peso del vehículo:  %s kg
                Precio del vehículo: %s
                """.formatted(name, year, isFamiliar, seats, weight, price));
    }
}
