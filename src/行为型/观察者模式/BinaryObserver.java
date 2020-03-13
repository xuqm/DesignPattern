package 行为型.观察者模式;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("BinaryObserver状态改变::" + subject.getState());
    }
}
