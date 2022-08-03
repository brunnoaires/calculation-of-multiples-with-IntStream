import java.util.Scanner;
import java.util.stream.IntStream;

public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IntStream stream = IntStream.range(1, 1000);

        long result = stream.filter(value -> (value % 3 == 0 || value % 5 == 0)).sum();

        System.out.println(result);
    }
}