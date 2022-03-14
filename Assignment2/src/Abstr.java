abstract class Car{
    abstract void start();
}
class bmw extends Car{
    @Override
    void start() {
        System.out.println("Bmw is starting");
    }
}
class audi extends Car{
    void start() {
        System.out.println("audi is starting" );
    }
}
public class Abstr {
    public static void main(String[] args) {
        audi a1=new audi();
        a1.start();
        bmw b1=new bmw();
        b1.start();
    }
}