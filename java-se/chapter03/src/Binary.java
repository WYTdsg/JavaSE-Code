public class Binary {
    public static void main(String[] args) {
        //n1 二进制
        int n1 = 0b1010;
        //n2 10 进制
        int n2 = 1010;
        //n3 8 进制
        int n3 = 01010;
        //n4 16 进制
        int n4 = 0X10101;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        System.out.println("n4=" + n4);

        // 其他进制转十进制
        // 课堂练习
        // 0b110001100 转成十进制
        // 02456 八进制转十进制
        // 0xA45 转十进制

        System.out.println(0b110001100); // 4+8+128+256 = 12+128+256=140+256=396
        System.out.println(02456); // 02456 = 6*8^0+5*8^1+4*8^2+2*8^3 = 6 + 40 + 256 + 1024 = 1326
        System.out.println(0xA45); // 0xA45 = 5*16^0 + 4*16^1 + 10^16^2 = 5 + 64 + 2560 = 69+2560 = 2629

        // 十进制转其他进制
        System.out.println(123);
        System.out.println(678);
        System.out.println(8912);
    }
}
