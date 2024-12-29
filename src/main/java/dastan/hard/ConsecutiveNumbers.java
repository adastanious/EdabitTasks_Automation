package dastan.hard;

import java.util.Arrays;

public class ConsecutiveNumbers {
    public boolean cons(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                return false;
            }
            if (arr[i] + 1 < arr[i+1]) {
                return false;
            }
        }
        return true;
    }

}
