package flower.store;

public class Tulip extends Flower{
    private final FlowerType flowerType = FlowerType.TULIP;

    public String getType() {
        return flowerType.toString();
    }
}
