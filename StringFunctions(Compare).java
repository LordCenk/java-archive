import java.util.*;
public class Solution{
   
   
    public static void main(String[] args) {
        String s1 = "Shashank";
        String s2 = "Shashank";
        String s3 = new String("Shashank");
        if(s1 == s2){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        if(s2 == s3){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}

o/p-Strings are equal
Strings are not equal
Explanation - Whenever new strings are declared then java takes them as different string and when we use == sign then also they are not equal
here a new Shashank was created


equals function only check the values
so now new code
import java.util.*;
public class revise{
   
   
    public static void main(String[] args) {
        String s1 = "Shashank";
        String s2 = "Shashank";
        String s3 = new String("Shashank");
        // if(s1 == s2){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }
        // if(s2 == s3){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");

        }
    }
}
