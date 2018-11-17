package test.workshop.constructorlogic;

import java.util.function.Predicate;

public class Validator {
    private final Predicate<String> predicate;

    public Validator(Predicate<String> predicate) {
        this.predicate = predicate;
    }

    public boolean isValid(String s) {
        return predicate.test(s);
    }
}
