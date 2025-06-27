package containers;

import java.util.Set;

import products.IProduct;

public abstract class Container implements IContainer {

    private String reference;
    protected int strength; // resistance
    protected int heigh;// alto

    Set<IProduct> products;

    public Container(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean canInsert(IProduct product) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isResistance(IProduct product) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int volumenAvailable() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int calculateVolumen() {
        return calculateArea() * heigh;
    }

    // GETTERS

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public Set<IProduct> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        String message = """
                %s ref: %s
                Hash: %s
                """.formatted(getType(), reference, super.toString());
        return message;
    }

}
