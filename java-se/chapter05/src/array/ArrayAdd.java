package array;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
//        要求：实现动态的给数组添加元素效果，实现对数组扩容。
//        1.原始数组使用静态分配 int[] arr = {1,2,3}
//        2.增加的元素
//        3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
        //4，直接放在数组的最后 arr = {1,2,3,4}

//        1. 定义初始数组 int[] arr = {1,2,3}//下标 0-2
//        2. 定义一个新的数组 int[] arrNew = new int[arr.length+1];
//        3. 遍历 arr 数组，依次将 arr 的元素拷贝到 arrNew 数组
//        4. 将 4 赋给 arrNew[arrNew.length - 1] = 4;把 4 赋给 arrNew 最后一个元素
//        5. 让 arr 指向 arrNew ; arr = arrNew; 那么 原来 arr 数组就被销毁
//        6. 创建一个 Scanner 可以接受用户输入
//        7. 因为用户什么时候退出，不确定，老师使用 do-while + break 来控制
//*/

        int arr[] = {1, 2, 3};
        Scanner myScanner = new Scanner(System.in);
        while(true){
            System.out.println("当前数组内容:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n是否继续添加元素<y|n>?");

            char ch = myScanner.next().charAt(0);
            if ('y' == ch) {
                System.out.println("请输入你要添加的元素的值");
                int add = myScanner.nextInt();
                int arr2[] = new int[arr.length + 1];
                int i = 0;
                for (i = 0; i < arr.length; i++) {
                    arr2[i] = arr[i];
                }
                arr2[arr2.length - 1] = add; //arr2[i] = add; //arr2[arr.length] = add;
                arr = arr2;     // 原来arr指向的数据，会被垃圾回收

            } else if ('n' == ch) {
                System.out.println("已经退出...");
                break;
            } else {
                System.out.println("请重新输入...");
            }
        }
        System.out.println("===扩容后的情况===");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
