package lambda;

import java.util.function.Supplier;

public class FIExamples {

    public static void main(String[] args) {
        Supplier<String> supplier1 = () -> "hello";
        Supplier<Integer> supplier2 = () -> "hello".length();
    }
}
