public class BitOperator {
    public static void main(String[] args) {
        // 10
        // 11
        // 10
        System.out.println(2&3);

        // 10000000 00000000 00000000 00000010 原码
        // 11111111 11111111 11111111 11111101 反码
        // 11111111 11111111 11111111 11111110 补码 -2

        // 00000000 00000000 00000000 00000001 ~-2的补码，也是原码


        System.out.println(~-2);

        // 00000000 00000000 00000000 00000010 2的补码
        // 11111111 11111111 11111111 11111101 ~2的补码
        // 11111111 11111111 11111111 11111100 ~2的反码
        // 10000000 00000000 00000000 00000011 ~2的原码
        System.out.println(~2);

        int a = 1>>2;
        int b = -1>>2; // 算术右移
        int c = 1<<2;
        int d = -1<<2;
        int e = 1>>>2;  // 无符号右移
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);

    }
}
