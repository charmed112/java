package res;

public class GameMain {
    public static void main(String[] args){
        RobotMap map = new RobotMap(5, 5);
        RobotMap.Robot robot = map.createRobot(new Point(2, 3));
        System.out.println(robot);
        robot.move();
        System.out.println(robot);
        robot.chageDirection(Direction.BOTTOM);
        robot.move();
        robot.move();//[3,3]
        robot.chageDirection(Direction.LEFT);
        robot.move();
        System.out.println(robot);//[3,2] left
    }
}
/*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
**/