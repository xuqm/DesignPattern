package 创建型.建造者模式.blog例子.普通;

public abstract class Builder {
    public abstract void setName();

    public abstract void setLanguage();

    public abstract void setCoding();

    public abstract void setWriteBug();

    public abstract Coder getCoder();
}
