package 创建型.建造者模式;

/**
 * 所有的冷饮都用瓶子包装
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
