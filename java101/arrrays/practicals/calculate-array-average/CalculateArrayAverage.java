public class CalculateArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Regular average
        int sum = 0;
        for (int n : numbers) sum += n;
        System.out.println("Aritmetik Ortalama: " + (double) sum / numbers.length);

        // Homework: Harmonic average
        double harmonicSum = 0;
        for (int n : numbers) harmonicSum += 1.0 / n;
        double harmonicAverage = numbers.length / harmonicSum;
        System.out.println("Harmonik Ortalama: " + harmonicAverage);
    }
}
