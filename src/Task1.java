import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите вещественное число: ");
            double number = scanner.nextDouble();
            double sqrt = Math.sqrt(number);
            System.out.println("Квадратный корень: " + sqrt);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка. Убедитесь, что вы ввели корректное вещественное число.");
        }
    }
}
