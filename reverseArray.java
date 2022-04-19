import java.util.Scanner;



public class reverseArray {

    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int j=arr.length-1;j>=0;j--)
		{
		    System.out.print(arr[j]);
		}
    }

    
}
