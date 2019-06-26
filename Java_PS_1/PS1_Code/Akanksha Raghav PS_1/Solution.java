import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int money = input.nextInt();
            int flavors = input.nextInt();
            Map<Integer, Integer> complements = new HashMap<>();
            
            for(int i = 1; i <= flavors; i++)
            {
                int cost = input.nextInt();
                if(complements.containsKey(cost))
                    System.out.println(complements.get(cost) + " " + i);
                else
                    complements.put(money-cost, i);
            }
        }
    }
}