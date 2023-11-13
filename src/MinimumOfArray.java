public class MinimumOfArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 15, 25, 36, 48, 5, 6, 1, -20};
        MinimumOfArray.findMinimume(arr);
    }

    private static void findMinimume(int[] arr) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid input. Input array is null or blank");
        }
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum of given array is : "+min);
    }
}
