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
        // El producto deber se compatible con alimentación, usamos equals para comparar categoría del producto == Food
        return Category.FOOD.equals(product.getCategory());
        //return product.getCategory() == Category.FOOD;
    }

}
