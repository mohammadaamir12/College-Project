import java.util.*;
import java.util.Arrays;

public class ana() {
    public static void main(String [] args) {
         String a="hari";
         String b="hira";
        char[] c=a.toCharArray();
        char[] d=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
       
        Boolean result=Arrays.equals(c,d);
        if(result==true){
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
        
    }

    
}