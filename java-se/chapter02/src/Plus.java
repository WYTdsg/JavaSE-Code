public class Plus {
    public static void main(String[] args) {
        // 求输出结果
        // 1.当左右两边都是数值型时，则做加法运算
        // 2.当左右两边有一方为字符串，则做拼接运算
        // 运算顺序：从左到右
        System.out.println(100+98);
        System.out.println("100"+98);
        System.out.println(100+3+"hello");
        System.out.println("hello"+100+3);
    }
}
