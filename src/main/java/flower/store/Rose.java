package flower.store;


public class Rose extends Flower {
    /**
     * FlowerType of Rose is ROSE.
     */
    private final FlowerType flowerType = FlowerType.ROSE;

    /**
     * Returns a String value of the type.
     * @return a String with the flower's type.
     */
    public String getType() {
        return flowerType.toString();
    }
}
