package 创建型.单例模式.饿汉式;

public class 静态代码块 {

    private static 静态代码块 instance;

    static {
        instance = new 静态代码块();
    }


    private 静态代码块() {
    }

    public static 静态代码块 getInstance() {
        return instance;
    }
}
