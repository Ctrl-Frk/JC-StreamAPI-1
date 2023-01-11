import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(List<Integer> numbers) {
        System.out.println("With stream API: ");
        numbers.stream()
                .filter(value -> value > 0)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(value -> System.out.print(value + " "));
        System.out.println();
    }
}
