package streams;

import java.util.Arrays;

public class Closure {

    public static void main(String[] args) {

        String[] words = {"abc", "world", "pace"};
    Arrays.stream(words).forEach(e ->
            System.out.println(e=e+"2")

        );
    }
}
