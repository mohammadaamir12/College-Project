import java.util.*;

class array {

    public static void main(String args []) {
        Scanner sc=new Scanner (System.in);
        int i;
        int j;
        int row=sc.nextInt();
        int col=sc.nextInt();
        int array[][]=new int[row][col];

        for( i=0;i<row;i++){
         for( j=0;j<col;j++){
             array[i][j]=sc.nextInt();
         }
        }

         for( i=0;i<row;i++){
            for( j=0;j<col;j++){
                System.out.println(array[i][j] + " ");
            }
           System.out.println();
        }
    }
    
}
