package 创建型.抽象工厂模式.颜色;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("填满了红色");
    }
}
