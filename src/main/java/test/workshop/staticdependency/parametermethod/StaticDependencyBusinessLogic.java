package test.workshop.staticdependency.parametermethod;

import test.workshop.Data;
import test.workshop.blackbox.DataStorage;

public class StaticDependencyBusinessLogic {

    private final DataStorage dataStorage;

    public StaticDependencyBusinessLogic(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void doStuff(Data data1, Data data2) {
        if (StaticComparator.isFirstSmaller(data1, data2)) {
            dataStorage.save(data1);
        } else {
            dataStorage.save(data2);
        }
    }
}
