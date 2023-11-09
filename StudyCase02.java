import java.util.Scanner;
public class StudyCase02 {
    public static void main (String[] args) {
        Scanner sc02 = new Scanner (System.in);
        int size = 5; 

        for (int i = 1; i <= size; i++) {
            
            for (int j = 1; j <= size; j++) {
               
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}