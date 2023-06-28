import java.util.Scanner;

/**
 * 打印金字塔
 */
public class Stars {
    public static void main(String[] args) {
        //for 实现
//        for (int i = 1 ; i<=5 ; i++){
//            for (int j = 1 ; j <=i ;j++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 1 ; i<=6 ; i++){
//            for (int j = 6 ; j>i ; j--){  // for(int j = 1 ; j<=(6-i) ;j++)
//                System.out.print(" ");
//            }
//            for (int k = 2*i-1 ; k>=1 ; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int totalLevel = 10;        // 这里可以手动输出层数
//        for (int i = 1 ; i<=totalLevel ; i++){
//            for (int j = totalLevel ; j>i ; j--){
//                System.out.print(" ");
//            }
//
//            // 当打印第1行和最后1行时全部输出，其他是打印第1个和最后1个时打印*
//            // 否则打印空格
//            for (int k = 2*i-1 ; k>=1 ; k--){
//                if(i==totalLevel || k==2*i-1 || k==1){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        请输入菱形的行数(奇数)：11
//     *
//    ***
//   *****
//  *******
// *********
//***********
// *********
//  *******
//   *****
//    ***
//     *
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入层数");
//        int totalLevel = myScanner.nextInt();       // 11/2 = 5
//
//        for (int i = 1 ; i<=totalLevel/2 ; i++){
//            for (int j = totalLevel/2 ; j>=i ;j--){
//                System.out.print(" ");
//            }
//            for (int k = 1 ; k<=2*i-1 ; k++){
//                if (k==2*i-1 || k==1){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = totalLevel/2+1 ; i>=1 ; i--){   // 11/2+1 = 6
//            for (int j = totalLevel/2+1 ; j>i ; j--){
//                System.out.print(" ");
//            }
//            for (int k = 2*i-1 ; k>=1 ; k--){
//                if (k==2*i-1 || k==1) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

    }
}
