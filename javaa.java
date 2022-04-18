import java.util.*;

public class javaa {
    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int l=Largest(arr);
        for(int i=0;i<l.size;i++)
        {
            System.out.println(l);
        }
    }
    
	{
	    int max=Integer.MIN_VALUE;
	    for(int  i=0;i<arr.length;i++)
	{
	   if(arr[i]>max){
	       max=arr[i];
	   }
	}
	return max;
	
    

    
    
    }
         
    

    

