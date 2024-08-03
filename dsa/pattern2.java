import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
       java.util.Scanner sc = new Scanner(System.in);
       System.out.println("n:");
       int n = sc.nextInt(); 

       for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++)
            System.out.print("* \t");
            System.out.println("\n");
        }
    }
}
