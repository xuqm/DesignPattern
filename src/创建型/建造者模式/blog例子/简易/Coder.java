package 创建型.建造者模式.blog例子.简易;

public class Coder {
    private String name;
    private String language;
    private String coding;
    private String writeBug;

    public Coder(Builder builder) {
        this.name = builder.name;
        this.language = builder.language;
        this.coding = builder.coding;
        this.writeBug = builder.writeBug;
    }

    public void draw() {
        System.out.printf("%s程序员，使用%s编程语言，%s，%s。", name, language, coding, writeBug);
    }

    public static class Builder {
        private String name;
        private String language;
        private String coding;
        private String writeBug;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder setCoding(String coding) {
            this.coding = coding;
            return this;
        }

        public Builder setWriteBug(String writeBug) {
            this.writeBug = writeBug;
            return this;
        }


        public Coder build() {
            return new Coder(this);
        }

    }
}
