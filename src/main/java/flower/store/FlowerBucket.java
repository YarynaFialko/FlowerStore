package flower.store;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public final class FlowerBucket {
    /**
     * FlowerBucket implemented as a list of FlowerPacks.
     */
    @Getter
    private final List<FlowerPack> bucket = new ArrayList<>();

    /**
     * Adds a flowerPack to the FlowerBucket.
     * @param flowerPack - a set of flowers.
     */
    void add(final FlowerPack flowerPack) {
        bucket.add(flowerPack);
    }

    /**
     * Calculates a price of the bucket.
     * @return duble prize of the whole bucket.
     */
    double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : bucket) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
        return "FlowerBucket{"
                + "bucket="
                + bucket + '}';
    }
}
