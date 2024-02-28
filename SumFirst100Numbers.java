public class SumFirst100Numbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Total of the first 100 numbers: " + sum);
    }
}
