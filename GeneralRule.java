public class GeneralRule {
    private final int divisor;
    private final String output;

    public GeneralRule(int divisor, String output) {
        this.divisor = divisor;
        this.output = output;
    }

    public boolean appliesTo(int number) {
        return number % divisor == 0;
    }

    public String getOutput() {
        return output;
    }
}