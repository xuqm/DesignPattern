package 创建型.建造者模式;

/**
 * 蔬菜汉堡  实现汉堡类
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "这是一个好吃的蔬菜汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
