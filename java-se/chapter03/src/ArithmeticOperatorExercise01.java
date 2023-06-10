public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        // 求输出结果
//        int i = 1;
//        i = i++;        // (1)temp = i (2)i++ (3)i=temp
//        System.out.println("i = "+i);
//
//        int j = 1;
//        j = ++j;        // (1)j++ (2)temp = j (3) j = temp
//        System.out.println("j = "+j);

        // 测试输出
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print(" i = "+i);//10
        System.out.println(" i2 = "+i2);//20
        i = --i2;
        System.out.print(" i = "+i);//19
        System.out.println(" i2 = "+i2);//19

    }
}
