package products;

import containers.IContainer;

public abstract class Product implements IProduct {

    private String reference;
    private int volumen;
    private int weight;

    private IContainer container;

    public Product(String reference, int volumen, int weight) {
        this.reference = reference;
        this.volumen = volumen;
        this.weight = weight;
    }

    //GETTERS

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public int getVolume() {
        return volumen;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    //METHODS

    @Override
    public boolean hasSpace(IContainer container) {
        //producto tendrá espacio en un container si su volumen es mas pequeño que el volumen disponible en el container
        return container.volumenAvailable() > volumen;
        //return volumen <= container.volumenAvailable();
    }


    @Override
    public void putInto(IContainer container) {
        // la compatibilidad la delegan las clases hijas, no implementamos este método aki
        //solo devolvemos en que container ha sido metido el producto.
        this.container = container;
        //container.getProducts().add(this);
    }


    /* @Override
    public String toString() {
        String message = "[%s] %s %s cm3 - %s g".formatted(
            getCategory().toString().toUpperCase(), reference, volumen, weight);
        return message;
    } */

    @Override
    public String toString() {
        String message = """
                Producto [Categoría = %s, Referencia = %s, Peso = %sg, Volumen = %scm3, Contenedor = %s]
                """.formatted(getCategory(), reference, weight, volumen,container.getReference());
        return message;
    }

}
