public class Main {

    public static void main(String[] args) throws InterruptedException {
        // While Loop
        System.out.println("While Loop Output:");
        int count = 0;
        while (count < 5) {
            System.out.println("I love Java");
            count++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop Output:");
        count = 0;
        do {
            System.out.println("I love Java");
            count++;
        } while (count < 5);

        // For Loop
        System.out.println("\nFor Loop Countdown:");
        for (count = 10; count > 0; count--) {
            System.out.println(count);
            Thread.sleep(1000); // Pause for 1 second
        }
        System.out.println("Launch!");
    }
}
