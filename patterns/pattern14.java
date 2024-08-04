import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.err.print("n:");
      int n= sc.nextInt();
            for(int i=0;i<n+1;i++){
                for(int j=1;j<=i;j++){
                    char k = (char)(j+64); 
                    System.out.printf("%c",k);
                    
                }
                System.out.println("");
            }
        
    }
}
