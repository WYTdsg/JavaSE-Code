public class ForDetail {
    public static void main(String[] args) {
//        1) 循环条件是返回一个布尔值的表达式

        //2) for(;循环判断条件;) 中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略。
        // 这种写法也是可以的
        int i = 1;
        for (; i<=10 ; ){
            System.out.println("Hello"+i);
            i++;
        }
        System.out.println("i = "+i);


        // for的无限循环
//        for (;;)
//        {
//            System.out.println("loop...");
//        }

        //3)循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，
        //循环变量迭代也可以有多条变量迭代
        //语句，中间用逗号隔开。
        int count = 3;
        for (int a = 0 , j = 0 ; a < count ; a++,j+=2){
            System.out.println("a = "+a+" j = "+j); // 0,0 | 1,2 | 2,4 |
        }
    }
}
