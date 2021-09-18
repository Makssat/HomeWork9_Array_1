package Tasks;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        int numbers[]={23,43,2,3,436,67};
        System.out.println(Arrays.toString(numbers));
        for(int i=0;i<numbers.length;i++){
            numbers[i]=numbers[i]*numbers[i];
        }

        System.out.println("This is square of int"+Arrays.toString(numbers));
    }
}
