package JavaInterviewCodingTasksAndSolutions;

public class sumOfDigits{

    public static int sumOfDigits ( String s){
        int total = 0;
        char [] ch = s.toCharArray();

        for( char each : ch){
            if(Character.isDigit(each)){
                total += Integer.valueOf(""+each);
            }
        }

        return total;


    }

}

/*
int result = 0;

        if(num >= 1){

            for(int i = 1 ; i <= num; i++ ){ // used for calculting the sum and add them into result
                result += i;
            }

            System.out.println("result = " + result);

        }else{
            System.err.println("Invalid Entry");
        }


    }

}

 */
