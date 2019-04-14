import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountingTest {

    @Test
    void shouldBe247Duplicates(){
        Counting freq = new Counting();
        InputReader inputReader = new InputReader("input");
        for (int i = 0; i < inputReader.getInputStringList().size(); i++) {
            freq.countDuplicates(inputReader.getInputStringList().get(i));
        }
        assertEquals(247, freq.duplicates);
    }

    @Test
    void shouldBe20Triplicates(){
        Counting freq = new Counting();
        InputReader inputReader = new InputReader("input");
        for(int i = 0; i < inputReader.getInputStringList().size(); i++){
            freq.countTriplicatees(inputReader.getInputStringList().get(i));
        }
        assertEquals(20, freq.triplicates);
    }
}
