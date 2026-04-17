import java.util.Scanner;

public class PolindromNumbers {
    static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayisidir.");
        } else {
            System.out.println(number + " bir palindrom sayisi degildir.");
        }

        input.close();
    }
}
