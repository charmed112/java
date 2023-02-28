package game;

public class RoadWithStoneBall {
    private final int distance;

    public RoadWithStoneBall(int distance){
        this.distance = distance;
    }
    public boolean pass(CanPushing canPushing) {
        return canPushing.getPushing() >= distance;
    }
}
