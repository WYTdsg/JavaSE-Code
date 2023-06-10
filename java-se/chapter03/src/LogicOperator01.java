public class LogicOperator01 {
    public static void main(String[] args) {
        //&&短路与 和 & 案例演示
        int age = 50;
        if(age > 20 && age < 90) {
            System.out.println("ok100");
        }
//&逻辑与使用
        if(age > 20 & age < 90) {
            System.out.println("ok200");
        }
//区别
        int a = 4;
        int b = 9;
//对于&&短路与而言，如果第一个条件为 false ,后面的条件不再判断
//对于&逻辑与而言，如果第一个条件为 false ,后面的条件仍然会判断
        if(a < 1 & ++b < 50) {
            System.out.println("ok300");
        }
        System.out.println("a = " + a+" b= "+b);
        int a2 = 4;
        int b2 = 9;
        if(a2 < 1 && ++b2 < 50) {
            System.out.println("ok400");
        }
        System.out.println("a2 = " + a2+" b2= "+b2);
    }
}
