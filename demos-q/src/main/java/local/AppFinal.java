package local;

import java.time.LocalDateTime;

import local.entities.Meeting;
import local.entities.Person;
import local.entities.Record;
import local.entities.Room;
import local.repositories.MeetingDAO;
import local.repositories.PersonDAO;

public class AppFinal {

    private static PersonDAO personDAO = new PersonDAO();
    private static MeetingDAO meetingDAO = new MeetingDAO();

    public static void main(String[] args) {

        Meeting m = new Meeting("Reunión inicial del proyecto", LocalDateTime.now().plusDays(1));
        Room r = new Room("S0104", "Sala Vip", 12);
        m.setRoom(r);
        Person p = new Person("Patricia", "Pino", "patty01@example.com");
        Person p2 = personDAO.findById(3).get();
        m.addParticipant(p);
        m.addParticipant(p2);
        Record rc = new Record("Lo que haremos en el proyecto nuevo");
        m.setRecord(rc);
        m = meetingDAO.save(m);

        AppMeeting.showOptional(meetingDAO.findById(m.getId()), "Meeting");

        //Falla al introducir Person, revisar
    }
}
