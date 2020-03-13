package 创建型.抽象工厂模式.形状;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("开始绘制矩形");
    }
}
