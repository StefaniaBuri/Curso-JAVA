package products;

import enums.Category;

public class Drugstore extends Product {

    public Drugstore(String reference, int volumen, int weight) {
        super(reference, volumen, weight);
    }

    @Override
    public Category getCategory() {
        return Category.DRUGSTORE;
    }

    @Override
    public boolean isCompatible(IProduct product) {
        //
        return !Category.FOOD.equals(product.getCategory()) && !Category.PETS.equals(product.getCategory());
    }

}
