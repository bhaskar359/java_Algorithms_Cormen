import java.util.Arrays;
class Merging {

    static int[] merge(int[] arr, int[] Left, int[] Right){
        int i = 0, j = 0,k = 0, nL = Left.length, nR = Right.length;
        while(i < nL && j < nR){
            if(Left[i] <= Right[j]){
                arr[k] = Left[i];
                i++;
            }
            else{
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while(i < nL){
            arr[k] = Left[i];
            i++;k++;
        }
        while(j < nR){
            arr[k] = Right[j];
            j++;k++;
        }
        return arr;
    }

    static String mergeSort(int arr[]){
        int n = arr.length;
        if(n< 2)
            return Arrays.toString(arr);
        int mid = n/2;
        int[] Left = new int[mid];
        int[] Right = new int[n - mid];
        for(int i = 0; i<mid; i++){
            Left[i] = arr[i];
        }
        for(int j = mid; j < n; j++){
            Right[j-mid] = arr[j];
        }
        mergeSort(Left);
        mergeSort(Right);
        merge(arr,Left,Right);
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6,10,7,9,8};
        System.out.println(mergeSort(arr));
    }
}