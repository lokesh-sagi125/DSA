import java.util.Scanner;

public class pattern13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.print("n:");
    int n = sc.nextInt();
    int k=1;
    for (int i=0;i<n;i++){
    for(int j=0;j<=i;j++){
        System.out.printf("%d \t",k);
        k++;
    }
    System.out.println("\n");
  }  
}
}