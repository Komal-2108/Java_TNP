import java.util.*;

public class fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] rowSum = new int[r];
        int[] colSum = new int[c];

        int highestSales = Integer.MIN_VALUE;
        int highestBranch = 0;

        // Calculate row sums
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                rowSum[i] += arr[i][j];
                colSum[j] += arr[i][j];
            }

            if (rowSum[i] > highestSales) {
                highestSales = rowSum[i];
                highestBranch = i + 1;
            }
        }

        // Print row sums
        for (int i = 0; i < r; i++) {
            System.out.println("Row " + (i + 1) + " Sum: " + rowSum[i]);
        }

        // Print column sums
        for (int j = 0; j < c; j++) {
            System.out.println("Column " + (j + 1) + " Sum: " + colSum[j]);
        }

        System.out.println("Highest Sales Branch: " + highestBranch);
        System.out.println("Highest Sales: " + highestSales);

        sc.close();
    }
}