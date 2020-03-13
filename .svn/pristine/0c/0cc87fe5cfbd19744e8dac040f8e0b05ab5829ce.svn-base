package 创建型.抽象工厂模式;

/**
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if ("COLOR".equalsIgnoreCase(choice))
            return new ColorFactory();
        else if ("SHAPE".equalsIgnoreCase(choice))
            return new ShapeFactory();
        return null;
    }
}
