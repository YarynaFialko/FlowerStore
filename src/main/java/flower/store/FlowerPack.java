package flower.store;

public final class FlowerPack {
    /**
     * The pack contains flowers of a certain type.
     */
    private final Flower flower;
    /**
     * Represents quantity of the flowers in the pack.
     */
    private final int quantity;

    /**
     * Sets parameters of the FlowerPack object.
     * @param flType - Flower class.
     * @param flQuantity - number of the flower in the pack.
     */
    public FlowerPack(final Flower flType, final int flQuantity) {
        this.flower = flType;
        this.quantity = flQuantity;
    }

    /**
     * Returns a price of the whole flower pack.
     * @return a double price.
     */
    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    /**
     * Returns true if the FlowerPack has a close match with
     * other FlowerPack.
     * @param comparedFlowerPack - compared Flower Pack object.
     * @return boolean value of the flowerPack match.
     */
    public boolean compare(final FlowerPack comparedFlowerPack) {
        return this.flower.compare(comparedFlowerPack.flower);
    }

    @Override
    public String toString() {
        return "FlowerPack{" + "flower="
                + flower + ", quantity="
                + quantity + '}';
    }
}
