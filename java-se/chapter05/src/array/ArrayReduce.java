package array;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        Scanner myScanner = new Scanner(System.in);
        do {
            int arrNew[] = new int[arr.length - 1];
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            if (arr.length > 1) {
                System.out.println("\n你是否要减少数据？");
                char key = myScanner.next().charAt(0);
                if ('n' == key) {
                    break;

                }
            } else {
                System.out.println("不可再减少！！！");
                break;
            }

        } while (true);

        System.out.println("===缩减后的情况===");
        for (int i = 0 ; i< arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
