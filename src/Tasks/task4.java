package Tasks;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 8, 9, 1, 5, 4, 3, 7, 8, 5, 9, 9};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //[1, 2, 3, 3, 4, 5, 5, 7, 8, 8, 9, 9, 9]
        int i,j;

        for (i = numbers.length - 1; i > 0; i--) {

            for (j = numbers.length - 2; j > 0; j--) {

                if (numbers[i] != numbers[j]) {

                    System.out.println(numbers[j] +" Is second largest number");
                    break;

                }
            }
            break;


        }
    }
}








