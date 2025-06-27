
import containers.Bag;
import containers.Box;
import containers.IContainer;
import order.IOrder;
import order.Order;

public class SuperApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestro supermercado online!");

        //Interface define el tipo, clase para dar valor a la variable
        IOrder order1 = new Order("0001");
        System.out.println(order1);

        IContainer box1 = new Box("B003", 50, 50, 50);
        IContainer bag = new Bag("B006", 50, 50, 5);
        
        

        order1.addContainer(box1);
        order1.addContainer(bag);
        
        System.out.println(box1);
        System.out.println(bag);

    }
}
