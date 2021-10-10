import java.util.Arrays;
class bubble {
    static void sort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
                System.out.println(Arrays.toString(arr));
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}