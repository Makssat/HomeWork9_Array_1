package Tasks;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int [] numbers={3,2,8,9,1,5,4,3,7,8,5,9,9};

        int highest=0;
        int secondHighest=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++) {
                if(numbers[i]==numbers[j]) {
                    numbers[i]=0;

                }}

                    if (numbers[i] > highest) {
                        secondHighest = highest;
                        highest = numbers[i];
                    } else if (numbers[i] > secondHighest) {
                        secondHighest = numbers[i];
                    }



        }
        System.out.println(highest);
        System.out.println(secondHighest);
        ////////////////////////////////////////////


        }





    }

