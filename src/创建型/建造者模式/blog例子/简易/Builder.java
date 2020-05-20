//package 创建型.建造者模式.blog例子;
//
//public class Builder {
//    private String name;
//    private String language;
//    private String coding;
//    private String writeBug;
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public Builder setLanguage(String language) {
//        this.language = language;
//        return this;
//    }
//
//    public Builder setCoding(String coding) {
//        this.coding = coding;
//        return this;
//    }
//
//    public Builder setWriteBug(String writeBug) {
//        this.writeBug = writeBug;
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getLanguage() {
//        return language;
//    }
//
//    public String getCoding() {
//        return coding;
//    }
//
//    public String getWriteBug() {
//        return writeBug;
//    }
//
//    public Coder build() {
//        return new Coder(this);
//    }
//}
