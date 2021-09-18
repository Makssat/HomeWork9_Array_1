package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] numbers=new int[10];
        int numberLength=numbers.length;
        for (int i=0;i<numbers.length;i++){
            if(i<=10) {
                System.out.println("You have " + numberLength + " spaces");
                System.out.println("Please enter a int number:");
                int entered= scan.nextInt();
                numbers[i]=entered;
                numberLength--;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
