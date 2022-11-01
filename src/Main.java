public class Main {
    public static void main(String[] args) {
        int MIN_PRIORITY = 1;
        int MAX_PRIORITY = 10;
        NumberGenerator numberGenerator1 = new NumberGenerator(1);
        NumberGenerator numberGenerator2 = new NumberGenerator(2);

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);

        thread1.setPriority(MAX_PRIORITY);
        thread2.setPriority(MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
