package 结构型.外观模式;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("开始绘制圆形");
    }
}
