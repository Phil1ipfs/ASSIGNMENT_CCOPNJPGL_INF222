public class HumanExplorer implements Explorer {

    @Override
    public void visit(Mercury mercury){
        System.out.println("Human is visiting Mercury...");
    }

    @Override
    public void visit(Venus venus){
        System.out.println("Human is visiting Venus...");
    }

    @Override
    public void visit(Earth earth){
        System.out.println("Human is visiting Earth...");
    }

    @Override
    public void visit(Mars mars){
        System.out.println("Human is visiting Mars...");
    }

    @Override
    public void visit(Jupiter jupiter){
        System.out.println("Human is visiting Jupiter...");
    }

    @Override
    public void visit(Saturn saturn){
        System.out.println("Human is visiting Saturn...");
    }

    @Override
    public void visit(Uranus uranus){
        System.out.println("Human is visiting Uranus...");
    }

    @Override
    public void visit(Neptune neptune){
        System.out.println("Human is visiting Neptune...");
    }
}
