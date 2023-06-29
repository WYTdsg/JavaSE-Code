package array;

public class ArrayReverse {
    public static void main(String[] args) {

        // 0 5
        // 1 4
        // 2 3
        // 实现反转

        // 方法1
//        int arr[] = {11, 22, 33, 44, 55, 66};
//        int len = arr.length/2;
//        int temp = 0;
//        for (int i = 0; i < len; i++) {
//            temp = arr[arr.length - 1 - i];      // 最后一个元素
//            arr[arr.length - 1 - i] = arr[i];
//            arr[i] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // 方式2
//        int arr[] = {11,22,33,44,55,66};
//        int left = 0;
//        int right = arr.length - 1;
//        int temp = 0;
//        for (int i = 0 ; i< arr.length/2 ;i++){ // 共循环数组总长度/2
//            temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//        for (int i = 0 ; i< arr.length ;i++){
//            System.out.print(arr[i]+" ");
//        }

        // 方式3

        // 逆序赋值
        //定义数组
        int[] arr = {11, 22, 33, 44, 55, 66};
        //使用逆序赋值方式
        //1. 先创建一个新的数组 arr2 ,大小 arr.length
        //2. 逆序遍历 arr ,将 每个元素拷贝到 arr2 的元素中(顺序拷贝)
        //3. 建议增加一个循环变量 j -> 0 -> 5
        int[] arr2 = new int[arr.length];
        //逆序遍历 arr
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }
        //4. 当 for 循环结束，arr2 就是一个逆序的数组 {66, 55, 44,33, 22, 11}
        //5. 让 arr 指向 arr2 数据空间, 此时 arr 原来的数据空间就没有变量引用
        // 会被当做垃圾，销毁
        arr = arr2;
        System.out.println("====arr 的元素情况=====");
//6. 输出 arr 看看
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "\t");
        }
    }
}
