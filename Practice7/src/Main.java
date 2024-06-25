import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static boolean isPositive(double num){
        return num >= 0;
    }
    public static void errorMessage(){
        System.out.println("ERROR\nNumero fuera de rango, ingrese otro valor: ");
    }
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);

        Bank bank = new Bank();

        Account a1 = new Account("agus", 123, 20000);
        Account a2 = new Account("nit", 321, 10500);
        bank.addAccount(a1);
        bank.addAccount(a2);

        ArrayList<Account> accounts = bank.getAccounts();
        int num;

        for(Account account : accounts){
            System.out.println(account.printInfo());
            System.out.println("------------------------------------------");
            System.out.print("Do you want to do anything with the account? (1, 0): ");
            do{
                num = xd.nextInt();
                if(num < 0 || num > 1){
                    errorMessage();
                }
            }while(num < 0 || num  > 1);
            if(num == 1){
                System.out.print("Do you want to deposit or withdraw? (1, 0): ");
                do{
                    num = xd.nextInt();
                    if(num > 1 || num < 0){
                        errorMessage();
                    }
                }while(num > 1 || num < 0);
                if(num == 1){
                    System.out.print("Type amount: ");
                    account.deposit(xd.nextDouble());
                }else{
                    System.out.print("Type amount: ");
                    account.withdraw(xd.nextDouble());
                }
                System.out.println("New balance: " + account.getMoney());
                System.out.println("------------------------------------------");

            }
        }
    }
}