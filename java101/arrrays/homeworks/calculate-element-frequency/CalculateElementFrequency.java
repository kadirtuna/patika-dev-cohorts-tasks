public class CalculateElementFrequency {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] counted = new boolean[numbers.length];

        System.out.println("Tekrar Sayilari:");
        for (int i = 0; i < numbers.length; i++) {
            if (counted[i]) continue;
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(numbers[i] + " sayisi " + count + " kere tekrar edildi.");
        }
    }
}
