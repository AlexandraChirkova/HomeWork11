import java.util.Scanner;

public class Task2 {
    public static double divide(double x, double y) throws IllegalArgumentException {
        if (y == 0) {
            throw new IllegalArgumentException("Ошибка: деление на ноль невозможно. Убедитесь, что общий возможный балл больше 0.");
        }
        return x / y;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число (x): ");
            double x = scanner.nextDouble();

            System.out.print("Введите второе число (y): ");
            double y = scanner.nextDouble();

            double result = divide(x, y);
            System.out.println("Результат: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
