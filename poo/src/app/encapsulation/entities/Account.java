package app.encapsulation.entities;

/**
 * Produto
 */
public class Account {

    private Integer number;
    private String holder;
    private Double balance;

    public Account() {
    }

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void saque(double saque){
        this.balance -= saque;
    }

    public void deposito(double deposito){
        this.balance += deposito;
    }

    public String toString() {
        return "Account " + number + ", Holder: "+ holder + ", Balance: $ "+ balance;
    }
}