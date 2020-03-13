package 行为型.模板模式;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("足球游戏初始化完成");
    }

    @Override
    void startPlay() {
        System.out.println("足球游戏开始");
    }

    @Override
    void endPlay() {
        System.out.println("足球游戏结束");
    }
}
