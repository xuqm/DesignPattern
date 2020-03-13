package 创建型.抽象工厂模式;

import 创建型.抽象工厂模式.形状.Shape;
import 创建型.抽象工厂模式.颜色.Blue;
import 创建型.抽象工厂模式.颜色.Color;
import 创建型.抽象工厂模式.颜色.Green;
import 创建型.抽象工厂模式.颜色.Red;

/**
 * 颜色创建的工厂  继承自抽象工厂@AbstractFactory
 * 只重写颜色方法
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String type) {
        if (null == type) {
            System.out.println("请输入需要颜色的形状");
            return null;
        }
        if ("RED".equalsIgnoreCase(type)) {
            return new Red();
        } else if ("BLUE".equalsIgnoreCase(type)) {
            return new Blue();
        } else if ("GREEN".equalsIgnoreCase(type)) {
            return new Green();
        } else {
            System.out.println("请输入正确的颜色类型");
        }
        return null;
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}
