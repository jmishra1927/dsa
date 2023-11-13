public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {8, 1, 0, 2, 1, 0, 3, 5, 8, 0, 9};
        Util.printArr(arr);
        MoveZerosToEnd.moveZero(arr);
        System.out.println("\n==============");
        Util.printArr(arr);
    }

    private static void moveZero(int[] arr){
        int len = arr.length;
        int j =0;
        for(int i=0; i< len; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
}
