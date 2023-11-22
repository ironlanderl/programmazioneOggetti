public class Main {
    private static void main_1(String[] args){
        Robot robot = new Robot();
        System.out.println(robot);
        robot.move();
        robot.turnRight();
        robot.move();
        robot.move();
        System.out.println(robot);
    }

    public static void main_2(String[] args) {
        NastyRobot robot = new NastyRobot();
        System.out.println(robot);
        for (int i = 0; i < 20; i++){
            robot.move();
            System.out.println(robot);
        }
    }

    public static void main_3(String[] args) {
        Sim sim = new Sim();
        sim.simulate();
    }


    public static void main(String[] args) {
        main_3(args);
    }
}