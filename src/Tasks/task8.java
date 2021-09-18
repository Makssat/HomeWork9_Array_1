package Tasks;

public class task8 {
    public static void main(String[] args) {
    int numbers[]={1,1,2,2,3,4,4};

    String duplicates="";

    for(int i=0;i<numbers.length;i++){


       INNER: for(int j=i+1;j<numbers.length;j++) {
            if (numbers[i]==numbers[j]){

                duplicates+=numbers[i];
                break INNER;
            }

            }
            if (!duplicates.contains(numbers[i]+"")){
                System.out.println(numbers[i]+" is a unique number");
            }

        }
    }

    }
