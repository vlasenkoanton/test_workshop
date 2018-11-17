package test.workshop.dependencycouple.field;

import test.workshop.Data;

public class Validator {

    private final ValidatorSettingStorage validatorSettingStorage;

    public Validator(ValidatorSettingStorage validatorSettingStorage) {
        this.validatorSettingStorage = validatorSettingStorage;
    }

    public boolean isValid(Data data) {
        /* a lot of logic here */
        return false;
    }
}
