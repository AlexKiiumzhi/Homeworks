import java.math.BigInteger;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int [] integers = new int[]{3, 6, 8, -4, 0, -10};

        IntStream intStream1 = Stream.of(integers).flatMapToInt(IntStream::of) ;
        OptionalDouble avg = intStream1.average();
        System.out.println("Average of elements: " + avg);

        IntStream intStream2 = Stream.of(integers).flatMapToInt(IntStream::of) ;
        OptionalInt min = intStream2.map();
        System.out.println("Minimum element:" + min);

        IntStream intStream3 = Stream.of(integers).flatMapToInt(IntStream::of) ;
        Long nul = intStream3.filter(i -> i == 0).count();
        System.out.println("number of elements equals zero: " + nul);

        IntStream intStream4 = Stream.of(integers).flatMapToInt(IntStream::of) ;
        Long greaterThanNul = intStream4.filter(i -> i > 0).count();
        System.out.println("number of elements greater than zero: " + greaterThanNul);

        IntStream intStream5 = Stream.of(integers).flatMapToInt(IntStream::of) ;
        IntStream intStream55 = intStream5.map((i) -> i * 5);
        intStream55.forEach(System.out::println);
    }
}
