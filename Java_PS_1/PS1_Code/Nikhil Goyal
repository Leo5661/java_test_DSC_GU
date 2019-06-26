public class Solution {

    private static int[] solve(int m, int []costs) {
        int []indexes = new int[]{-1, -1};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < costs.length; i++) {
            int cost = costs[i];
            int diff = m- cost;
            if (diff < 0) continue;
            Integer index = map.get(diff);

            if (index == null) {
                map.put(cost, i + 1);
            }
            else {
                indexes = new int[]{map.get(diff), i + 1};
                break;
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int j = 0; j < T; j++) {
            int M = s.nextInt();
            int N = s.nextInt();
            int []costs = new int[N];
            for (int i = 0; i < N; i++) {
                costs[i] = s.nextInt();
            }
            int []result = solve(M, costs);
            System.out.println(result[0] + " " + result[1]);   
        }
    }
}
