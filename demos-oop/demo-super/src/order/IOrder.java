package order;
import java.util.Set;

import containers.IContainer;
import products.IProduct;

public interface IOrder {

    String getReference();
    Set<IProduct> getProducts();
    Set<IContainer> getContainers();

    void addContainer(IContainer container);
    IContainer addProduct(IProduct product);

}
