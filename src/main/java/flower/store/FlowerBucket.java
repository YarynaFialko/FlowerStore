package flower.store;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    @Getter
    private final List<FlowerPack> bucket = new ArrayList<>();

    void add(FlowerPack flowerPack){
        bucket.add(flowerPack);
    }
    double getPrice(){
        double price = 0;
        for(FlowerPack flowerPack : bucket){
            price += flowerPack.getPrice();
        }
        return price;
    }


    @Override
    public String toString() {
        return "FlowerBucket{" +
                "bucket=" + bucket +
                '}';
    }
}
