public class QuickSort {
    public static void main(String[] args) {
        int []array={32,67,13,76,34,98};
        printArray(array);
        sort(array,0,array.length-1);
        System.out.println();
        printArray(array);
    }

    public static void printArray(int []array){
        for (int e:array) {
            System.out.print(e+" ");
        }
    }

    public static int partitioning(int []array, int first, int last){
        int i=first-1;
        int key=array[last];
        for(int j=first; j<last; j++){
            if(array[j]<key){
                i++;
                int temp = array[j];
                array[j]=array[i];
                array[i]=temp;
            }
        }
        int temp=array[i+1];
        array[i+1]=array[last];
        array[last]=temp;

        return i+1;
    }

    public static void sort(int []array, int first, int last){
        if(first<last){
            int pi=partitioning(array,first,last);
            sort(array,first,pi-1);
            sort(array, pi+1, last);
        }
    }
}
