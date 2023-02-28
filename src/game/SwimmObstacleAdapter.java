package game;

public class SwimmObstacleAdapter implements Obstacle {
    private final SwimmingPoll swimmingPoll;

    public SwimmObstacleAdapter(SwimmingPoll swimmingPoll) {
        this.swimmingPoll = swimmingPoll;
    }

    @Override
    public boolean pass(Participant participant) {
        return swimmingPoll.pass(participant);
    }
}
