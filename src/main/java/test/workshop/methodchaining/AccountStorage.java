package test.workshop.methodchaining;

import java.util.ArrayList;
import java.util.List;

public class AccountStorage implements Storage {
    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
