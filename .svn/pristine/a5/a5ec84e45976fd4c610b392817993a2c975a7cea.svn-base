package 创建型.单例模式.饿汉式;

public class 静态常量 {
    //私有化构造函数
    private 静态常量() {
    }

    private static final 静态常量 instance = new 静态常量();

    public static 静态常量 getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("创建成功");
    }
}

class a {
    public static void main(String[] args) {
        静态常量.getInstance().print();
    }
}
