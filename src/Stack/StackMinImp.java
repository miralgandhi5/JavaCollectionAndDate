package Stack;

import java.util.stream.IntStream;

/**
 * Created by miral on 6/24/2017.
 */
public class StackMinImp {
    public static void main(String[] args) {
        StackWithFindMin demo=new StackWithFindMin();
        System.out.println("after adding:"+demo.push(5));
        System.out.println("Min value "+demo.findMin());
        System.out.println("after adding:"+demo.push(2));
        System.out.println("Min value "+demo.findMin());
        System.out.println("after adding:"+demo.push(4));
        System.out.println("Min value "+demo.findMin());
        System.out.println("after adding:"+demo.push(1));
        System.out.println("Min value "+demo.findMin());
        System.out.println("after pop:"+demo.pop());
        System.out.println("Min value "+demo.findMin());
        System.out.println("after pop:"+demo.pop());
        System.out.println("Min value "+demo.findMin());


    }
}
