package game;

//участники
public interface Participant extends CanJump, CanRun, CanSwim,CanPushing {

    String getName();

}
