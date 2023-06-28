public class Return01 {
    public static void main(String[] args) {
        for(int i = 1 ; i<=5 ; i++){
            if(i==3){
                System.out.println("你好 "+i);
                return;		// 直接退出程序，退出main方法
            }
            System.out.println("Hello");
        }
        System.out.println("程序继续...");
    }
}
