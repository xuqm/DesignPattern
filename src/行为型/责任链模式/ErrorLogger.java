package 行为型.责任链模式;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);

    }
}
