package test.workshop.useless.utility;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetUtils {
    private SetUtils() {
    }

    public static <T> Set<T> toSet(T... elements) {
        return Stream.of(elements).collect(Collectors.toSet());
    }
}
