import java.util.Scanner;

public class Shop {

    static final double PACK_PRICE = 20;

    static int getPackByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vendemos paquetes de pantalones y camisetas a %s EU \n", PACK_PRICE);
        System.out.println("Introduce el número de paquetes");
        int packs = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return packs;
    }

    static double totalPrice() {
        int numPack = getPackByScanner();
        int shippingByPack = 0;
        double discount = 0.15;

        if(numPack <= 5) {
            System.out.println("No se puede realizar la venta porque el número de paquetes es insuficiente");
            return 0;

        } else if(numPack < 10) {
            discount = 0.05;
            shippingByPack = 10;
        } else if(numPack < 20) {
            discount = 0.1;
            shippingByPack = 5;
        }  

        // Descuento para los casos 2, 3, 4
        double total = numPack * PACK_PRICE;
        double finalDiscount = total * discount;
        double totalShipping = numPack * shippingByPack;
        double totalPrice = total - finalDiscount + totalShipping;

        System.out.println("""
            Números de paquetes             %s
            Precio total del producto       %.2f EU
            Descuento aplicado              %.2f EU
            Gastos de envío                 %.2f EU
            ---------------------------------
            TOTAL                           %.2f EU
                 """.formatted(numPack, total, finalDiscount, totalShipping, totalPrice));
        return totalPrice;
    } 


    //static void getDiscount() {
        /* int[] descuento = {0, 5, 10 , 0};
        int[] fees = {0, 10, 5, 0};
        String[] messages = {
                "No se puede realizar la venta",
                "Te aplicaremos un %s de descuento y el coste de envío es de %s por paquete",
                "Te aplicaremos un %s de descuento y el coste de envío es de %s por paquete",
                "Te aplicaremos un %s de descuento y el coste de envío es gratuito"
        };

        int index = (pack <= 5) ? 0 :
                    (pack < 10) ? 1 : 
                    (pack >= 10 && pack < 20) ? 2 :
                    (pack >= 20) ? 3 : 4;
          System.out.printf(messages[index], descuento, fees); */
        

    //}

    public static void main(String[] args) {
        totalPrice();

     }
}
