package Tasks;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int numbers[]={2,3,6,8,5,9};
        for(int i=0;i<numbers.length;i++){
            for(int j=1;j<=10;j++){
                System.out.println(numbers[i]+"*"+j+"="+numbers[i]*j);

            }System.out.println("***************************");
        }
        System.out.println(Arrays.toString(numbers));
    }
}
