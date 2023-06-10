public class ForceConvert {
    public static void main(String[] args) {
        int i = (int)1.9;
        System.out.println(i); // 精度损失

        int j = 100;
        byte b1 = (byte)j;
        System.out.println(b1); // 数据溢出
    }
}
