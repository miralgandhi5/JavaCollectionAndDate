import java.util.*;
/**
 * Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
 * Created by miral on 6/21/2017.
 */

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Float> floatList=new ArrayList<>();
        floatList.add(1.5f);
        floatList.add(2.5f);
        floatList.add(8.4f);
        floatList.add(2.6f);
        floatList.add(1.5f);

        Iterator<Float> iterate = floatList.iterator();

        float sum=0;

        while (iterate.hasNext())
        {
            sum+=iterate.next();
        }

        System.out.println("Sum of elements in List is "+sum);
    }
}
