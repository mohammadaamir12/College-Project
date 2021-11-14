import java.util.Scanner;

public class average{

  public static int Average(int a,int b,int c){
     int avg=(a+b+c)/3;
     return avg;
  }  
public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter three number");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt(); 
   int d=Average(a,b,c);
 System.out.println(d);
}



}