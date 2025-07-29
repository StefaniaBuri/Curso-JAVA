package local;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import local.entities.IEntities;
import local.entities.Meeting;
import local.repositories.MeetingDAO;

public final class AppMeeting {
    private static MeetingDAO meet = new MeetingDAO();

    public static <T extends IEntities> void  showList(Collection<Meeting> collection, String className) {
        if (collection == null || collection.isEmpty()) {
            System.out.println("No items found.");
            return;
        }
        System.out.println(className + ": [");
        collection.forEach(item -> System.out.println(item.toString(true)));
        System.out.println("]");
        System.out.println();
    }

    public static <T extends IEntities> void showOptional(Optional<T> optional, String entityName) {
        optional.ifPresentOrElse(
            //
            item -> System.out.println(item.toString(true)),
            //
            () -> System.out.println(entityName + " no encontrada"));
    }

    private static void showMeetings() {
        System.out.println("----------- Find All -----------");
        showList(meet.findAll(), "Meetings");
        // meet.findAll().forEach(item -> {
        // System.out.println(item.toString(true));
        // });

        System.out.println("----------- Find by date -----------");
        //List<Meeting> m = meet.findByDate(LocalDateTime.of(2025,07,25, 10,38,23));
        List<Meeting> m = meet.findByDate(LocalDate.of(2025, 07, 25));
        showList(m, "Meetings");
        System.out.println("----------- Next meeting -----------");
        Optional<Meeting> m1 = meet.nextMeetingBasic();
        showOptional(m1, "Reunión");
    }

    @SuppressWarnings("unused")
    private static void checkMeetingInitial() {
        //CREAR REGISTRO
        Meeting m1 = meet.save(new Meeting("Primera reunion" , LocalDateTime.now().plusDays(2)));
        Meeting m2 = meet.save(new Meeting("Segunda reunion" , LocalDateTime.now().plusDays(3)));
        System.out.println("1º Meet: " + m1);
        System.out.println("2º Meet: " + m2);

        System.out.println("----------- Find All -----------");
        showList(meet.findAll(), "Meetings");
        System.out.println("----------- Find by ID valid -----------");
        showOptional(meet.findById(1), "Reunión");
        System.out.println("----------- Find by ID invalid -----------");
        showOptional(meet.findById(100), "Reunión");

        //BORRAR REGISTRO
        /* try {
            System.out.println("Delete by ID 3 (si existe): ");
            //Option 1
            meet.delete(meet.findById(3).get());
        } catch (Exception e) {
            System.out.println("Meeting eliminada");
        } */

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
            meet.detach(m3); //clona el objeto y quita la relación con la base de datos para que no refleje los nuevos cambios
            System.out.println("Update by ID: ");
            m3.setDescription("Reunion actualizada");
            m3.setDate(LocalDateTime.now().plusDays(4));
            meet.update(m3); // sube los cambios a la bbdd
            System.out.println();
            System.out.println("Find All after update: " + meet.findAll());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        //checkMeetingInitial();
        //System.exit(0); // salir de la aplicación
        showMeetings();
    }
}
