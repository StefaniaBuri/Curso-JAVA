package order;

import java.util.HashSet;
import java.util.Set;

import containers.IContainer;
import products.IProduct;

public class Order implements IOrder {

    private String reference;
    private Set<IProduct> products;
    private Set<IContainer> containers;

    //CONSTRUCTOR

    public Order(String reference) {
        this.reference = reference;
        this.containers = new HashSet<>();
    }

    // MÉTODOS

    public Set<IProduct> getCalculateProducts() {
        Set<IProduct> products = new HashSet<>();
        for (IContainer container : containers) {
            products.addAll(container.getProducts());
        }
        return products;
    }

    @Override
    public void addContainer(IContainer container) {
        containers.add(container);
    }

    @Override
    public IContainer addProduct(IProduct product) {
        for (IContainer container : containers) {
            if(container.canInsert(product)) {
                return container;
            }
        }
        //return addProduct(product);
        return null;
    }

    //GETTERS

    @Override
    public Set<IContainer> getContainers() {
        return containers;
    }

    @Override
    public Set<IProduct> getProducts() {
        return products;
    }

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public String toString() {
        String message = """
                Pedido: %s 
                Hash: %s
                """.formatted(reference, super.toString());

        for (IContainer container : containers) {
            message += container;
        }
        return message;
    }

}
