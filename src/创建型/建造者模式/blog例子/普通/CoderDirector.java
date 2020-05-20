package 创建型.建造者模式.blog例子.普通;

public class CoderDirector {//指导者类

    public void makeCoder(AndroidBuilder builder) {
        builder.setName();
        builder.setLanguage();
        builder.setCoding();
        builder.setWriteBug();
    }
}
