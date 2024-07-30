public class DirectionFun {

    private enum Direction {
        NORTH, EAST, SOUTH, WEST;
    }
    public static void main(String[] args) {
        Direction theDirection = Direction.NORTH;
        switch (theDirection) {
            case NORTH:
                System.out.println("You are travelling north!");
                break;
            case EAST:
                System.out.println("You are travelling east!");
                break;
            case SOUTH:
                System.out.println("You are travelling south!");
                break;
            case WEST:
                System.out.println("You are travelling west!");
                break;
        }
    }
}
