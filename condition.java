import java.util.*;

public class condition {
    public static void main(String args []){
        Scanner in =new Scanner(System.in);
        int age=in.nextInt();

        if(age<=18){
            System.out.println("Not Adult");
        }
        else{
            System.out.println("Adult");
        }
    }
}
