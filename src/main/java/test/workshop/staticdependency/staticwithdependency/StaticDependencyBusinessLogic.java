package test.workshop.staticdependency.staticwithdependency;

import test.workshop.Data;
import test.workshop.finaldependency.DataStorage;

public class StaticDependencyBusinessLogic {

    private final DataStorage dataStorage;

    public StaticDependencyBusinessLogic(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void doStuff(Data data) {
        if (StaticValidator.isValid(data)) {
            dataStorage.save(data);
        }
    }
}