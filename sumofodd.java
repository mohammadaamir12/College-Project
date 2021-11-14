import java.util.Scanner;

public class sumofodd {

    public static int Odd(int a){
  int b=1;
        for(int i=a;i>0;i--){
            if(i%2==1){
             b=b+i;
            }
        }
        return b;
    }
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();

    int c=Odd(a);
    System.out.println(c);
    }
}
