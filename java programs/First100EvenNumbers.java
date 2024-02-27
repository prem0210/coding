public class First100EvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("First 100 even numbers:");
        for (int i = 2; count < 100; i += 2) {
            System.out.println(i);
            count++;
        }
    }
}
