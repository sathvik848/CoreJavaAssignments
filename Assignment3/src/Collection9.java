import java.util.TreeSet;

public class Collection9 {

    public static void main(String[] args) {
        TreeSet<SavingAccount> saving= new TreeSet<SavingAccount>();
        SavingAccount sa1 = new SavingAccount(100, 1, "a1", true);
        SavingAccount sa2 = new SavingAccount(100, 4, "a2", true);
        SavingAccount sa3 = new SavingAccount(100, 3, "a3", true);

        saving.add(sa1);
        saving.add(sa2);
        saving.add(sa3);

        // Collections.sort(saving,new acc_idcomparator());

        for (SavingAccount p:saving){
            System.out.println(p.acc_balance+" "+p.acc_id+" "+p.accountholdername+" "+p.issalaryAccount);
        }

    }
    
}
