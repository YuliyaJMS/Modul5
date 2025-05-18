public class Middle1 {
    public static void main(String[] args) {
        //Задан массив целочисленных чисел, вывести сумму всех чисел массива.
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех чисел массива: " + sum);
    }
}