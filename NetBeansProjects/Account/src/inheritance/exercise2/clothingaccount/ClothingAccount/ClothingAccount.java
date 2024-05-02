package inheritance.exercise2.clothingaccount.ClothingAccount;

import inheritance.exercise2.account.Account;

public class ClothingAccount extends Account {
  
    private int pointsEarned;
    private double credit;
    private double creditLimit;
    
    public ClothingAccount(){
        
    }
    
    public ClothingAccount(int accNum  , String accHolderName , int pointsEarned , double creditUsed , double credLim){
          
    }
    
    public int getPointsEarned(){
        
    }
    
    public double getCredit(){
        
    }
    
    public boolean buy(double clothesValue){
        if (this.credit >= this.creditLimit){
            return false;
            else{
                return true;
                this.credit += clothesValue;
                this.pointsEarned = (int)(Math.floor(clothesValue/100));
            }
        }
    }
    
    public double minimumPayment(){
        return (credit*1.15);
    }
    
}
