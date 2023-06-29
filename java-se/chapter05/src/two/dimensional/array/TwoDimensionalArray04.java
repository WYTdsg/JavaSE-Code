package two.dimensional.array;

public class TwoDimensionalArray04 {
    public static void main(String[] args) {
        int s = 0;
        int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}}; // 遍历该二维数组，并得到和
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                s += arr[i][j];
            }
        }
        System.out.println("s = " + s);
    }
}
