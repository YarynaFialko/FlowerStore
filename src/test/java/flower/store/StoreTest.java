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

        // generating two flowerpacks for flowerBucket
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);

        int price1 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity1 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower1 = new Tulip();
        flower.setPrice(price1);
        FlowerPack flowerPack1 = new FlowerPack(flower1, quantity1);

        // adding flowerPacks to the flowerBucket
        flowerBucket.add(flowerPack);
        flowerBucket.add(flowerPack1);

        // generating a searchFlowerPack
        int price2 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity2 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower2 = new Rose();
        flower.setPrice(price2);
        FlowerPack flowerPack2 = new FlowerPack(flower2, quantity2);


        Store store = new Store();
        store.setFlowerBucket(flowerBucket);

        FlowerBucket testBucket = new FlowerBucket();
        testBucket.add(flowerPack);

        FlowerBucket roseSearchBucket = store.search(flowerPack2);

        Assertions.assertEquals(roseSearchBucket.toString(), (testBucket.toString()));
    }

}

