import java.util.Scanner;

public class SortArrayByMerge {
    static void mergeTwoSortedArray(int[] arr1){
        int[] result = new int[arr1.length];
        int mid = arr1.length/2;
        int i=0, j=mid, k=0;
        
        while(i<mid && j < arr1.length){
            if(arr1[i]<=arr1[j]){
                result[k++] = arr1[i++];
            }
            else{
                result[k++] = arr1[j++];
            }
        }
        while (i < mid) {
            result[k++] = arr1[i++];
    }
        while (j < arr1.length) {
            result[k++] = arr1[j++];
        }
         for(int s=0;s<result.length;s++){
            System.out.print(result[s]+" ");
        }
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of 1st array: ");
        int size1 = sc.nextInt();
        
        int[] arr1 = new int[size1];
       
        System.out.println("enter the elements of 1st sorted array: ");
        for(int i=0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
       
        mergeTwoSortedArray(arr1);
       
    }
}
