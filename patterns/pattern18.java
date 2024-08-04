import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        
        for(int i=0;i<n ;i++){
            for(int j=i;j>=0;j--){
               char k = (char)(n-j+64);
                System.out.printf("%c",k);
            }
            System.out.print("\n");

        }
    }
}
