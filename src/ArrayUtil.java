public class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.defaultArr();
        arrayUtil.initalizedArr();
    }

    public void printArr(int[] arr){
        System.out.println("Array length is "+arr.length);
        for(int element: arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    private void defaultArr(){
        int[] arr = new int[5];
        printArr(arr);
    }

    private void initalizedArr(){
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 5;
        arr[2] = 4;
        arr[3] = 9;
        arr[4] = 98;
        printArr(arr);
        arr[4] = 76;
        printArr(arr);
        //arr[5] = 21;  // This line will throw ArrayIndexOutOfBoundException
        int[] arr2 = {3, 4, 6, 7,85,32};
        printArr(arr2);
    }
}
