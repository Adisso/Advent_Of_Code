import java.util.HashSet;
import java.util.Set;

public class Frequency {
    private int currentFrequency = 0;
    private int resultingFrequency = 0;
    private InputReader inputReader = new InputReader("input");
    private Set<Integer> appeared = new HashSet<>();

    public void showDuplicate(){
        try {
            while(true)
                showAnswer();
        }
        catch (IllegalArgumentException e){
            System.out.println("Which has already been seen.");
        }
    }

    private void showAnswer(){
        for (int i = 0; i < inputReader.getInputIntList().size(); i++) {
            resultingFrequency += inputReader.getInputIntList().get(i);
            System.out.println("Current frequency " + currentFrequency + ", change of " + inputReader.getInputStringList().get(i) + ", resulting frequency " + resultingFrequency + ".");
            currentFrequency = resultingFrequency;
            hasDuplicate();
        }
    }

    private void hasDuplicate() {
        if (!appeared.add(resultingFrequency)) {
            throw new IllegalArgumentException("Duplicate number is: " +resultingFrequency);
        }
    }
}
