import java.lang.Math;
public class ArmstrongNumberRange
{
    public static void main(String[] args) 
	{
		int i;
		for(i=101;i<1000;i++)
		{
			int count=0,rem=0,temp=i;
			double x=0.0;
			while(temp!=0)
			{
				temp=temp/10;
				count=count+1;
			}
			temp=i;
			while(temp!=0)
			{
				rem=temp%10;
				x= x + Math.pow(rem,count);
				temp=temp/10;
			}
			if(x==i)
			{
				System.out.println(i + ", ");
			}
		}
	}
}