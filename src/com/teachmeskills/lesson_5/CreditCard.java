package com.teachmeskills.lesson_5;

public class CreditCard {
    int accountNumber;
    int accountAmount;

    /**
     *We make methods for the ability to withdraw money from the card and constructors
     *
     */
     void addAmount(int amount){
      accountAmount +=amount;
     }
    void withdrawMoney(int amount){
        accountAmount -=amount;
    }
    void accountBalance(){
        System.out.println("Yor account balance is: " + accountAmount + " Account number " + accountNumber);
    }
    CreditCard(int accNum,int accAm) {
        this.accountNumber = accNum;
        this.accountAmount = accAm;
    }
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(20,100);
        CreditCard card2 = new CreditCard(30,200);
        CreditCard card3 = new CreditCard(40,300);

       card1.addAmount(20);
       card1.accountBalance();
       card2.addAmount(40);
       card2.accountBalance();
       card3.withdrawMoney(50);
       card3.accountBalance();
        }
    }

