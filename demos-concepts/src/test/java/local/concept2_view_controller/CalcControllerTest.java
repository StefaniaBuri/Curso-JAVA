package local.concept2_view_controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;


//Corner case: situaciones extrañas que no hubieran previsto.

public class CalcControllerTest {

    private CalcController cc;

    @Before //método que se ejecuta antes de los test
    public void configure() {
        cc = new CalcController();
    }


    @Test
    public void testAddDefault() {
        // 0 + 0
        assertEquals(0, cc.add());
    }

    @Test
    public void testAddPositives() {
        int num1 = 5;
        int num2 = 7;
        cc.setNum1(num1);
        cc.setNum2(num2);
        int result = cc.add();
        assertEquals(12, result);
    }

    @Test
    public void testAddOneNegative() {
        int num1 = -5;
        int num2 = -4;
        cc.setNum1(num1);
        cc.setNum2(num2);
        int result = cc.add();
        assertEquals(-9, result);
    }

    @Test
    public void testSubtraction() {
        int num1 = 10;
        int num2 = 4;
        cc.setNum1(num1);
        cc.setNum2(num2);
        int result = cc.subtraction();
        assertEquals(6, result);
    }

    @Test
    public void testSubtractionNegative() {
        int num1 = 5;
        int num2 = -3;
        cc.setNum1(num1);
        cc.setNum2(num2);
        int result = cc.subtraction();
        assertEquals(8, result);
    }

    @Test
    public void testMultiply() {
        int num1 = 20;
        int num2 = 8;
        cc.setNum1(num1);
        cc.setNum2(num2);
        int result = cc.multiply();
        assertEquals(160, result);
    }

    @Test
    //public void testRestDivision()
    public void testDivisionPositive() throws BusinessException {
        cc.setNum1(30);
        cc.setNum2(3); 
      
        assertEquals(10, cc.division());
        assertEquals(0,cc.restDivision());
    }

    @Test 
    public void testDivision() {
      /*   cc.setNum1(3);
        cc.setNum2(30);  */
        try {
            cc.division();
            fail("Situación no contemplada");
        } catch (BusinessException e) {
            /* BusinessException expected = new BusinessException(ErrorCodes.ERROR_ZERO, "Dividendo por 0");
            assertEquals(expected.getMessage(),e.getMessage()); */
            assertTrue(true);
        } catch (Exception e) {
            fail("Excepción no soportada");
        }
    }

    @Test 
    public void testDivision2() {
        try {
            cc.division();
            fail("Situación no contemplada");
        } catch (BusinessException e) {
            BusinessException expected = new BusinessException(ErrorCodes.ERROR_ZERO, "Dividendo por 0");
            assertEquals(expected.getMessage(),e.getMessage());
        } catch (Exception e) {
            fail("Excepción no soportada");
        }
    }


    @Test 
    public void testDivisionNegative() throws BusinessException {
        cc.setNum1(5);
        cc.setNum2(-3); 

        assertEquals(-1, cc.division());
    }

    @Test //delta: grado de precision de los decimales queremos usar, da un margen de error en los decimales.
    public void testDecimalDividePositive() throws BusinessException {
        cc.setNum1(5);
        cc.setNum2(3);
        //assertEquals(1.98, cc.decimalDivide(),0.2); // 1.6666 != 1.98 FALLA
        assertEquals(1.68, cc.decimalDivide(),0.2); // OK
    }


    @Test //revisar
    public void testDecimalDivideNegative() throws BusinessException {
        cc.setNum1(5);
        cc.setNum2(-3);
        double result = cc.decimalDivide();
        assertEquals(-1.68, result ,0.2); // OK
    }

    @Test //revisar
    public void testDecimalDivideDefault() throws BusinessException {
        double x = Double.NaN;
        double result = cc.decimalDivide();
        assertEquals(x, result ,1); // OK
    }

    @Test //revisar
    public void testDecimalDivideNoNanDefault() throws BusinessException {
        cc.setNum1(5);
        cc.setNum2(-3);
        double result = cc.decimalDivideNoNan();
        assertEquals( -1.66, result, 0.01);
    }

    @Test //revisar
    public void testDecimalDivideNoNanPositive() throws BusinessException {
        cc.decimalDivideNoNan();
    }

    @Test //revisar
    public void testDecimalDivideNoNanNegative() throws BusinessException {
        cc.decimalDivideNoNan();
    }

    @Test
    public void testDecimalDivideZero() {
        int num1 = 3;
        int num2 = 0;
        cc.setNum1(num1);
        cc.setNum2(num2);
        double result = cc.decimalDivide();
        assertEquals(Double.POSITIVE_INFINITY, result, 0.01);
    }

    @Test //default = numero de partida 0
    public void testFactorialDefault() throws BusinessException {
        assertEquals(1, cc.calculateFactorial());
    }


    @Test
    public void testFactorialPositive() throws BusinessException {
      short num1 = 3;
        //cc.setNum1(num1);
        long result = cc.calculateFactorial(num1);
        assertEquals(6, result);
    }

    @Test
    public void testFactorialNegative() throws BusinessException {
       short num1 = -3;
       cc.setNum1(num1);
       try {
            cc.calculateFactorial();
            fail("Situación no contemplada");
       } catch (BusinessException e) {
        //Option 1
           /*  BusinessException expected = new BusinessException(ErrorCodes.ERROR_NEGATIVE, "No se puede calcular el factorial de "+ num1);
            assertEquals(expected.getMessage(), e.getMessage()); */

        //Option 2
            //assertTrue(true);
        //Option 3
            assertTrue(e.getMessage().contains(ErrorCodes.ERROR_NEGATIVE.toString()));
       }
    }

    @Test
    public void testFactorialBigger20()  {
        int num1 = 22;
        cc.setNum1(num1);
         try {
            cc.calculateFactorial();
            //fail("Situación no contemplada");
       } catch (BusinessException e) {
        //Option 1
           /*  BusinessException expected = new BusinessException(ErrorCodes.ERROR_BIGGER_20, "No se puede calcular el factorial de "+ num1);
            assertEquals(expected.getMessage(), e.getMessage()); */
        //Option 2
            //assertTrue(true);
        //Option 3
            assertTrue(e.getMessage().contains(ErrorCodes.ERROR_BIGGER_20.toString()));
       }
    }

}
