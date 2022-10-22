package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 100;
    private static final int MAX_PRICE = 1000;

    @Test
    public void testSearch() {
        FlowerBucket flowerBucket = new FlowerBucket();

        // generating two packs for flower Bucket.
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);

        int priceOne = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantityOne = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flowerOne = new Tulip();
        flower.setPrice(priceOne);
        FlowerPack flowerPackOne = new FlowerPack(flowerOne, quantityOne);

        // adding flowerPacks to the flowerBucket
        flowerBucket.add(flowerPack);
        flowerBucket.add(flowerPackOne);

        // generating a searchFlowerPack
        int priceTwo = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantityTwo = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flowerTwo = new Rose();
        flower.setPrice(priceTwo);
        FlowerPack flowerPackTwo = new FlowerPack(flowerTwo, quantityTwo);


        Store store = new Store();
        store.setFlowerBucket(flowerBucket);

        FlowerBucket testBucket = new FlowerBucket();
        testBucket.add(flowerPack);

        FlowerBucket roseSearchBucket = store.search(flowerPackTwo);

        Assertions.assertEquals(roseSearchBucket.toString(),
                (testBucket.toString()));
    }

}

