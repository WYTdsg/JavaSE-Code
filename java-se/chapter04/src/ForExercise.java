public class ForExercise {
    public static void main(String[] args) {
        //打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和.[化繁为简,先死后活]
        //老韩的两个编程思想(技巧)
        //1. 化繁为简 : 即将复杂的需求，拆解成简单的需求，逐步完成 编程 = 思想 --练习-> 代码
        //2. 先死后活 : 先考虑固定的值，然后转成可以灵活变化的值
        //
        //思路分析
        //打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和
        //化繁为简

        //(1) 完成 输出 1-100 的值
        //(2) 在输出的过程中，进行过滤，只输出 9 的倍数 i % 9 ==0
        //(3) 统计个数 定义一个变量 int count = 0; 当 条件满足时 count++;
        //(4) 总和 , 定义一个变量 int sum = 0; 当条件满足时累积 sum += i;
        //先死后活
        //(1) 为了适应更好的需求，把范围的开始的值和结束的值，做出变量
        //(2) 还可以更进一步 9 倍数也做成变量 int
        int i = 0;
        for (i = 9 ; i<=100 ; i+=9){
            System.out.println("i = "+i);
        }

        System.out.print("\n");
//        int j = 0;
//        int count = 0;
//        for (j = 1 ; j<=100 ; j++){
//            if (j%9==0){
//                count++;
//                System.out.println("j = "+j);
//            }
//        }
//        System.out.println("count = "+count);

        // 从静态转换成动态的写法，推荐！！！
        int j = 0;
        int count = 0; // 计算个数
        int start = 1; // 起始位置
        int end = 100; // 结束位置
        int t = 9;     // 倍数
        for (j = start ; j<=end ; j++){
            if (j%t==0){
                count++;
                System.out.println("j = "+j);
            }
        }
        System.out.println("count = "+count);
    }
}
