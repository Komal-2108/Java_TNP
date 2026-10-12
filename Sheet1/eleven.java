import java.util.*;

public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.add(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }

        
        // boolean[] seen = new boolean[100001];

        // for (int i = 0; i < n; i++) {
        //     if (!seen[arr[i]]) {
        //         System.out.print(arr[i] + " ");
        //         seen[arr[i]] = true;
        //     }
        // }

        sc.close();
    }
}