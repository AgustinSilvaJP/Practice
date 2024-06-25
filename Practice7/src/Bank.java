import java.util.ArrayList;
public class Bank {
    private ArrayList<Account> accounts;

    //constructor
    public Bank(){
        accounts = new ArrayList<>();
    }

    //methods
    public void addAccount(Account newAccount){
        accounts.add(newAccount);
    }

    public void removeAccount(Account remAccount){
        accounts.remove(remAccount);
    }

    public void depositToAccount(Account account, double amount){
        account.deposit(amount);
    }
    public void withdrawFromAccount(Account account, double amount){
        account.withdraw(amount);
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }
}
