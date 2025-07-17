package local.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

//COMPLETAR 

public class Demo01Streams {

    int[] numbers = { 1, 5, 22, 36 };
    // Stream<Integer> x = Arrays.stream(numbers); no existe
    IntStream numStream = Arrays.stream(numbers);

    public int sumSquareGreaterThan(int limit, IntStream sNumber) {
       return sNumber.map(num -> num * num).filter(num -> num > limit).reduce((acc, num) -> acc += num).orElse(-1); // -1 significa que no ha funcionado
    }

    public void makeForEach(IntStream numStream) {
        numStream.forEach((number) -> {
            System.out.println(number); // imprimir cada numStream
        });
    }

    public void makeMap() {
        IntStream sNumber = numStream.map(number -> number * number); // parámetro lambda -> devuelve new stream
        makeForEach(sNumber);
    }

    public void makeFilter() {
        IntStream sNumber = numStream.filter(number -> number > 10); // parámetro lambda -> devuelve new stream
        makeForEach(sNumber);
    }

    public void makeReduce() {
        OptionalInt newValue = numStream.reduce((acc, num) -> acc += num); // parámetro lambda -> devuelve new stream
       System.out.println(newValue);
    }

    public static void main(String[] args) {
        Demo01Streams demo = new Demo01Streams();
        //demo.makeForEach(demo.numStream);
        //demo.makeMap();
        //demo.makeFilter();
        System.out.println(demo.sumSquareGreaterThan(100, demo.numStream)); // 1780
        //System.out.println(demo.sumSquareGreaterThan(10_000, demo.numStream));// devuelve -1
        
    }
}
