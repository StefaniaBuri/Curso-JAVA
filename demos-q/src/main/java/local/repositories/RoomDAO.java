package local.repositories;


import local.entities.Room;

public class RoomDAO extends AbstractDAO<Room> {

    public RoomDAO() {
        super(Room.class);
    }
}
