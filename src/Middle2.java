import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива (от 1 до 100):");
        int size = scanner.nextInt();
        if (size < 1 || size > 100) {
            System.out.println("Некорректный размер массива. Размер должен быть от 1 до 100.");
            return;
        }
        double[] numbers = new double[size];
        System.out.println("Введите " + size + " вещественных чисел:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }
        //double maxAbs = Math.abs(numbers[0]);
        double maxAbs = 0;
        //double maxElement = numbers[0];
        for (int i = 1; i < size; i++) {
            double absValue = Math.abs(numbers[i]);
            if (absValue > maxAbs) {
             // maxAbs = absValue;
                maxAbs = Math.max(Math.abs(numbers[i]), maxAbs);
                //maxElement = numbers[i];
            }
        }
        System.out.println("Результат: " + maxAbs);
    }
}