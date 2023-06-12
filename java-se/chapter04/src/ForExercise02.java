public class ForExercise02 {
    public static void main(String[] args) {
        // 输出以下表达式
        // 0 + 5 = 5
        // 1 + 4 = 5
        // 2 + 3 = 5
        // 3 + 2 = 5
        // 4 + 1 = 5
        // 5 + 0 = 5

//        int i = 0;
//        int j = 0;
//        int s = 0;
//        for (i = 0, j = 5 ; i<=5 ; i++,j--){
//            s = i+j;
//            System.out.println(i+" + "+j+" = "+s);
//        }

        int n = 5;
        for (int x = 0 ; x<=n ;x++ ){
            System.out.println(x+" + "+(n-x)+" = "+n);
        }
    }
}
