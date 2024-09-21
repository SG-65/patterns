import java.util.*;
public class ptrn_advance_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            //space
            for(int k=1;k<=(2*(n-i));k++){
                System.out.print(" ");
            }
            //starts
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            //space
            for(int k=1;k<=(2*(n-i));k++){
                System.out.print(" ");
            }
            //starts
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}