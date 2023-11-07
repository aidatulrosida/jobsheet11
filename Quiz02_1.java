import java.util.Scanner;
import java.util.Random;
public class Quiz02_1 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = sc02.nextInt();
                sc02.nextLine();

                if (answer < number) {
                    System.out.println("Angka yang Anda tebak lebih kecil dari jawaban.");
                } else if (answer > number) {
                    System.out.println("Angka yang Anda tebak lebih besar dari jawaban.");
                } else {
                    success = true;
                }
            } while (!success);

            System.out.print("Apakah anda ingin mengulang permainan (Y/y)? ");
            menu = sc02.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
