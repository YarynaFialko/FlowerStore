package flower.store;

import lombok.Getter;
import lombok.Setter;

public class Store {
    @Getter @Setter
    private FlowerBucket flowerBucket;

    public FlowerBucket search(FlowerPack searchedFlowerPack){
        FlowerBucket matchingPacks = new FlowerBucket();
        for(FlowerPack flowerPack : flowerBucket.getBucket()){
            if(flowerPack.compare(searchedFlowerPack)){
                matchingPacks.add(flowerPack);}
        }
        return matchingPacks;
    }
}
