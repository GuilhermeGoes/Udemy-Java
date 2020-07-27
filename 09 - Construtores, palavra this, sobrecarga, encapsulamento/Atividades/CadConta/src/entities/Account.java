package entities;

public class Account {
    //ATRIBUTOS
    private int number;
    private String holder;
    private double balance;

    //CONSTRUTORES
    public Account(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    //GETTERS E SETTERS
    public int getNumber() {
        return number;
    }

    public String getholder() {
        return holder;
    }

    public double getbalance() {
        return balance;
    }

    public void setholder(String holder) {
        this.holder = holder;
    }

    //METODOS
    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5.00;
    }

    public String toString() {
        return "Account " + number +
                ", Holder: " + holder +
                ", Balance: $ " + String.format("%.2f", balance);
    }
}
