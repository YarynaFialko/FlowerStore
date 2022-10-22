package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    /**
     * sepalLength parameter.
     */
    @Getter
    private double sepalLength;
    /**
     * color parameter of FlowerColor.
     */
    private FlowerColor color;
    /**
     * Price of the flower.
     */
    @Getter
    private double price;
    /**
     * Flower type parameter.
     */
    @Getter
    private FlowerType flowerType;

    /**
     * Gets a flower's color.
     * @return  a string value of the color.
     */
    public String getColor() {
        if (color != null) {
            return color.toString();
        } else {
            return "";
        }
    }

    /**
     * @return a String value of the flower type.
     */
    public String getType() {
        return flowerType.toString();
    }

    /**
     * Compares two flowers.
     * @param comFlower - the compared flower.
     * @return boolean if the flowers match.
     */
    @SuppressWarnings("checkstyle:HiddenField")
    public boolean compare(final Flower comFlower) {
        boolean comColor = this.getColor().equals(comFlower.getColor());
        if (this.getColor().equals("") && comFlower.getColor().equals("")) {
            comColor = false;
        }
        boolean type = this.getType().equals(comFlower.getType());
        return comColor || type;
    }

    /**
     * String value of the object.
     */
    @Override
    public String toString() {
        return "Flower{"
                + "sepalLength="
                + sepalLength
                + ", color=" + color
                + ", price="
                + price
                + ", flowerType="
                + flowerType
                + '}';
    }
}
