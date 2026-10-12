import java.util.*;

class Second{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int arr[] = new int[n] ; 
        int even = 0  ;
        int odd = 0 ;
        for(int i : arr){
            arr[i] = sc.nextInt() ; 
            if(arr[i] % 2 == 0)even++ ; 
            else odd++ ; 
        }
        System.out.println("Even : " + even) ; 
        System.out.println("Odd : " + odd) ; 
    }
}