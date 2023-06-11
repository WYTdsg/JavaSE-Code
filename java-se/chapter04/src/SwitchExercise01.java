import java.util.Scanner;
public class SwitchExercise01 {
   public static void main(String[] args) {
//        1) 使用 switch 把小写类型的 char 型转为大写(键盘输入)。只转换 a, b, c, d, e. 其它的输出 "other"。
       //使用 switch 把小写类型的
        //char 型转为大写(键盘输入)。只转换 a->A, b->B, c, d, e. //其它的输出 "other"。
        //创建 Scanner 对象
//             Scanner myScanner = new Scanner(System.in);
//             System.out.println("请输入 a-e");
//             char c1 = myScanner.next().charAt(0);
//             switch(c1) {
//                case 'a' :
//                    System.out.println("A");
//                    break;
//                case 'b' :
//                    System.out.println("B");
//                    break;
//                case 'c' :
//                     System.out.println("C");
//                     break;
//                 case 'd' :
//                     System.out.println("D");
//                     break;
//                case 'e' :
//                     System.out.println("E");
//                     break;
//                default :
//                    System.out.println("你的输入有误~");
//             }

//对学生成绩大于 60 分的，输出"合格"。低于 60 分的，
//输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60
//思路分析
//1. 这道题，可以使用 分支来完成， 但是要求使用 switch
//2. 这里我们需要进行一个转换, 编程思路 :
// 如果成绩在 [60,100] , (int)(成绩/60) = 1
// 如果成绩在 [0,60) , (int)(成绩/60) = 0
//代码实现

//使用 if-else 保证输入的成绩有有效的 0-100
//看了当老师的分析和代码演示后，自己一定要独立完成（不看老韩代码，也能写）
//       double score = 1.1;
//        if( score >= 0 && score <= 100) {
//            switch ((int)(score / 60)) {
//                case 0 :
//                    System.out.println("不合格");
//                    break;
//                case 1 :
//                    System.out.println("合格");
//                    break;
//                 default :
//                    System.out.println("输入有误");
//                    break;
//            }
//        } else {
//            System.out.println("输入的成绩在 0-100");
//        }
//根据用于指定月份，
//打印该月份所属的季节。
//3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季
//[课堂练习, 提示 使用穿透 ]
//
//思路分析
//1. 创建 Scanner 对象， 接收用户输入
//2. 使用 int month 接收
//3. 使用 switch 来匹配 ,使用穿透来完成，比较简洁
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入月份");
        int month = myScanner.nextInt();
        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("这是冬季");
                break;
            default :
                System.out.println("你输入的月份不对(1-12)");
        }
        
    }
}
