package 创建型.建造者模式;

public class BuiderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("蔬菜套餐");
        vegMeal.showItems();
        System.out.println("套餐价格: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("肌肉套餐");
        nonVegMeal.showItems();
        System.out.println("套餐价格: " + nonVegMeal.getCost());
    }
}
