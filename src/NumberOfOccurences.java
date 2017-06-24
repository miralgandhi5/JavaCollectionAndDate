import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a method that takes a string and print the number of occurrence of each character characters in the string.
 * Created by miral on 6/21/2017.
 */
public class NumberOfOccurences {
    public static void NumberOfOccurencesOfCharacters(String string){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<string.length();i++)
        {
            if (map.containsKey(string.charAt(i))) {
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);

            }
            else
                map.put(string.charAt(i),1);
        }


        for(Map.Entry<Character,Integer> kvpair:map.entrySet())
        {

                System.out.println("Character "+kvpair.getKey()+" no. of occurences "+kvpair.getValue());


        }

    }

    public static void main(String[] args) {
        System.out.println("enter string to test");
        Scanner sc = new Scanner(System.in);
        String string=sc.next();
        NumberOfOccurencesOfCharacters(string);


    }
}
