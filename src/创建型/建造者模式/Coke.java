package 创建型.建造者模式;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "这是一个什么饮料呢";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
