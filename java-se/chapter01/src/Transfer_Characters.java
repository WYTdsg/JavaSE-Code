/**
 * 01.演示转义字符的使用
 */

public class Transfer_Characters {
    public static void main(String[] args) {
        // \t
        System.out.println("北京\t天津\t上海");
        // \n
        System.out.print("\n");
        // \\
        System.out.println("D:\\Windows\\System32\\cmd.exe");
        // \"
        System.out.println("\"字符串\"");
        // \'
        System.out.println("\'字符串\'");
        // \r
        // 回车
        System.out.println("吴宇呵呵\r张三");
        System.out.println("韩顺平教育\r北京");
        System.out.println("韩顺平教育\r\n北京");

        // exercise

        System.out.println("书名 作者 价格 销量\n三国 罗贯中 120 1000");
    }
}
