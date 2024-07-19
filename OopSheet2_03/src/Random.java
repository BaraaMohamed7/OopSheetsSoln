public class Random {
    private int seed = 1000;

    public void nextInt(int num) {
        if (num == 100) {
            int random = (int)(Math.random() * 50);
            System.out.println(random);
        }
    }
}
