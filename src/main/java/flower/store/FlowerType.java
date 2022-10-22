package flower.store;

public enum FlowerType {
    /**
     * Represents a type of flowers.
     * Three types with String representation.
     */
    CHAMOMILE("Chamomile"), ROSE("Rose"), TULIP("Tulip");

    /**
     * String Representation of the type.
     */
    private final String stringRepresentation;

    /**
     * Sets a string representation of the flower type.
     * @param stringRep - String og the flower type.
     */
    FlowerType(final String stringRep) {
        this.stringRepresentation = stringRep;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
