import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class KarelFriendCarl {
    public static void main(String[] args) {
        City ncity = new City();
        Robot karel = new Robot(ncity, 0, 0, Direction.SOUTH, 1);
        Robot carl = new Robot(ncity, 3, 0, Direction.EAST, 0);
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();

        carl.pickThing();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.putThing();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
    }
}
