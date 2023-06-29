package array;

public class ArrayAssign {
    public static void main(String[] args) {
        // 基本数据类型赋值，赋值方式是值拷贝
        // n2的变化不会影响到n1
        int n1 = 10;
        int n2 = n1;

        n2 = 88;
        System.out.println("n1="+n1);
        System.out.println("n2="+n2);

        // 数组在默认情况下是引用传递，传递的是地址，赋值方式是引用赋值
        // 是一个地址，arr2变化会影响到arr1
        int arr1[] = {1,2,3};
        int arr2[] = arr1;
        arr2[0] = 10;

        System.out.println("====打印数组====");
        for (int i = 0 ; i<arr1.length ;i++){
            System.out.print(arr1[i]+" ");
        }


    }
}
