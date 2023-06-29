package array;

import java.util.Scanner;

/**
 * 顺序查找
 */
public class SeqSearch {
    public static void main(String[] args) {
        /*
        有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：
        从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】
        要求: 如果找到了，就提示找到，并给出下标值
        */

        // 方法一
//        Scanner myScanner = new Scanner(System.in);
//        String arr[] = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
//
//        System.out.println("请输入一个名称");
//        String str = myScanner.next();
//        int i = 0;
//        for (i = 0; i < arr.length; i++) {
//            if (arr[i].equals(str)) {
//                System.out.println("找到了" + str + "下标为：" + i);
//                break;
//            }
//        }
//        if (i == arr.length) {
//            System.out.println("没找到...");
//        }

        Scanner myScanner = new Scanner(System.in);
        String arr[] = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};

        System.out.println("请输入一个名称");
        String str = myScanner.next();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                index = i;              // 如果进入了if语句块，说明找到了，否则反之
                System.out.println("找到了" + str + "下标为：" + i);
                break;
            }
        }
        if (-1 == index) {
            System.out.println("sorry,没找到...");
        }
    }
}
