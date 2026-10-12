import java.util.*;

public class third {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int arr[] = new int[n] ; 
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ; 
        }
       Arrays.sort(arr) ;
       System.out.println("Maximum : "+ arr[n-1]);
       System.out.println("Minimum : " + arr[0]);
    }
}
