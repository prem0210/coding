public class EvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Even numbers:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
            count++;
        }
        System.out.println("Count of even numbers: " + count);
    }
}
