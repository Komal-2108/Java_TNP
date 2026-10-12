import java.util.*;
class First{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        int sum = 0 ; 
        for(int i : arr){
            arr[i] = sc.nextInt() ;
            sum += arr[i] ;
        }
        float avg = (sum / n) ;
        String average = String.format("%.2f", avg);
        System.out.println("Total : " + sum);
        System.out.println("Average : " + average);
        
    }
}