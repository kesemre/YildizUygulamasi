import java.util.Scanner;

public class YıldızUygulamsı {
    public static void main(String[] args) {
        int n;
        // deneme
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 1;i<=n; i++){
            for (int j = n-i; j>=1 ; j--){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i=1;i<n;i++){
            for(int k =0 ;k<i;k++){
                System.out.print(" ");
            }
            for (int j=1;j<2*(n-i);j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}