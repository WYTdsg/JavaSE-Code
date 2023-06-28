public class HomeWork05 {
    public static void main(String[] args) {
        // 输出1-100之间的不能被5整除的数，每五个一行
//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 != 0) {
//                count++;
//                System.out.print(i + " ");
//                if (count % 5 == 0) {
//                    System.out.println();
//                }
//            }
//        }
//        System.out.println("共"+count+"个数");

        // 输出小写的a-z以及大写的Z-A
        // 小写：97 ~ 122
        // 大写: 65 ~ 90
        for (char i = 97 ; i<=122 ;i++){
            System.out.print(i+" ");
        }
        System.out.println("\n====================================================");
        for (char i = 90 ; i>=65 ;i--){
            System.out.print(i+" ");
        }




    }
}
