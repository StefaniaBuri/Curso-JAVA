
public class Statistics {
    //Calcular la media de una serie de numeros

    static int sumAllArray(int[] data) {
        int sum = 0;
        for (int i : data) {
            sum = sum + i;
            //sum += i
        }
        return sum;
    }

    static double averageArray(int[] data) {
        sumAllArray(data); // suma todos los valores de data
        //calculamos la media
        double average = (double)sumAllArray(data)/data.length;
        return average;
    }

    static double average(int...args) {
        return averageArray(args);
    }

    public static void main(String[] args) {
        int[] numbers = {14,35,47,18,96, 2, 3};
        double avg = averageArray(numbers);

        int sum = sumAllArray(numbers);
        //System.out.println("La suma del array es: "+ sum);
        //System.out.println("La media es: " + avg);

        //double average = averageArray(numbers);
        double avg2 = average(2,14,85,47,23);
        System.out.println("La media es: "+ avg2);
    }
}
