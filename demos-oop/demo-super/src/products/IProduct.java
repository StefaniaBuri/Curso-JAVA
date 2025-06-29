package products;

import containers.IContainer;
import enums.Category;

public interface IProduct {

    // Getters

    String getReference();

    int getWeight();

    int getVolume();

    Category getCategory();


    // Lógica de negocio

    boolean isCompatible(IProduct product);

    boolean hasSpace(IContainer container);

    void putInto(IContainer container);
}
