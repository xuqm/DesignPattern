package 创建型.建造者模式;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐可以来一杯么";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
