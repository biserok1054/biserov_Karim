import java.util.Scanner;

public class CalculatorV2 {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Введите каждую цифру по отдельности");
        a = scanner.nextInt();
        b = scanner.nextInt();
        char g = scanner.nextLine().charAt(0);
        int result;
        float result1;
        if (g == '+') {
            result = plus(a, b);
        }
        else if(g == '-'){
            result = minus(a, b);
        }
        else if(g == '*'){
            result = multiple(a, b);
        }
    }

    private static int multiple(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int plus(int a, int b) {
        return a + b;

    }


}
