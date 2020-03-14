public class SelectionSort {
    public static void main(String[] args) {
        int []array={12,54,65,9,78,90,32};
        printArray(array);
        System.out.println();
        sort(array);
        printArray(array);
    }
    public static void printArray(int []array){
        for(int e : array){
            System.out.print(e+" ");
        }
    }
    public static void sort(int []array){
        int size=array.length;
        for(int i=0; i<size-1; i++){
            int min=i;
            for(int j=i+1; j<size; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
             int temp;
             temp=array[min];
             array[min]=array[i];
             array[i]=temp;
        }
    }
}
