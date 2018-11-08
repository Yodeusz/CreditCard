package pl.wwys.creditcard;

class CreditCard {
    
    private boolean blockade = false;
    private double limit = 0;
    private double credit = 0;
    
    public void assignLimit(double money) {
        this.limit = money;
    }
    
    public double getLimit() {
        return limit;
    }
    
    public void block() {
        this.blockade = true;
    }
    
    public boolean isBlocked() {
        return this.blockade;
    }
    
    public void withdraw(double amount) {
        if (!blockade || amount<this.limit){
            this.limit -= amount;
            this.credit += amount;
        }
        else {
            System.out.println("Card blocked!");
        }
    }
    
    public void repay(double money) {
        this.credit -= money;
    }
    
    public double getCredit(){
        return credit;
    }
}