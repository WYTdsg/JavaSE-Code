public class Break01 {
    public static void main(String[] args) {
        for (int i = 1 ; i<=10 ; i++){
            // Math.random() -> 返回 [0,1) -> *100+1 -> [1,100)
            // Math.random()返回浮点数
            System.out.println((int)(Math.random()*100+1));
        }
        System.out.println("============");
        int count = 0;
        while(true){
            int r = (int)(Math.random()*100+1);
            count++;
            System.out.println(r);
            if (r==97){
                break;
            }
        }
        System.out.println("为了生成97,共循环了"+count+"次");
    }
}
