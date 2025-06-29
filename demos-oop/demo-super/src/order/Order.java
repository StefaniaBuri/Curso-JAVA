package order;

import java.util.HashSet;
import java.util.Set;

import containers.IContainer;
import products.IProduct;

public class Order implements IOrder {

    private String reference;
    //private Set<IProduct> products;
    private Set<IContainer> containers;

    //CONSTRUCTOR

    public Order(String reference) {
        this.reference = reference;
        this.containers = new HashSet<>();
    }

    // MÉTODOS

    @Override
    public void addContainer(IContainer container) {
        containers.add(container);
    }

    @Override
    public IContainer addProduct(IProduct product) {
        //iteramos todos los contenedores
        for (IContainer container : containers) {
            //comprobamos si el contenedor admite el producto que queremos añadir. 
            if(container.canInsert(product)) {
                return container;
            }
        }
        return null;//no hay sitio para el producto
    }

    //GETTERS

    @Override
    public Set<IContainer> getContainers() {
        return containers;
    }

    @Override
    public Set<IProduct> getProducts() {
        // Creamos un conjunto de productos nulo y recorriendo los contenedores, inicializar el nuevo conjunto con los productos del primer container e ir añadiendo los del resto.
        Set<IProduct> products = new HashSet<>();
        for (IContainer c : containers) {
            products.addAll(c.getProducts());
        }
        return products;
    }

    @Override
    public Set<IProduct> getCalculateProducts() {
        Set<IProduct> products = new HashSet<>();
        for (IContainer container : containers) {
            products.addAll(container.getProducts());
        }
        return products;
    }

    @Override
    public String getReference() {
        return reference;
    }

    // @Override
    // public String toString() {
    //     String message = """
    //             Pedido: %s 
    //             Hash: %s
    //             """.formatted(reference, super.toString());

    //     for (IContainer container : containers) {
    //         message += container;
    //     }
    //     return message;
    // }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido: " + reference + "\n");
        for (IContainer container : containers) {
            sb.append("\t" + container + "\n");
        }
        return sb.toString();
    }

}
