package accounting;

import java.text.NumberFormat;
import java.util.Locale;

public class Item {

    static private final NumberFormat NF = NumberFormat.getCurrencyInstance(Locale.GERMANY);

    // default: son publicas dentro del paquete
    private Product product;
    private int amount;
    private int value;

    public Item(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        this.value = calculatePrice(amount);
    }

    public int getValue() {
        return value;
    }


    private int calculatePrice(int items) {
        return items * product.getUnityPrice();
    }

    String renderInvoiceLine() {

        // hace una columna de 25 caracteres
        String start = "%-25s :   %s u. a %s".formatted(
                product.getSku() + " " + product.getName(), amount,
                NF.format(product.getUnityPrice()));

        // creamos una columna de 50 para pintarlo bien
        String message = """
                %-50s..... Total %s
                """.formatted(
                start,
                NF.format(getValue()));
        return message;
    }
}
