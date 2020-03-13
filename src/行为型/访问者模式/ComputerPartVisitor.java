package 行为型.访问者模式;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}
