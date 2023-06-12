public class WhileExercise {
    public static void main(String[] args) {
//        1) 打印 1—100 之间所有能被 3 整除的数 [使用 while]

        int i = 1;
        int count = 0;
        while(i<=100){
            if (i%3==0){
                count++;
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println("count = "+count);

        System.out.println();
        // 2) 打印 40—200 之间所有的偶数 [使用 while, 课后练习]代码
        int n = 40;
        int s = 0;
        while(n<=200){
            if (n%2==0){
                s++;
                System.out.print(n+" ");
            }
            n++;
        }
        System.out.println("s = "+s);

    }
}
