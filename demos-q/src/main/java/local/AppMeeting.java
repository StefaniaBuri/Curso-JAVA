package local;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;
import local.entities.Meeting;
import local.repositories.MeetingDAO;

public final class AppMeeting {
    private static MeetingDAO meet = new MeetingDAO();

    @SuppressWarnings("unused")
    private static void checkMeetingInitial() {
        //CREAR REGISTRO
        Meeting m1 = meet.save(new Meeting("Primera reunion" , LocalDateTime.now().plusDays(2)));
        Meeting m2 = meet.save(new Meeting("Segunda reunion" , LocalDateTime.now().plusDays(3)));
        System.out.println("1º Meet: " + m1);
        System.out.println("2º Meet: " + m2);

        //MOSTRAR TODOS LOS REGISTROS
        System.out.println("FindAll: " + meet.findAll());
        //MOSTRAR REGISTRO POR ID
        System.out.println("FindById: " + meet.findById(1));
        System.out.println("Find by ID invalid: " + meet.findById(100));

        //BORRAR REGISTRO
        try {
            System.out.println("Delete by ID 3 (si existe): ");
            //Option 1
            meet.delete(meet.findById(3).get());
        } catch (Exception e) {
            System.out.println("Meeting eliminada");
        }
        //Option 2
        //meet.findById(1).ifPresent(entity -> meet.delete(entity));
        meet.findById(1).ifPresentOrElse(entity -> meet.delete(entity), () -> System.out.println("Reunión no encontrada, no se ha podido eliminar")); // para mandar un error si el registro a eliminar no existe
        //meet.findById(1).ifPresentOrElse(meet::delete, () -> System.out.println("Reunión no encontrada, no se ha podido eliminar"));
        System.out.println("Find All after delete: " + meet.findAll());


        //ACTUALIZAR REGISTRO
        //Meeting m1 = new Meeting(); //Option 1: crear un meeting
        //Meeting m2 = meet.findById(1).get(); // Option 2 : crear otro meeting
        try {
            Meeting m3 = meet.findById(8).orElseThrow(() -> new RuntimeException("Meeting not found"));
            meet.detach(m3);
            System.out.println("Update by ID: ");
            m3.setDescription("Reunion actualizada");
            m3.setDate(LocalDateTime.now().plusDays(4));
            meet.update(m3);
            System.out.println();
            System.out.println("Find All after update: " + meet.findAll());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        //checkMeetingInitial();
        //System.exit(0); // salir de la aplicación
        System.out.println("------ Find All---------");
        System.out.println(meet.findAll());

        System.out.println("------ Reunion FindByDate ---------");
        //List<Meeting> m = meet.findByDate(LocalDateTime.of(2025,07,25, 10,38,23));
        List<Meeting> m1 = meet.findByDate(LocalDate.of(2025, 07, 25));
        //System.out.println(m);
        System.out.println(m1);
        System.out.println("------ Next meeting ---------");
        Meeting m2 = meet.nextMeetingBasic();
        System.out.println(m2);
    }
}
