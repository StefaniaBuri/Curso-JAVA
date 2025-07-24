package local;

import local.entities.Room;
import local.repositories.RoomDAO;

public class AppRoom {
    private static RoomDAO room = new RoomDAO();

    private static void showRooms() {
        System.out.println("----------- Find All -----------");
        System.out.println(room.findAll());
    }

    private static void checkRoom() {

        try {
            room.save(new Room("S0102", "Sala Principal",10));
            room.save(new Room("S0201", "Sala pequeña",5));
            room.save(new Room("S0204", "Technology",50));
            room.save(new Room("S0203", "Human Resources",15));
        } catch (Exception e) {
            System.out.println("Salas ya creadas");
        }

        room.save(new Room("S0205", "Sala pequeña estudiantes", 15));

        System.out.println("----------- Find All -----------");
        System.out.println(room.findAll());
        System.out.println("----------- Find by ID valid -----------");
        System.out.println(room.findById("S0204"));
        System.out.println("----------- Find by ID invalid -----------");
        System.out.println(room.findById(100));

        //BORRAR REGISTRO
        System.out.println("----------- Delete by ID S0201 (si existe)-----------");
        room.findById("S0201").ifPresentOrElse(room::delete, () -> System.out.println("Room no encontrada, no se ha podido eliminar"));
        System.out.println("----------- Find All after delete -----------");
        System.out.println(room.findAll());


        try {
            Room r1 = new Room("S0101", "Sala principal reformada", 15);
            System.out.println("----------- Update by ID 2 -----------");
            room.update(r1);
            System.out.println("----------- Find All after update -----------");
            System.out.println(room.findAll());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        //checkRoom();
        showRooms();
    }
}
