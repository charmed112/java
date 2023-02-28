package game;

public class RoadWithStoneBallObstacleAdapter implements Obstacle {
    private final RoadWithStoneBall roadWithStoneBall;
    public RoadWithStoneBallObstacleAdapter(RoadWithStoneBall roadWithStoneBall) {
        this.roadWithStoneBall = roadWithStoneBall;
    }

    @Override
    public boolean pass(Participant participant) {
        return roadWithStoneBall.pass(participant);
    }
}
