package 创建型.建造者模式;

/**
 * 商品的接口  封装了名字  价格   打包方式
 */
public interface Item {
    public String name();

    public float price();

    public Packing packing();

}
