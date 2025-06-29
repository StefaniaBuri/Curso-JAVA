package products;

import enums.Category;

public class Pets extends Product {

    public Pets(String reference, int volumen, int weight) {
        super(reference, volumen, weight);
    }

    @Override
    public Category getCategory() {
        return Category.PETS;
    }

    @Override
    public boolean isCompatible(IProduct product) {
        //los productos de mascota no son compatibles con drogueria
        return Category.DRUGSTORE.equals(product.getCategory());
    }

}
