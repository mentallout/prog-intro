import java.util.*;

public class ManagingDifficulties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // slow scanner // scanner not closing if throw
        int t = scanner.nextInt(); // naming
        for (int p = 0; p < t; p++) {
            Map<Integer, Integer> C = new HashMap<>();
            List<Integer> a = new ArrayList<>(); // int[]
            int count = 0;
            int n = scanner.nextInt();
            for (int x = 0; x < n; x++) {
                a.add(scanner.nextInt());
            }
            for (int j = n - 1; j >= 1; j--) {
                for (int i = 0; i < j; i++) {
                    count = count + C.getOrDefault(2 * a.get(j) - a.get(i), 0);
                }
                C.put(a.get(j), C.getOrDefault(a.get(j), 0) + 1);
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
