import java.util.Scanner;
public class Jhonny_and_sunny {
    static void Selection(){
        Scanner ip = new Scanner(System.in);
        int m = ip.nextInt();
        int flavours = ip.nextInt();
        int[] flavours_cost = new int[flavours];
        int i,temp =0;
        for(i =0;i<flavours;i++){
            temp = ip.nextInt();
            flavours_cost[i] = temp;
        }
        for(i=0;i<flavours-1;i++){
            for(int j=i+1;j<flavours;j++){
                if((flavours_cost[i]+flavours_cost[j])==m){
                    System.out.println((i+1)+" "+(j+1));
                    return;
                }
            }
        }

    }
    public static void main(String[] args){
        Scanner ip_1 = new Scanner(System.in);
        int visits = ip_1.nextInt();
        while (visits!=0){
            Selection();
            visits--;
        }

    }

}
