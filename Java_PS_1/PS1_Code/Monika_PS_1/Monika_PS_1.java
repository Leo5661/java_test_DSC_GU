package PS_1;
import java.util.*;

class trip
{
	public int m,n;
	public int cost[]=new int[10000];
	trip()
	{	Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			cost[j]=sc.nextInt();
		}
	}	
	public void show()
	{   int i,j,temp;//first=0,second=0;
		for(i=1;i<n;i++)
		{
			temp=cost[i];
			for(j=i+1;j<=n;j++)
			{	
				if(temp+cost[j]==m)
				{
					System.out.println(i+" "+j);	
					break;
				}
			}
		}
		
	}	
}

public class Monika_PS_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t= sc.nextInt();
		trip obj[]=new trip[50];
		
		for(int i=0;i<t;i++)
		{
			obj[i]=new trip();
		}
		
		for(int i=0;i<t;i++)
		{
			obj[i].show();
		}
		
	}

}
