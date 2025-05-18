import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов ряда Фибоначчи (N): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Количество элементов должно быть больше 0.");
        } else {
            int first = 0, second = 1;
            System.out.println("Ряд Фибоначчи из " + n + " элементов:");
            for (int i = 1; i <= n; i++) {
                if (i == 1) {
                    System.out.println(first + " ");
                } else if (i == 2) {
                    System.out.println(second + " ");
                } else {
                    int next = first + second;
                    System.out.println(next + " ");
                    first = second;
                    second = next;
                }
            }
        }
    }
}
