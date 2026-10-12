import java.util.*;

public class fourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int mainSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            mainSum += arr[i][i];
            secondarySum += arr[i][n - 1 - i];
        }

        int difference = Math.abs(mainSum - secondarySum);

        System.out.println("Main Diagonal Sum: " + mainSum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
        System.out.println("Difference: " + difference);

        sc.close();
    }
}