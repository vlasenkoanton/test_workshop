package test.workshop.methodchaining;

import java.util.HashMap;
import java.util.Map;

public class StorageService {
    private Map<String, Storage> storageMap = new HashMap<>();

    public StorageService(AccountStorage accountStorage) {
        storageMap.putIfAbsent("accountStorage", accountStorage);
    }

    public AccountStorage getAccountStorage() {
        return (AccountStorage) getByName("accountStorage");
    }

    public Storage getByName(String name) {
        return storageMap.get(name);
    }
}
