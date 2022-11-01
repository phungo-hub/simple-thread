public class NumberGenerator implements Runnable {

    private int genNum;
    public NumberGenerator(int genNum) {
        this.genNum = genNum;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + " from generator " + genNum);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(hashCode());
    }
}
