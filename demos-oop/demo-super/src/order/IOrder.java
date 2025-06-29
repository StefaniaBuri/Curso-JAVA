package order;
import java.util.Set;

import containers.IContainer;
import products.IProduct;

public interface IOrder {

    // Getters

    String getReference();
    
    Set<IContainer> getContainers();
    Set<IProduct> getProducts();

    // Lógica de negocio 

    Set<IProduct> getCalculateProducts();
    void addContainer(IContainer container);
    IContainer addProduct(IProduct product);

}
