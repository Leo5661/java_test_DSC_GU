package MyPack;
import java.util.Scanner;

public class SahilSingh_PS_1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t;
		int m,n,i,j,k;
		int[] arr = new int[10000];
		t = scan.nextInt();
		
		for(i=0;i<t;i++)
		{
			m=scan.nextInt();
			n=scan.nextInt();
			
			for(j=1;j<=n;j++)
			{
				arr[j]=scan.nextInt();
			}
			
			for(j=1;j<n;j++)
			{
				for(k=j+1;k<=n;k++)
				{
					if(arr[j]+arr[k]==m)
					{
						System.out.println(j+ " "+k);
						break;
					}
				}
			}		
		}
	}

}
