public class ArrayMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {1,5,2,4,3,6,8,9,10};
        int missing = findMissingNum(arr);
        System.out.println("Missing number is "+missing);
    }

    private static int findMissingNum(int[] arr) {
        int range = arr.length +1;
        int sumOfElement = range * (range + 1) / 2;
        System.out.println("Sum of Element: "+sumOfElement);
        for(int num: arr){
            sumOfElement = sumOfElement - num;
        }
        return sumOfElement;
    }
}
