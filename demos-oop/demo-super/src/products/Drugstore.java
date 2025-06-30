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
        //compatible con Hygiene y Drogueria
        return !Category.FOOD.equals(product.getCategory()) && !Category.PETS.equals(product.getCategory());
        //return product.getCategory() == Category.DRUGSTORE || product.getCategory() == Category.HYGIENE;
    }

}
