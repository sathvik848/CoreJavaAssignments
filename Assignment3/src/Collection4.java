import java.util.HashMap;
import java.util.Map;

public class Collection4 {

    public static void main(String[] args) {
        DOB b = new DOB(1,1,3);
        EmpName e = new EmpName("kunal");
        
        HashMap<DOB,EmpName> map = new HashMap<DOB,EmpName>();
        map.put(b, e);
        map.put(new DOB(3,2,1),new EmpName("a"));
        map.put(new DOB(3,2,2),new EmpName("b"));
        for(Map.Entry<DOB,EmpName> m:map.entrySet()){
            DOB dob = m.getKey();

            System.out.println("Unique Employee DOB: " + dob.toString());
        }       
    }
}
