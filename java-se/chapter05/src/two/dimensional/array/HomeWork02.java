package two.dimensional.array;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        // [10,12,45,90] -> [10,12,23,45,90] 插入元素后结果依旧为升序

        // 方法1.
        int arr[] = {10, 12, 45, 90};
        int insertNum = 23;
        int index = -1;
        int arrNew[] = new int[arr.length + 1];

        // 查找insertNum所插入的位置(索引)
        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) {
                index = i;
                break;      // 找到索引后直接退出
            }
        }

        // 如果遍历了原数组都不符合条件，那么插入的数就是新数组的末尾
        if (index == -1) {
            index = arrNew.length - 1; // arr.length
        }

        // i为遍历新数组的每个元素，j为原数组的元素的下标
        //[10,12,45,90]

        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i != index) {
                arrNew[i] = arr[j];
                j++;
            } else {
                arrNew[i] = insertNum;
            }
        }
        arr = arrNew;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 思路分析：
        // 先创建arr2数组，数组长度是arr数组+1，把arr数组的元素给到arr2中
        // 之后键盘输入一个数，与arr2中数组的元素一一比较，排序
        // 最后arr -> arr2
        // 输出结果

        // 方法2
//        int arr[] = {10,12,45,90};
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入你要插入的元素");
//        int num = myScanner.nextInt();
//        int temp = 0;
//        int arr2[] = new int[arr.length+1];
//        for (int i = 0 ; i<arr.length ;i++){
//            arr2[i] = arr[i];
//        }
//        arr2[arr2.length-1] = num;   // [10,12,45,90,33]
//        for (int i = 0 ; i< arr2.length ; i++){
//            if (arr2[arr2.length-1] < arr2[i]){
//                temp = arr2[i];
//                arr2[i] = arr2[arr2.length-1];
//                arr2[arr2.length-1] = temp;
//            }
//
//        }
//        arr = arr2;
//        for (int i = 0 ; i<arr.length ; i++){
//            System.out.print(arr[i]+" ");
//        }


    }
}
