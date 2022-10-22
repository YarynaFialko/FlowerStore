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
     * @param stringRep - String representation
     *                             of the color type.
     */
    FlowerColor(final String stringRep) {
        this.stringRepresentation = stringRep;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
