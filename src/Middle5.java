import java.util.Scanner;

public class Middle5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива от 1 до 10: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        System.out.println("Введите элементы массива построчно (через пробел): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i][i];
        }

        System.out.println("Сумма элементов главной диагонали: " + sum);
    }
}
