package Tasks;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        double[] fahrenheit ={70,32,90,53,6,102};
        double [] celcius=fahrenheit;
        for(int i=0;i<fahrenheit.length;i++){
          fahrenheit[i]= (fahrenheit[i]-32)*5/9;

        }
        System.out.println(Arrays.toString(celcius));
    }
}
