package array;

import java.util.Scanner;

/**
 * 请对一个有序数组进行二分查找 {1,8, 10, 89, 1000, 1234} ，
 * 输入一个数看看该数组是否存在此数，并且求出下标，
 * 如果没有就提示"没有这个数"。
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 8, 10, 89, 1000, 1234};
        int left = 0;
        int right = arr.length - 1;
        System.out.println("请输入你要查找的数>");
        Scanner myScanner = new Scanner(System.in);
        int findNum = myScanner.nextInt();
        while (left <= right) {         // 有时left和right指向同一个数也是要查找的数
            int mid = (left + right) / 2;//left + (right - left) / 2;
            if (arr[mid] > findNum) {
                right = mid - 1;
            } else if (arr[mid] < findNum) {
                left = mid + 1;
            } else {
                System.out.println("找到了" + arr[mid] + " 下标为:" + mid);
                break;
            }
        }
        if (left > right) {
            System.out.println("没有找到该数...");
        }
    }
}
