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
     * @return  a stringvalue of the color.
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
     * @param flower - the compared flower.
     * @return boolean if the flowers match.
     */
    public boolean compare(final Flower flower) {
        boolean color = this.getColor().equals(flower.getColor());
        if (this.getColor().equals("") && flower.getColor().equals("")) {
            color = false;
        }
        boolean type = this.getType().equals(flower.getType());
        return color || type;
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
