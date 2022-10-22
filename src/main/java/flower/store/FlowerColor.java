package flower.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    /**
     * String representation of the flower's color.
     */
    private final String stringRepresentation;

    /**
     * Sets a color stringRepresentation.
     * @param stringRepresentation - String representation
     *                             of the color type.
     */
    FlowerColor(final String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
