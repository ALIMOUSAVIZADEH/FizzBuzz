import java.util.ArrayList;
import java.util.List;

public class FizzBuzzProcessor {
    private final List<Rule> rules = new ArrayList<>();

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public String process(int number) {
        for (Rule rule : rules) {
            if (rule.appliesTo(number)) {
                return rule.getResult();
            }
        }
        return String.valueOf(number);
    }
}