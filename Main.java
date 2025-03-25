public class Main {
    public static void main(String[] args) {
        final int start = 1;
        final int end = 100;

        RuleEngine engine = new RuleEngine();

        engine.addRule(3, "Fizz");
        engine.addRule(5, "Buzz");
        engine.addRule(7, "Pop");
        engine.addRule(11, "Zap");

        for (int i = start; i <= end; i++) {
            System.out.println(engine.process(i));
        }
    }
}