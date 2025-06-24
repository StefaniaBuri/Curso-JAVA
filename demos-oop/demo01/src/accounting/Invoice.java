package accounting;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Invoice {

    /*
     * static se utiliza para definir miembros (variables, métodos, bloques y clases
     * anidadas)
     * que pertenecen a la clase en sí, en lugar de a las instancias de la clase.
     * Esto significa que solo existe una copia de ese miembro, independientemente
     * de cuántos objetos de la clase se creen.
     * 
     * Variables estáticas:
     * Se comparten entre todas las instancias de la clase. Son útiles para
     * representar valores globales o constantes de la clase.
     * 
     * Métodos estáticos:
     * Se pueden invocar directamente a través de la clase sin necesidad de crear
     * una instancia. Son útiles para crear funciones de utilidad que no dependen de
     * un objeto específico.
     * 
     * Bloques estáticos:
     * Se ejecutan una sola vez, cuando se carga la clase, y se utilizan para
     * inicializar las variables estáticas.
     * 
     * Clases estáticas anidadas:
     * Se pueden definir dentro de una clase principal y son accesibles sin
     * necesidad de crear instancias de la clase principal.
     */

    static private final NumberFormat NF = NumberFormat.getCurrencyInstance(Locale.GERMANY);

    // propiedades y métodos static
    static private final Company BRAND = new Company("68323392y", "Boracay");
    static private byte lastId = 0;

    static private String generateID() {
        int year = LocalDate.now().getYear();
        String id = String.valueOf(year) + '/' + ++lastId;
        return id;
    }

    // declaración de propiedades privadas

    private String id = generateID();
    private Company client;
    private List<Item> items = new ArrayList<>(); // Es una lista porque no sabemos la cantidad de items, longitud sin
                                                  // definir
    private double iva;
    private double total = 0;
    private Payments paymentMethod;

    
     /*  public Company getClient() {
      return client;
      } */
     

    // constructor
    public Invoice(Company client, Product product, int amount, double iva, Payments method) {
        this.id = Invoice.generateID();
        this.client = client;
        // this.items.add(new Item(product, amount));
        // this.total = this.items.get(0).value; // Initialize total with the first
        // item's value
        this.client = client;
        this.iva = iva;
        this.paymentMethod = method;
        addItem(product, amount);
    }

    // constructor 2
    public Invoice(Company client, Product product, int amount, Payments method) {
        this(client, product, amount, 1.21, method);
    }

    // constructor 3
    public Invoice(Company client, Product product, int amount) {
        this(client, product, amount, 1.21, Payments.TRANSFER);
    }

    public void addItem(Product product, int amount) {
        Item item = new Item(product, amount);
        this.items.add(item);
        this.total += item.getValue(); // Update total with the new item's value
    }


    public double calculatePrice() {
        return total * this.iva;
    }

    private String renderDate() {
        return LocalDate.now().toString();
    }

    private String renderItems() {
        String itemsList = "";
        for (Item item : items) {
            itemsList += item.renderInvoiceLine();
        }
        return itemsList;
    }

    private String renderPayment() {

        double totalWithIva = calculatePrice();
        double totalIva = totalWithIva - total;

        String ivaPercentage = String.format("%.0f", (this.iva - 1) * 100) + "%";

        return """
                Total (sin iva): %s
                Iva (%s): %s
                Total (con iva): %s
                ----------------------------------------------

                Forma de pago: %s
                """.formatted(
                NF.format(total),
                ivaPercentage,
                NF.format(totalIva),
                NF.format(totalWithIva),
                paymentMethod.toString());

    }

    // System.out.printf("Total Price: %s\n", totalPrice));

    public void printInvoice() {

        String invoice = """
                %s
                %s

                Factura %s
                Fecha: %s
                ------------------------------------------------------------------------

                %s

                ------------------------------------------------------------------------
                %s
                ----------------------------------------------
                Gracias por su compra
                ----------------------------------------------

                """.formatted(BRAND.renderHeader(), client.renderClient(), id, renderDate(), renderItems(),
                renderPayment());

        System.out.println(invoice);
    }

}
