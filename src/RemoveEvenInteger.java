public class RemoveEvenInteger {
    public static void printArr(int[] arr) {
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println("\nArray length is: "+arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1,4, 5,67, 66,22, 23, 10};
        printArr(arr);
        int[] oddArr = removeEven(arr);
        printArr(oddArr);
    }

    private static int[] removeEven(int[] arr) {
        int oddCount = 0;
        int len = arr.length;
        for(int i =0 ; i< len; i++){
            if(arr[i]%2 != 0 ){
                oddCount++;
            }
        }
        System.out.println(oddCount);
        int[] oddArr = new int[oddCount];
        int index = 0;
        for(int e: arr){
            if(e%2 != 0){
                oddArr[index] = e;
                index++;
            }
        }
        return oddArr;
    }
}
