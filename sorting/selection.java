import java.util.*;
class selection{
	public static void main(String[] args) {
		int[] arr = {1,10,2,9,3,8,4,7,5,6};
		for (int i = 0; i < arr.length ; i++) {
			int min = i;
			boolean swap = false;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
					swap = true;
				}
			}
			if(swap == false){
				continue;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
	}
}