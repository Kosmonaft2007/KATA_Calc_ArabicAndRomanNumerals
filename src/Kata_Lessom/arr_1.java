package Kata_Lessom;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Arrays;

public class arr_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
        int a = 3;
        int b = 8;
        int k = 0;
        int[] result = new int[k];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= a && arr[i] >= b) {
                result[k] = arr[i];
                System.out.print(result);
            }

        }



    }

//        static int[] mett () {
//            int[] array = {1,2,3,4,5,6,7};
//            int n1 =6;
//            int n2 = 3;
//
//            int startIndex = java.util.Arrays.binarySearch(array, Math.min(n1, n2));
//            if (startIndex < 0) startIndex = -startIndex - 1;
//            int finishIndex = Arrays.binarySearch(array, startIndex, array.length, Math.max(n1, n2));
//            if (finishIndex < 0) finishIndex = -finishIndex - 2;
//            int[] result = new int[finishIndex - startIndex + 1];
//            System.arraycopy(array, startIndex, result, 0, result.length);
//            return result;
//        }
}

