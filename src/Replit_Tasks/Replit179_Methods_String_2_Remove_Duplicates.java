package Replit_Tasks;

public class Replit179_Methods_String_2_Remove_Duplicates {
    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below

        String word = "";
        for (int i =0; i<str.length();i++){
            if (!word.contains(str.charAt(i)+""))word+=str.charAt(i);
        }
        return word;

    }
}

/*
String nonDup = "";

    for(String each : str.split("")){
      if(!nonDup.contains(each)){
        nonDup += each;
      }
    }
    return nonDup;
  }
 */