import java.util.Scanner;

public class Merge_two_sorted_array {
    static void mergeTwoSortedArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];
        int i=0, j=0, k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                result[k++] = arr1[i++];
            }
            else{
                result[k++] = arr2[j++];
            }
        }
           while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        for(int s=0;s<result.length;s++){
            System.out.print(result[s]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of 1st array: ");
        int size1 = sc.nextInt();
        System.out.print("Enter size of 2nd array: ");
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        System.out.println("enter the elements of 1st sorted array: ");
        for(int i=0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the elements of 2nd sorted array: ");
        for(int i=0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }
        mergeTwoSortedArray(arr1,arr2);
    }
}
