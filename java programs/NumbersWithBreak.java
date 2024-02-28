public class NumbersWithBreak {
    public static void main(String[] args) {
        System.out.println("Printing numbers 1 to 4 using break:");
        for (int i = 1; i <= 10; i++) {
            if (i > 4) {
                break;
            }
            System.out.println(i);
        }
    }
}
