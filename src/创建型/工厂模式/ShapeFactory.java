package 创建型.工厂模式;

/**
 * 形状工厂
 */
public class ShapeFactory {
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
