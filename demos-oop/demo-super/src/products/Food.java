package products;

import enums.Category;

public class Food extends Product{

    public Food(String reference, int volumen, int weight) {
        super(reference, volumen, weight);
    }

    @Override
    public Category getCategory() {
        return Category.FOOD;
    }

    @Override
    public boolean isCompatible(IProduct product) {
        // El producto deber se compatible con alimentacion, usamos equals para comparar categoria del producto == Food
        return Category.FOOD.equals(product.getCategory());
    }

}
