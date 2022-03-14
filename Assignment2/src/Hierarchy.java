public class Hierarchy {
    public static void main(String[] args) {
        Manager m1=new Manager();
        m1.calculate();
        Labour l1=new Labour();
        l1.calculate();
    }
}
class Employee{
    int salary=25000;
}
class Manager extends Employee{
    int incentive=5000;
    void calculate(){
        salary=40000+incentive;
        System.out.println("Salary of manager is " +salary);
    }
}
class Labour extends Employee{
    int overtime=5;
    void calculate(){
        salary=7000+(overtime*10);
        System.out.println("Salary of labour is " +salary);
    }
}