package test.workshop.staticdependency.staticwithdependency;

import test.workshop.Data;

public class StaticValidator {

    private static StaticValidatorStorage staticValidatorStorage;

    public StaticValidator() {
        staticValidatorStorage = new StaticValidatorStorage();
    }

    public static boolean isValid(Data data) {
        Object object = staticValidatorStorage.getSomething();
        /* complex logic */
        return false;
    }
}