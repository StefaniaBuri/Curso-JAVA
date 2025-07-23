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

        System.out.println(record.findAll());
        System.out.println(record.findById(UUID.fromString("08ef9d35-8f2a-494f-a021-e32651aa9b86")));

        try {
            //record.delete(record.findById(2).get());
            record.findById(UUID.fromString("db469160-f8aa-4b90-abff-2782e8c6f19a")).ifPresentOrElse(entity -> record.delete(entity), () -> System.out.println("Record no encontrada, no se ha podido eliminar"));
        } catch (Exception e) {
            System.out.println("Record eliminado" + e.getMessage());
        }

        try {
            Record re1 = record.findById((UUID.fromString("d093f4c6-6dfe-47ba-b2de-9d1bd6bc16a5"))).orElseThrow(() -> new RuntimeException("Record not found"));
            record.detach(re1);
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
