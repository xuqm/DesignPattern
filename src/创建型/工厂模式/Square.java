package 创建型.工厂模式;

/**
 * 实现接口的实体类  正方形
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("开始绘制正方形");
    }
}
