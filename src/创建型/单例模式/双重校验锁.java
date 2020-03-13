package 创建型.单例模式;

public class 双重校验锁 {
    private static 双重校验锁 instance;

    private 双重校验锁() {
    }

    public static 双重校验锁 getInstance() {
        if (null == instance) {
            synchronized (双重校验锁.class) {
                if (null == instance)
                    instance = new 双重校验锁();
            }
        }
        return instance;
    }
}
