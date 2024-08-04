import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.err.print("n:");
      int n= sc.nextInt();
            for(int i=0;i<=n;i++){
                for(int j=0;j<=i;j++){
                    char k = (char)(i+65); 
                    System.out.printf("%c",k);
                    
                }
                System.out.println("");
            }
        
    }
}
