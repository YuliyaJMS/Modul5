import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int n = scanner.nextInt();
        if (n < 1 || n > 1000) {
            System.out.println("Некорректная длина массива. Длина должна быть от 1 до 1000.");
            return;
        }
        boolean[] flags = new boolean[1001];
        System.out.println("Введите элементы массива через пробел:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value >= 1 && value <= 1000) {
                flags[value] = true;
            }
        }
        System.out.println("Уникальные элементы:");
        for (int i = 1; i <= 1000; i++) {
            if (flags[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
