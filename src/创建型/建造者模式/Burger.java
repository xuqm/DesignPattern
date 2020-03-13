package 创建型.建造者模式;

/**
 * 所有的汉堡都需要用盒子包装
 * 所以抽出一个抽象类出来
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
