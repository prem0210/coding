public class OddNumbers {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
            count++;
        }
        System.out.println("Count of odd numbers: " + count);
    }
}
