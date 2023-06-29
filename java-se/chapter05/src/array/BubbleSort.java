package array;

public class BubbleSort {
    public static void main(String[] args) {
//        数组 [24,69,80,57,13]
//        第 1 轮排序: 目标把最大数放在最后
//        第 1 次比较[24,69,80,57,13]
//        第 2 次比较[24,69,80,57,13]
//        第 3 次比较[24,69,57,80,13]
//        第 4 次比较[24,69,57,13,80]
//        ....

        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0; //用于辅助交换的变量
        //将多轮排序使用外层循环包括起来即可
        //先死后活 => 4 就是 arr.length - 1
        for( int i = 0; i < (arr.length - 1); i++) {    // 外层循环是 4 次
            for( int j = 0; j < (arr.length - 1) - i; j++) {  // 4 3 2 1
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("\n==第"+(i+1)+"轮==");
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }

    }
}
