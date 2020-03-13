package 创建型.抽象工厂模式;


import 创建型.抽象工厂模式.形状.Circle;
import 创建型.抽象工厂模式.形状.Rectangle;
import 创建型.抽象工厂模式.形状.Shape;
import 创建型.抽象工厂模式.形状.Square;
import 创建型.抽象工厂模式.颜色.Color;

/**
 * 形状创建的工厂，不重写颜色方法
 * 继承自抽象工厂
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String type) {
        return null;
    }

    @Override
    public Shape getShape(String type) {
        if (null == type) {
            System.out.println("请输入需要创建的形状");
            return null;
        }
        if ("CIRCLE".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(type)) {
            return new Square();
        } else {
            System.out.println("请输入正确的形状类型");
        }
        return null;
    }
}
