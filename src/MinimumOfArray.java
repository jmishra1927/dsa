public class MinimumOfArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 15, 25, 36, 48, 5, 6, 1, -20};
        MinimumOfArray.minOfArray(arr);
    }

    private static void minOfArray(int[] arr) {
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum of given array is : "+min);
    }
}
