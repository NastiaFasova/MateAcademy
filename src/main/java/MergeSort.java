public class MergeSort {
 public static void main(String[] args) {
       int []arr={4, 67, 34, 12, 87, 76, 90, 124, 1 };
       print(arr,arr.length);
       sort(arr, 0, arr.length-1);
        System.out.println();
       print(arr, arr.length);
    }

    public static void print(int []array, int size){
        for(int i = 0; i < size; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void merge(int []array, int l, int m, int r){
        int size1=m-l+1;
        int size2=r-m;
        int []tempArray1=new int[size1];
        int []tempArray2=new int[size2];
        for (int i = 0; i<size1; i++){
            tempArray1[i]=array[l+i];
        }
        for (int i=0; i<size2; i++){
            tempArray2[i]=array[m+i+1];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<size1 && j<size2){
            if(tempArray1[i]<tempArray2[j]){
                array[k]=tempArray1[i];
                i++;
            } else{
                array[k]=tempArray2[j];
                j++;
            }
            k++;
        }
        while(i<size1){
            array[k]=tempArray1[i];
            i++;
            k++;
        }
        while(j<size2) {
            array[k] = tempArray2[j];
            j++;
            k++;
        }
    }

    public static void sort(int []array, int l, int r){
        if(l<r){
            int m = (l + r)/2;
            sort(array, l,m);
            sort(array,m+1, r);
            merge(array, l, m, r);
        }
    }
}
