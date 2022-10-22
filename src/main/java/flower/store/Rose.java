package flower.store;


public class Rose extends Flower {
    private final FlowerType flowerType = FlowerType.ROSE;

    public String getType() {
        return flowerType.toString();
    }
}
