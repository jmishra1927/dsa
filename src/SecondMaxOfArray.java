public class SecondMaxOfArray {

    public static void main(String[] args) {
        int[] arr = {15, 25, 14, 55, 37, 55, 31, 67};
        int secondMax = SecondMaxOfArray.findSecondMax(arr);
        System.out.println("Second max is : "+secondMax);
    }
    private static int findSecondMax(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Input array is null or its size is ZERO");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length; i++){
            int a = arr[i];
            if(a > max){
                secondMax = max;
                max = a;
            }else if(a < max && a > secondMax){
                secondMax = a;
            }
        }
        return secondMax;
    }
}
