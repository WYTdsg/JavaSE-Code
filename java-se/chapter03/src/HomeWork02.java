public class HomeWork02 {
    public static void main(String[] args) {
        // 当a%b时,a是小数时
        // 公式为: a - (int)a/b *b
        // -10.5%3 = -10.5-(-10)/3*3 = -10.5+9 = -1.5
        // 特别注意,有小数运算，得到的结果是近似值
        System.out.println(-10.5%3);    // 近似值
        System.out.println(-10.4%3);    // 近似值

        int i = 66;
        System.out.println(++i+i);

        // String -> double
        // char -> String
        String s1 = "18.9";
        char ch1 = 'W';
        double d1 = Double.parseDouble(s1);
        String s2 = ch1+"";
        System.out.println("d1 = "+d1 + " s2 = "+s2);

    }
}
