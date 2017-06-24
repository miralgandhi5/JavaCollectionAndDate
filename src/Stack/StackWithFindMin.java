package Stack;

import java.util.Stack;

/**
 * Created by miral on 6/24/2017.
 */
public class StackWithFindMin extends Stack<Integer>{

    Stack<Integer> minStack;
    Integer min;
    public StackWithFindMin() {
        super();
        minStack=new Stack<>();
        min=null;
    }

    @Override
    public Integer push(Integer item) {
        if(min==null)
            min=item;
        else
            if(min>item)
            {
                min=item;
            }
        minStack.push(min);
        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {
        minStack.pop();
        return super.pop();
    }

    @Override
    public synchronized Integer peek() {
        return super.peek();
    }

    @Override
    public boolean empty() {
        return super.empty();
    }

    @Override
    public synchronized int search(Object o) {
        return super.search(o);
    }

    public int findMin()
    {
        return minStack.peek();
    }
}
