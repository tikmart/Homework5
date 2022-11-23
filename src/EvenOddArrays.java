import java.util.Arrays;

public class EvenOddArrays {
    public static void main(String[] args) {
        int[] arr = {12, 63, 54, 123, 84, 46, 95, 72, 99, 155, 256, 119, 221, 298};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }

        int[] evenArr = new int[even];
        int[] oddArr = new int[odd];


        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) evenArr[j++] = arr[i];
            else oddArr[k++] = arr[i];
            }
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));
        }


    }

