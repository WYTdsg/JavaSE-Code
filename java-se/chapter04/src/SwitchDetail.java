/**
 * switch细节
 */
public class SwitchDetail {
    public static void main(String[] args) {
        // Detail 1:
        // switch(表达式)中的表达式数据类型 ，应和case后的常量类型一致
        // 或者是可以自动转成可以相互比较的类型，比如输入的是char ， 常量是int

        // Detail 2:
        // switch(表达式)中的表达式的返回值必须是：
        // (byte、short、int、char、enum、String)

        // Detail 3:
        // case子句中的值必须是常量(1,'a'),而不能是变量

        // Detail 4:
        // default子句是可选的

        // Detail 5:
        // 如果没有写break , 程序会直接执行下一个语句块 ，直到遇到break

        // Detail 5:
        // case()中的值必须不同
        char c = 'a';
        char c2 = 'b';
        switch(c){
            case 'a':
                System.out.println("ok1");
                break;
            case 'a'+1 /* "a" */:
                System.out.println("ok2");
                 break;
            case 30 /* c2 */:
                System.out.println("ok3");
                break;
            default:
                System.out.println("ok4");
        }
    }
}
