package local;

import java.time.LocalDateTime;

import local.entities.Meeting;
import local.entities.Person;
import local.entities.Record;
import local.repositories.MeetingDAO;
import local.repositories.PersonDAO;
import local.repositories.RecordDAO;
import local.entities.Room;
import local.repositories.RoomDAO;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //MEETING
        MeetingDAO meet = new MeetingDAO();
        //CREAR REGISTRO
        meet.save(new Meeting("Primera reunion" , LocalDateTime.now().plusDays(2)));
        //MOSTRAR TODOS LOS REGISTROS
        System.out.println(meet.findAll());
        //MOSTRAR REGISTRO POR ID
        System.out.println(meet.findById(1));
        //BORRAR REGISTRO
        try {
            //meet.delete(meet.findById(2).get());
        } catch (Exception e) {
            //System.out.println("Meeting eliminada");
        }
        //ACTUALIZAR REGISTRO
        //Meeting m1 = new Meeting(); //Option 1: crear un meeting
        Meeting m2 = meet.findById(1).get(); // Option 2 : crear otro meeting
        m2.setDescription("Reunion modificada");
        meet.update(m2);


        //ROOM
        RoomDAO room = new RoomDAO();
        //CREAR
        room.save(new Room("1", "Technology",50));
        //MOSTRAR TODOS
        System.out.println(room.findAll());
        //MOSTRAR POR ID
        System.out.println(room.findById(1));
        //BORRAR REGISTRO
        try {
            //room.delete(room.findById(2).get());
        } catch (Exception e) {
            //System.out.println("Room eliminada");
        }
        //ACTUALIZAR REGISTRO
        Room r1 = room.findById(1).get();
        r1.setName("Human Resources");
        room.update(r1);


        //RECORD
        RecordDAO record = new RecordDAO();
        record.save(new Record("Sesion informativa"));
        System.out.println(record.findAll());
        System.out.println(record.findById(1));
        try {
            //record.delete(record.findById(2).get());
        } catch (Exception e) {
            //System.out.println("Record eliminado");
        }
        Record re1 = record.findById(1).get();
        re1.setContent("Sesion informativa para estudiantes");
        record.update(re1);

        //PERSON
        PersonDAO person1 = new PersonDAO();
        person1.save(new Person("Carolina", "Castro", "carol@example.com"));
        System.out.println(person1.findAll());
        System.out.println(person1.findById(1));
        try {
            //person1.delete(person1.findById(2).get());
        } catch (Exception e) {
            //System.out.println("Person eliminada");
        }
        Person p1 = person1.findById(1).get();
        p1.setEmail("carolCas@example.com");
        person1.update(p1);
    }
}
