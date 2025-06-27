package products;

import java.util.Locale.Category;
import java.util.Set;

import containers.IContainer;

public abstract class Product implements IProduct {

    private String reference;
    private int volumen;
    private int weight;

    Set<IContainer> containers;

    public Product(String reference, int volumen, int weight) {
        this.reference = reference;
        this.volumen = volumen;
        this.weight = weight;
    }

    @Override
    public Category getCategory() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public int calculateVolume() {
        return volumen;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean hasSpace(IContainer container) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isCompatible(IProduct product) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void putInto(IContainer container) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        String message = "[%s] %s %s cm3 - %s g".formatted(getCategory().toString().toUpperCase(), reference, volumen, weight);
        return message;
    }

}
