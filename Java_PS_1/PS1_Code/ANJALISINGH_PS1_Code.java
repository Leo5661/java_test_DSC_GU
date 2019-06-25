
import java.util.*;

public class Icecream
{
	public static void main(String[] args) 
	{
	     Scanner scan = new Scanner(System.in);
	     System.out.println("enter the number of trials 't':");
        int t = scan.nextInt();
        while(t-->0)
        {
         System.out.println("enter the amount of money they have pooled,m:");
         int m = scan.nextInt();
         System.out.println("enter number of flavours offered at a time,n:");
        int n = scan.nextInt();
        int[] flavours = new int[n];
        System.out.println("flavours are:");
         for(int i = 0; i < n; i++) 
         {
                flavours[i] = scan.nextInt();
            }

        for(int i = 0; i < n; i++)
         {
                for(int j = i + 1; j < n; j++) 
                {
                    if(flavours[i] + flavours[j] == m)
                    {
                        System.out.println( (i + 1) + " " + (j + 1) );
                        break;
                    }
                }
         }
         
        }
	  scan.close();
	}
}
