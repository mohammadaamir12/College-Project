public class dsa-1largestandsmallest {
    public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int max=0,min=0;
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
        
	}
	    if(n==1){
	        max=a[0];
	        min=a[0];
	    }
	    else{
	        if(a[0]>a[1]){
	            max=a[0];
	            min=a[1];
	        }
	        else{
	            max=a[1];
	            min=a[0];
	        }
	        
	        for(int j=2;j<n;j++){
	            if(a[j]>max){
	                max=a[j];
	            }
	            if(a[j]<min){
	                min=a[j];
	            }
	        }
	    }
	    System.out.println(max);
	    System.out.println(min);
	
	}
}
