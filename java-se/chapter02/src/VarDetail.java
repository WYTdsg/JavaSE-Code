public class VarDetail {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);  // 打印1个变量

        a = 0;                  // 修改一个变量
        System.out.println(a);

        // 变量在同一作用域内不能重名
//        int a = 77; // err
    }
}

class Dog
{
    public static void main(String[] args) {
        int a = -1;     // ok
    }
}