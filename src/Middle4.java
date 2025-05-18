import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала:: ");
        int f = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial = factorial * i;
            System.out.println("Факториал числа " + f + " равен: " + factorial);

        }
    }
}
