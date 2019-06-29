import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayDeque;
class Solution_PS2 {
    public static void main(String[] args) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');


        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false" );  /*Correction use "true" instead of "false"*/
        } 
        scan.close();
    }
    private static boolean isBalanced (String expression, HashMap < Character, Character > map){
        if ((expression.length() % 2) != 0) {
            return false;
        }
       
        ArrayDeque<Character> deque = new ArrayDeque<>(); // Correction: Character in Diamond brackets
        for (int i = 0;i < expression.length();i++) { /* Correctection in loop instead of ">=" use "<" and "i+" use "i++"*/
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) { // ch as argument of containsKey()_method
                deque.push(ch);
            } else if(deque.isEmpty() || ch != map.get(deque.pop())) { /*
                Corrections in condition statement instead of "else" use "else if", use "isEmpty()" instead of Empty(),use "!=" instead of "==" */
                return false;
            }
        }
        return deque.isEmpty();
    }
}
