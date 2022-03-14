/**
 * TotalCashinBank
 */
public class TotalCashinBank {

    public static void main(String[] args) {
        Bank s = new Saving();
        Bank c = new Current();
        s.setFixedDeposist(10);
        s.setCashCredit(10);
        c.displaytotalcash();
    }
}