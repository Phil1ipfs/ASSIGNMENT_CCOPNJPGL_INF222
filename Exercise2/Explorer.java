public interface Explorer {
    void visit(Mercury mercury);

    void visit(Venus venus);
    
    void visit(Mars mars);

    void visit(Earth earth);

    void visit(Jupiter jupiter);

    void visit(Saturn saturn);

    void visit(Uranus uranus);

    void visit(Neptune neptune);

    default void visit(Planet planet){
        System.out.println("Landed on an Unknown planet...");
    }
}
