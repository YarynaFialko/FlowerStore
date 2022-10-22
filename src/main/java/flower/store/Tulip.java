package flower.store;

public final class Tulip extends Flower {
    /**
     * FlowerType of Tulip is TULIP.
     */
    private final FlowerType flowerType = FlowerType.TULIP;

    /**
     * Gets the Type of the flower.
     * @return  a String value of the type.
     */
    public String getType() {
        return flowerType.toString();
    }
}
