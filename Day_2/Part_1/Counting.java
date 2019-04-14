import org.apache.commons.lang3.StringUtils;
public class Counting {
    public int duplicates = 0;
    public int triplicates = 0;


    public void countDuplicates(String str){
        for(int i = 0; i < str.length(); i++){
            int counter = StringUtils.countMatches(str, str.charAt(i));
            if(counter == 2){
                duplicates++;
                break;
            }
        }
    }

    public void countTriplicatees(String str){
        for(int i = 0; i < str.length(); i++){
            int counter = StringUtils.countMatches(str, str.charAt(i));
            if(counter == 3){
                triplicates++;
                break;
            }
        }
    }
}
