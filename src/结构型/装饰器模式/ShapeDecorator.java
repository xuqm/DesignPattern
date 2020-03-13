package 结构型.装饰器模式;

public abstract class ShapeDecorator implements Shape {
    protected  Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
