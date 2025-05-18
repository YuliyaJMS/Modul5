import java.util.Scanner;

public class Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100: ");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}