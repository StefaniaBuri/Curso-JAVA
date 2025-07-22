package local.repositories;


import local.entities.Room;

public class RoomDAO extends AbstractDAO<Room> {

    RoomDAO() {
        super(Room.class);
    }
}
