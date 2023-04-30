import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        num = input.nextDouble();

        for (double i = 1; i <= num; i++) {
            total = total + (1 / i);
        }
        System.out.println(total);
    }
}