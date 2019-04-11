public class Frequency {
    private int currentFrequency = 0;
    private int resultingFrequency = 0;
    private InputReader inputReader = new InputReader("input");

    public void showAnswer(){
        for (int i = 0; i < inputReader.getInputIntList().size() ; i++) {
            resultingFrequency += inputReader.getInputIntList().get(i);
            System.out.println("Current frequency " + currentFrequency + ", change of " + inputReader.getInputStringList().get(i) + ", resulting frequency " +resultingFrequency + ".");
            currentFrequency = resultingFrequency;
        }
    }

}
