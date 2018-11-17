package test.workshop.dependencycouple.field;

import test.workshop.Data;

public class FieldDependencyBusinessLogic {
    private final Validator validator;
    private final DataSaveService dataSaveService = new DataSaveService();

    public FieldDependencyBusinessLogic() {
        validator = new Validator(new ValidatorSettingStorage());
    }

    public void doSomeStuff(Data data) {
        if (validator.isValid(data)) {
            dataSaveService.save(data);
        }
    }
}