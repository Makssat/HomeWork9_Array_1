package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]={10,4,3,55,32,145,443,234,98,32};
        System.out.println(Arrays.toString(arr));
        System.out.println("Which one would you like to remove?");
        int entered=scan.nextInt();
        System.out.println();

            for (int i = 0;i<arr.length;i++) {
                if (arr[i]==entered) {
                    arr[i]=0;
                }

            }
            System.out.println(Arrays.toString(arr));

    }
}
