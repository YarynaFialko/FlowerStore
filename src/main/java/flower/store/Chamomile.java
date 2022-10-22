package flower.store;


public class Chamomile extends Flower{
    private final FlowerType flowerType = FlowerType.CHAMOMILE;
    public String getType() {
        return flowerType.toString();
    }
}
