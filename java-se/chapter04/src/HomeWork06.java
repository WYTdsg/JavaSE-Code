public class HomeWork06 {
    public static void main(String[] args) {
        // 求出1-1/2+1/3-1/4...1/100的和
//        int a = 1; // 控制正负
//        double s = 0;
//        for (int i = 1 ; i<=100 ;i++){
//            s += 1.0/(i*a);
//            a *= -1;
//        }
//        System.out.println("和为："+s);

        // 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+100)
        // i可以表示第几项，同时也是当前项的最后一个数
        int s = 0;
        for (int i = 1 ; i<=100 ; i++){
            for (int j = 1 ; j<=i ; j++){  // 内存1~i进行循环
                s += j;
            }
        }
        System.out.println(s);
    }
}
