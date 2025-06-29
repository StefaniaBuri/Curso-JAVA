package containers;

import java.util.Set;

import enums.ContainerType;
import products.IProduct;

public interface IContainer {

    // Getters

    String getReference();

    int getResistance();

    ContainerType getType();

    Set<IProduct> getProducts();

    // Propiedades calculadas

    int calculateArea();

    int calculateVolumen();

     // Lógica de negocio

    int volumenAvailable();

    boolean canInsert(IProduct product);

    boolean isResistance(IProduct product);

}
