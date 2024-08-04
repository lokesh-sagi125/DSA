import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
       java.util.Scanner sc = new Scanner(System.in);
       System.out.println("n:");
       int n = sc.nextInt(); 

       for (int i=0;i<n;i++){
            for (int j=n-i;j!=0;j--){
            System.out.print("* \t");}
            System.out.println("\n");
        }
    }
    
}
