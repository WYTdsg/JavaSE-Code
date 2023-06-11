public class IfExercise01 {
    public static void main(String[] args) {
        // 求下列程序的输出结果
        int x = 7;
        int y = 4;
        if(x>5) {
            if(y>5) {
                System.out.println(x+y);
            }
            System.out.println("哈哈");
        } else
            System.out.println("x is "+x);

//        1) 编写程序，声明 2 个 double 型变量并赋值。判断第一个数大于 10.0，且第 2 个数小于 20.0，打印两数之和。
        double d1 = 10.1;
        double d2 = 2.2;
        double sum = d1+d2;
        if (d1>10.0 && d2<=20.0)
        {
            System.out.println("d1+d2 = "+sum);
        }

//        2) 定义两个变量 int，判断二者的和，是否能被 3 又能被 5 整除，打印提示信息
        int n1 = 10;
        int n2 = 20;
        if((n1+n2) %3==0 && (n1+n2)%5==0)
        {
            System.out.println("这个数既能被3整除又能被5整除");
        }
        else
        {
            System.out.println("这个数不能被3整除又能被5整除");
        }
//        3) 判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
//        (1)年份能被 4 整除，但不能被 100 整除；
//        (2)能被 400整除

        int year = 2000;
        if(year%400==0 || (year%4==0 && year%100!=0))
        {
            System.out.println(year+"是闰年");
        }
        else
        {
            System.out.println(year+"不是闰年");
        }
    }
}
