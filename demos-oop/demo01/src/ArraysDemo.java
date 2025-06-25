import java.util.ArrayList;
import java.util.List;

public class ArraysDemo {

    public static int[] foo(int[] data) {
        int[] newData = data.clone();
        newData[0] = 1;
        return newData;
    }

    public static void main(String[] args) {
        int[] data = { 1, 2, 45, 56 };
        int[] data2 = data;
        int[] data3 = { 1, 2, 45, 56 };
        // System.out.println(data == data2);
        // System.out.println(data == data3); // false

        foo(data3);
        System.out.println(data3[0]); //1
        //System.out.println();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(34);
        list.add(3, 5);
        System.out.println(list);
    }
}
