package array;

import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        Scanner myScanner = new Scanner(System.in);

        // do-while循环 先实现一次扩充
        do {
            int arrNew[] = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {      // 先拷贝
                arrNew[i] = arr[i];
            }
            System.out.println("请输入你要添加的元素");   // 再添加
            int addNum = myScanner.nextInt();
            arrNew[arrNew.length - 1] = addNum;
            arr = arrNew;

            System.out.println("====扩容情况====");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("是否继续<y|n>");
            char key = myScanner.next().charAt(0);
            if ('n' == key) {                       // 如果是'n'直接退出do-while
                break;
            }

        } while (true);

        System.out.println("你退出了添加...");
    }

}
