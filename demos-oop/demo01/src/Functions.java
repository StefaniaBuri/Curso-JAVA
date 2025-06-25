import base.Square;

public class Functions {

    public static Square foo(Square sqFoo) throws CloneNotSupportedException {
        Square newSq = (Square) sqFoo.clone();
        //newSq.side *= 2;
        return newSq;
    } 


    public static void main(String[] args) throws CloneNotSupportedException {
        Square s1 = new Square(10);
        //Square dSq = foo(s1);
        //System.out.println(s1); // side 10
        //System.out.println(dSq); // side 20

        //Clone
        System.out.println("Objeto Square 1: " + s1); // side: 10
        //Square s2 = (Square) s1.clone();
        //System.out.println("Objeto Square 2: " + s2); // side: 10
        System.out.println("Objeto Square 2: " + foo(s1));
        
    }
}
