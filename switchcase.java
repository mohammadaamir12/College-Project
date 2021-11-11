import java.util.Scanner;

 class switchcase {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int a = in.nextInt(); 
        switch (a) {
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("bonjour");
            break;
            default: System.out.println("invalid");
            break;
        }
    }
}
