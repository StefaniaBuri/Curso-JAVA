package local;

import local.repositories.RecordDAO;

import java.util.UUID;

import local.entities.Record;

public class AppRecord {

    private static void checkRecord() {
        RecordDAO record = new RecordDAO();

        record.save(new Record("Sesión informativa"));
        record.save(new Record("Info reunion"));
        record.save(new Record("Reunion trabajadores"));

        System.out.println("----------- Find All -----------");
        System.out.println(record.findAll());
        System.out.println("----------- Find by ID valid -----------");
        System.out.println(record.findById(UUID.fromString("08ef9d35-8f2a-494f-a021-e32651aa9b86")));
        System.out.println("----------- Find by ID invalid -----------");
        System.out.println(record.findById(UUID.fromString( "2a0cd5b5-1c2f-41d0-bc00-96bc7f9176c5")));


        System.out.println("----------- Delete by ID 1 (si existe)-----------");
        record.findById(UUID.fromString("db469160-f8aa-4b90-abff-2782e8c6f19a")).ifPresentOrElse(record::delete, () -> System.out.println("Record no encontrada, no se ha podido eliminar"));
        System.out.println("----------- Find All after delete -----------");
        System.out.println(record.findAll());

        try {
            Record re1 = record.findById((UUID.fromString("d093f4c6-6dfe-47ba-b2de-9d1bd6bc16a5"))).orElseThrow(() -> new RuntimeException("Record not found"));
            record.detach(re1);
            System.out.println("----------- Update by ID -----------");
            re1.setContent("Sesión informativa para estudiantes");
            record.update(re1);
            System.out.println("Find All after update: " + record.findAll());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        checkRecord();
    }
}
