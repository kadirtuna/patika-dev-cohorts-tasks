import java.util.Scanner;

public class FindArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = input.nextInt();

        int digitCount = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        int result = 0;
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digitCount; i++) {
                power *= digit;
            }
            result += power;
            temp /= 10;
        }

        if (result == number) {
            System.out.println(number + " bir Armstrong sayisidir.");
        } else {
            System.out.println(number + " bir Armstrong sayisi degildir.");
        }

        // Homework: sum of digits
        int digitSum = 0;
        temp = number;
        while (temp != 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        System.out.println(number + " sayisinin basamak toplami: " + digitSum);

        input.close();
    }
}
