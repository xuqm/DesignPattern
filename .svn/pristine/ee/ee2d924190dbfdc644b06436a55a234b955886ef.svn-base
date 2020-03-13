package 结构型.代理模式;

public class RealImage implements Image {
    private String name;

    public RealImage(String name) {
        this.name = name;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.printf("开始加载本地图片%s\n", name);
    }

    @Override
    public void display() {
        System.out.printf("开始展示图片%s\n", name);
    }
}
