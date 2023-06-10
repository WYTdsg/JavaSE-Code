public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
//        1) 假如还有 59 天放假，问：合 xx 个星期零 xx 天
        int days = 59;
        int weeks = days/7;
        int leftDays = days%7;
        System.out.println(days+"天 共"+weeks+"星期零"+leftDays+"天");
//        2) 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度。
        double temperature = 318.6;
        double r = 5.0/9*(temperature-100);
        System.out.println("转换的华氏温度为:"+r);
    }
}
