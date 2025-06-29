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
        //p tendra espacio en un container si su volumen es mas pequeño que el volumen disponible en el container
        return container.volumenAvailable() > volumen;
    }

    

    @Override
    public void putInto(IContainer container) {
        // la compatibilidad la delagan las clases hijas, no implementamos este metodo aki
        //solo devolvemos en que container ha sido metido el producto.
        this.container = container;
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
                Producto [categoria = %s, referencia = %s, peso = %sg, volumen = %scm3, contenedor = %s]
                """.formatted(getCategory(), reference, weight, volumen,container.getReference());

        // return "Producto [categoria = " + getCategory() + ", referencia = " + reference + ", peso = " + weight +
        // ", volumen = " + volumen + ", contenedor = " + container.getReference() + "]";
        return message;
    }

}
