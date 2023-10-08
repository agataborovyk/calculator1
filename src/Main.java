import java.util.Scanner;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        boolean isRun = true;
//        while (isRun) {
//
//
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");

        int a = sc.nextInt();
        System.out.println("Введите операцию( +, -, *, /)");
        char operation = sc.next().charAt(0);
        System.out.println("Введите второе число");
        int b = sc.nextInt();


        if (operation == '+') {
            int result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        } else if (operation == '-') {
            int result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        } else if (operation == '*') {
            int result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        } else if (operation == '/') {
            int result = a / b;
            System.out.println(a + "/" + b + "=" + result);
        } else {
            System.out.println("Операция не удалась");
        }
    }
}

