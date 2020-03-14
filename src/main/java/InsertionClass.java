public class InsertionClass {
    public static void main(String[] args) {
        int []arr={1,56,32,98,90,45,2};
        printArray(arr);
        System.out.println();
        sort(arr, arr.length);
        printArray(arr);
    }
    public static void  printArray(int []array){
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void sort(int []array, int size){
        for(int i=1; i<size; i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
    }
}
