import java.util.Set;
import java.util.TreeSet;

public class Collection1 {
    public static void main(String[] args) {
        Set<Person> set=new TreeSet<Person>();
        Person p1 = new Person(10,5,"p1");
        Person p2 = new Person(10,4,"p2");
        Person p3 = new Person(9,7,"p3");

        set.add(p1);
        set.add(p2);
        set.add(p3);

        for (Person p:set){
            System.out.println(p.name);
        }
    }
}