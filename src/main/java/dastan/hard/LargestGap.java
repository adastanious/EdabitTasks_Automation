package dastan.hard;

import java.util.Arrays;

public class LargestGap {

    public int largestGap(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int gap = arr[i+1] - arr[i];
            if (gap > max) {
                max = gap;
            }
        }
        return max;
    }

    // for edabit
    public int largestGap2(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            int gap = numbers[i+1] - numbers[i];
            if (gap > max) {
                max = gap;
            }
        }
        return max;
    }



    public static void main(String[] args) {
        LargestGap obj = new LargestGap();
        System.out.println(obj.largestGap(new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
        System.out.println(obj.largestGap2(new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
    }
}
