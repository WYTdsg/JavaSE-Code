public class Boolean01 {
    public static void main(String[] args) {
        // 布尔类型
        boolean isPass = false; // -1 0 1  (x)
        if(true == isPass)
        {
            System.out.println("考试通过");
        }
        else
        {
            System.out.println("考试未通过");
        }
        // 细节说明
        // java里面，不可以使用0或非0的整数代替false和true
        // 这点和C语言不同
    }
}
