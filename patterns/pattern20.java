

import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            for(int j =0;j<=(2*(n-i-1)) ;j++){
                System.out.print(" ");
            }
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0; i<n; i++){
            for(int j =0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j =0;j<=(2*i);j++){
                System.out.print(" ");
            }
            for(int j =0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }
}
