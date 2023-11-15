public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot);
        robot.move();
        robot.turnRight();
        robot.move();
        robot.move();
        System.out.println(robot);
    }
}