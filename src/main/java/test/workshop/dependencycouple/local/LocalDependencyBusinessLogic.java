package test.workshop.dependencycouple.local;


import test.workshop.Data;

public class LocalDependencyBusinessLogic {

    private final SaveVervice saveVervice;

    public LocalDependencyBusinessLogic(SaveVervice saveVervice) {
        this.saveVervice = saveVervice;
    }

    public void doStuff(Data data) {
        boolean dataValid = new LocalValidator().isValid(data);
        if (dataValid) {
            saveVervice.save(data);
        }
    }
}