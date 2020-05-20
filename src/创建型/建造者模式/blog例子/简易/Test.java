package 创建型.建造者模式.blog例子.简易;

public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder.Builder()
                .setCoding("写了一行代码")
                .setLanguage("Java")
                .setName("Android")
                .setWriteBug("没有bug")
                .build();
        coder.draw();
    }
}
