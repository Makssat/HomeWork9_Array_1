package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String [] names={"Liam","Emma","Noah","Olivia","William"};
        System.out.println(Arrays.toString(names));
        System.out.println("Please enter a string");
        String updateName= scan.nextLine();
        System.out.println("Please enter  a index number");
        int index= scan.nextInt();
        for(int i=0;i<names.length;i++){
            if(index==i){
                names[i]=updateName;
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
