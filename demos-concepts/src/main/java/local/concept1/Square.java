package local.concept1;

/** JavaDoc
 * Clase Square: dimensiones de un cuadrado
 */

public class Square implements Cloneable {
    public int side;

    public Square(int side) {
        this.side = side;
    }

   
    @Override
    public String toString() {
        return super.toString() + "\n" + 
        "Square {side: %s}".formatted(side);
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Square 
        && this.side == ((Square)object).side) {
            return true;
        }
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // devuelve clone del object actual
        return super.clone(); 
    } 
}
