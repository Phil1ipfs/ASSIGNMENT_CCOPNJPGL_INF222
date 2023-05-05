import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet earth = new Earth();
        Planet mars = new Mars();
        Planet jupiter = new Jupiter();
        Planet uranus = new Uranus();
        Planet neptune = new Neptune();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer android = new AndroidExplorer();

        mercury.accept(astronaut);
        venus.accept(astronaut);
        earth.accept(astronaut);
        mars.accept(astronaut);
        jupiter.accept(astronaut);
        uranus.accept(astronaut);
        neptune.accept(astronaut);
        System.out.println("");

        mercury.accept(rover);
        venus.accept(rover);
        earth.accept(rover);
        mars.accept(rover);
        jupiter.accept(rover);
        uranus.accept(rover);
        neptune.accept(rover);
        System.out.println("");

        mercury.accept(android);
        venus.accept(android);
        earth.accept(android);
        mars.accept(android);
        jupiter.accept(android);
        uranus.accept(android);
        neptune.accept(android);
        



        

    }
}
