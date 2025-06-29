
import animals.Pet;
import containers.Bag;
import containers.Box;
import containers.IContainer;
import order.IOrder;
import order.Order;
import products.Drugstore;
import products.Food;
import products.Fresh;
import products.Frozen;
import products.Hygiene;
import products.Pets;
import products.IProduct;

public class SuperApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestro supermercado online!");

        //Interface define el tipo, clase para dar valor a la variable
        IOrder order1 = new Order("P001");
        //System.out.println(order1);

        IContainer box1 = new Box("B003", 30, 50, 50);
        IContainer bag = new Bag("B006", 40, 50, 900);
        
        System.out.println(box1);
        System.out.println(bag);

        System.out.println("---------------------------");
        order1.addContainer(bag);
        order1.addContainer(box1);
        System.out.println("Mi pedido con contenedores: " + order1);
        
        IProduct p1 = new Food("Patatas", 1500, 1000);
        IProduct p2 = new Drugstore("Detergente", 1000, 1000);
        IProduct p3 = new Hygiene("Papel Higiénico", 1000, 100);
        IProduct p4 = new Pets("Comida para perros", 1000, 2000);
        IProduct p5 = new Fresh("Kiwi", 1000, 1500);
        IProduct p6 = new Frozen("Pizza", 800, 1000);

        // System.out.println(p1);
        // System.out.println(p2);
        // System.out.println(p3);
        // System.out.println(p4);
        // System.out.println(p5);
        // System.out.println(p6);
        
        IContainer c1 = order1.addProduct(p1);
        IContainer c2 = order1.addProduct(p2);
        IContainer c3 = order1.addProduct(p3);
        IContainer c4 = order1.addProduct(p4);
        IContainer c5 = order1.addProduct(p5);
        IContainer c6 = order1.addProduct(p6);

        // System.out.println(c1);
        // System.out.println(c2);
        // System.out.println(c3);
        // System.out.println(c4);
        // System.out.println(c5);
        // System.out.println(c6);
        System.out.println("Mi pedido con productos: " + order1);


        /* RESUMEN:
           Desde la clase Supermercado(main) creamos un pedido, con una bolsa y una caja. llamamos al metodo addProduct() de un pedido para agregar productos, dentro del metodo iteramos sobre todos los
         * contenedores del pedido. Por cada container, llamamos al metodo canInsert(). Hace comprobaciones para poder agregar el producto:
         *  - Primero: comprueba si el contenedor resiste al producto. isResistance() metodo que pertenece a container.
         *  - Segundo: pregunta a producto si tiene espacio en el container, container chequea el volumenAvailable().
         *  - Tercero: compatibilidad. Container debe iterar sobre todos los productos que ya contiene y comprabar si el producto nuevo es compatible con los ya añadidos.
         * Finalmente, si las 3 comprobaciones son ok, Container agrega a su lista de productos el nuevo producto.
         * Despues informa al producto en que container ha sido metido
         */

    }
}
