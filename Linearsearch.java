import java.util.*;


public class linearsearch {
public static void main(String args []){
    int i=0;
 Scanner sc=new Scanner(System.in);
 int size=sc.nextInt();
 int x=sc.nextInt();
 int number[]=new int[size];
for( i=0;i<size;i++){
   number[i]=sc.nextInt();

}
for( i=0;i<size;i++){
    if(number[i]==x){
        System.out.println("found at index" + i);
    
    }
}
}

}
