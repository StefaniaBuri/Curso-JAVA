package containers;

import enums.ContainerType;
import products.IProduct;

public class Box extends Container {

    private int width;// ancho
    private int length;// largo

    public Box(String reference, int width, int length, int heigh) {
        super(reference);
        this.width = width;
        this.length = length;
        this.heigh = heigh;
    }

    /*
     * @Override
     * public int getStrength() { //resistencia
     * return strength;
     * }
     */

    @Override
    public int calculateArea() {
        return width * length;
    }

    @Override
    public ContainerType getType() {
        return ContainerType.BOX;
    }

    @Override
    public boolean isResistance(IProduct product) { // resistencia
        return true;
    }
}
