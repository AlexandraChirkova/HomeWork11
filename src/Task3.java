import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        String input = scanner.nextLine();
        String[] str = input.split(" ");
        int sum = 0;

        for (String part : str) {
            try {
                int number = Integer.parseInt(part);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Пропускаем: '" + part + "' (не целое число)");
            }
        }

        System.out.println("Сумма целых чисел в строке равна " + sum);
    }
}
