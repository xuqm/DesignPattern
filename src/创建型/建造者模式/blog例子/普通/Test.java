package 创建型.建造者模式.blog例子.普通;

public class Test {
    public static void main(String[] args) {
        CoderDirector director = new CoderDirector();//1
        AndroidBuilder builder = new AndroidBuilder();//2
        director.makeCoder(builder);//3
        Coder coder = builder.getCoder();//4
        coder.draw();
    }
}
