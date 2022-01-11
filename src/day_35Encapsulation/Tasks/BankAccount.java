package day_35Encapsulation.Tasks;

public class BankAccount {

private String accountHolder;
private int accountNumber;
private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount<0){
            System.out.println("Invalid deposit");
            return;
        }
        System.out.println(accountHolder+"is depositing money in his"+balance);
    }

    public void withdraw(double amount){
        if(amount<=0) {
            System.err.println("Invalid transaction");
            return;

        }
        if (amount<balance){
            System.err.println("Invalid transaction");
            return;
        }
        System.out.println(accountHolder+"is able to withdraw money from"+balance);
    }

    public void checkABalance(){

        System.out.println(accountHolder+"is able to check a"+balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments
 */
