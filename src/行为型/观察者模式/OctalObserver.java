package 行为型.观察者模式;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("OctalObserver状态改变::" + subject.getState());
    }
}
