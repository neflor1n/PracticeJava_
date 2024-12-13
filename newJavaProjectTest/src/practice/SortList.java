package practice;
import java.util.*;

public class SortList {

    public static void main(String[] args) {

        List<String> wordList = new ArrayList<String>();


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter some string: ");
        String str = sc.nextLine();


        Collections.sort(wordList);

        wordList.add(str);

        for (String word : wordList) {

            System.out.printf(word);
        }

    }

}
