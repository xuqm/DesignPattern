package 创建型.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐类 创建一张套餐
 */
public class Meal {
    //    套餐包含的产品
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("产品名称 : " + item.name());
            System.out.print(", 打包方式 : " + item.packing().pack());
            System.out.println(", 价格 : " + item.price());
        }
    }
}
