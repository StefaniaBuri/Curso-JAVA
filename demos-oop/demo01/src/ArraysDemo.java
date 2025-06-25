import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

    //Método toString no esta override(sobrescrito) en los arrays y las listas si.
    public static int[] foo(int[] data) {
        int[] newData = data.clone();
        newData[0] = 1;
        return newData;
    }

    public static void showArray(int[] data) {
        System.out.print("[");
        System.out.print(data[0]);

        int[] showArray = Arrays.copyOfRange(data, 1, data.length);

        for (int item : showArray) {
            System.out.print(", " + item);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] data = { 1, 2, 45, 56 };
        int[] data2 = data;
        int[] data3 = { 1, 2, 45, 56 };
        // System.out.println(data == data2);
        // System.out.println(data == data3); // false

        System.out.println("--------------------");
        foo(data3);
        //System.out.println(data3[0]); //1
        System.out.println("Mi array " + Arrays.toString(data3));
        showArray(data3);
        System.out.println("--------------------");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(34);
        list.add(3, 5);
        //System.out.println(list);
    }
}
