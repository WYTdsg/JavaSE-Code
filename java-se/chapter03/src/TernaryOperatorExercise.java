public class TernaryOperatorExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // 三个数求最大值
        int n = 10;
        int n2 = -10;
        int n3 = 100;

        int r = n > n2 ? n : n2;
        int max = r > n3 ? r : n3;
        System.out.println("max = "+max);

        // 一条语句实现
        int m = (n > n2 ? n : n2) > n3 ?(n > n2 ? n : n2) : n3;
        System.out.println("m = "+m);
    }
}
