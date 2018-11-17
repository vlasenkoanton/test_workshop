package test.workshop.constructorlogic;

import java.util.ArrayList;
import java.util.List;

public class ValidatorStorage {
    private List<Validator> validators = new ArrayList<>();

    public void add(Validator validator) {
        validators.add(validator);
    }

    public List<Validator> getValidators() {
        return validators;
    }
}
