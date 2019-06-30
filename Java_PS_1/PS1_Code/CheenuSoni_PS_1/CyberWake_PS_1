import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//for scanning the data from the user
        int t = scan.nextInt();               //taking the input of the number of visits to the ice cream parlour
        while (t-- > 0) {
            int m = scan.nextInt();           //taking the input of the total money pooled
            int n = scan.nextInt();           //taking the input of numbr of flavours availale on that particular day
            int [] costs = new int[n];        //creating the array to store the cost of each flavour
            for (int i = 0; i < n; i++) {
                costs[i] = scan.nextInt();    //taking the input of cost of flavour one by one
            }
            buyIceCream(costs, m);            //calling the function
        }
        scan.close();                         
    }
    
    public static void buyIceCream(int [] costs, int money) {
        //creating a hashmap
        HashMap<Integer, Integer> map = new HashMap<>(); // key = cost, value = ice cream ID
        for (int i = 0; i < costs.length; i++) {
            int icecreamID = i + 1;
            int cost = costs[i];              //getting the key of flavour using value
            // Find 2 flavors to buy that sum to "money"
            int otherCost  = money - cost;    //money left after purchasing one flavour and being used to find the complimentory of the total money pooled
            //finding the value using key
            if (map.containsKey(otherCost)) {
                System.out.println(map.get(otherCost) + " " + icecreamID);
            }
            
            map.putIfAbsent(cost, icecreamID);
        }
    }
}
