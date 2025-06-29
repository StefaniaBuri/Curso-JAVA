package products;

import enums.Category;

public class Hygiene extends Product {

    public Hygiene(String reference, int volumen, int weight) {
        super(reference, volumen, weight);
    }

    @Override
    public Category getCategory() {
        return Category.HYGIENE;
    }

    @Override
    public boolean isCompatible(IProduct product) {
        // Cualquier producto entra salvo los de alimentacion, lo contrario
        return !Category.FOOD.equals(product.getCategory());
    }

}
