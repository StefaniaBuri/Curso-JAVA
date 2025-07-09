package local.concept_test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OutputTest {

    private PrintStream originalOut;
    private ByteArrayOutputStream outputStream;

    //@BeforeAll: método estático que se ejecuta antes de todos los demás métodos
    @BeforeEach
    void configure() {
        //Guardar el output original
        originalOut = System.out;

        //Crear un nuevo output
        outputStream = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(outputStream);

        //Le pasamos el system output, y asi leemos la información de ese stream porque lo esta capturando
        System.setOut(newOut);
    }

    @Test
    void demo() {
        final String TEXT = "Texto de prueba";
        System.out.println(TEXT); // se guarda en el flujo de salida a medida (outputStream)
        String output = outputStream.toString().trim(); // esto es lo que ha pintado el usuario en la pantalla

        //Assert
        assertEquals(TEXT, output);
    }

    @AfterEach //métodos no estáticos
    public void tearDown() {
        //Restablecer el output original
        System.setOut(originalOut);
    }
}
