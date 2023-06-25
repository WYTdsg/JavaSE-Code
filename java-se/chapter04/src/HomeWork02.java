import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        // 输出一个整数判断在哪个范围。
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int n = myScanner.nextInt();
        if (n > 0) {
            System.out.println("正数");
        } else if (n < 0) {
            System.out.println("负数");
        } else  {
            System.out.println("0");
        }
    }
}
