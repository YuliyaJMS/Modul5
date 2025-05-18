import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива (от 1 до 100):");
        int N = scanner.nextInt();
        if (N < 1 || N > 100) {
            System.out.println("Некорректный размер массива. Размер должен быть от 1 до 100.");
            return;
        }
        double[] numbers = new double[N];
        System.out.println("Введите " + N + " вещественных чисел:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextDouble();
        }
        double maxAbs = Math.abs(numbers[0]);
        double maxElement = numbers[0];
        for (int i = 1; i < N; i++) {
            double absValue = Math.abs(numbers[i]);
            if (absValue > maxAbs) {
                maxAbs = absValue;
                maxElement = numbers[i];
            }
        }
        System.out.println("Результат: " + maxElement);
    }
}