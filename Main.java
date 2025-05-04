import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        String[] list = {"the", "red", "fox", "the", "red"};
        WordPairList test = new WordPairList(list);
        ArrayList<WordPair> words = test.getlist();
        for (WordPair k : words){
            System.out.println("(" + k.getFirst() + ", " + k.getSecond() + ")");
        }
        System.out.println(test.numMatches());
    }

}