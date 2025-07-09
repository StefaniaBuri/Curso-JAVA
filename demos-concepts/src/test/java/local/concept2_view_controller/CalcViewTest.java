package local.concept2_view_controller;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;

public class CalcViewTest {

    //Solo se puede testear métodos públicos, los que llamamos para mostrar resultados.
    private CalcController ctrMock;
    private CalcView view;

    private InputStream originalIn;
    //ByteArrayInputStream inputStream;

    private PrintStream originalOut;
    private ByteArrayOutputStream outputStream;


    /* @Test
    void testShow() {
        //Inyección de dependencias -> pasamos el controller a la vista
        CalcController ctrl = new CalcController();
        CalcView view = new CalcView(ctrl);
        view.show(); // el sistema esta esperando que el usuario haga algo, se queda eternally running. 
        //Para testear un interfaz de usuario necesitamos simular(mockear) un test que gestione input y outputs.
    } */


    @BeforeEach
    public void setUp() {
        ctrMock = Mockito.mock(CalcController.class);
        view = new CalcView(ctrMock);

        // Guardar el input original
        originalIn = System.in;
        // Guarder el output original
        originalOut = System.out;
        outputStream = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(outputStream);

        // Restablecemos el system output
        System.setOut(newOut);
    }

    @Test
    void testAdd() {
        ctrMock.setNum1(3);
        ctrMock.setNum2(2);

        Mockito.when(ctrMock.add()).thenReturn(5);

        //creamos el string de lo que escribiría el usuario
        String userInput = "3";

        //creamos un ByteArrayInputStream a partir de un string
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show();
        } catch (NoSuchElementException e) {
            // exception por problema de salida  del while que esta dentro del método show()
        }

        // Verify that the controller's add method was called
        Mockito.verify(ctrMock).add();

        //Verify terminal output
        String output = outputStream.toString().trim();
        //assertEquals("El resultado de Suma:  es 5", output);
        assert output.contains("El resultado de Suma:  es 5") : "Output did not contain expected result.";
    }

    @Test
    public void testShowSubtraction() {
        ctrMock.setNum1(5);
        ctrMock.setNum2(2);
        Mockito.when(ctrMock.subtraction()).thenReturn(3);

        // creamos el string de lo que escribiría el usuario
        String userInput = "4";

        // creamos un ByteArrayInputStream a partir de un string
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        // se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show();
        } catch (NoSuchElementException e) {
            // handle exception for exit while in the code
        }

        // Verify that the controller's add method was called
        Mockito.verify(ctrMock).subtraction();

        // Verify terminal output
        String output = outputStream.toString().trim();
        // assertEquals("er" , output);
        assert output.contains("es 3") : "Output did not contain expected result.";
    }


    @Test
    void testFactorial() throws BusinessException {

        view = new CalcView(ctrMock);
        ctrMock.setNum1(5);

        Mockito.when(ctrMock.calculateFactorial((byte) 1)).thenReturn(120l);

        // creamos el string de lo que escribiría el usuario
        String userInput = "3";

        // creamos un ByteArrayInputStream a partir de un string
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        // se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show(true);
        } catch (NoSuchElementException e) {
            // handle exception for exit while in the code
        }

        // Verify that the controller's add method was called
        Mockito.verify(ctrMock).calculateFactorial((byte) 1);

        // // Verify terminal output
        String output = outputStream.toString().trim();
        // assertEquals("El Factorial number 1: de 0 es 120", output);
        assert output.contains("Factorial") : "Output did not contain expected result.";
        assert output.contains("de 0 es 120") : "Output did not contain expected result.";

    }

    @Test
    void testFactorialNegative() throws BusinessException {

        view = new CalcView(ctrMock);
        ctrMock.setNum1(-5);

        Mockito.when(ctrMock.calculateFactorial((byte) 1))
                .thenThrow(new BusinessException(ErrorCodes.ERROR_NEGATIVE, "Error"));

        // creamos el string de lo que escribiría el usuario
        String userInput = "3";

        // creamos un ByteArrayInputStream a partir de un string
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        // se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show(true);
        } catch (NoSuchElementException e) {
            // handle exception for exit while in the code
        }

        // Verify that the controller's add method was called
        Mockito.verify(ctrMock).calculateFactorial((byte) 1);

        // // Verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains(ErrorCodes.ERROR_NEGATIVE.toString()) : "Output did not contain expected result.";

    }

    @Test
    void testFactorialBigger() throws BusinessException {

        ctrMock.setNum2(25);
        view = new CalcView(ctrMock);

        Mockito.when(ctrMock.calculateFactorial((byte) 2))
                .thenThrow(new BusinessException(ErrorCodes.ERROR_BIGGER_20, "Error"));

        // creamos el string de lo que escribiría el usuario
        String userInput = "4";

        // creamos un ByteArrayInputStream a partir de un string
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        // se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show(true);
        } catch (NoSuchElementException e) {
            // handle exception for exit while in the code
        }

        // Verify that the controller's add method was called
        Mockito.verify(ctrMock).calculateFactorial((byte) 2);

        // // Verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains(ErrorCodes.ERROR_BIGGER_20.toString()) : "Output did not contain expected result.";

    }


    @AfterEach
    public void tearDown() {
        // Restablecer el input
        System.setIn(originalIn);
        // Restablecer el output
        System.setOut(originalOut);
    }
}
