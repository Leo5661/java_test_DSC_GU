import java.util.*;
public class Icecream
{
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of trials 'T':");
        int n = scan.nextInt();
        while(n-->0)
        {
            System.out.println("Enter The Amount Of Money They Have Pooled,a:");
            int a = scan.nextInt();
            System.out.println("Enter Number Of Flavours Offered At A Time,b:");
            int b = scan.nextInt();
            int[] flavours = new int[b];
            System.out.println("Flavours Are:");
            for(int i = 0; i < b; i++)
            {
                flavours[i] = scan.nextInt();
            }
            for(int i = 0; i < b; i++)
            {
                for(int j = i + 1; j < b; j++)
                {
                    if(flavours[i] + flavours[j] == a)
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
