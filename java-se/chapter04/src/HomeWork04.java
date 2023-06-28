import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        // 水仙花数
        System.out.println("输入3位数判断是否为水仙花数：");
        Scanner myScanner = new Scanner(System.in);
        int flower = myScanner.nextInt();

        int ge = flower % 10;
        int shi = flower % 100 / 10;
        int bai = flower / 100;

        int s = ge * ge * ge + shi * shi * shi + bai * bai * bai;

        if (s == flower) {
            System.out.println("该数是水仙花数");
        } else {
            System.out.println("不是水仙花数");
        }

    }
}
