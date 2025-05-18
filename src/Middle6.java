
import java.util.Random;
import java.util.Scanner;

public class Middle6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int examplesCount = 5;

        for (int i = 0; i < examplesCount; i++) {
            int a = random.nextInt(10) + 1;
            int b = random.nextInt(10) + 1;
            int correctAnswer = a * b;
            System.out.print("Решите пример: " + a + " * " + b + " = ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswer) {
                System.out.println("Ответ верный!");
            } else {
                System.out.println("Ответ неверный. " + a + " * " + b + " = " + correctAnswer);
            }
        }
    }
}
