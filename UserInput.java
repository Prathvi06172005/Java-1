import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter end: ");
        int end = scanner.nextInt();
        scanner.close();

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}


