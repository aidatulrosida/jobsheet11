import java.util.Random;
import java.util.Scanner;
public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        Random random = new Random(); 

        char menu='y'; 
        do{ 
                int number = random.nextInt(10) + 1; 
                boolean success = false; 
                do { 
                        System.out.print("Tebak angka (1-10): "); 
                        int answer = sc02.nextInt(); 
                        sc02.nextLine(); 
                        success = (answer == number); 
                } while(!success); 
                System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?"); 
                menu = sc02.nextLine().charAt(0); 
        } while(menu=='y' || menu=='Y');
    }
}