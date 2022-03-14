class Bank{
    int total=0;
    int fixedDeposit=0;
    int CashCredit = 0;
    void setFixedDeposist(int value){
        fixedDeposit = fixedDeposit+value;
    }
    void setCashCredit(int value){
        CashCredit = CashCredit+value;
    }
    public void displaytotalcash(){
        total = fixedDeposit+CashCredit;
        System.out.println(total);
    }
}
class Saving extends Bank{
    // int fixedDeposit=0;
    void setFixedDeposist(int value){
        fixedDeposit = fixedDeposit+value;
    }
}
class Current extends Bank{
    // int CashCredit = 0;
    public void setCashCredit(int value){
        CashCredit = CashCredit+value;
    }
}

