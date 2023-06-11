/**
 * 多分支
 */
import java.util.Scanner;
public class If03 {
    public static void main(String[] args) {
//        输入保国同志的芝麻信用分：
//        如果：
//        1) 信用分为 100 分时，输出 信用极好；
//        2) 信用分为(80，99]时，输出 信用优秀；
//        3) 信用分为[60,80]时，输出 信用一般；
//        4) 其它情况 ，输出 信用 不及格
//        5) 请从键盘输入保国的芝麻信用分，并加以判断
        Scanner myScanner = new Scanner(System.in);
        int score = 0;
        System.out.println("请输入:");
        score =  myScanner.nextInt();
        // 分数的合理范围
        if(score>=0 && score<=100) {
            if (score >= 60 && score <= 80) {
                System.out.println("信用一般");
            } else if (score > 80 && score <= 99) {
                System.out.println("信用优秀");
            } else if (score == 100) {
                System.out.println("信用极好");
            } else {
                System.out.println("信用不及格");
            }
        }else{
            System.out.println("你的信用分输入有误，请重新输入:)");
        }


    }
}
