package test.workshop.blackbox;

import test.workshop.Data;

public class DataValidator {
    private DataValidator() {
    }

    public static boolean isNameBlank(Data data) {
        String name = data.getName();
        return name == null || name.trim().isEmpty();
    }
}
