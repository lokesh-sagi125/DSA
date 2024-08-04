

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        for(int i=0;i<(2*n-1) ;i++){
            for(int j=0;j<(2*n-1);j++){
               int m = Math.min(Math.min(i,j),Math.min((2*n-2-i),(2*n-2-j)));
               System.out.printf("%d ",n-m);
            }
            System.out.print("\n");
        }
        
    }
}

