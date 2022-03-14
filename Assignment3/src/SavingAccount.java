import java.util.*;
// import java.io.*;
// import java.util.Iterator;

class SavingAccount implements Comparable<SavingAccount>{
    int acc_balance;
    int acc_id;
    String accountholdername;
    boolean issalaryAccount;
    SavingAccount(int acc_balance,int acc_id,String accountholdername,boolean issalaryAccount){
        this.acc_balance=acc_balance;
        this.acc_id=acc_id;
        this.accountholdername=accountholdername;
        this.issalaryAccount=issalaryAccount;
    }
    public int getAcc_balance() {
        return acc_balance;
    }
    public void setAcc_balance(int acc_balance) {
        this.acc_balance = acc_balance;
    }
    public int getAcc_id() {
        return acc_id;
    }
    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }
    public String getAccountholdername() {
        return accountholdername;
    }
    public void setAccountholdername(String accountholdername) {
        this.accountholdername = accountholdername;
    }
    public boolean isIssalaryAccount() {
        return issalaryAccount;
    }
    public void setIssalaryAccount(boolean issalaryAccount) {
        this.issalaryAccount = issalaryAccount;
    }

    public int compareTo(SavingAccount p) {  
        if(acc_id>p.acc_id){  
            return 1;  
        }else if(acc_id<p.acc_id){  
            return -1;  
        }else{ 
            return 0;
        }  
    
}
}

