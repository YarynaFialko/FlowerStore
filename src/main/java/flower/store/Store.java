package flower.store;

import lombok.Getter;
import lombok.Setter;

public final class Store {
    /**
     *FlowerBucket.
     */
    @Getter @Setter
    private FlowerBucket flowerBucket;

    /**
     * Searches best matches with the searchedFlowerPack in the
     * store's FlowerBucket.
     * @param searchedFlowerPack - object of searched flower pack.
     * @return  a FlowerBucket with the best matches.
     */
    public FlowerBucket search(final FlowerPack searchedFlowerPack) {
        FlowerBucket matchingPacks = new FlowerBucket();
        for (FlowerPack flowerPack : flowerBucket.getBucket()) {
            if (flowerPack.compare(searchedFlowerPack)) {
                matchingPacks.add(flowerPack);
            }
        }
        return matchingPacks;
    }
}
