package flower.store;

public final class Chamomile extends Flower {
    /**
     * FlowerType of Chamomile is CHAMOMILE.
     */
    private final FlowerType flowerType = FlowerType.CHAMOMILE;

    /**
     * * Returns a String value of the type.
     * @return String value of the type.
     */
    public String getType() {
        return flowerType.toString();
    }
}
