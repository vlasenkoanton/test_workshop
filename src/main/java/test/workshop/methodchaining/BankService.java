package test.workshop.methodchaining;

import java.util.List;

public class BankService {

    private StorageService storageService;

    public BankService(StorageService storageService) {
        this.storageService = storageService;
    }

    public double getRate(InterestRateRequest request) {
        List<Account> accounts = storageService.getAccountStorage().getAccounts();
        return accounts
                .stream()
                .filter(account -> request.getAccountNumber() == account.getAccountNumber())
                .mapToDouble(Account::getInterestRate)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Account not found."));
    }

    public Storage getStorageByName(String name) {
        return storageService.getByName(name);
    }
}
