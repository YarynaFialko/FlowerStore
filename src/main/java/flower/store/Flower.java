package flower.store;

import lombok.Getter;
import lombok.Setter;


@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        if (color != null) {
            return color.toString();
        } else {
            return "";
        }
    }

    public String getType() {
        return flowerType.toString();
    }

    public boolean compare(Flower flower){
        boolean color = (this.getColor().equals(flower.getColor()));
        if (this.getColor().equals("") && flower.getColor().equals("")){color = false;}
        boolean type = this.getType().equals(flower.getType());
        return color || type;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "sepalLength=" + sepalLength +
                ", color=" + color +
                ", price=" + price +
                ", flowerType=" + flowerType +
                '}';
    }
}
