import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
    private final List<GeneralRule> rules = new ArrayList<>();

    public void addRule(int divisor, String output) {
        rules.add(new GeneralRule(divisor, output));
    }

    public String process(int number) {
        StringBuilder result = new StringBuilder();

        for (GeneralRule rule : rules) {
            if (rule.appliesTo(number)) {
                result.append(rule.getOutput());
            }
        }

        return result.length() > 0 ? result.toString() : String.valueOf(number);
    }
}