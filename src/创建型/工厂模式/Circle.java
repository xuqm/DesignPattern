package 创建型.工厂模式;

/**
 * 实现接口的实体类  圆形
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("开始绘制圆形");
    }
}
