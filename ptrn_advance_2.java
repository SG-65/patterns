import java.util.*;

public class ptrn_advance_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
           for(int j=1;j<=(n-i);j++){
             System.out.print(" ");
           }
           for(int k=1;k<=5;k++){
             System.out.print("*");
           }
           System.out.println();
        }
        sc.close();
    }
}
