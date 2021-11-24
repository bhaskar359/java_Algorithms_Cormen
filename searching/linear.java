class linear{
    public static int search(int arr[], int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int x = 2;
        int found = search(arr,x);
        if(found == -1){
            System.out.println("The element is NOT FOUND!");
        }
        else{
            System.out.println("The element is found at " +(found+1)+ " position.");
        }
    }
}