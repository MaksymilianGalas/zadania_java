package zad7;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = {8, 9};

        int sum = sumArrays(new int[][] {arr1, arr2, arr3});
        System.out.println(sum);
    }


    public static int sumArrays(int[][] arrays) {
        int sum = 0;
        for(int[] arr : arrays) {
            for(int i : arr) {
                sum += i;
            }
        }
        return sum;
    }

}
