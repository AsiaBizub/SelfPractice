package Replit_Tasks;

public class Replit180_Methods_With_Strings_3_Cover {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        if(!main.contains(coverME)){
            return "[" + main + "]";
        }

        return main.replaceAll(coverME,"[" + coverME + "]");


    }

}