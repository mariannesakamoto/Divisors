import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro positivo: ");
        int number = scanner.nextInt();
        
        System.out.print("Divisores de " + number + ": ");
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}