import java.util.Hashtable;

public class Collection5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sathvik");
        Employee emp2 = new Employee("Krishna");

        Hashtable<Employee, String> dict = new Hashtable<Employee, String>();
        
        dict.put(emp1, "Developer");
        dict.put(emp2, "DS");
       
        System.out.println(dict.hashCode());
        System.out.println(emp2.equals(emp1));
    }
}