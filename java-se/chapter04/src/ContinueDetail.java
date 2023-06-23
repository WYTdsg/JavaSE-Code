public class ContinueDetail {
    public static void main(String[] args) {
        label1:
        for(int j = 0 ; j < 2;j++){
            label2:
            for(int a = 0 ; a<10 ; a++){
                if(a == 2){
                    // continue;           -> 2组 |0,1,3,4,5,6,7,8,9
                    // continue label2;    -> 2组 |0,1,3,4,5,6,7,8,9
                     continue label1;    //-> 2组 | 0,1
                }
                System.out.println("a = "+ a);
            }
        }
    }
}
