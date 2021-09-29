import java.util.*;
class selection{
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		for (int i = 1; i < arr.length ; i++) {
			int key = arr[i];
			int j = i-1;
			while (j > -1 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
				System.out.println(Arrays.toString(arr));
			}
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
	}
}