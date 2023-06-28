import java.util.Scanner;

public class MulForExercise01 {
    public static void main(String[] args) {
        // 统计 3 个班成绩情况，每个班有 5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
        // 统计三个班及格人数
        Scanner myScanner = new Scanner(System.in);
        double sum = 0.0d;
        double score = 0.0d;
        double totalSum = 0.0d;
        int passPeople = 0;

        for (int i = 1 ; i<=3 ; i++) {
            sum = 0.0d;
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第"+(i)+"个班第"+ (j) + "个同学的成绩:");
                score = myScanner.nextDouble();     // 记录每一位同学的成绩
                if (score>=60){
                    passPeople++;
                }
                sum += score;           // 记录每个班的总成绩
            }
            System.out.println("第"+(i)+"班的平均分为:"+(sum/5));
            totalSum += sum;         // 记录所有学生的总成绩
        }
        System.out.println("3个班总成绩为："+(totalSum/15));
        System.out.println("3个班及格总人数为："+passPeople);
    }
}
