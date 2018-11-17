package test.workshop.finaldependency;

import test.workshop.Data;

public class FinalDependencyBusinessLogic {

    private final DataValidator dataValidator;
    private final DataStorage dataStorage;

    public FinalDependencyBusinessLogic(DataValidator dataValidator, DataStorage dataStorage) {
        this.dataValidator = dataValidator;
        this.dataStorage = dataStorage;
    }

    public String doStuff(Data data) {
        return dataValidator.isValid(data) ? dataStorage.save(data) : "ERROR";
    }
}