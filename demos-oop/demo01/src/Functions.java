import base.Square;

public class Functions {

    /* public static Square foo(Square sqFoo) {
        Square newSq =  new Square(sqFoo);
        newSq.side *= 2;
        return newSq;
    } */


    public static void main(String[] args) throws CloneNotSupportedException {
        Square s1 = new Square(10);
        //Square dSq = foo(s1);
        System.out.println("Objeto Square 1: " + s1); // side: 10
        //System.out.println(dSq); // side 20

        Square s2 = (Square) s1.clone();
        System.out.println("Objeto Square 2: " + s2);
    }
}
