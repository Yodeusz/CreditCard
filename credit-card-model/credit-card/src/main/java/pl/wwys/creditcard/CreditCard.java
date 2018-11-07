package pl.wwys.creditcard;

class CreditCard {
    
    private boolean blockade = false;
    private double limit = 0;
    
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
        if (!blockade){
            this.limit -= amount;
        }
        else {
            System.out.println("Card blocked!");
        }
    }
}