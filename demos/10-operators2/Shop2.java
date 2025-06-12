import java.util.Scanner;

public class Shop2 {

    static final double TROUSER_PRICE = 22;
    static final double SHIRT_PRICE = 16;

    static int[] getPackByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vendemos paquetes de pantalones a %s EU \n", TROUSER_PRICE);
        System.out.printf("Vendemos paquetes de camisetas a %s EU \n", SHIRT_PRICE);
        System.out.println("Introduce el número de paquetes de pantalones");
        int packsTrouser = scanner.nextInt();

        System.out.println("Introduce el número de paquetes de camisetas");
        int packsShirts = scanner.nextInt();

        scanner.close();

        int[] result= {packsTrouser,packsShirts};
        return result;
        //return new int[]{packsTrouser,packsShirts};
    }


    public static void main(String[] args) {
        int[] numPack = getPackByScanner();
        int numPackTrouser = numPack[0];
        int numPackShirt = numPack[1];
        int numPackTotal = numPackTrouser + numPackShirt;

        int shippingByPack = 0;
        double discount = 0.15;
        double promotion = 0;


        if(numPackTotal <= 5) {
            System.out.printf("Número de paquetes es insuficiente: %s", numPackTotal);
            return;
        } else if(numPackTotal < 10) {
            discount = 0.05;
            shippingByPack = 10;
        } else if(numPackTotal < 20) {
            discount = 0.1;
            shippingByPack = 5;
        }  

        // Descuento para los casos 2, 3, 4
        double total = (numPackTrouser * TROUSER_PRICE) + (numPackShirt * SHIRT_PRICE);
        double finalDiscount = total * discount;
        double totalShipping = numPackTotal * shippingByPack;
        double totalPrice = total - finalDiscount + totalShipping;

        if(total >= 1000) {
            promotion = total * 0.10;
            totalPrice = totalPrice - promotion;

            System.out.println("""
            Paquetes de pantalones      %d
            Paquetes de camisetas       %d
            Número de paquetes total    %d
            -----------------------------------
            Precio total del producto   %.2f EU
            Descuento aplicado          %.2f EU
            Gastos de envío             %.2f EU
            -----------------------------------

            PROMOCIÓN
            Descuento                   %.2f EU
            -----------------------------------
            TOTAL                       %.2f EU
                 """.formatted(numPackTrouser, numPackShirt, numPackTotal, total, finalDiscount, totalShipping, promotion, totalPrice));
        } else {
            double amountToGetPromotion = 1000 - total;

            System.out.println("""
            Paquetes de pantalones      %d
            Paquetes de camisetas       %d
            Número de paquetes total    %d
            -----------------------------------
            Precio total del producto   %.2f EU
            Descuento aplicado          %.2f EU
            Gastos de envío             %.2f EU
            -----------------------------------

            PROMOCIÓN NO APLICABLE
            Cantidad que falta          %.2f EU
            -----------------------------------
            TOTAL                       %.2f EU
                 """.formatted(numPackTrouser, numPackShirt, numPackTotal, total, finalDiscount, totalShipping,amountToGetPromotion, totalPrice));
        }
    
    }
}
