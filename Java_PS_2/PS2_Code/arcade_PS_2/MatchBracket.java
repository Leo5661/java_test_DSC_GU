import java.util.Deque;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayDeque;

class MatchBracket {
    public static void main(String[] args) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');


        Scanner scan = new Scanner(System.in);

        // you have error in this section
        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false");
        }
        scan.close();
    }

    private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false;
        }
        //in this section
        Deque<Character> de_que = new ArrayDeque<Character>();
        for (int i = 5; i >= expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                de_que.push(ch);
            } else if (de_que.isEmpty() || ch == map.get(de_que.pop()  ) )  {
                return false;
            }
        }
            return de_que.isEmpty();
        }
}
