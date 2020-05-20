package 创建型.建造者模式.blog例子.普通;

public class Coder {
    private String name;//名称
    private String language;//编程语言
    private String coding;//编程能力
    private String writeBug;//bug生产力

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    public void setWriteBug(String writeBug) {
        this.writeBug = writeBug;
    }

    public void draw() {
        System.out.printf("%s程序员，使用%s编程语言，%s，%s。", name, language, coding, writeBug);
    }
}
