import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        try
        {
        int T=sc.nextInt();
        
        while(T!=0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            sc.nextLine();
            String s[]=sc.nextLine().split(" ");
            outerloop:
            for(int x=0;x<n;x++)
            {
                for(int y=0;y<n;y++)
                {
                    if(x==y)
                    {
                        continue;
                    }
                    if((Integer.parseInt(s[x])+Integer.parseInt(s[y]))==m)
                    {
                        System.out.println((x+1)+" "+(y+1));
                        break outerloop;
                    }
                }
            }
            
            T--;
        }
    }
    
    catch(Exception e)
    {
    }

    }

}

