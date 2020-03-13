package 结构型.享元模式;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);
        if (null == circle) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.printf("新建一个%s颜色的圆%n", color);
        }
        return circle;
    }
}
