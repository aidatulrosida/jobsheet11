import java.util.Scanner;
public class Square02_2 {
    public static void main(String[] args) {

        Scanner sc02 = new Scanner(System.in);
        System.out.print("Masukkan nilai N= ");
        int N = sc02.nextInt();
        for(int iOuter=1; iOuter<=N; iOuter++) {
            for(int i=0; i<=N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
}

