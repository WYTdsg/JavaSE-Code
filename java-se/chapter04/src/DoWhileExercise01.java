public class DoWhileExercise01 {
    public static void main(String[] args) {
//        1) 打印 1—100 [学生做]
        // 2) 计算 1—100 的和 [学生做]
        int i = 1;
        int s = 0;
        do{
            s+=i;
            System.out.print(i+" ");
            i++;
        }while (i<=100);
        System.out.println();
        System.out.println("s = "+s);

//        3) 统计 1---200 之间能被 5 整除但不能被 3 整除的个数
        int j = 1;
        int count = 0;
        do{
            if (j%5==0 && j%3!=0){
                count++;
            }
            j++;
        }while(j<=200);
        System.out.println("count = "+count);
    }
}
