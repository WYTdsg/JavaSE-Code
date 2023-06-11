import java.util.Scanner;
/**
 *         // 根据淡季和旺季的月份和年龄，打印票价
 *         // 4_10月是旺季
 *         //  成人(18-60):60
 *         //  儿童(<18):半价
 *         //  老人>60:1/3
 *
 *         // 其他是淡季
 *         // 成人：40
 *         // 其他：20
 */
public class NextIfExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份:");
        int month = myScanner.nextInt();
        System.out.println("请输入你的年龄");
        int age = myScanner.nextInt();


        if (month>=1 && month<=12) {
            double money = 60.0;
            if (month >= 4 && month <= 10) {
                if (age>=18 && age<=60){
                    System.out.println("你是成年人，票价为:"+money);
                }else if (age>=60){
                    System.out.println("你是老年人，票价为:"+money/2);
                }else if (age>=1 && age<=18){
                    System.out.println("你是青少年，票价为:"+money/3);
                }
            } else{
                if (age>=18 && age<=60){
                    money -= 20;
                    System.out.println("你是成年人，票价为:"+money);
                }else{
                    money -= 40;
                    System.out.println("票价为"+money);
                }
            }
        }else {
            System.out.println("月份不合法请重新输入！");
        }
    }
}
