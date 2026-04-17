import java.util.Scanner;

public class MakeTriangleWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();

        // Triangle (top half)
        System.out.println("Ucgen:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++) System.out.print("*");
            System.out.println();
        }

        // Homework: Diamond shape
        System.out.println("Elmas:");
        // Top half
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++) System.out.print("*");
            System.out.println();
        }
        // Bottom half
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < (n - i); j++) System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++) System.out.print("*");
            System.out.println();
        }

        input.close();
    }
}
