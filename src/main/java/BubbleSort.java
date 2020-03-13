import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a size of your future array: ");
        int size=scan.nextInt();
        int[]array=new int[size];
        System.out.println("Enter "+size+" digits you would like to sort in ascending order: ");
        for(int i=0; i<size; i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Before sorting: ");
        printArray(array, array.length);
        sortArray(array,array.length);
        System.out.println();
        System.out.println("After sorting: ");
        printArray(array, array.length);
    }
    public static int[]sortArray(int[] array, int size){
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(array[i]>array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        return array;
    }
    public static void printArray(int[] array, int size){
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
    }
}
