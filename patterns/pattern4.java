import java.util.Scanner;

public class pattern4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.print("n:");
    int n = sc.nextInt();
    for (int i=0;i<n;i++){
    for(int j=0;j<=i;j++){
        System.out.printf("%d \t",i+1);
    }
    System.out.println("\n");
  }  
}
}