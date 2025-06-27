package products;

import java.util.Locale.Category;

import containers.IContainer;

public interface IProduct {

    String getReference();

    int getWeight();

    int calculateVolume();

    Category getCategory();

    boolean isCompatible(IProduct product);

    boolean hasSpace(IContainer container);

    void putInto(IContainer container);
}
