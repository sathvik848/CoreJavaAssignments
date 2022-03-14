import java.util.*;
public class Marks {
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,total;
		double avg=0.0;
		System.out.println("Subject A marks: ");
		a=sc.nextInt();
		System.out.println("Subject B marks: ");
		b=sc.nextInt();
		System.out.println("Subject C marks: ");
		c=sc.nextInt();
		total=a+b+c;
		avg=(total/3);
		System.out.println("Total marks: "+total+"\nAverage marks: "+avg);
		sc.close();
	}
}