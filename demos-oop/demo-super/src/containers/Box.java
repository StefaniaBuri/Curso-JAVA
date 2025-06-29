package containers;

import enums.ContainerType;
import products.IProduct;

public class Box extends Container {

    private int width;// ancho
    private int length;// largo

    public Box(String reference, int width, int length, int heigh) {
        super(reference, 0);//Caja no tiene resistencia,le pasamos 0
        this.width = width;
        this.length = length;
        this.heigh = heigh;
    }


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
        return true;//true porque resistencia: "cualquier peso"
    }
}
