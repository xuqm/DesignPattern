package 创建型.抽象工厂模式;

import 创建型.抽象工厂模式.形状.Shape;
import 创建型.抽象工厂模式.颜色.Color;

/**
 * 获取形状和颜色的工厂抽象类
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String type);

    public abstract Shape getShape(String type);
}
