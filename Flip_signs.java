import java.util.Arrays;
import java.util.Scanner;

public class Flip_signs {
    static void flip_sign_method(int[] arr,int k){
    while(k!=0){
        arr[0] = arr[0]*-1;
        k--;
    }
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum += arr[i];
        
    }
    System.out.print(sum);
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for(int i=0;i<input.length;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int k = sc.nextInt();

        flip_sign_method(arr, k);
    }
}
