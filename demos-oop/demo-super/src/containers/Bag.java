package containers;

import enums.ContainerType;
import products.IProduct;

public class Bag extends Container {

    private int length;// largo

    public Bag(String reference, int length, int heigh, int strength) {
        super(reference);
        this.length = length;
        this.heigh = heigh;
        this.strength = strength; // resistencia
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

    public int calculateDiameter() {
        return (int) ((2 * length) / Math.PI);
    }

    @Override
    public boolean isResistance(IProduct product) {
        return true;
    }

}
