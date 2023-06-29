package array;

public class ArrayExercise02 {
    public static void main(String[] args) {
        //(2)请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标
        int arr[] = {4,-1,9,10,23};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0 ; i< arr.length ;i++){
            if (arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("该数组的最大值为"+max+" 下标为"+maxIndex);
    }
}
