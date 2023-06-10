public class HomeWork01 {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        if(x++==6 & ++y==6){								// 先判断后增加
            x = 11;
        }
        System.out.println(" x = " + x + " y = " + y);			// 6 6


        int a = 5;
        int b = 5;
        if(a++==6 && ++b==6){
            a = 11;
        }
        System.out.println(" a = " + a + " b = " + b);     		// 6 5

        int c = 5;
        int d = 5;
        if(c++==5 | ++d==5){								// 11 6
            c = 11;
        }
        System.out.println(" c = " + c + " d = " + d);


        int n = 5;
        int m = 5;
        if(n++==5 || ++m==5){								// 11 5
            n = 11;
        }
        System.out.println(" n = " + n + " m = " + m);


        boolean n1 = true;
        boolean n2 = false;
        short n3 = 46;
        if ((n3++==46) && (n2=true)){
            n3++;
        }
        if ((n1=false)||(++n3==49)){
            n3++;
        }
        System.out.println("n3 = " + n3);
    }
}
