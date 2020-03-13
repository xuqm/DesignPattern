package 创建型.工厂模式;

/**
 * 实现接口的实体类  矩形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("开始绘制矩形");
    }
}
