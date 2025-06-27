package containers;

import java.util.Set;

import enums.ContainerType;
import products.IProduct;

public interface IContainer {

    String getReference();

    int calculateVolumen();

    // int getStrength();

    ContainerType getType();

    int calculateArea();

    Set<IProduct> getProducts();

    int volumenAvailable();

    boolean canInsert(IProduct product);

    boolean isResistance(IProduct product);

}
