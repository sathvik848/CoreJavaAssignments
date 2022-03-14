public class Main {

    // Singleton Class
    public static void main(String[] args) {
	// write your code here

        Singleton s = Singleton.getInstance();
        Singleton t = Singleton.getInstance();

        System.out.println(s.singleton);

        s.singleton = "here is the First Instance";

        System.out.println(s.singleton);

        t.singleton = "Override value on same instance";

        System.out.println(s.singleton);
    }
}