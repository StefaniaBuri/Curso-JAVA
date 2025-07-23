package local;

import local.entities.Room;
import local.repositories.RoomDAO;

public class AppRoom {

    private static void checkRoom() {
        RoomDAO room = new RoomDAO();
        //CREAR
        try {
            room.save(new Room("S0102", "Sala Principal",10));
            room.save(new Room("S0201", "Sala pequeña",5));
            room.save(new Room("S0204", "Technology",50));
            room.save(new Room("S0203", "Human Resources",15));
        } catch (Exception e) {
            System.out.println("Salas ya creadas");
        }

        //MOSTRAR TODOS
        System.out.println(room.findAll());
        //MOSTRAR POR ID
        System.out.println(room.findById(1));

        //BORRAR REGISTRO
        try {
            room.findById("S0201").ifPresentOrElse(entity -> room.delete(entity), () -> System.out.println("Room no encontrada, no se ha podido eliminar"));
        } catch (Exception e) {
            System.out.println("Room eliminada");
        }
        //ACTUALIZAR REGISTRO
        Room r1 = new Room("S0101", "Sala Principal reformada",10);
        room.update(r1);
    }

    public static void main(String[] args) {
        checkRoom();
    }
}
