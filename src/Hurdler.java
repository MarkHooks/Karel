import becker.robots.*;


public class Hurdler {

    public static void main(String[] args) {
        City olney= new City();
        Robot karel = new Robot(olney, 6, 0, Direction.EAST, 0);
    /*
    Replace these lines below with the ones from the instruction sheet once you have your program working.
    Your code should work with the new lines without having to change anything.
     */
        new Wall(olney, 6, 1, Direction.WEST);
        new Wall(olney, 6, 2, Direction.WEST);
        new Wall(olney, 6, 3, Direction.WEST);
        new Wall(olney, 6, 6, Direction.WEST);


        // Leave these lines alone as they make up the ground and the end wall
        new Wall(olney, 6, 0, Direction.SOUTH);
        new	Wall(olney, 6, 1, Direction.SOUTH);
        new Wall(olney, 6, 2, Direction.SOUTH);
        new Wall(olney, 6, 3, Direction.SOUTH);
        new Wall(olney, 6, 4, Direction.SOUTH);
        new	Wall(olney, 6, 5, Direction.SOUTH);
        new Wall(olney, 6, 6, Direction.SOUTH);
        new Wall(olney, 6, 7, Direction.SOUTH);
        new Wall(olney, 6, 8, Direction.WEST);
        new Wall(olney, 5, 8, Direction.WEST);

        // Your code goes below here
        if(karel.frontIsClear()){
            karel.move();
           /* karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            */

        }else{
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();

        }
    }
}
