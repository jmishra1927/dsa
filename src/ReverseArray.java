public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[7];
        for(int i =0; i< arr.length; i++){
            arr[i] = i*i*i;
        }
        Util.printArr(arr);
        reverse(arr, 0, arr.length-1);
        System.out.println("Reversed array is....");
        Util.printArr(arr);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
