package Tasks;

public class task9 {
    public static void main(String[] args) {
        int []numbers={4,4,5,12,6,7,12,7,1,1,2,2,3};
        String duplicates="";
        for(int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]==numbers[j]){
                    duplicates+=numbers[i];
                            break;
                }
            }
            if(!duplicates.contains(numbers[i]+"")){
                System.out.println(numbers[i]+ " is unique numbers");
            }



        }
    }
}
