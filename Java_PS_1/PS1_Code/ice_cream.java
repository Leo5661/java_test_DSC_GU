import java.io.*;
public class ice_cream
{
    public static void main(String args[])throws IOException
    {
        int q,i,j,d,f,k;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter queries : ");
        q=Integer.parseInt(br.readLine());
        for(k=0;k<q;k++)
        {
            System.out.println("Enter dollar you have : ");
            d=Integer.parseInt(br.readLine());
            System.out.println("Number of flavour available : ");
            f=Integer.parseInt(br.readLine());
            System.out.println("Flavours available are : ");
            String[] str=(br.readLine()).trim().split("\\s+");
            int a[]=new int[f];
            loopbreak:
            for(i=0;i<f-1;i++)
            {
                for(j=i+1;j<f;j++)
                {
                    if(i==0)
                    {
                        a[i]=Integer.parseInt(str[i]);
                        a[j]=Integer.parseInt(str[j]);
                    }
                    if(a[i]+a[j]==d)
                    {
                        System.out.println((i+1)+" "+(j+1));
                        break loopbreak;
                    }
                }
            }
        }
    }
}
