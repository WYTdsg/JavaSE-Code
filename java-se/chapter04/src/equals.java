public class equals {
    public static void main(String[] args) {
        String name = "小李";
        System.out.println(name.equals("小王"));
        System.out.println(name.equals("小李"));

        // 两种写法  这里可以避免空指针，下面写法更好
        System.out.println("小王".equals(name));
        System.out.println("小李".equals(name));
    }
}
