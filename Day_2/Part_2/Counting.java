import org.apache.commons.lang3.StringUtils;

public class Counting {

    public void getStringsWIthOneLevenshteinDistance(String str1, String str2){
        int levensteinDistance = StringUtils.getLevenshteinDistance(str1, str2);
        if(levensteinDistance == 1){
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(StringUtils.difference(str1, str2));
        }
    }
    
    public static void main(String[] args) {
        InputReader inputReader = new InputReader("input");
        List<String> list = inputReader.getInputStringList();
        Counting counting = new Counting();
        for (int i = 0; i < list.size() ; i++) {
            for(int j = i + 1; j < list.size(); j++){
                counting.getStringsWIthOneLevenshteinDistance(list.get(i), list.get(j));
            }
        }
    }
    
}
