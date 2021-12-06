package subSystem;

public class AccountService {
    private String id;
    private Double balance;
    private String password;

    public AccountService(String id, Double balance, String password) {
        this.id = id;
        this.balance = balance;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public Double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
