    import java.util.*;
    /**
     * Write a method that takes a string and returns the number of unique characters in the string.
     * Created by miral on 6/21/2017.
     */
    public class UniqueCharactersInString {
        public static int NumberOfUniqueCharacters(String string){
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < string.length(); i++) {
                if (map.containsKey(string.charAt(i))) {
                    map.put(string.charAt(i), map.get(string.charAt(i)) + 1);

                } else
                    map.put(string.charAt(i), 1);
            }
            int count = 0;
            System.out.println("Unique Characters in " + string);
            for (Map.Entry<Character, Integer> kvpair : map.entrySet()) {
                if (kvpair.getValue() == 1) {
                    System.out.println(kvpair.getKey());
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            System.out.println("enter string to test");
            Scanner sc = new Scanner(System.in);
            String string=sc.next();
            int noOfUniqueChar=NumberOfUniqueCharacters(string);
            System.out.println("Number of unique occurences is "+noOfUniqueChar);

        }
    }
