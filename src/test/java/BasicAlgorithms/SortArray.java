package BasicAlgorithms;

public class SortArray {

    public static void main(String[] args){
        int arr[] ={78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

        int n = arr.length;
        int temp ;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){ //depending our condition, we can sort desc or asc
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
