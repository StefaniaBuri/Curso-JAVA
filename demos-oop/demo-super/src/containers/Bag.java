package containers;

import enums.ContainerType;
import products.IProduct;

public class Bag extends Container {

    private int length;// largo

    public Bag(String reference, int length, int heigh, int resistance) {
        super(reference, resistance);
        this.length = length;
        this.heigh = heigh;
        //this.resistance = resistance; // resistencia
    }

    @Override
    public ContainerType getType() {
        return ContainerType.BAG;
    }

    @Override
    public int calculateArea() {
        int radio = calculateDiameter() / 2;
        return (int) (Math.PI * radio * radio);
    }

    private int calculateDiameter() {
        return (int) ((2 * length) / Math.PI);
    }

    // @Override
    // public boolean isResistance(IProduct product) {
    //     return false;
    // } //el metodo lo hereda de container

}
