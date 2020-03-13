package 创建型.单例模式.懒汉式;

public class 线程安全 {
    private static 线程安全 instance;

    private 线程安全() {
    }

    public static synchronized 线程安全 getInstance() {
        if (null == instance)
            instance = new 线程安全();
        return instance;
    }
}
