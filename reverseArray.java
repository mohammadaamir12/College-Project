import java.util.Scanner;



public class reverseArray {

    public static void revarr(int arr[],int n){
        for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
        
    }
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		revarr(arr,n);
    }

    
}
