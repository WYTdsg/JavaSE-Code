/**
 * 多重for循环
 */
public class MulFor01 {
    public static void main(String[] args) {
            for (int i = 0 ; i < 2 ; i++){
                for (int j = 0 ; j < 3 ; j++){
                    System.out.println("i = "+i +" j = "+j); // 0,0|0,1|0,2|1,0|1,1|1,2
                }
            }
    }
}
