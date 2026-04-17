import java.util.Scanner;

public class FindPalindromicWords {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println("\"" + word + "\" bir palindromik kelimedir.");
        } else {
            System.out.println("\"" + word + "\" bir palindromik kelime degildir.");
        }

        input.close();
    }
}
