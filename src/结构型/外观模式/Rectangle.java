package 结构型.外观模式;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("开始绘制矩形");
    }
}
