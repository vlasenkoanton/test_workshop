package test.workshop.useless.utility;

public class BusinessLogic {

    private final Storage storage;

    public BusinessLogic(Storage storage) {
        this.storage = storage;
    }

    public void doStuff(String... thins) {
        storage.save(SetUtils.toSet(thins));
    }
}
