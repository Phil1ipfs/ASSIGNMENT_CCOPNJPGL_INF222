public class RobotExplorer implements Explorer{
    @Override
    public void visit(Mercury mercury){
        System.out.println("Robot is visiting Mercury...");
    }

    @Override
    public void visit(Venus venus){
        System.out.println("Robot is visiting Venus...");
    }

    @Override
    public void visit(Earth earth){
        System.out.println("Robot is visiting Earth...");
    }

    @Override
    public void visit(Mars mars){
        System.out.println("Robot is visiting Mars...");
    }

    @Override
    public void visit(Jupiter jupiter){
        System.out.println("Robot is visiting Jupiter...");
    }

    @Override
    public void visit(Saturn saturn){
        System.out.println("Robot is visiting Saturn...");
    }

    @Override
    public void visit(Uranus uranus){
        System.out.println("Robot is visiting Uranus...");
    }

    @Override
    public void visit(Neptune neptune){
        System.out.println("Robot is visiting Neptune...");
    }
}
