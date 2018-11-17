package test.workshop.blackbox;

import test.workshop.Data;

public class BlackBoxBusinessLogic {
    private final DataStorage dataStorage;

    public BlackBoxBusinessLogic(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void doStuff(Data data) {
        if (DataValidator.isNameBlank(data)) {
            throw new IllegalArgumentException("Not valid data");
        }
        dataStorage.save(data);
    }
}