package containers;

import java.util.HashSet;
import java.util.Set;

import products.IProduct;

public abstract class Container implements IContainer {

    private String reference;
    protected int resistance; // resistance
    protected int heigh;// alto

    private Set<IProduct> products;

    public Container(String reference, int resistance) {
        this.reference = reference;
        this.resistance = resistance;
        products = new HashSet<>();
    }

    /* CRITERIOS DEL CONTENEDOR PARA DECIDIR SI ACEPTA UN PRODUCTO:
     * - Producto debe caber en el contenedor
     * - Contenedor debe resistir el peso del producto
     * - Producto debe ser compatible con el resto de productos que ya estan en ese contenedor.
     */

    @Override
    public boolean canInsert(IProduct product) {
        //Inicializamos llamando al metodo del container y pasandole producto
        boolean resistanceOk = isResistance(product);

        //Preguntamos a producto si tiene espacio en este container
        boolean volumenOk = product.hasSpace(this);

        //Recorremos todos los productos que hay en el container y comprobamos compatibilidad con el producto que queremos agregar.
        boolean compatibilidadOk = true;
        for (IProduct p : products) {
            boolean compatibleOk = product.isCompatible(p);
            compatibilidadOk &= compatibleOk;
            //&= operador de asignación que combina una operación AND bit a bit entre la variable (operando izquierdo) y la expresión (operando derecho),el resultado de esta operación se asigna de nuevo a la variable
            //Si el nuevo p es compatible con los demas saldremos del bucle con compatibilidadOk true.
            //Si no hay productos no entre en el bucle
        }

        boolean accept = resistanceOk && volumenOk && compatibilidadOk;
        //el contenedor acepta un producto si resiste su peso, si cabe por volumen y si hay compatibilidad entre productos.
        //Si acepta: añadimos el producto al contenedor e informamos al producto que ha sido agregado a un container(this: hace referencia al propio objeto)
        if(accept) {
            products.add(product);
            product.putInto(this);
        }
        return accept;
    }

    @Override
    public boolean isResistance(IProduct product) {
        // Un Container resiste a un producto si su resistencia es mayor que el peso del producto. Hay que inicializar la resistencia de un container. BOX no importa porque tiene override el metodo isResistance(). Pero BAG si tiene resistencia 0, jamas podra ser mayor que el peso del producto(q es +).En clase Bag, modificamos constructor
        return resistance > product.getWeight();
        //en caja especificamos su comportamiento
    }

    @Override
    public int volumenAvailable() {
        // VolAvaib es el volumen del contenedor menos el volumen ocupado
        return calculateVolumen() - volumenInUse();
    }

    //volumen ocupado: sumamos el volumen de cada producto del contenedor.
    private int volumenInUse() {
        int res = 0;
        for (IProduct p : products) {
            res += p.getVolume();
        }
        return res;
    }

    @Override
    public int calculateVolumen() {
        return calculateArea() * heigh;
    }

    // GETTERS

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public int getResistance() {
        return resistance;
    }


    @Override
    public Set<IProduct> getProducts() {
        return products;
    }

    // @Override
    // public String toString() {
    //     String message = """
    //             %s ref: %s
    //             Hash: %s
    //             """.formatted(getType(), reference, super.toString());
    //     return message;
    // }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Contenedor " + reference + " [" 
        + getType() + "] (Sup " + calculateArea() + "cm2 - Vol " + calculateVolumen() + "cm3 - Resistencia " + getResistance() + " g).\n");

        if(products.isEmpty()) {
            sb.append("\tvacío\n");
        }

        for (IProduct p : products) {
            sb.append("\t\t" + p + "\n");
        }
        sb.append("\t\t>> Disponible vol " + volumenAvailable() + "cm3");
        return sb.toString();
    }

}
