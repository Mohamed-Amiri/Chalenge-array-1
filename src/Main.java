import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] numbers = new int[5];

        System.out.println("Veuillez entrer 5 nombres entiers :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nLes nombres dans l'ordre inverse sont :");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        
    }
}
