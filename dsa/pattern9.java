import java.util.Scanner;

public class pattern9{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=((2*i)+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("\n");


        }
        for (int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int j=((2*(n-i-1))+1);j>0;j--){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println("\n");


        }

    }
}
