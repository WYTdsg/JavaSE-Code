package two.dimensional.array;

public class HomeWork03 {
    public static void main(String[] args) {
        // 随机生成10个整数(1-100),并倒序打印以及求平均值，
        // 求最大值及其下标，并查找其中是否有8

        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int r = (int) ((Math.random() * 10) + 1);
            arr[i] = r;
            System.out.print(arr[i] + " ");
        }
        double s = 0.0d;
        int max = arr[0];
        int index = -1;
        int maxIndex = 0;
        System.out.println("\n===逆序后===");
        for (int i = arr.length - 1; i >= 0; i--) {
            s += arr[i];
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            if (8==arr[i]){
                index = i;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n平均值是"+s/ arr.length);
        System.out.println("最大值是"+max+"下标为"+maxIndex);
        if (-1 != index) {
            System.out.println("8的下标是" + index);
        }
        else {
            System.out.println("没有找到8");
        }

    }
}
