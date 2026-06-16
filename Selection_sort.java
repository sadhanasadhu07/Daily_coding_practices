import java.util.Scanner;

public class Selection_sort {
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min =i;

            for(int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i< size;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
