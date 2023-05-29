import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Типо количества чисел
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        // Массив
        int[] numbers = new int[n];

        // Ввод чисел
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // а) Найти сумму, количество и среднее значение среди чисел, которые не делятся на 5
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 5 != 0) {
                sum += num;
                count++;
            }
        }
        double average = (double) sum / count;

        System.out.println("Сумма чисел, не делящихся на 5: " + sum);
        System.out.println("Количество чисел, не делящихся на 5: " + count);
        System.out.println("Среднее значение чисел, не делящихся на 5: " + average);

        // б) Найти среди отрицательных чисел, которые не делятся на 5, минимальное и максимальное значения
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0 && numbers[i] % 5 != 0) {
                if (numbers[i] < min) {
                    min = numbers[i];
                    minIndex = i;
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                    maxIndex = i;
                }
            }
        }

        // Короче чтоб поменять местами минимальное и максимальное значения
        if (minIndex != -1 && maxIndex != -1) {
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[maxIndex];
            numbers[maxIndex] = temp;
        }

        // Вывод массива после обмена значениями
        System.out.println("Массив после обмена минимального и максимального значения:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
// ну типо всё
