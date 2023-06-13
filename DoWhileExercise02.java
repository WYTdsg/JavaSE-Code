import java.util.Scanner;
public class DoWhileExercise02 {
    public static void main(String[] args) {
        // 如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
        char answer = ' ';
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("还钱吗?<y|n>");
            answer = scanner.next().charAt(0);
            System.out.println("他的回答是"+answer);
        }while(answer != 'y');
        System.out.println("李三还钱了");
    }
}
