package Chapter3;
public class ModifiedAccountClass311 {
    private String name;
    private double balance;
    public ModifiedAccountClass311(String name, double balance){
        setName(name);
        setBalance(balance);
    }
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
            System.out.printf("К балансу %s было добавлено: %.2f%n", getName(), depositAmount);
        }
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0.0){
            if((balance - withdrawAmount) > 0.0){
                balance -= withdrawAmount;
            } else {
                System.out.printf("%nДанная сумма превышет ваш баланс%n");
            }
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double balance) {
        if (balance > 0.0)
            this.balance = balance;
    }

    public String getName(){
        return name;
    }
}