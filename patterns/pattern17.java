import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.err.print("n:");
      int n= sc.nextInt();
            for(int i=0;i<n;i++){
                
                for (int j=1;j<n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i+1;j++){
                   char k = (char) (j+64);
                    System.out.printf("%c",k);
                }
                for(int j=i;j>0;j--){
                    char k = (char) (j+64);
                    System.out.printf("%c",k);
                }
                for (int j=1;j<n-i;j++){
                    System.out.print(" ");
                }
                System.out.println("\n");
            }
        
    }
}
