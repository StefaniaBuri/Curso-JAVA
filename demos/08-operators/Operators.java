public class Operators {

    /* Operadores -> expresiones 
            - Asignación =
            - Aritméticos 
               + 
               - 
               * 
               / 
               %
            - Comparación -> expresión boolean  
               ==  
               !=  
               < 
               >  
               <= 
               >= 
               .equals()
    */ 

    public static void main(String[] args) {
      int num1 = 10;
      int num2 = 20;
      String s1 = "20";
      String s2 = "20";

      boolean result = num1 == num2; // igual -> false
      boolean result2 = num1 != num2; // distinto -> true
      boolean result3 = num1 > num2; // mayor que -> false
      boolean result4 = num1 < num2; // menor que -> true
      boolean result5 = s1.equals(s2);
      

      System.out.println(result);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
      System.out.println(result5);

    
    }
}
