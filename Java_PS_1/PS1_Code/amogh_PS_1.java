import java.lang.reflect.Array;
import java.util.Scanner;
class Solution1 {
    public static void main(String args[]){
        Scanner s=new Scanner((System.in));
        Solution1 obj=new Solution1();
        System.out.println("Enter the no. of trips to ice cream parlour");
        int t=s.nextInt();
        int[][] solution =new int[t][2];
        int x=1;
        for(int i=0;i<t;i++) {
            System.out.println();
            System.out.println("Enter details of "+(i+1)+"st trip");
            System.out.println();
            System.out.println("Enter the money they have pooled");
            int m=s.nextInt();
            System.out.println("Enter the no. of flavour they have offered");
            int n=s.nextInt();
            int[] cost = new int[n];
            for(int j=0;j<n;j++){
                System.out.println("Enter the cost of the ice-cream");
                cost[j]=s.nextInt();
            }
            solution[i]=obj.icecream(m,cost);
        }
        for(int k=0;k<t;k++){
            if(x==1)
            {System.out.println("Solution = ");
                x++;
            }
            for(int l=0;l<2;l++) {
                System.out.print(solution[k][l]);
            }
            System.out.println();
        }
    }
    public int[] icecream(int m,int[] cost){
        int[] solution={0,0};
        int n=cost.length;
        for(int i=0;i<n;i++){
            int a=cost[i];
            for(int b=i+1;b<n;b++){
                if((a+cost[b])==m){
                    solution[0]=i+1;
                    solution[1]=b+1;
                    return solution;
                }
            }
        }
        return solution;
    }
}

