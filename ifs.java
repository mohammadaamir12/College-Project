import java.util.*;
import java.lang.*;
import java.io.*;

 class ifs {

	public static void main(String[] args) throws java.lang.Exception {

	{
	   int n;  
Scanner sc=new Scanner(System.in);  
n=sc.nextInt();  
int[] array = new int[10];  
for(int i=0; i<n; i++)  
{  
array[i]=sc.nextInt();  
}  

int l=Largest(array);
int s=Smallest(array);
System.out.println(l);
System.out.println( s);

}


public static int Largest(int array[])
{

int max=Integer.MIN_VALUE;

 for(int  i=0;i<array.length;i++)
	{
	   if(array[i]>max){
	       max=array[i];
	   }
	}
	

  return max;  

}  
public static int Smallest(int array[])   {
   int min=Integer.MAX_VALUE;
  for(int  j=0;j<array.length;j++)
	{
	 if(array[j]<min){
	     min=array[j];
	  }
	}
	return min;
}     
	
}
