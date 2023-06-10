public class StringToBasicDetail {
    public static void main(String[] args) {
/*        1) 在将 String 类型转成 基本数据类型时， ，比如 我们可以把 "123" , 转成一
        个整数，但是不能把 "hello" 转成一个整数

        2) 如果格式不正确，就会抛出异常，程序就会终止， 这个问题在异常处理章节中，会处理*/

        String s = "123";
        String s2 = "Hello";
        int n = Integer.parseInt(s);
        int n2 = Integer.parseInt(s2);
        System.out.println(n);
        System.out.println(n2);
    }
}
