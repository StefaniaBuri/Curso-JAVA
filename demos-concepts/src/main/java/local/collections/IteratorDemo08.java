package local.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorDemo08 {

    void useIterators(Collection<Integer> coll) {
        //Option 1
        Iterator<Integer> ite = coll.iterator();
        while (ite.hasNext()) { //condición boolean
            Integer item = ite.next();
            System.out.println(item);
        }
    }

    void useIteratorForEach(Collection<Integer> coll) {
        //Option 1
       coll.forEach((item) -> System.out.println("Item: " + item)); //pide una lambda
    }

    void useIteratorForEach2(Collection<Integer> coll) {
        //Option 1
        Integer accumulator = 0;
        Consumer<Integer> foo = (item) -> 
        {
            //accumulator += item;
            System.out.println("Item: " + item);
        };
        coll.forEach(foo);

    }

    public static void main(String[] args) {
        IteratorDemo08 demo = new IteratorDemo08();
        Collection<Integer> coll = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            coll.add(i);
        }
        //demo.useIterators(coll);
        //demo.useIteratorForEach(coll);
        demo.useIteratorForEach2(coll);
    }
}
