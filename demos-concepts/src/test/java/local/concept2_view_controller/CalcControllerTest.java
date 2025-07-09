package local.concept2_view_controller;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;


//Corner case: situaciones extrañas que no hubieran previsto.

public class CalcControllerTest {

    private CalcController cc;

    @BeforeEach
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
    public void subtractDefaultTest() {
        // 0 - 0
        assertEquals(0, cc.subtraction());
    }

    @Test
    public void testSubtractionPositives() {
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
    public void multiplyDefaultTest() {
        // 0 * 0
        assertEquals(0, cc.multiply());
    }

    @Test
    public void testMultiplyPositives() {
        int num1 = 20;
        int num2 = 8;
        cc.setNum1(num1);
        cc.setNum2(num2);
        int result = cc.multiply();
        assertEquals(160, result);
    }

    @Test
    public void testMultiplyNegative() {
        int num1 = 5;
        int num2 = -3;
        cc.setNum1(num1);
        cc.setNum2(num2);
        int result = cc.multiply();
        assertEquals(-15, result);
    }

    @Test 
    public void testDivisionDefault() {
      /*   cc.setNum1(3);
        cc.setNum2(30);  */
        // 0 / 0
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
    public void testDivisionDefault2() {
        // 0 / 0
        try {
            cc.division();
            fail("Situación no contemplada");
        } catch (BusinessException e) {
            assertTrue(true);
        } catch (Exception e) {
            fail("Excepción no soportada");
        }
    }

    @Test
    public void testDivisionPositive() throws BusinessException {
        cc.setNum1(30);
        cc.setNum2(3); 
      
        assertEquals(10, cc.division());
        assertEquals(0,cc.restDivision());
    }

    @Test 
    public void testDivisionNegative() throws BusinessException {
        cc.setNum1(5);
        cc.setNum2(-3); 

        assertEquals(-1, cc.division());
        assertEquals(2, cc.restDivision());
    }

     @Test
    public void testDecimalDivideDefault() {
        // 0 / 0
        double result = cc.decimalDivide();
        assertEquals(Double.NaN, result, 1); // OK
    }

    @Test //delta: grado de precision de los decimales queremos usar, da un margen de error en los decimales.
    public void testDecimalDividePositive() {
        cc.setNum1(5);
        cc.setNum2(3);
        //assertEquals(1.98, cc.decimalDivide(),0.2); // 1.6666 != 1.98 FALLA
        assertEquals(1.68, cc.decimalDivide(),0.2); // OK
    }

    @Test
    public void testDecimalDivideNegative() {
        cc.setNum1(5);
        cc.setNum2(-3);
        double result = cc.decimalDivide();
        assertEquals(-1.68, result ,0.2); // OK
    }

    @Test
    public void testDecimalDivideNoNanDefault() {
        // 0 / 0
         try {
            cc.decimalDivideNoNan();
            fail("Situación no contemplada");
        } catch (BusinessException e) {
            assertTrue(true);
        } catch (Exception e) {
            fail("Excepción no soportada");
        }
    }

    @Test
    public void testDecimalDivideNoNanPositive() throws BusinessException {
        // int num1 = 5;
        // int num2 = 3;
        cc.setNum1(5);
        cc.setNum2(3);
        // int result = calculator.add();
        assertEquals(1.66, cc.decimalDivideNoNan(), 0.01);
    }

    @Test
    public void testDecimalDivideNoNanNegative() throws BusinessException {
        int num1 = 5;
        int num2 = -3;
        cc.setNum1(num1);
        cc.setNum2(num2);
        double result = cc.decimalDivideNoNan();
        assertEquals(-1.66, result, 0.01);
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
        // 0
        assertEquals(1, cc.calculateFactorial());
    }

    @Test
    public void testFactorialPositive() throws BusinessException {
        cc.setNum1(5);
        assertEquals(120, cc.calculateFactorial());
    }

    @Test
    public void testFactorialNegative() {
       int num1 = -3;
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
     public void testFactorialNegativeLambda() {
        int num1 = -3;
        cc.setNum1(num1);
        Exception e = assertThrows(BusinessException.class, 
        () -> cc.calculateFactorial());
        assertTrue(e.getMessage().contains(ErrorCodes.ERROR_NEGATIVE.toString()));
     }

    @Test
    public void testFactorialBigger20()  {
        int num1 = 22;
        cc.setNum1(num1);
         try {
            cc.calculateFactorial();
            fail("Situación no contemplada");
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

    @Test
    public void testFactorialBigger20Lambda()  {
        int num1 = 23;
        cc.setNum1(num1);
        Exception e = assertThrows(BusinessException.class, 
        () -> cc.calculateFactorial());
        assertTrue(e.getMessage().contains(ErrorCodes.ERROR_BIGGER_20.toString()));
    }

    /* @ParameterizedTest
    public void testPow(int n1, int n2, int e) throws BusinessException {
        cc.setNum1(5);
        cc.setNum2(3);
        assertEquals(125, cc.calculatePow());
    } */

    @ParameterizedTest(name = "[{index}] {0}^{1} = {2}")
    @CsvSource(value = {"2,2,4", "3,2,9", "3,5, 243"})// 2 elevado a 2 = 4, 3 elevado a 2 = 9, 3 elevado a 5 = 243
    public void testPow_2_2(int n1, int n2, int e) throws BusinessException {
        // int num1 = 5;
        // int num2 = 3;
        cc.setNum1(n1);
        cc.setNum2(n2);
        // int result = calculator.add();
        assertEquals(e, cc.calculatePow());
    }

 /*    @Test
    public void testPow_3_2() throws BusinessException {
        // int num1 = 5;
        // int num2 = 3;
        cc.setNum1(3);
        cc.setNum2(2);
        // int result = calculator.add();
        assertEquals(9, cc.calculatePow());
    } 

    @Test
    public void testPow_3_5() throws BusinessException {
        // int num1 = 5;
        // int num2 = 3;
        cc.setNum1(3);
        cc.setNum2(5);
        // int result = calculator.add();
        assertEquals(243, cc.calculatePow());
    }

     @Test
    public void testPow_m3_2() throws BusinessException {
        // int num1 = 5;
        // int num2 = 3;
        cc.setNum1(-3);
        cc.setNum2(3);
        // int result = calculator.add();
        assertEquals(-27, cc.calculatePow());
    }

    @Test
    public void testPow_3_m2() {
        // int num1 = 5;
        // int num2 = 3;
        cc.setNum1(3);
        cc.setNum2(-3);
        // int result = calculator.add();
        assertThrows(BusinessException.class, () -> cc.calculatePow());
    }*/
}
