public class TernaryOperatorDetail {
    public static void main(String[] args) {
        //表达式 1 和表达式 2 要为可以赋给接收变量的类型
        //(或可以自动转换/或者强制转换)
        int a = 3;
        int b = 8;
        //int c = a > b ? 1.1 : 3.4;//不可以
        int c = a > b ? (int)1.1 : (int)3.4;//可以的
        double d = a > b ? a : b + 3;//可以的，满足 int -> double
    }
}
