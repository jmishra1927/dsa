public class ResizeArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 56, 15};
        System.out.println(arr.length);
        arr = resizeArr(arr, arr.length * 2);
        System.out.println(arr.length);
    }

    private static int[] resizeArr(int[] arr, int newSize) {
        int[] temp = new int[newSize];
        for(int i=0; i< arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
}
