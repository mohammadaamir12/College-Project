import java.util.*;
public class javaa {
    public static void main (String[] args) {
        
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=1;l<=i-1;l++)
            {
                System.out.print(i-l);
                
            }
            System.out.println();
        }
       
	}
    
    }
         
    

    

