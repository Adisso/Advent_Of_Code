import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputReader {
    private List<Integer> inputIntList = new ArrayList<>();
    private List<String> inputStringList = new ArrayList<>();
    private String fileName;

    private void txtToInteger(){
        txtToString(fileName);
        stringToInteger(inputStringList);
    }

    private void txtToString(String fileName){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Adis\\IdeaProjects\\AdventOfCode\\src\\" +fileName+ ".txt"))){
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                inputStringList.add(sCurrentLine);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void stringToInteger(List<String> stringArray){
        for(String stringValue : stringArray) {
            inputIntList.add(Integer.parseInt(stringValue.trim()));
        }
    }

    public InputReader(String fileName){
        this.fileName = fileName;
        txtToInteger();
    }

    public List<Integer> getInputIntList(){
        return inputIntList;
    }

    public List<String> getInputStringList(){
        return inputStringList;
    }
}
