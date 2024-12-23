import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création d'un tableau pour stocker 5 nombres entiers
        int[] numbers = new int[5];

        // Lecture des 5 nombres entiers saisis par l'utilisateur
        System.out.println("Veuillez entrer 5 nombres entiers :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Affichage des nombres dans l'ordre inverse
        System.out.println("\nLes nombres dans l'ordre inverse sont :");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Pas besoin de scanner.close(), car System.in reste ouvert pour d'autres saisies
    }
}
