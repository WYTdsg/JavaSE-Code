public class HomeWork01 {
    public static void main(String[] args) {
        // 1.
        // 某人有100000元 ，每经过一次路口，需要交费
        // (1)当现金>50000，每次交5%
        // (2)当现金<=50000时，每次交1000
        // 该人可以经过多少路口？

        // 分析有3种情况
        // (1) money > 50000
        // (2) money >= 1000 && money <= 50000)
        // (3) money < 1000

        double money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
                 money *= 0.95; // money = money-money*0.05;
                count++;
            } else if (money >= 1000 /* && money<=50000 */) {
                money -= 1000;
                count++;
            } else {    // 钱不够了
                break;
            }
        }
        System.out.println("共经过" + count + "个路口");
    }
}
