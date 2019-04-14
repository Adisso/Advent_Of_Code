import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputReader {
    private List<String> inputStringList = new ArrayList<>();
    private String fileName;

    public InputReader(String fileName){
        this.fileName = fileName;
        txtToString();
    }

    private void txtToString(){
        try (BufferedReader br = new BufferedReader(new FileReader(fileName+ ".txt"))){
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                inputStringList.add(sCurrentLine);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getInputStringList(){
        return inputStringList;
    }
}
