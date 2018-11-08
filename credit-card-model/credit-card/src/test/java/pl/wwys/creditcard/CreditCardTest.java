package pl.wwys.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {
    
    @Test
    public void allowAssignLimit() {
        //Arrange / Given
        CreditCard card = new CreditCard();
        //Act / When
        card.assignLimit(2000);
        //Asser / Then
        Assert.assertTrue(card.getLimit() == 2000);
    }
    
    @Test
    public void allowBlockCard() {
        CreditCard card = new CreditCard();
        card.block();
        
        Assert.assertTrue(card.isBlocked());
    }
    
    @Test
    public void allowWithdrawMoney() {
        CreditCard card = new CreditCard();
        card.assignLimit(2000);
        
        card.withdraw(200);
        
        Assert.assertEquals(1800, card.getLimit(),0);
    }
    
    @Test
    public void allowRepay() {
        CreditCard card = new CreditCard();
        double limit = 500;
        card.assignLimit(limit);
        card.withdraw(200);
        
        card.repay(limit);
        Assert.assertEquals(limit, card.getLimit(), 0);
        card.assignLimit(2000);
        
        card.withdraw(200);
        
        card.repay(100);
        
        Assert.assertEquals(100, card.getCredit(), 0);
    }
}