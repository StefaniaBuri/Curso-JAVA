package local;

import java.time.LocalDateTime;

import local.entities.Meeting;
import local.repositories.MeetingDAO;

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
        MeetingDAO meet = new MeetingDAO();

        //meet.save(new Meeting("Primera reunion" , LocalDateTime.now().plusDays(2)));
        System.out.println(meet.findAll());

        System.out.println(meet.findById(1));

        try {
            meet.delete(meet.findById(2).get());
        } catch (Exception e) {
            System.out.println("Meeting eliminada");
        }

        //Meeting m1 = new Meeting(); //Option 1: crear un meeting
        Meeting m2 = meet.findById(1).get(); // Option 2 : crear otro meeting
        m2.setDescription("Reunion modificada");
        meet.update(m2);
    }
}
