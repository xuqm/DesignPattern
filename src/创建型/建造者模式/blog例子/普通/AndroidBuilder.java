package 创建型.建造者模式.blog例子.普通;

public class AndroidBuilder extends Builder {
    private Coder coder = new Coder();

    @Override
    public void setName() {
        coder.setName("Android");
    }

    @Override
    public void setLanguage() {
        coder.setLanguage("Java");
    }

    @Override
    public void setCoding() {
        coder.setCoding("写了三行代码");
    }

    @Override
    public void setWriteBug() {
        coder.setWriteBug("竟然没有bug");
    }

    @Override
    public Coder getCoder() {
        return coder;
    }
}
