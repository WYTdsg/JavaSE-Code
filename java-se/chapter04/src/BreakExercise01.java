import java.util.Scanner;

public class BreakExercise01 {
    public static void main(String[] args) {
        //1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break】
        int s = 0;
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            s += i;
            if (s > 20) {
                System.out.println("当和>20时，当前数为"+i);
                //n = i;
                break;
            }
        }
        System.out.println("s=" + s);
        //System.out.println("当和>20时，当前数为"+n);

        //2) 实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，否则提示还有几次机会，
        // 请使用 for+break
        Scanner myScanner = new Scanner(System.in);

        int chance = 3;

        for (int i = 1 ; i<=3 ;i++){
            System.out.println("请输入用户名和密码");
            String name = myScanner.next();
            String password = myScanner.next();
            if ("丁真".equals(name) && "666".equals(password)){
                System.out.println("登录成功~");
                break;
            }else{
                chance--;
                System.out.println("你还有"+(chance)+"次登录机会");
            }
        }

//        for (int i = 3; i >= 1; i--) {
//            System.out.println("请输入用户名");
//            String username = myScanner.next();
//            if (username.equals("丁真")) {
//                System.out.println("请输入密码:");
//                int password = myScanner.nextInt();
//                if (password == 666) {
//                    System.out.println("登录成功！");
//                    break;
//                } else {
//                    System.out.println("登录失败...你还有" + (i - 1) + "次机会");
//                }
//            } else if (i > 1) {
//                System.out.println("用户名输入不正确！你还有" + (i - 1) + "次机会");
//            }else{
//                System.out.println("你的机会已用完...");
//            }
//        }


    }
}
